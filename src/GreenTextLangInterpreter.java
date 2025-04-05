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
        System.out.println(value.getString());
        return null;
    }

    @Override
    public Value visitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx) {
        String name = ctx.variable(0).getText();
        Value value = visit(ctx.expressions());
        memory.assign(name, value);
        return null;
    }

    @Override
    public Value visitExpressions(GreenTextLangParser.ExpressionsContext ctx) {
        // TODO add separator context
        Value value = visit(ctx.expression());
        return value;
    }

    @Override
    public Value visitExpression(GreenTextLangParser.ExpressionContext ctx) {
        Value value = visit(ctx.also(0));
        return value;
    }

    @Override
    public Value visitAlso(GreenTextLangParser.AlsoContext ctx) {
        Value value = visit(ctx.inversion(0));
        return value;
    }

    @Override
    public Value  visitInversion(GreenTextLangParser.InversionContext ctx) {
        Value value = visit(ctx.comparison());
        return value;
    }

    @Override
    public Value  visitComparison(GreenTextLangParser.ComparisonContext ctx) {
        Value value = visit(ctx.sum());
        return value;
    }

    @Override
    public Value  visitCompare_sum(GreenTextLangParser.Compare_sumContext ctx) {
        Value value = visit(ctx.sum());
        return value;
    }

    @Override
    public Value  visitSum(GreenTextLangParser.SumContext ctx) {
        Value value = visit(ctx.term());
        return value;
    }

    @Override
    public Value visitTerm(GreenTextLangParser.TermContext ctx) {
        if (ctx.BREEDING_LIKE() != null) {
            Value val1 = visit(ctx.term());
            Value val2 = visit(ctx.expression());
            return val1.mul(val2);
        } else if (ctx.WHATEVER_LEFT_FROM() != null) {
            Value val1 = visit(ctx.term());
            Value val2 = visit(ctx.factor());
            return val1.mod(val2);
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
                if (ctx.THE_LITERAL_OPPOSITE_OF() != null) return val.opp();
                else if (ctx.FLIPPED() != null) return val.flip();
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
        if (ctx.BOOL_LITERAL() != null) {
            value = Value.parseBoolean(ctx.getText());
        } else if (ctx.STRING_LITERAL() != null) {
            value = Value.parseString(ctx.getText());
        } else if (ctx.DECIMAL_LITERAL() != null) {
            value = Value.parseInt(ctx.getText());
        } else if (ctx.FLOAT_LITERAL() != null) {
            value = Value.parseDouble(ctx.getText());
        } else {
            value = Value.NULL;
        }
        return value;
    }
}