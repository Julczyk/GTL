/**
 * Value class that encapsulates numeric and string values.
 * Contains all operations between them and all type errors.
 * Empty Value is filled with "", 0, false appropriately
 */
public class Value {
    // Globals
    public static final Value FALSE = new Value(false);
    public static final Value TRUE = new Value(true);
    public static final Value NULL = new Value(null, true);
    // Fields
    private Object value;
    private boolean isNull = false;
    private Type type;
    enum Type {STRING, INT, DOUBLE, BOOLEAN}
    // Private constructor
    private Value(Object value, boolean isNull) {
        this.value = value;
        this.isNull = isNull;
    }

    // TYPE CONSTRUCTORS
    public Value(String value) {
        this.value = value;
        this.type = Type.STRING;
    }

    public Value(int value) {
        this.value = value;
        this.type = Type.INT;
    }

    public Value(double value) {
        this.value = value;
        this.type = Type.DOUBLE;
    }

    public Value(boolean value) {
        this.value = value;
        this.type = Type.BOOLEAN;
    }

    // TYPE GETTERS
    public Value getString() {
        return new Value(
                switch (type) {
                    case STRING -> (String) value;
                    case INT -> String.valueOf(value);
                    case DOUBLE -> String.valueOf(value);
                    case BOOLEAN -> internalGetBoolean() ? "c:" : ":c";
                    default -> throw new UnknownException("func: Value.getString()" + getInfo()); // this won't happen
        });
    }

    public Value getNumber() {
        if (type.equals(Type.INT)) return new Value((int)value);
        if (type.equals(Type.DOUBLE)) return new Value((int)value);
        throw new TypeException("You cannot see what you " + getMemeType() + ".", "Invalid type conversion between integer and " + type.toString().toLowerCase());
    }

    public Value getDouble() {
        if (type.equals(Type.INT)) return new Value((double)value);
        if (type.equals(Type.DOUBLE)) return new Value((double)value);
        throw new TypeException("You cannot taste what you " + getMemeType() + ".", "Invalid type conversion between integer and " + type.toString().toLowerCase());
    }

    public Value getBoolean() {
        return new Value(isTrue());
    }

    private String internalGetString() {
        return (String)value;
    }

    private int internalGetNumber() {
        return (int)value;
    }

    private double internalGetDouble() {
        return (double)value;
    }

    private boolean internalGetBoolean() {
        return (boolean)value;
    }

    // IS TYPE
    public boolean isString() {
        return type.equals(Type.STRING);
    }

    public boolean isNumber() {
        return type.equals(Type.INT);
    }

    public boolean isDouble() {
        return type.equals(Type.DOUBLE);
    }

    public boolean isBoolean() {
        return type.equals(Type.BOOLEAN);
    }

    public boolean isNull() {
        return isNull;
    }

    public boolean isTrue() {
        if (isNull) {
            return false;
        } else if (isString()) {
            return !internalGetString().isEmpty();  // empty string is false
        } else if (isNumber()) {
            return internalGetNumber() != 0;        // int == 0 is false
        } else if (isDouble()) {
            return internalGetDouble() != 0;        // double == 0 is false
        } else if (isBoolean()) {
            return internalGetBoolean();            // bool is bool
        } else {                            // this won't happen
            throw new UnknownException("func: Value.isTrue()" + getInfo());
        }
    }

    public boolean isFalse() {
        return !isTrue();
    }

    // ARITHMETIC OPERATIONS
    public Value flip() {
        if (isNull) {
            throw new TypeException("You cannot flip what you don't have.", "Invalid operation 'flipped' on null value");
        } else if (isString()) {
            throw new TypeException("You cannot flip what you hear.", "Invalid operation 'flipped' on string");
        } else if (isNumber() || isDouble()) {
            if (internalGetDouble() == 0) {
                throw new ArithmeticException("You fool. Trying to flip a zero, huh? Not on my watch.", "Division by 0");
            }
            double val = 1 / internalGetDouble();
            if (Double.isInfinite(val) || Double.isNaN(val)) return NULL;
            return new Value(val);      // flipping int and double
        } else if (isBoolean()) {
            return new Value(!internalGetBoolean());// flipping bool
        } else {                            // this won't happen
            throw new UnknownException("func: Value.flip()" + getInfo());
        }
    }

