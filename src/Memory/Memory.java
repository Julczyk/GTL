package Memory;

import Exceptions.NotImplementedException;
import Exceptions.StackOverflowException;
import Exceptions.UnknownException;
import Exceptions.VariableNotFoundException;
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
        for (var loc : locals) {
            if (loc.containsKey(memoryName)) {
                Value curr_val = loc.get(memoryName);
                curr_val = Operators.castValue(curr_val, value);
                loc.put(memoryName, curr_val);
                return;
            }
        }
        throw new VariableNotFoundException("Your " + memoryName + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public void assign(GreenTextLangParser.Parent_variableContext parentCtx, Value value) {
        // TODO implement
        assign(parentCtx.variable().NAME().getText(), value);
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
        // TODO implement
        int upScopes = parentCtx.PARENT().size();
        String name = parentCtx.variable().NAME().getText();
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
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
        // TODO add parent
        String name = parentCtx.variable().NAME().getText();
        var memoryName = new Identifier(name, funcArgs);
        Value function = null;
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                function = loc.get(memoryName);
            }
        }
        if (function == null && globals.containsKey(memoryName)) {
            function = globals.get(memoryName);
        }
        if (function == null) {
            throw new VariableNotFoundException("Your " + memoryName + " is missing, maybe he went to buy milk and hasn't returned yet.",
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

//    public void create(String name, Type type) {
//        if (locals_old.containsKey(name)) {
//            throw new VariableNotFoundException("Double " + name + " and give it to the next person.",
//                    "Variable '" + name + "' has already been declared.");
//        }
//        locals_old.put(name, new Value(null, type, true));
//    }

//    public void create(String name, Type type, Value value) {
//        create(name, type);
//        if (value != null) assign(name, value);
//    }

//    public Value get(String name) {
//        if (locals_old.containsKey(name)) {
//            return locals_old.get(name);
//        }
//        for (var loc : local_stack_old) {
//            if (loc.containsKey(name)) {
//                return loc.get(name);
//            }
//        }
//        throw new VariableNotFoundException("Your " + name + " is missing, maybe he went to buy milk and hasn't returned yet.",
//                "Variable '" + name + "' has not been found in this scope");
//    }
//
//    public void assign(String name, Value value) {
//        if (locals_old.containsKey(name)) {
//            Value curr_val = locals_old.get(name);
//            curr_val = Operators.castValue(curr_val, value);
//            locals_old.put(name, curr_val);
//            return;
//        }
//        for (var loc : local_stack_old) {
//            if (loc.containsKey(name)) {
//                Value curr_val = loc.get(name);
//                curr_val = Operators.castValue(curr_val, value);
//                loc.put(name, curr_val);
//                return;
//            }
//        }
//        throw new VariableNotFoundException("Your " + name + " is missing, maybe he went to buy milk and hasn't returned yet.",
//                "Variable '" + name + "' has not been found in this scope");
//    }
//
//
//    public void create_function(String name, List<Type> types, GreenTextLangParser.Function_declarationContext ctx) {
//        var name_type = new Pair<String, List<Type>>(name, new ArrayList<>(types));
//        if (functions.containsKey(name_type)) {
//            throw new VariableNotFoundException("Double " + name + " and give it to the next person.",
//                    "Function '" + name + "' with types: "+ types.toString() + " has already been declared.");
//        }
//        functions.put(name_type, ctx);
//    }
//
//    public GreenTextLangParser.Function_declarationContext get_function(String name, List<Value> arguments) {
//        List<Type> types = new ArrayList<>();
//        for (var arg : arguments) {
//            types.add(arg.type);
//        }
//        var name_type = new Pair<String, List<Type>>(name, new ArrayList<>(types));
//        if (functions.containsKey(name_type)) {
//            return functions.get(name_type);
//        }
//        for (var func : func_stack) {
//            if (func.containsKey(name_type)) {
//                return func.get(name_type);
//            }
//        }
//        throw new VariableNotFoundException("Your " + name + " is missing, maybe types " + types.toString() + " are very incorrect.",
//                "Function '" + name + "' with types: "+ types.toString() +" has not been found in this scope");
//    }
//
//    public void begin_local() {
//        local_stack_old.push(new HashMap<>(locals_old));
//        func_stack.push(new HashMap<>(functions));
//        locals_old.clear();
//        functions.clear();
//    }
//
//    public void end_local() {
//        locals_old = local_stack_old.pop();
//        functions = func_stack.pop();
//    }
//
//    public void begin_func() {
//        if (local_stack_stack.size() >= STACK_LIMIT) {
//            throw new StackOverflowException("Don't repeat yourself. Don't repeat yourself. Don't repeat your... Error",
//                    "Max recursion limit reached.");
//        }
//        begin_local();
//        local_stack_stack.push(local_stack_old);
//        local_stack_old = new Stack<>();
//    }
//
//    public void end_func() {
//        local_stack_old = local_stack_stack.pop();
//        end_local();
//    }

    public void free() {
        locals.clear();
        globals.clear();
    }
}