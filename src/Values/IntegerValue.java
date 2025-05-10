package Values;

import Exceptions.ArithmeticException;
import Exceptions.UnknownException;

public class IntegerValue extends Value {

    public IntegerValue(int value) {
        super(value, new Type(Type.BaseType.INT));
    }

    public IntegerValue(String text) {
        super(null, new Type(Type.BaseType.INT));
        if (text != null) {
            try {
                value = Integer.parseInt(text);
                isNull = false;
            } catch (Exception e) {
                throw new UnknownException("func: Value.Value.parseInt()" + text);
            }
        }
    }

    @Override
    String getString() {
        return String.valueOf(value);
    }

    @Override
    int getInt() {
        return (int) value;
    }

    @Override
    boolean getBoolean() {
        return (int) value != 0;
    }

    @Override
    double getDouble() {
        return (double)(int) value;
    }

    @Override
    Value flip() {
        if (getInt() == 0) {
            throw new Exceptions.ArithmeticException("You fool. Trying to flip a zero, huh? Not on my watch.", "Division by 0");
        }
        return new DoubleValue(1/getDouble());
    }

    @Override
    Value opp() {
        return new IntegerValue(-1 * getInt());
    }

    @Override
    Value mul(Value right) {
        if (right.type.isInt()) {
            return new IntegerValue(getInt() * right.getInt());
        } else if (right.type.isBoolean()) {
            return new IntegerValue(right.getBoolean() ? getInt() : 0);
        }
        return super.mul(right);
    }

    @Override
    Value mod(Value right) {
        if (right.type.isInt()) {
            if (right.getInt() == 0) {
                throw new ArithmeticException("You don't know what is left from zero? An idiot, who doesn't know how modulo operation works.", "Modulo by 0");
            }
            return new IntegerValue(getInt() % right.getInt());
        }
        return super.mod(right);
    }

    @Override
    Value add(Value right) {
        if (right.type.isInt()) {
            return new IntegerValue(getInt() + right.getInt());
        }
        return super.add(right);
    }

    @Override
    Value gt(Value right) {
        if (right.type.isInt()) {
            return getInt() > right.getInt() ? TRUE : FALSE;
        }
        return super.gt(right);
    }

    @Override
    Value lt(Value right) {
        if (right.type.isInt()) {
            return getInt() < right.getInt() ? TRUE : FALSE;
        }
        return super.lt(right);
    }

    @Override
    Value eq(Value right) {
        if (right.type.isInt()) {
            return getInt() == right.getInt() ? TRUE : FALSE;
        }
        return super.eq(right);
    }
}
