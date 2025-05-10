package GreenTextLangImpl;

import Exceptions.InterpreterException;
import Exceptions.NotImplementedException;
import Exceptions.StackOverflowException;
import Exceptions.UnknownException;
import GreenTextLangBase.GreenTextLangParser;
import GreenTextLangBase.GreenTextLangParserBaseVisitor;
import Memory.Memory;
import Values.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class GreenTextLangVisitorImpl extends GreenTextLangParserBaseVisitor<Value> {
    public Memory memory = new Memory();
    private final Path filePath;

    public GreenTextLangVisitorImpl(Path filePath) {
        this.filePath = filePath;
    }

    private void addLocation(InterpreterException ex, ParserRuleContext ctx) {
        ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), filePath);
    }

    @Override
    public Value visitFunction_call_ing(GreenTextLangParser.Function_call_ingContext ctx) {
        List<Values.Value> values = new ArrayList<>();
        if (ctx.expressions() != null) {
            for (var exp : ctx.expressions().expression()) {
                Value val = visit(exp);
                values.add(val);
            }
        }
        List<Values.Type> types = new ArrayList<>();
        for (var val : values) {
            types.add(val.type);
        }
        FunctionValue function;
        try {
            function = memory.getFunction(ctx.parent_variable(), types);
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        try {
            memory.beginFunction(function);
            GreenTextLangParser.Function_declarationContext funcCtx = function.getFunction();
            String retValueName = null;
            if (funcCtx.function_return() != null) {
                var decl = funcCtx.function_return().variable_declaration_ing_without_elses();
                retValueName = decl.NAME().getText();
                Value value = null;
                if (decl.expressions() != null) {
                    value = visit(decl.expressions());
                } else if (decl.function_call_ing() != null) {
                    value = visit(decl.function_call_ing());
                }
                try {
                    memory.createVariable(retValueName, decl.type_ing(), value);
                } catch (InterpreterException e) {
                    addLocation(e, ctx);
                    throw e;
                }
            }
            if (funcCtx.function_arguments() != null) {
                for (int i = 0; i < funcCtx.function_arguments().variable_declaration_ing().size(); i++) {
                    var decl = funcCtx.function_arguments().variable_declaration_ing(i);
                    String name = decl.NAME().getText();
                    Value value = null; // TODO default values
                    if (decl.SOMEONE_ELSES() != null) {
                        var e = new NotImplementedException("SOMEONE ELSES in function arguments");
                        addLocation(e, ctx);
                        throw e;
                    } else if (decl.expressions() != null) {
                        value = visit(decl.expressions());
                    } else if (decl.function_call_ing() != null) {
                        value = visit(decl.function_call_ing());
                    }
                    try {
                        memory.createVariable(name, decl.type_ing(), values.get(i));
                    } catch (InterpreterException e) {
                        addLocation(e, ctx);
                        throw e;
                    }
                }
            }
            for (var stmt : function.getFunctionBody()) {
                visit(stmt);
            }
            Value retValue = null;
            if (retValueName != null) {
                retValue = memory.getVariable(retValueName);
            }
            memory.endFunction();
            return retValue;
        } catch (StackOverflowException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitFunction_call(GreenTextLangParser.Function_callContext ctx) {
        List<Values.Value> values = new ArrayList<>();
        if (ctx.expressions() != null) {
            for (var exp : ctx.expressions().expression()) {
                Value val = visit(exp);
                values.add(val);
            }
        }
        List<Values.Type> types = new ArrayList<>();
        for (var val : values) {
            types.add(val.type);
        }
        FunctionValue function;
        try {
            function = memory.getFunction(ctx.parent_variable(), types);
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        try {
            memory.beginFunction(function);
            GreenTextLangParser.Function_declarationContext funcCtx = function.getFunction();
            String retValueName = null;
            if (funcCtx.function_return() != null) {
                var decl = funcCtx.function_return().variable_declaration_ing_without_elses();
                retValueName = decl.NAME().getText();
                Value value = null;
                if (decl.expressions() != null) {
                    value = visit(decl.expressions());
                } else if (decl.function_call_ing() != null) {
                    value = visit(decl.function_call_ing());
                }
                try {
                    memory.createVariable(retValueName, decl.type_ing(), value);
                    return null;
                } catch (InterpreterException e) {
                    addLocation(e, ctx);
                    throw e;
                }
            }
            if (funcCtx.function_arguments() != null) {
                for (int i = 0; i < funcCtx.function_arguments().variable_declaration_ing().size(); i++) {
                    var decl = funcCtx.function_arguments().variable_declaration_ing(i);
                    String name = decl.NAME().getText();
                    Value value = null; // TODO default values
                    if (decl.SOMEONE_ELSES() != null) {
                        var e = new NotImplementedException("SOMEONE ELSES in function arguments");
                        addLocation(e, ctx);
                        throw e;
                    } else if (decl.expressions() != null) {
                        value = visit(decl.expressions());
                    } else if (decl.function_call_ing() != null) {
                        value = visit(decl.function_call_ing());
                    }
                    try {
                        memory.createVariable(name, decl.type_ing(), values.get(i));
                    } catch (InterpreterException e) {
                        addLocation(e, ctx);
                        throw e;
                    }
                }
            }
            for (var stmt : function.getFunctionBody()) {
                visit(stmt);
            }
            Value retValue = null;
            if (retValueName != null) {
                retValue = memory.getVariable(retValueName);
            }
            memory.endFunction();
            return retValue;
        } catch (StackOverflowException e) {
            addLocation(e, ctx);
            throw e;
        }
    }
//
//    private Value call_function(GreenTextLangParser.Function_declarationContext ctx, List<Value> values) {
//        for (int i = 0; i < values.size(); i++) {
//            String name = ctx.function_arguments().variable_declaration_ing(i).NAME().getText();
//            Value value = values.get(i);
//            try {
//                memory.createVariable(name, value.type, value);
//            } catch (InterpreterException e) {
//                addLocation(e, ctx);
//                throw e;
//            }
//        }
//        String ret_name = null;
//        if (ctx.function_return() != null) {  // add return value
//            var ret_val = ctx.function_return().variable_declaration_ing_without_elses();
//            ret_name = ret_val.NAME().getText();
//            try {
//                if (ret_val.type_ing().primitive_type_ing().SEEING() != null) {
//                    memory.createVariable(ret_name, Value.Type.INT);
//                } else if (ret_val.type_ing().primitive_type_ing().TASTING() != null) {
//                    memory.createVariable(ret_name, Value.Type.DOUBLE);
//                } else if (ret_val.type_ing().primitive_type_ing().HEARING() != null) {
//                    memory.createVariable(ret_name, Value.Type.STRUCT);
//                } else if (ret_val.type_ing().primitive_type_ing().SMELLING() != null) {
//                    memory.createVariable(ret_name, Value.Type.BOOLEAN);
//                } else {
//                    throw new UnknownException("Unhandled case: " + ctx.getText());
//                }
//            } catch (InterpreterException e) {
//                addLocation(e, ctx);
//                throw e;
//            }
//        }
//        for (var stmt : ctx.statement_newline()) {
//            visit(stmt);
//        }
//        Value ret_value = new Value(null, Value.Type.INT, true);
//        if (ret_name != null) {
//            ret_value = memory.get(ret_name);
//        }
//        return ret_value;
//    }
//
    @Override
    public Value visitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        try {
            memory.createFunction(ctx);
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        return null;
    }

    @Override
    public Value visitCode_block(GreenTextLangParser.Code_blockContext ctx) {
        memory.beginScope();
        visitChildren(ctx);
        memory.endScope();
        return null;
    }

    @Override
    public Value visitSpit(GreenTextLangParser.SpitContext ctx) {
        // Extracts and prints the string from the spit statement
        Value value = visit(ctx.expressions());
        System.out.println(Operators.getString(value));
        return null;
    }

    @Override
    public Value visitSwallow(GreenTextLangParser.SwallowContext ctx) {
        Value value = memory.getVariable(ctx.parent_variable());
        // TODO try parse
        return null;
    }

    @Override
    public Value visitVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx) {
        String name = ctx.NAME().getText();
        Value value = null;
        if (ctx.SOMEONE_ELSES() != null) {
            throw new NotImplementedException("SOMEONE ELSES in variable declaration");
        } else if (ctx.expressions() != null) {
            value = visit(ctx.expressions());
        } else if (ctx.function_call_ing() != null) {
            value = visit(ctx.function_call_ing());
        }
        try {
            memory.createVariable(name, ctx.type(), value);
            return null;
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx) {
        var currentVariable = ctx.parent_variable(0);
        Value currentValue = null;
        try {
            currentValue = memory.getVariable(currentVariable);
        } catch (InterpreterException e) {
            addLocation(e, ctx); // TODO add location in memory
            throw e;
        }

        if (ctx.expressions() != null) {
            currentValue = visit(ctx.expressions());
        } else if (ctx.function_call_ing() != null) {
            currentValue = visit(ctx.function_call_ing());
        } else if (ctx.SOMEONE_ELSES() != null) {
            var e = new NotImplementedException("SOMEONE ELSES in variable assignment");
            addLocation(e, ctx);
            throw e;
        } else if (ctx.EVOLVES() != null) {

        } else if (ctx.DEVOLVES() != null) {

        }
        Value temp = null;
        if (ctx.expressions() != null) {
            temp = visit(ctx.expressions());
        }
        try {
            if (ctx.JOINED_BY() != null) {
                currentValue = Operators.add(currentValue, temp);
            } else if (ctx.BREEDING_LIKE() != null) {
                currentValue = Operators.mul(currentValue, temp);
            } else if (ctx.FLIPPED() != null) {
                currentValue = Operators.flip(temp);
            } else if (ctx.THE_LITERAL_OPPOSITE_OF() != null) {
                currentValue = Operators.opp(temp);
            } else if (ctx.WHATEVER_LEFT_FROM() != null) {
                currentValue = Operators.mod(currentValue, temp);
            }
            memory.assign(currentVariable, currentValue); // TODO is it necessary
            return null;
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx) {
        while (true) {
            memory.beginScope();
            Value cond = visit(ctx.expression());
            try {
                boolean loop = Operators.isTrue(cond);
                if (!loop) break;
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
            for (var stmt : ctx.statement_newline()) {
                visit(stmt);
            }
            memory.endScope();
        }
        return null;
    }

    @Override
    public Value visitIf_declaration(GreenTextLangParser.If_declarationContext ctx) {
        memory.beginScope();
        Value cond = visit(ctx.expression());
        boolean isTrue;
        try {
            isTrue = Operators.isTrue(cond);
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        if (isTrue) {
            for (var stmt : ctx.statement_newline()) {
                visit(stmt);
            }
            memory.endScope();
        } else {
            memory.endScope();
            if (ctx.or_statement() != null) {
                visit(ctx.or_statement());
            } else if (ctx.or_not_statement() != null) {
                visit(ctx.or_not_statement());
            }
        }
        return null;
    }

    @Override
    public Value visitOr_statement(GreenTextLangParser.Or_statementContext ctx) {
        memory.beginScope();
        Value cond = visit(ctx.expression());
        boolean isTrue;
        try {
            isTrue = Operators.isTrue(cond);
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        if (isTrue) {
            for (var stmt : ctx.statement_newline()) {
                visit(stmt);
            }
            memory.endScope();
        } else {
            memory.endScope();
            if (ctx.or_statement() != null) {
                visit(ctx.or_statement());
            } else if (ctx.or_not_statement() != null) {
                visit(ctx.or_not_statement());
            }
        }
        return null;
    }

    @Override
    public Value visitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {
        memory.beginScope();
        for (var stmt : ctx.statement_newline()) {
            visit(stmt);
        }
        memory.endScope();
        return null;
    }

    @Override
    public Value visitExpressions(GreenTextLangParser.ExpressionsContext ctx) {
        Value value;
        if (ctx.expression(1) == null) {
            value = visit(ctx.expression(0));
        } else {
            // it's a list
            var e = new NotImplementedException("Array");
            addLocation(e, ctx);
            throw e;
        }
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
                if (!Operators.isTrue(result)) {
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
    public Value visitSum(GreenTextLangParser.SumContext ctx) {
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
            Value val2 = visit(ctx.expressions());
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
        if (ctx.parent_variable() != null) {
            value = memory.getVariable(ctx.parent_variable());
        } else if (ctx.literal() != null) {
            value = visit(ctx.literal());
        } else if (ctx.expressions() != null) {
            value = visit(ctx.expressions());
        } else {
            throw new UnknownException("func: visitAtom()" + ctx.getText());
        }
        return value;
    }

    @Override
    public Value visitLiteral(GreenTextLangParser.LiteralContext ctx) {
        Value value;
        try {
            if (ctx.BOOL_LITERAL() != null) {
                value = new BooleanValue(ctx.getText());
            } else if (ctx.STRING_LITERAL() != null) {
                String text = ctx.getText();
                text = text.substring(1, text.length() - 1);
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
