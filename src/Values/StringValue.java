package Values;

public class StringValue extends Value {

    public StringValue(String value) {
        super(value, new Type(Type.BaseType.STRING));
    }

    public StringValue(String value, boolean parseEscape) {
        super(value, new Type(Type.BaseType.STRING));
        if (parseEscape) { // escape btnfr"\\
            value = value.replace("\\b", "\b");
            value = value.replace("\\t", "\t");
            value = value.replace("\\n", "\n");
            value = value.replace("\\f", "\f");
            value = value.replace("\\r", "\r");
            value = value.replace("\\\"", "\"");
            value = value.replace("\\\\", "\\");
            this.value = value;
        }
    }

    @Override
    String getString() {
        return (String) value;
    }

    @Override
    boolean getBoolean() {
        return !getString().isEmpty();
    }

    @Override
    Value opp() {
        return new StringValue(new StringBuilder(getString()).reverse().toString());
    }

    @Override
    Value mul(Value right) {
        if (right.type.isBoolean()) {
            return new StringValue(right.getBoolean() ? getString() : "");
        } else if (right.type.isInt()) {
            return new StringValue(getString().repeat(right.getInt()));
        }
        return super.mul(right);
    }

    @Override
    Value add(Value right) {
        if (right.type.isBoolean() || right.type.isString() || right.type.isInt() || right.type.isDouble()) {
            return new StringValue(getString() + right.getString());
        }
        return super.add(right);
    }

    @Override
    Value gt(Value right) {
        if (right.type.isString()) {
            int cmp = getString().compareTo(right.getString());
            return cmp < 0 ? TRUE : FALSE;
        }
        return super.gt(right);
    }

    @Override
    Value lt(Value right) {
        if (right.type.isString()) {
            int cmp = getString().compareTo(right.getString());
            return cmp > 0 ? TRUE : FALSE;
        }
        return super.lt(right);
    }

    @Override
    Value eq(Value right) {
        if (right.type.isString()) {
            int cmp = getString().compareTo(right.getString());
            return cmp == 0 ? TRUE : FALSE;
        }
        return super.eq(right);
    }
}
