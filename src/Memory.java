import java.util.HashMap;
import java.util.Map;

/**
 * Memory for main program
 */
public class Memory {

    private Map<String, Value> memory = new HashMap<>();

    public Value get(String name) {
        if (!memory.containsKey(name)) {
            throw new VariableNotFoundException("Your " + name + " is missing, maybe he went to buy milk and hasn't returned yet.",
                    "Variable "+ name + " has not been found in this scope");
        }
        return memory.get(name);
    }

    public void assign(String name, Value value) {
        memory.put(name, value);
    }

    public void free() {
        memory.clear();
    }
}