import Exceptions.InterpreterException;
import Exceptions.UnknownException;
import Value.Value;
import Value.IntegerValue;
import Value.StringValue;
import Value.BooleanValue;
import Value.DoubleValue;
import Value.Operators;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class GreenTextLangInterpreter {
    public static void main(String[] args) throws IOException {
        String test = "test.gtl";
        String world = "hello_world.gtl";
        String fib = "fibonacci.gtl";
        String input = Files.readString(Path.of(System.getProperty("user.dir") + "/examples/" + test));

        // Assuming ANTLR setup and parser generation is done
        GreenTextLangLexer lexer = new GreenTextLangLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GreenTextLangParser parser = new GreenTextLangParser(tokens);

        ParseTree tree = parser.program();
        GreenTextLangVisitorImpl visitor = new GreenTextLangVisitorImpl();
        visitor.visit(tree);
    }
}

class GreenTextLangVisitorImpl extends GreenTextLangParserBaseVisitor<Value> {
    public Memory memory = new Memory();

    private void addLocation(InterpreterException ex, ParserRuleContext ctx) {
        ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }

    @Override
    public Value visitSpit(GreenTextLangParser.SpitContext ctx) {
        // Extracts and prints the string from the spit statement
        Value value = visit(ctx.expressions());
        System.out.println(Operators.getString(value));
        return null;
    }

    @Override
    public Value visitVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx) {
        String name = ctx.NAME().getText();
        Value value = null;
        if (ctx.expressions() != null) {
            value = visit(ctx.expressions());
        }
        try {
            if (ctx.type().primitive_type().SEE() != null) {
                memory.create(name, Value.Type.INT, value);
            } else if (ctx.type().primitive_type().TASTE() != null) {
                memory.create(name, Value.Type.DOUBLE, value);
            } else if (ctx.type().primitive_type().HEAR() != null) {
                memory.create(name, Value.Type.STRING, value);
            } else if (ctx.type().primitive_type().SMELL() != null) {
                memory.create(name, Value.Type.BOOLEAN, value);
            } else {
                throw new UnknownException("Unhandled case: " + ctx.getText());
            }
            return null;
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx) {
        String name = ctx.variable(0).getText();
        Value value = visit(ctx.expressions());
        try {
            memory.assign(name, value);
            return null;
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitExpressions(GreenTextLangParser.ExpressionsContext ctx) {
        // TODO add separator context
        Value value = visit(ctx.expression());
        return value;
    }

    @Override
    public Value visitExpression(GreenTextLangParser.ExpressionContext ctx) {
        if (ctx.also(1) == null) {
            return visit(ctx.also(0));
        }
        Value result;
        for (var node : ctx.also()) {
            result = visit(node);
            try {
                if (Operators.isTrue(result)) {
                    return Value.TRUE;
                }
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
        }
        return Value.FALSE;
    }

    @Override
    public Value visitAlso(GreenTextLangParser.AlsoContext ctx) {
        if (ctx.inversion(1) == null) {
            return visit(ctx.inversion(0));
        }
        Value result;
        for (var node : ctx.inversion()) {
            result = visit(node);
            try {
                if (Operators.isTrue(result)) {
                    return Value.FALSE;
                }
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
        }
        return Value.TRUE;
    }

    @Override
    public Value visitInversion(GreenTextLangParser.InversionContext ctx) {
        if (ctx.NOT() == null) {
            return visit(ctx.comparison());
        }
        Value value = visit(ctx.inversion());
        try {
            return Operators.isTrue(value) ? Value.FALSE : Value.TRUE;
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitComparison(GreenTextLangParser.ComparisonContext ctx) {
        if (ctx.sum(1) == null) {
            return visit(ctx.sum(0));
        }
        // context exists
        Value val1 = visit(ctx.sum(0));
        Value val2 = visit(ctx.sum(1));
        try {
            if (ctx.VIBE_WITH() != null) {
                return Operators.eq(val1, val2);
            } else if (ctx.DOESNT_VIBE_WITH() != null) {
                return Operators.neq(val1, val2);
            } else if (ctx.BEATEN_BY() != null) {
                return Operators.lt(val1, val2);
            } else if (ctx.DOESNT_BEAT() != null) {
                return Operators.lte(val1, val2);
            } else if (ctx.BEATS() != null) {
                return Operators.gt(val1, val2);
            } else if (ctx.UNBEATEN_BY() != null) {
                return Operators.gte(val1, val2);
            }
            throw new UnknownException("func: visitComparison()" + ctx.getText());
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value  visitSum(GreenTextLangParser.SumContext ctx) {
        if (ctx.JOINED_BY() != null) {
            Value val1 = visit(ctx.sum());
            Value val2 = visit(ctx.term());
            try {
                return Operators.add(val1, val2);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
        } else {
            return visit(ctx.term());
        }
    }

    @Override
    public Value visitTerm(GreenTextLangParser.TermContext ctx) {
        if (ctx.BREEDING_LIKE() != null) {
            Value val1 = visit(ctx.term());
            Value val2 = visit(ctx.expression());
            try {
                return Operators.mul(val1, val2);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
        } else if (ctx.WHATEVER_LEFT_FROM() != null) {
            Value val1 = visit(ctx.term());
            Value val2 = visit(ctx.factor());
            try {
                return Operators.mod(val1, val2);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
        } else if (ctx.factor() != null) {
            return visit(ctx.factor());
        }
        throw new UnknownException("func: visitTerm()" + ctx.getText());
    }

    @Override
    public Value visitFactor(GreenTextLangParser.FactorContext ctx) {
        if (ctx.factor() != null) {
            Value val = visit(ctx.factor());
            try {
                if (ctx.THE_LITERAL_OPPOSITE_OF() != null) return Operators.opp(val);
                else if (ctx.FLIPPED() != null) return Operators.flip(val);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
        } else if (ctx.atom() != null) {
            return visit(ctx.atom());
        }
        throw new UnknownException("func: visitFactor()" + ctx.getText());
    }

    @Override
    public Value visitAtom(GreenTextLangParser.AtomContext ctx) {
        Value value;
        if (ctx.variable() != null) {
            value = visit(ctx.variable());
        } else if (ctx.literal() != null) {
            value = visit(ctx.literal());
        } else {
            throw new UnknownException("func: visitAtom()" + ctx.getText());
        }
        return value;
    }

    @Override
    public Value visitVariable(GreenTextLangParser.VariableContext ctx) {
        String name = ctx.getText();
        try {
            return memory.get(name);
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitLiteral(GreenTextLangParser.LiteralContext ctx) {
        Value value;
        try {
            if (ctx.BOOL_LITERAL() != null) {
                value = new BooleanValue(ctx.getText());
            } else if (ctx.STRING_LITERAL() != null) {
                String text = ctx.getText();
                text = text.substring(1, text.length()-1);
                value = new StringValue(text);
            } else if (ctx.DECIMAL_LITERAL() != null) {
                value = new IntegerValue(ctx.getText());
            } else if (ctx.FLOAT_LITERAL() != null) {
                value = new DoubleValue(ctx.getText());
            } else {
                throw new UnknownException("func: visitLiteral()" + ctx.getText());
            }
            return value;
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }
}