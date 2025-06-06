package Values;

import Exceptions.TypeException;
import Exceptions.UnknownException;

public class DoubleValue extends Value {

    public DoubleValue(double value) {
        super(value, new Type(Type.BaseType.DOUBLE));
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            isNull = true;
        }
    }

    public DoubleValue(String text) {
        super(null, new Type(Type.BaseType.DOUBLE));
        if (text != null) {
            try {
                value = Double.parseDouble(text);
                isNull = false;
            } catch (Exception e) {
                throw new TypeException("You cannot taste " + text, "Unable to cast string " + text + " to double.");
            }
        }
    }

    @Override
    String getString() {
        return String.valueOf(value);
    }

    @Override
    int getInt() {
        return (int)(double) value;
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
        if (right.type.isDouble() || right.type.isInt()) {
            return new DoubleValue(getDouble() * right.getDouble());
        } else if (right.type.isBoolean()) {
            return new DoubleValue(right.getBoolean() ? getDouble() : 0);
        }
        return super.mul(right);
    }

    @Override
    Value add(Value right) {
        if (right.type.isDouble() || right.type.isInt()) {
            return new DoubleValue(getDouble() + right.getDouble());
        }
        return super.mul(right);
    }

    @Override
    Value gt(Value right) {
        if (right.type.isDouble() || right.type.isInt()) {
            return getDouble() > right.getDouble() ? TRUE : FALSE;
        }
        return super.gt(right);
    }

    @Override
    Value lt(Value right) {
        if (right.type.isDouble() || right.type.isInt()) {
            return getDouble() < right.getDouble() ? TRUE : FALSE;
        }
        return super.lt(right);
    }

    @Override
    Value eq(Value right) {
        if (right.type.isDouble() || right.type.isInt()) {
            return getDouble() == right.getDouble() ? TRUE : FALSE;
        }
        return super.eq(right);
    }
}
