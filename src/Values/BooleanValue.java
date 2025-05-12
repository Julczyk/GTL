package Values;

import Exceptions.TypeException;
import Exceptions.UnknownException;

public class BooleanValue extends Value {

    public BooleanValue(boolean value) {
        super(value, new Type(Type.BaseType.BOOLEAN));
    }

    public BooleanValue(String text) {
        super(null, new Type(Type.BaseType.BOOLEAN));
        if (text == null) value = null;
        else if (text.equals("c:")) {value = true; isNull = false;}
        else if (text.equals(":c")) {value = false; isNull = false;}
        else throw new TypeException("You cannot smell " + text, "Unable to cast string " + text + " to boolean.");
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
        if (right.type.isBoolean()) {
            return getBoolean() && right.getBoolean() ? TRUE : FALSE;
        }
        return super.mul(right);
    }

    @Override
    Value add(Value right) {
        if (right.type.isBoolean()) {
            return getBoolean() || right.getBoolean() ? TRUE : FALSE;
        }
        return super.add(right);
    }

    @Override
    Value gt(Value right) {
        if (right.type.isBoolean()) {
            return getBoolean() && !right.getBoolean() ? TRUE : FALSE;
        }
        return super.gt(right);
    }

    @Override
    Value lt(Value right) {
        if (right.type.isBoolean()) {
            return !getBoolean() && right.getBoolean() ? TRUE : FALSE;
        }
        return super.lt(right);
    }

    @Override
    Value eq(Value right) {
        if (right.type.isBoolean()) {
            return getBoolean() == right.getBoolean() ? TRUE : FALSE;
        }
        return super.eq(right);
    }
}
