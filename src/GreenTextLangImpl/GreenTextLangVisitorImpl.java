package GreenTextLangImpl;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangParser;
import GreenTextLangBase.GreenTextLangParserBaseVisitor;
import Memory.Memory;
import Memory.Identifier;
import Values.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class GreenTextLangVisitorImpl extends GreenTextLangParserBaseVisitor<Value> {
    public Memory memory;
    final Path filePath;
    PrintStream out;
    InputStream in;

    public GreenTextLangVisitorImpl(Path filePath, PrintStream out, InputStream in) {
        this.filePath = filePath;
        this.memory = new Memory(filePath);
        this.out = out;
        this.in = in;
    }

    private void addLocation(InterpreterException ex, ParserRuleContext ctx) {
        ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), filePath);
    }

    @Override
    public Value visitFunction_call_ing(GreenTextLangParser.Function_call_ingContext ctx) {
        try {
            return callFunction(ctx.parent_variable(), ctx.expressions());
        } catch (StackOverflowException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    @Override
    public Value visitFunction_call(GreenTextLangParser.Function_callContext ctx) {
        try {
            return callFunction(ctx.parent_variable(), ctx.expressions());
        } catch (StackOverflowException e) {
            addLocation(e, ctx);
            throw e;
        }
    }

    private Value callFunction(FunctionValue function, List<Value> values) {
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
            memory.createVariable(retValueName, decl.type_ing(), value);
        }
        if (funcCtx.function_arguments() != null) {
            for (int i = 0; i < funcCtx.function_arguments().variable_declaration_ing().size(); i++) {
                var decl = funcCtx.function_arguments().variable_declaration_ing(i);
                String name = decl.NAME().getText();
                memory.createVariable(name, decl.type_ing(), values.get(i));
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
    }

    private Value callFunction(GreenTextLangParser.Parent_variableContext varCtx, GreenTextLangParser.ExpressionsContext expCtx) {
        List<Pair<GreenTextLangParser.Parent_variableContext, Value>> valuePairs = new ArrayList<>();
        if (expCtx != null) {
            for (var exp : expCtx.expression()) {
                Value val = visit(exp);
                // pass by reference check if it is only parent variable context
                GreenTextLangParser.Parent_variableContext parentCtx = null;
                if (exp.also(1) == null &&
                    exp.also(0).inversion(1) == null &&
                    exp.also(0).inversion(0).inversion() == null &&
                    exp.also(0).inversion(0).comparison().sum(1) == null &&
                    exp.also(0).inversion(0).comparison().sum(0).sum() == null &&
                    exp.also(0).inversion(0).comparison().sum(0).term().term() == null &&
                    exp.also(0).inversion(0).comparison().sum(0).term().factor().factor() == null &&
                    exp.also(0).inversion(0).comparison().sum(0).term().factor().atom().parent_variable() != null ) {
                    parentCtx = exp.also(0).inversion(0).comparison().sum(0).term().factor().atom().parent_variable();
                }
                valuePairs.add(new Pair<>(parentCtx, val));
            }
        }
        List<Type> types = new ArrayList<>();
        for (var pair : valuePairs) {
            types.add(pair.b.type);
        }
        FunctionValue function;
        function = memory.getFunction(varCtx, types);
        memory.beginFunction(function);
        GreenTextLangParser.Function_declarationContext funcCtx = function.getFunction();
        String retValueName = null;
        if (funcCtx.function_return() != null) {
            var decl = funcCtx.function_return().variable_declaration_ing_without_elses();
            Value value = null;
            retValueName = decl.NAME().getText();
            if (decl.type_ing().complex_type_ing() != null) { // it's an array
                int length = 0;
                if (decl.type_ing().complex_type_ing().expression() != null) {
                    var exp = decl.type_ing().complex_type_ing().expression();
                    Value size = visit(exp);
                    if (!(size instanceof IntegerValue)) {
                        var e = new TypeException("You need to see the size of an array", "Size of an array must be an int not: " + size.toString());
                        addLocation(e, decl);
                        throw e;
                    }
                    length = Operators.getInt(size);
                }
                if (decl.expressions() != null) {
                    value = visit(decl.expressions());
                }
                memory.createArray(retValueName, decl.type_ing(), length, value);
            } else {
                retValueName = decl.NAME().getText();
                if (decl.expressions() != null) {
                    value = visit(decl.expressions());
                } else if (decl.function_call_ing() != null) {
                    value = visit(decl.function_call_ing());
                }
                memory.createVariable(retValueName, decl.type_ing(), value);
            }
        }
        List<Pair<String, GreenTextLangParser.Parent_variableContext>> translations = new ArrayList<>();
        if (funcCtx.function_arguments() != null) {
            int start = 0;
            if (function.getFirstArgument() != null) {
                memory.locals.peek().put(
                        new Identifier(funcCtx.function_arguments().variable_declaration_ing(0).NAME().getText()),
                        function.getFirstArgument()
                );
                start = 1;
            }
            for (int i = start; i < funcCtx.function_arguments().variable_declaration_ing().size(); i++) {
                var decl = funcCtx.function_arguments().variable_declaration_ing(i);
                String name = decl.NAME().getText();
                var valuePair = valuePairs.get(i);
                if (decl.SOMEONE_ELSES() != null) {
                    if (valuePair.a != null) { // context exists so translate
                        translations.add(new Pair<>(name, valuePair.a));
                    }
                }
                if (decl.type_ing().complex_type_ing() != null) { // it's an array
                    int length = 0;
                    if (decl.type_ing().complex_type_ing().expression() != null) {
                        var exp = decl.type_ing().complex_type_ing().expression();
                        Value size = visit(exp);
                        if (!(size instanceof IntegerValue)) {
                            var e = new TypeException("You need to see the size of an array", "Size of an array must be an int not: " + size.toString());
                            addLocation(e, decl);
                            throw e;
                        }
                        length = Operators.getInt(size);
                    }
                    memory.createArray(name, decl.type_ing(), length, valuePair.b);
                } else {
                    memory.createVariable(name, decl.type_ing(), valuePair.b);
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
        // save to temp mem when someone elses
        List<Pair<GreenTextLangParser.Parent_variableContext, Value>> retValuePairs = new ArrayList<>();
        for (var pair : translations) {
            retValuePairs.add(new Pair<>(pair.b, memory.getVariable(pair.a)));
        }
        memory.endFunction();
        // copy from temp mem to memory
        for (var pair : retValuePairs) {
            memory.assign(pair.a, pair.b);
        }
        return retValue;
    }

    @Override
    public Value visitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        memory.createFunction(ctx);
        return null;
    }

    @Override
    public Value visitStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx) {
        String name = ctx.NAME().getText();
        memory.beginStruct();
        for (var stmt : ctx.statement_newline()) {
            visit(stmt);
        }
        HashMap<Identifier, Value> mem = memory.locals.peek();
        memory.endStruct();
        memory.createStruct(name, mem, ctx);
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
        List<String> strings = new ArrayList<>();
        for (var exp : ctx.expressions().expression()) {
            Value val = visit(exp);
            strings.add(Operators.getString(val));
        }
        out.println(String.join(", ", strings));
        return null;
    }

    @Override
    public Value visitSwallow(GreenTextLangParser.SwallowContext ctx) {
        Value value;
        value = memory.getVariable(ctx.parent_variable());
        Value newValue;
        Scanner terminalInput = new Scanner(in);
        String input = terminalInput.nextLine();
        try {
            switch (value.type.baseType) {
                case BOOLEAN:
                    newValue = new BooleanValue(input);
                    break;
                case DOUBLE:
                    newValue = new DoubleValue(input);
                    break;
                case STRING:
                    newValue = new StringValue(input, true);
                    break;
                case INT:
                    newValue = new IntegerValue(input);
                    break;
                default:
                    throw new NotImplementedException("Cannot convert type " + value.type);
            }
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        memory.assign(ctx.parent_variable(), newValue);
        return null;
    }

    @Override
    public Value visitVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx) {
        String name = ctx.NAME().getText();
        Value value = null;
        if (ctx.SOMEONE_ELSES() != null) {
            var e = new NotImplementedException("SOMEONE ELSES in variable declaration");
            addLocation(e, ctx);
            throw e;
        } else if (ctx.type().complex_type() != null) { // it's an array
            int length = 0;
            if (ctx.type().complex_type().expression() != null) {
                var exp = ctx.type().complex_type().expression();
                Value size = visit(exp);
                if (!(size instanceof IntegerValue)) {
                    var e = new TypeException("You need to see the size of an array", "Size of an array must be an int not: " + size.toString());
                    addLocation(e, ctx);
                    throw e;
                }
                length = Operators.getInt(size);
            }
            if (ctx.expressions() != null) {
                value = visit(ctx.expressions());
            }
            memory.createArray(name, ctx.type(), length, value);
            return null;
        } else if (ctx.expressions() != null) {
            value = visit(ctx.expressions());
        } else if (ctx.function_call_ing() != null) {
            value = visit(ctx.function_call_ing());
        }
        memory.createVariable(name, ctx.type(), value);
        return null;
    }

    @Override
    public Value visitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx) {
        var currentVariable = ctx.parent_variable(0);
        Value currentValue = null;
        currentValue = memory.getVariable(currentVariable);
        Value temp = null;
        if (ctx.expressions() != null) {
            temp = visit(ctx.expressions());
        }
        if (ctx.function_call_ing() != null) {
            temp = visit(ctx.function_call_ing());
        } else if (ctx.SOMEONE_ELSES() != null) {
            var e = new NotImplementedException("SOMEONE ELSES in variable assignment");
            addLocation(e, ctx);
            throw e;
        }
        try {
            if (ctx.EVOLVES() != null) {
                currentValue = Operators.evolve(currentValue);
            } else if (ctx.DEVOLVES() != null) {
                currentValue = Operators.devolve(currentValue);
            } else if (ctx.JOINED_BY() != null) {
                Value ret = Operators.add(currentValue, temp);
                if (ret instanceof FunctionValue func) {
                    ret = callFunction(func, List.of(currentValue, temp));
                }
                currentValue = ret;
            } else if (ctx.BREEDING_LIKE() != null) {
                Value ret = Operators.mul(currentValue, temp);
                if (ret instanceof FunctionValue func) {
                    ret = callFunction(func, List.of(currentValue, temp));
                }
                currentValue = ret;
            } else if (ctx.FLIPPED() != null) {
                Value ret = Operators.flip(temp);
                if (ret instanceof FunctionValue func) {
                    ret = callFunction(func, List.of(temp));
                }
                currentValue = ret;
            } else if (ctx.THE_LITERAL_OPPOSITE_OF() != null) {
                Value ret = Operators.opp(temp);
                if (ret instanceof FunctionValue func) {
                    ret = callFunction(func, List.of(temp));
                }
                currentValue = ret;
            } else if (ctx.WHATEVER_LEFT_FROM() != null) {
                Value ret = Operators.mod(currentValue, temp);
                if (ret instanceof FunctionValue func) {
                    ret = callFunction(func, List.of(currentValue, temp));
                }
                currentValue = ret;
            } else {
                currentValue = temp;
            }
        } catch (InterpreterException e) {
            addLocation(e, ctx);
            throw e;
        }
        memory.assign(currentVariable, currentValue);
        return null;
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
        memory.endScope(); // endScope when existing the loop
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
            try {
                // it's a list, type is null needs to be casts
                Value[] values = new Value[ctx.expression().size()];
                for (int i = 0; i < ctx.expression().size(); i++) {
                    values[i] = visit(ctx.expression(i));
                }
                value = new ArrayValue(values, new Type(Type.BaseType.ARRAY, (Type) null)); // subType is null, because it's needs to be parsed
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }

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
            Value ret;
            try {
                ret = Operators.add(val1, val2);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
            if (ret instanceof FunctionValue func) {
                ret = callFunction(func, List.of(val1, val2));
            }
            return ret;
        } else {
            return visit(ctx.term());
        }
    }

    @Override
    public Value visitTerm(GreenTextLangParser.TermContext ctx) {
        if (ctx.BREEDING_LIKE() != null) {
            Value val1 = visit(ctx.term());
            Value val2 = visit(ctx.expressions());
            Value ret;
            try {
                ret = Operators.mul(val1, val2);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
            if (ret instanceof FunctionValue func) {
                ret = callFunction(func, List.of(val1, val2));
            }
            return ret;
        } else if (ctx.WHATEVER_LEFT_FROM() != null) {
            Value val1 = visit(ctx.term());
            Value val2 = visit(ctx.factor());
            Value ret;
            try {
                ret = Operators.mod(val1, val2);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
            if (ret instanceof FunctionValue func) {
                ret = callFunction(func, List.of(val1, val2));
            }
            return ret;
        } else if (ctx.factor() != null) {
            return visit(ctx.factor());
        }
        throw new UnknownException("func: visitTerm()" + ctx.getText());
    }

    @Override
    public Value visitFactor(GreenTextLangParser.FactorContext ctx) {
        if (ctx.factor() != null) {
            Value val = visit(ctx.factor());
            Value ret = null;
            try {
                if (ctx.THE_LITERAL_OPPOSITE_OF() != null) ret = Operators.opp(val);
                else if (ctx.FLIPPED() != null) ret = Operators.flip(val);
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
            if (ret instanceof FunctionValue func) {
                ret = callFunction(func, List.of(val));
            }
            return ret;
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
        } else if (ctx.atom() != null) { // let me, type casting
            value = visit(ctx.atom());
            try {
                value = Operators.castValue(value, Type.inferType(ctx.type()));
            } catch (InterpreterException e) {
                addLocation(e, ctx);
                throw e;
            }
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
                value = new StringValue(text, true);
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
