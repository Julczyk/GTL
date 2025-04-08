import Exceptions.VariableNotFoundException;
import Value.Value;
import Value.Value.Type;
import Value.Operators;

import java.util.HashMap;
import java.util.Map;

/**
 * Memory for main program
 */
public class Memory {

    private Map<String, Value> locals = new HashMap<>();
    private Map<String, Value> globals = new HashMap<>();

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
        if (!locals.containsKey(name)) {
            throw new VariableNotFoundException("Your " + name + " is missing, maybe he went to buy milk and hasn't returned yet.",
                    "Variable '" + name + "' has not been found in this scope");
        }
        return locals.get(name);
    }

    public void assign(String name, Value value) {
        Value curr_val = get(name);
        curr_val = Operators.castValue(curr_val, value);
        locals.put(name, curr_val);
    }

    public void free() {
        locals.clear();
    }
}