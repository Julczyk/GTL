package Values;

import Exceptions.OutOfBoundsException;

public class ArrayValue extends Value {
    public ArrayValue(Object value, Type type) {
        super(value, type);
        if (value != null && type.subType != null) {
            Value[] array = (Value[]) value;
            for (int i = 0; i < array.length; i++) {
                ((Value[]) this.value)[i] = array[i] == null ? new Value(null, new Type((Type) type.subType)) : array[i];
            }
        }
    }

    public Value get(int i) {
        Value[] values = (Value[]) (value);
        if (i < 0 || i >= values.length) {
            throw new OutOfBoundsException(
                    "You are not long enough you have only " + values.length + " but you wanted " + i,
                    "Index " + i + " is out of bounds for an array of length " + values.length);
        }
        return values[i];
    }

    public void set(int i, Value value) {
        Value[] values = (Value[]) (this.value);
        if (i < 0 || i >= values.length) {
            throw new OutOfBoundsException(
                    "You are not long enough you have only " + values.length + " but you wanted " + i,
                    "Index " + i + " is out of bounds for an array of length " + values.length);
        }
        ((Value[])this.value)[i] = value;
    }

    @Override
    public Value add(Value value) {
        if (value.type.baseType == Type.BaseType.ARRAY) {
            Value[] values = (Value[]) (this.value);
            Value[] newValues = new Value[values.length];
            System.arraycopy(values, 0, newValues, 0, values.length);
            ArrayValue arrayValue = new ArrayValue(newValues, this.type);
            for (var val : (Value[]) value.value) {
                arrayValue = (ArrayValue) arrayValue.add(val);
            }
            return arrayValue;
        } else {
            Value[] values = (Value[]) (this.value);
            Value[] newValues = new Value[values.length + 1];
            Value temp = new Value(null, (Type) this.type.subType);
            value = Operators.automaticCastValue(temp, value);
            System.arraycopy(values, 0, newValues, 0, values.length);
            newValues[values.length] = value;
            return new ArrayValue(newValues, this.type);
        }
    }

    @Override
    String getString() {
        if (((Value[])this.value).length == 0) {
            return "[]";
        }
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
