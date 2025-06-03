package Values;

import Exceptions.TypeException;

public class StringValue extends Value {
    String rawString;

    public StringValue(String value) {
        super(value, new Type(Type.BaseType.STRING));
        rawString = value;
    }

    public StringValue(String value, boolean parseEscape) {
        super(value, new Type(Type.BaseType.STRING));
        rawString = value;
        if (parseEscape) { // escape btnfr"\\
            try {
            String parsed = "";
            int i = 0;
            while (i < value.length()) {
                char c = value.charAt(i);
                if (c == '\\') {
                    i++;
                    c = value.charAt(i);
                    switch (c) {
                        case '\\': parsed += "\\"; break;
                        case '"': parsed += "\""; break;
                        case 'b': parsed += "\b"; break;
                        case 't': parsed += "\t"; break;
                        case 'n': parsed += "\n"; break;
                        case 'f': parsed += "\f"; break;
                        case 'r': parsed += "\r"; break;
                        case 'u':
                            parsed += (char) Integer.parseInt(value.substring(i + 1, i + 5), 16);
                            i += 4;
                            break;
                        case 'U':
                            parsed += (char) Integer.parseInt(value.substring(i + 1, i + 9), 16);
                            i += 8;
                            break;
                    }
                } else {
                    parsed += c;
                }
                i++;
                this.value = parsed;
            }} catch (Exception e) {
                throw new TypeException("Hearing is damaged due to " + value, "Unable to parse string: " + value);
            }
        }
    }

    @Override
    public String toString() {
        return rawString;
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
