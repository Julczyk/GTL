package Value;

import Exceptions.UnknownException;

public class BooleanValue extends Value {

    public BooleanValue(boolean value) {
        super(value, Type.BOOLEAN);
    }

    public BooleanValue(String text) {
        super(null, Type.BOOLEAN);
        if (text.equals("c:")) value = true;
        else if (text.equals(":c")) value = false;
        else throw new UnknownException("func: BooleanValue() " + text);
    }

    @Override
    String getString() {
        return getBoolean() ? "c:" : ":c";
    }

    @Override
    boolean getBoolean() {
        return (boolean) value;
    }

    @Override
    Value flip() {
        return getBoolean() ? FALSE : TRUE;
    }

    @Override
    Value opp() {
        return getBoolean() ? FALSE : TRUE;
    }

    @Override
    Value mul(Value right) {
        if (right.type == Type.BOOLEAN) {
            return getBoolean() && right.getBoolean() ? TRUE : FALSE;
        }
        return super.mul(right);
    }

    @Override
    Value add(Value right) {
        if (right.type == Type.BOOLEAN) {
            return getBoolean() || right.getBoolean() ? TRUE : FALSE;
        }
        return super.add(right);
    }

    @Override
    Value gt(Value right) {
        if (right.type == Type.BOOLEAN) {
            return getBoolean() && !right.getBoolean() ? TRUE : FALSE;
        }
        return super.gt(right);
    }

    @Override
    Value lt(Value right) {
        if (right.type == Type.BOOLEAN) {
            return !getBoolean() && right.getBoolean() ? TRUE : FALSE;
        }
        return super.lt(right);
    }

    @Override
    Value eq(Value right) {
        if (right.type == Type.BOOLEAN) {
            return getBoolean() == right.getBoolean() ? TRUE : FALSE;
        }
        return super.eq(right);
    }
}
