package Values;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Exceptions.TypeException;
import Memory.Identifier;

public class StructValue extends Value {  // value is a HashMap
    public StructValue(HashMap<Identifier, Value> struct, String name) {
        super(struct, new Type(Type.BaseType.STRUCT, name));
    }

    public StructValue(StructValue struct) {
        super(struct.getStruct().clone(), new Type(Type.BaseType.STRUCT, (String) struct.type.subType));
    }

    public HashMap<Identifier, Value> getStruct() {
        return (HashMap<Identifier, Value>) value;
    }

    Value add(Value right) {
        var mem = (HashMap<Identifier, Value>) value;
        var types = List.of(this.type, right.type);
        var id = new Identifier("+", types);
        if (mem.containsKey(id)) {
            return mem.get(id);
        }
        return super.add(right);
    }

    Value flip() {
        var mem = (HashMap<Identifier, Value>) value;
        var types = List.of(this.type);
        var id = new Identifier("/", types);
        if (mem.containsKey(id)) {
            return mem.get(id);
        }
        return super.flip();
    }

    Value opp() {
        var mem = (HashMap<Identifier, Value>) value;
        var types = List.of(this.type);
        var id = new Identifier("-", types);
        if (mem.containsKey(id)) {
            return mem.get(id);
        }
        return super.opp();
    }

    Value mul(Value right) {
        var mem = (HashMap<Identifier, Value>) value;
        var types = List.of(this.type, right.type);
        var id = new Identifier("*", types);
        if (mem.containsKey(id)) {
            return mem.get(id);
        }
        return super.mul(right);
    }

    Value mod(Value right) {
        var mem = (HashMap<Identifier, Value>) value;
        var types = List.of(this.type, right.type);
        var id = new Identifier("%", types);
        if (mem.containsKey(id)) {
            return mem.get(id);
        }
        return super.mod(right);
    }

}
