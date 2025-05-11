package Values;

public class ArrayValue extends Value {
    public ArrayValue(Object value, Type subType) {
        super(value, new Type(Type.BaseType.ARRAY, subType));
        subType = type;
    }
}
