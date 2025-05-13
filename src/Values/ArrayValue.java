package Values;

public class ArrayValue extends Value {
    public ArrayValue(Object value, Type type) {
        super(value, type);
    }

    public Value get(int i) { // TODO add exception
        Value[] values = (Value[]) (value);
        return values[i];
    }

    public void set(int i, Value value) { // TODO add exception
        ((Value[])this.value)[i] = value;
    }

    @Override
    String getString() {
        StringBuilder builder = new StringBuilder();
        for (var val : ((Value[])this.value)) {
            if (val == null) {
                builder.append("null");
            } else {
                builder.append(val.getString());
            }
            builder.append(", ");
        }
        builder.setLength(builder.length() - 2);
        return builder.toString();  // There is always string representation
    }
}
