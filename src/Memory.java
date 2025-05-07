import Exceptions.StackOverflowException;
import Exceptions.VariableNotFoundException;
import Value.Value;
import Value.Value.Type;
import Value.Operators;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;

/**
 * Memory for main program
 */
public class Memory {

    public Map<String, Value> locals = new HashMap<>();  // working memory, current scope
    public Stack<Map<String, Value>> local_stack = new Stack<>();  // parent scopes
    public Stack<Map<Pair<String, List<Type>>, GreenTextLangParser.Function_declarationContext>> func_stack = new Stack<>();  // parent functions
    public Stack<Stack<Map<String, Value>>> local_stack_stack = new Stack<>();  // safe whole stack when starting a function
    public Map<String, Value> globals = new HashMap<>();
    public Map<Pair<String, List<Type>>, GreenTextLangParser.Function_declarationContext> functions = new HashMap<>();

    private final int STACK_LIMIT = 200;

    public Memory() {}

    public void create(String name, Type type) {
        if (locals.containsKey(name)) {
            throw new VariableNotFoundException("Double " + name + " and give it to the next person.",
                    "Variable '" + name + "' has already been declared.");
        }
        locals.put(name, new Value(null, type, true));
    }

    public void create(String name, Type type, Value value) {
        create(name, type);
        if (value != null) assign(name, value);
    }

    public Value get(String name) {
        if (locals.containsKey(name)) {
            return locals.get(name);
        }
        for (var loc : local_stack) {
            if (loc.containsKey(name)) {
                return loc.get(name);
            }
        }
        throw new VariableNotFoundException("Your " + name + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + name + "' has not been found in this scope");
    }

    public void assign(String name, Value value) {
        Value curr_val = get(name);
        curr_val = Operators.castValue(curr_val, value);
        locals.put(name, curr_val);
    }


    public void create_function(String name, List<Type> types, GreenTextLangParser.Function_declarationContext ctx) {
        var name_type = new Pair<String, List<Type>>(name, new ArrayList<>(types));
        if (functions.containsKey(name_type)) {
            throw new VariableNotFoundException("Double " + name + " and give it to the next person.",
                    "Function '" + name + "' with types: "+ types.toString() + " has already been declared.");
        }
        functions.put(name_type, ctx);
    }

    public GreenTextLangParser.Function_declarationContext get_function(String name, List<Value> arguments) {
        List<Type> types = new ArrayList<>();
        for (var arg : arguments) {
            types.add(arg.type);
        }
        var name_type = new Pair<String, List<Type>>(name, new ArrayList<>(types));
        if (functions.containsKey(name_type)) {
            return functions.get(name_type);
        }
        for (var func : func_stack) {
            if (func.containsKey(name_type)) {
                return func.get(name_type);
            }
        }
        throw new VariableNotFoundException("Your " + name + " is missing, maybe types " + types.toString() + " are very incorrect.",
                "Function '" + name + "' with types: "+ types.toString() +" has not been found in this scope");
    }

    public void begin_local() {
        local_stack.push(new HashMap<>(locals));
        func_stack.push(new HashMap<>(functions));
        locals.clear();
        functions.clear();
    }

    public void end_local() {
        locals = local_stack.pop();
        functions = func_stack.pop();
    }

    public void begin_func() {
        if (local_stack_stack.size() >= STACK_LIMIT) {
            throw new StackOverflowException("Don't repeat yourself. Don't repeat yourself. Don't repeat your... Error",
                    "Max recursion limit reached.");
        }
        begin_local();
        local_stack_stack.push(local_stack);
        local_stack = new Stack<>();
    }

    public void end_func() {
        local_stack = local_stack_stack.pop();
        end_local();
    }

    public void free() {
        locals.clear();
        functions.clear();
        globals.clear();
    }
}