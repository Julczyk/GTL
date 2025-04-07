import Exceptions.VariableNotFoundException;
import Value.Value;
import Value.Value.Type;

import java.util.HashMap;
import java.util.Map;

/**
 * Memory for main program
 */
public class Memory {

    private Map<String, Value> memory = new HashMap<>();

    public void create(String name) {
        create(name, new Value(null, Type.INT, true));
    }

    public void create(String name, Value value) {
        // TODO add type check
        memory.put(name, value);
    }

    public Value get(String name) {
        if (!memory.containsKey(name)) {
            throw new VariableNotFoundException("Your " + name + " is missing, maybe he went to buy milk and hasn't returned yet.",
                    "Variable '" + name + "' has not been found in this scope");
        }
        return memory.get(name);
    }

    public void assign(String name, Value value) {
        // TODO check type and exist
        memory.put(name, value);
    }

    public void free() {
        memory.clear();
    }
}