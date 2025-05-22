package Memory;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangParser;
import GreenTextLangBase.GreenTextLangParserVisitor;
import Values.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Memory.Memory for main program
 */
public class Memory {

    public Stack<HashMap<Identifier, Value>> locals = new Stack<>(); // working memory, available scopes
    public Stack<Stack<HashMap<Identifier, Value>>> locals_stack = new Stack<>();  // drop off memory
    public HashMap<Identifier, Value> globals = new HashMap<>();  // global statements

    private final int STACK_LIMIT = 200;
    private final Path filePath;

    public Memory(Path filePath) {
        this.filePath = filePath;
    }

    private void addLocation(InterpreterException ex, ParserRuleContext ctx) {
        ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), filePath);
    }

    private boolean isGlobal() {
        return locals_stack.size() == 0 ? locals.size() == 1 : false;
    }

    private void assertNotExists(Identifier memoryName) throws VariableNotFoundException {
        if (locals.peek().containsKey(memoryName)) {
            throw new VariableNotFoundException("Double " + memoryName.toMemeString() + " and give it to the next person.",
                    "Variable '" + memoryName + "' has already been declared.");
        }
    }

    private void assertNotExistsGlobal(Identifier memoryName) throws VariableNotFoundException {
        if (globals.containsKey(memoryName)) {
            throw new VariableNotFoundException("Double " + memoryName.toMemeString() + " and give it to the next person.",
                    "Variable '" + memoryName + "' has already been declared.");
        }
    }

    public void createVariable(String name, GreenTextLangParser.TypeContext typeCtx) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType(typeCtx);
            locals.peek().put(memoryName, new Value(null, type, true));
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createVariable(String name, GreenTextLangParser.Type_ingContext typeCtx) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType_ing(typeCtx);
            locals.peek().put(memoryName, new Value(null, type, true));
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createVariable(String name, GreenTextLangParser.TypeContext type, Value value) {
        createVariable(name, type);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, type); throw e;
            }
        }
    }

    public void createVariable(String name, GreenTextLangParser.Type_ingContext type, Value value) {
        createVariable(name, type);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, type); throw e;
            }
        }
    }

    public void createArray(String name, GreenTextLangParser.TypeContext typeCtx, int length) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType(typeCtx);
            locals.peek().put(memoryName, new ArrayValue(new Value[length], type));
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createArray(String name, GreenTextLangParser.TypeContext typeCtx, int length, Value value) {
        createArray(name, typeCtx, length);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, typeCtx);
                throw e;
            }
        }
    }

    public void createFunction(GreenTextLangParser.Function_declarationContext funcCtx) {
        var memoryName = new Identifier(funcCtx);
        try {
            assertNotExists(memoryName);
            if (isGlobal()) {
                assertNotExistsGlobal(memoryName);
                globals.put(memoryName, new FunctionValue(funcCtx));
            } else {
                locals.peek().put(memoryName, new FunctionValue(funcCtx));
            }
        }  catch (InterpreterException e) {
            addLocation(e, funcCtx);
            throw e;
        }
    }

    public void createStruct(String name, HashMap<Identifier, Value> struct, GreenTextLangParser.Struct_declarationContext structCtx) {
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            if (isGlobal()) {
                assertNotExistsGlobal(memoryName);
                globals.put(memoryName, new StructValue(struct, name));
            } else {
                locals.peek().put(memoryName, new StructValue(struct, name));
            }
        }  catch (InterpreterException e) {
            addLocation(e, structCtx);
            throw e;
        }
    }

    private void assign(String name, Value value) throws InterpreterException {
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                Value curr_val = loc.get(memoryName);
                curr_val = Operators.automaticCastValue(curr_val, value);
                loc.put(memoryName, curr_val);
                return;
            }
        }
        throw new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public void assign(GreenTextLangParser.Parent_variableContext parentCtx, Value value) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            var e = new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
            addLocation(e, parentCtx);
            throw e;
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            name = varCtx.NAME().getText();
        } else if (varCtx.TH() != null) {
            name = varCtx.variable().NAME().getText();
            int index;
            if (varCtx.NAME() != null) {
                Value idxValue = getVariable(varCtx.NAME().getText());
                if (idxValue.type.baseType != Type.BaseType.INT) {
                    var e = new TypeException("int in array", "int in array");
                    addLocation(e, parentCtx);
                    throw e;
                }
                index = Operators.getInt(idxValue);
            } else {
                index = Integer.parseInt(varCtx.DECIMAL_LITERAL().getText());
            }
            var memoryName = new Identifier(name);
            for (int i = 0; i < locals.size(); i++) {
                if (scope > i) continue;
                var loc = locals.get(locals.size() - i - 1); // reversed
                if (loc.containsKey(memoryName)) {
                    try {
                        Value curr_val = loc.get(memoryName);
                        if (curr_val.type.baseType != Type.BaseType.ARRAY) {
                            throw new TypeException("not an array", "not an array");
                        }
                        ArrayValue array = (ArrayValue) curr_val;
                        array.set(index, value);
                        loc.put(memoryName, array);
                        return;
                    } catch (InterpreterException e) {
                        addLocation(e, parentCtx);
                        throw e;
                    }
                }
            }
            return;
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name);
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                try {
                    Value curr_val = loc.get(memoryName);
                    curr_val = Operators.automaticCastValue(curr_val, value);
                    loc.put(memoryName, curr_val);
                    return;
                } catch (InterpreterException e) {
                    addLocation(e, parentCtx);
                    throw e;
                }
            }
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
        addLocation(e, parentCtx);
        throw e;
    }

    public Value getVariable(String name) throws InterpreterException {
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                return loc.get(memoryName);
            }
        }
        throw new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public Value getVariable(GreenTextLangParser.Parent_variableContext parentCtx) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            var e = new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
            addLocation(e, parentCtx);
            throw e;
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            name = varCtx.NAME().getText();
        } else if (varCtx.TH() != null) {
            name = varCtx.variable().NAME().getText();
            int index;
            if (varCtx.NAME() != null) {
                Value idxValue = getVariable(varCtx.NAME().getText());
                if (idxValue.type.baseType != Type.BaseType.INT) {
                    var e = new TypeException("int in array", "int in array");
                    addLocation(e, parentCtx);
                    throw e;
                }
                index = Operators.getInt(idxValue);
            } else {
                index = Integer.parseInt(varCtx.DECIMAL_LITERAL().getText());
            }
            var memoryName = new Identifier(name);
            for (int i = 0; i < locals.size(); i++) {
                if (scope > i) continue;
                var loc = locals.get(locals.size() - i - 1); // reversed
                if (loc.containsKey(memoryName)) {
                    try {
                        Value curr_val = loc.get(memoryName);
                        if (curr_val.type.baseType != Type.BaseType.ARRAY) {
                            throw new TypeException("not an array", "not an array");
                        }
                        ArrayValue array = (ArrayValue) curr_val;
                        return array.get(index);
                    } catch (InterpreterException e) {
                        addLocation(e, parentCtx);
                        throw e;
                    }
                }
            }
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name);
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                return loc.get(memoryName);
            }
        }
        if (globals.containsKey(memoryName)) {
            return globals.get(memoryName);
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
        addLocation(e, parentCtx);
        throw e;
    }

    public FunctionValue getFunction(GreenTextLangParser.Parent_variableContext parentCtx, List<Type> funcArgs) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            var e = new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
            addLocation(e, parentCtx);
            throw e;
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            var e = new NotImplementedException("Function from struct");
            addLocation(e, parentCtx);
            throw e;
        } else if (varCtx.TH() != null) {
            var e = new NotImplementedException("Array");
            addLocation(e, parentCtx);
            throw e;
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name, funcArgs);
        Value function = null;
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                function = loc.get(memoryName);
            }
        }
        if (function == null && globals.containsKey(memoryName)) {
            function = globals.get(memoryName);
        }
        if (function == null) {
            var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                    "Variable '" + memoryName + "' has not been found in this scope");
            addLocation(e, parentCtx);
            throw e;
        }
        if (function instanceof FunctionValue) {
            return (FunctionValue) function;
        } else {
            var e = new UnknownException("Memory.getFunction");
            addLocation(e, parentCtx);
            throw e;
        }
    }

    public void beginScope() {
        locals.push(new HashMap<>());
    }

    public void endScope() {
        locals.pop();
    }

    public void beginStruct() {
        locals_stack.push(locals);
        locals = new Stack<>();
        beginScope();
    }

    public void endStruct() {
        endScope();
        locals = locals_stack.pop();
    }

    public void beginFunction(FunctionValue func) throws StackOverflowException {
        if (locals_stack.size() >= STACK_LIMIT) {
            throw new StackOverflowException("Don't repeat yourself. Don't repeat yourself. Don't repeat your... Error",
                    "Max recursion limit reached.");
        }
        locals_stack.push(locals);
        locals = new Stack<>();
        beginScope();
        createFunction(func.getFunction()); // for recursion
    }

    public void endFunction() {
        endScope();
        locals = locals_stack.pop();
    }

    public void free() {
        locals.clear();
        globals.clear();
    }
}