    public Value opp() {
        if (isNull) {
            throw new TypeException("You cannot inverse what you don't have.", "Invalid operation 'the literal opposite of' on null value");
        } else if (isString()) {                // opposite string, it's reversed
            return new Value(new StringBuilder(internalGetString()).reverse().toString());
        } else if (isNumber()) {
            return new Value(-1 * internalGetNumber()); // opposite int
        } else if (isDouble()) {
            return new Value(-1 * internalGetDouble()); // opposite double
        } else if (isBoolean()) {
            return new Value(!internalGetBoolean());    // opposite bool
        } else {                                // this won't happen
            throw new UnknownException("func: Value.opp()" + getInfo());
        }
    }

    public Value mul(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot breed like what you don't have times.", "Invalid operation 'breeding like times' on null value");
        } else if (isString() && right.isString()) {
            throw new TypeException("You cannot breed hear with hear.", "Invalid operation 'breeding like times' on 'string' and 'string'");
        } else if (isNumber() && right.isString()) {
            return new Value(right.internalGetString().repeat(internalGetNumber()));
        } else if (isString() && right.isNumber()) {
            return new Value(internalGetString().repeat(right.internalGetNumber()));
        } else if (isDouble() && right.isString()) {
            throw new TypeException("You cannot breed taste with hear.", "Invalid operation 'breeding like times' on 'double' and 'string'");
        } else if (isString() && right.isDouble()) {
            throw new TypeException("You cannot breed hear with taste.", "Invalid operation 'breeding like times' on 'string' and 'double'");
        } else if (isBoolean() && right.isString()) {
            return internalGetBoolean() ? new Value(right.internalGetString()) : new Value("");
        } else if (isString() && right.isBoolean()) {
            return right.internalGetBoolean() ? new Value(internalGetString()) : new Value("");
        } else if (isNumber() && right.isNumber()) {
            return new Value(internalGetNumber() * right.internalGetNumber());
        } else if (isNumber() && right.isDouble()) {
            return new Value(internalGetDouble() * right.internalGetDouble());
        } else if (isDouble() && right.isNumber()) {
            return new Value(internalGetDouble() * right.internalGetDouble());
        } else if (isNumber() && right.isBoolean()) {
            return right.internalGetBoolean() ? new Value(internalGetNumber()) : new Value(0);
        } else if (isBoolean() && right.isNumber()) {
            return internalGetBoolean() ? new Value(right.internalGetNumber()) : new Value(0);
        } else if (isDouble() && right.isDouble()) {
            return new Value(internalGetDouble() * right.internalGetDouble());
        } else if (isBoolean() && right.isDouble()) {
            return internalGetBoolean() ? new Value(right.internalGetDouble()) : new Value(0);
        } else if (isDouble() && right.isBoolean()) {
            return right.internalGetBoolean() ? new Value(internalGetDouble()) : new Value(0);
        } else if (isBoolean() && right.isBoolean()) {
            return internalGetBoolean() ? new Value(right.internalGetBoolean()) : FALSE;
        } else {                                // this won't happen
            throw new UnknownException("func: Value.mul()" + getInfo() + right.getInfo());
        }
    }

    public Value mod(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot see whatever is left from nothing.", "Invalid operation 'whatever left from' on null value");
        } else if (isNumber() && right.isNumber()) {
            if (right.internalGetNumber() == 0) {
                throw new ArithmeticException("You don't know what is left from zero? An idiot, who doesn't know how modulo operation works.", "Modulo by 0");
            }
            return new Value(internalGetNumber() % right.internalGetNumber());
        } else if ((isDouble() || isBoolean() || isString() || isNumber())
                && (right.isDouble() || right.isBoolean() || right.isString() || right.isNumber())) {
            throw new TypeException("You cannot "+ getMemeType() +" hear with "+ right.getMemeType() +".", "Invalid operation 'whatever left from' on '"+ type +"' and '"+ right.type +"'");
        } else {                                // this won't happen
            throw new UnknownException("func: Value.mod()" + getInfo() + right.getInfo());
        }
    }

    public Value add(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot join nothing.", "Invalid operation 'joined by' on null value");
        } else if ((isDouble() || isBoolean() || isString() || isNumber())
        && (right.isDouble() || right.isBoolean() || right.isString() || right.isNumber())) {
            return new Value(internalGetString() + right.internalGetString());
        } else {                                // this won't happen
            throw new UnknownException("func: Value.add()" + getInfo() + right.getInfo());
        }
    }

    // COMPARISON OPERATORS
    public Value gt(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot be beat nothing.", "Invalid operation 'beats' on null value");
        } else if (isString() && right.isString()) {
            int cmp = internalGetString().compareTo(right.internalGetString());
            return cmp > 0 ? TRUE : FALSE;
        } else if (isNumber() && right.isNumber()) {
            return internalGetNumber() > right.internalGetNumber() ? TRUE : FALSE;
        } else if (isDouble() && right.isDouble()) {
            return internalGetNumber() > right.internalGetNumber() ? TRUE : FALSE;
        } else if (isBoolean() && right.isBoolean()) {
            return internalGetBoolean() && !right.internalGetBoolean() ? TRUE : FALSE;
        } else {
            throw new UnknownException("func: Value.gt()" + getInfo() + right.getInfo());
        }

    }

    public Value gte(Value right) {
        return gt(right).equals(TRUE) ? TRUE : eq(right);
    }

    public Value lt(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot be not beat nothing.", "Invalid operation 'doesn't beat' on null value");
        } else if (isString() && right.isString()) {
            int cmp = internalGetString().compareTo(right.internalGetString());
            return cmp < 0 ? TRUE : FALSE;
        } else if (isNumber() && right.isNumber()) {
            return internalGetNumber() < right.internalGetNumber() ? TRUE : FALSE;
        } else if (isDouble() && right.isDouble()) {
            return internalGetNumber() < right.internalGetNumber() ? TRUE : FALSE;
        } else if (isBoolean() && right.isBoolean()) {
            return !internalGetBoolean() && right.internalGetBoolean() ? TRUE : FALSE;
        } else {
            throw new UnknownException("func: Value.lt()" + getInfo() + right.getInfo());
        }
    }

    public Value lte(Value right) {
        return lt(right).equals(TRUE) ? TRUE : eq(right);
    }

    public Value eq(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot be vibe with nothing.", "Invalid operation 'vibe with' on null value");
        } else if (isString() && right.isString()) {
            int cmp = internalGetString().compareTo(right.internalGetString());
            return cmp == 0 ? TRUE : FALSE;
        } else if (isNumber() && right.isNumber()) {
            return internalGetNumber() == right.internalGetNumber() ? TRUE : FALSE;
        } else if (isDouble() && right.isDouble()) {
            return internalGetNumber() == right.internalGetNumber() ? TRUE : FALSE;
        } else if (isBoolean() && right.isBoolean()) {
            return internalGetBoolean() == right.internalGetBoolean() ? TRUE : FALSE;
        } else {
            throw new UnknownException("func: Value.eq()" + getInfo() + right.getInfo());
        }
    }

    public Value neq(Value right) {
        return eq(right).equals(TRUE) ? FALSE : TRUE;
    }

    public Value not() {
        return isTrue() ? TRUE : FALSE;
    }

    public Value and(Value right) {
        return isTrue() && right.isTrue() ? TRUE : FALSE;
    }

    public Value or(Value right) {
        return isTrue() || right.isTrue() ? TRUE : FALSE;
    }

    private String getInfo() {
        return ", Value: " + value + ", isNull: " + isNull + ", type: " + type;
    }

    private String getMemeType() {
        return switch(type) {
            case STRING -> "hear";
            case INT -> "see";
            case BOOLEAN -> "smell";
            case DOUBLE -> "taste";
            default -> throw new UnknownException("func: Value.getMemeType()" + getInfo()); // this won't happen
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value value1)) return false;

        if (isNull != value1.isNull) return false;
        if (isNull) return true;
        return value.equals(value1.value);
    }

    @Override
    public int hashCode() {
        int result = 0;
        if (value != null) result = value.hashCode();
        result = 29 * result + (isNull ? 1 : 0);
        return result;
    }
}