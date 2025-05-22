package Values;

import java.util.HashMap;
import Memory.Identifier;

public class StructValue extends Value {  // value is a HashMap
    public StructValue(HashMap<Identifier, Value> struct, String name) {
        super(struct, new Type(Type.BaseType.STRUCT, name));
    }


}
