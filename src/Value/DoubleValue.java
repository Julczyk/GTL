package Value;

import Exceptions.UnknownException;

public class DoubleValue extends Value {

    public DoubleValue(double value) {
        super(value, Type.DOUBLE);
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            isNull = true;
        }
    }

    public DoubleValue(String text) {
        super(null, Type.DOUBLE);
        try {
            value = Double.parseDouble(text);
        } catch (Exception e) {
            throw new UnknownException("func: DoubleValue()" + text);
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
        return (double) value != 0;
    }

    @Override
    double getDouble() {
        return (double) value;
    }

    @Override
    Value flip() {
        if (getDouble() == 0) {
            throw new Exceptions.ArithmeticException("You fool. Trying to flip a zero, huh? Not on my watch.", "Division by 0");
        }
        return new DoubleValue(1 / getDouble());
    }

    @Override
    Value opp() {
        return new DoubleValue(-1 * getDouble());
    }

    @Override
    Value mul(Value right) {
        if (right.type == Type.DOUBLE || right.type == Type.INT) {
            return new DoubleValue(getDouble() * right.getDouble());
        } else if (right.type == Type.BOOLEAN) {
            return new DoubleValue(right.getBoolean() ? getDouble() : 0);
        }
        return super.mul(right);
    }

    @Override
    Value add(Value right) {
        if (right.type == Type.DOUBLE || right.type == Type.INT) {
            return new DoubleValue(getDouble() + right.getDouble());
        }
        return super.mul(right);
    }

    @Override
    Value gt(Value right) {
        if (right.type == Type.DOUBLE || right.type == Type.INT) {
            return getDouble() > right.getDouble() ? TRUE : FALSE;
        }
        return super.gt(right);
    }

    @Override
    Value lt(Value right) {
        if (right.type == Type.DOUBLE || right.type == Type.INT) {
            return getDouble() < right.getDouble() ? TRUE : FALSE;
        }
        return super.lt(right);
    }

    @Override
    Value eq(Value right) {
        if (right.type == Type.DOUBLE || right.type == Type.INT) {
            return getDouble() == right.getDouble() ? TRUE : FALSE;
        }
        return super.eq(right);
    }
}
