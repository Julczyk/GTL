package Memory;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangParser;
import Values.Value;
import Values.FunctionValue;
import Values.Operators;
import Values.Type;

import java.util.*;

/**
 * Memory.Memory for main program
 */
public class Memory {

    public Stack<Map<Identifier, Value>> locals = new Stack<>(); // working memory, available scopes
    public Stack<Stack<Map<Identifier, Value>>> locals_stack = new Stack<>();  // drop off memory
    public Map<Identifier, Value> globals = new HashMap<>();  // global statements

    private final int STACK_LIMIT = 200;

    public Memory() {}

    private boolean isGlobal() {
        return locals_stack.size() == 0 ? locals.size() == 1 : false;
    }

    private void assertNotExists(Identifier memoryName) {
        if (locals.peek().containsKey(memoryName)) {
            throw new VariableNotFoundException("Double " + memoryName + " and give it to the next person.",
                    "Variable '" + memoryName + "' has already been declared.");
        }
    }

    private void assertNotExistsGlobal(Identifier memoryName) {
        if (globals.containsKey(memoryName)) {
            throw new VariableNotFoundException("Double " + memoryName + " and give it to the next person.",
                    "Variable '" + memoryName + "' has already been declared.");
        }
    }

    public void createVariable(String name, GreenTextLangParser.TypeContext typeCtx) {
        // check if exists
        var memoryName = new Identifier(name);
        assertNotExists(memoryName);
        Type type = Type.inferType(typeCtx);
        locals.peek().put(memoryName, new Value(null, type, true));
    }

    public void createVariable(String name, GreenTextLangParser.Type_ingContext typeCtx) {
        // check if exists
        var memoryName = new Identifier(name);
        assertNotExists(memoryName);
        Type type = Type.inferType_ing(typeCtx);
        locals.peek().put(memoryName, new Value(null, type, true));
    }

    public void createVariable(String name, GreenTextLangParser.TypeContext type, Value value) {
        createVariable(name, type);
        if (value != null) assign(name, value);
    }

    public void createVariable(String name, GreenTextLangParser.Type_ingContext type, Value value) {
        createVariable(name, type);
        if (value != null) assign(name, value);
    }

    public void createFunction(GreenTextLangParser.Function_declarationContext funcCtx) {
        var memoryName = new Identifier(funcCtx);
        assertNotExists(memoryName);
        if (isGlobal()) {
            assertNotExistsGlobal(memoryName);
            globals.put(memoryName, new FunctionValue(funcCtx));
        } else {
            locals.peek().put(memoryName, new FunctionValue(funcCtx));
        }
    }

    private void assign(String name, Value value) {
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                Value curr_val = loc.get(memoryName);
                curr_val = Operators.automaticCastValue(curr_val, value);
                loc.put(memoryName, curr_val);
                return;
            }
        }
        throw new VariableNotFoundException("Your " + memoryName + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public void assign(GreenTextLangParser.Parent_variableContext parentCtx, Value value) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            throw new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            name = varCtx.NAME().getText();
        } else if (varCtx.TH() != null) {
            throw new NotImplementedException("Array");
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name);
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                Value curr_val = loc.get(memoryName);
                curr_val = Operators.automaticCastValue(curr_val, value);
                loc.put(memoryName, curr_val);
                return;
            }
        }
        throw new VariableNotFoundException("Your " + memoryName + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public Value getVariable(String name) {
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                return loc.get(memoryName);
            }
        }
        throw new VariableNotFoundException("Your " + memoryName + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public Value getVariable(GreenTextLangParser.Parent_variableContext parentCtx) throws VariableNotFoundException {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            throw new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            name = varCtx.NAME().getText();
        } else if (varCtx.TH() != null) {
            throw new NotImplementedException("Array");
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
        throw new VariableNotFoundException("Your " + memoryName + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public FunctionValue getFunction(GreenTextLangParser.Parent_variableContext parentCtx, List<Type> funcArgs) throws VariableNotFoundException {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            throw new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            throw new NotImplementedException("Function from struct");
        } else if (varCtx.TH() != null) {
            throw new NotImplementedException("Array");
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
            throw new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                    "Variable '" + memoryName + "' has not been found in this scope");
        }
        if (function instanceof FunctionValue) {
            return (FunctionValue) function;
        } else {
            throw new UnknownException("Memory.getFunction");
        }
    }

    public void beginScope() {
        locals.push(new HashMap<>());
    }

    public void endScope() {
        locals.pop();
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