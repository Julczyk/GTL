import java.util.function.BiFunction;

/**
 * Value class that encapsulates numeric and string values.
 * Contains all operations between them and all type errors.
 */
public class Value {
    // Globals
    public static final Value FALSE = new Value(0);
    public static final Value TRUE = new Value(1);
    public static final Value NULL = new Value(null, true);
    // Fields
    private Object value;
    private boolean isNull = false;
    // Private constructor
    private Value(Object value, boolean isNull) {
        this.value = value;
        this.isNull = isNull;
    }

    // TYPE CONSTRUTORS
    public Value(String value) {
        this.value = value;
    }

    public Value(int value) {
        this.value = value;
    }

    public Value(double value) {
        this.value = value;
    }

    public Value(boolean value) {
        this.value = value;
    }

    // TYPE GETTERS
    public String getString() {
        return (String)value;
    }

    public int getNumber() {
        return (int)value;
    }

    public double getDouble() {
        return (double)value;
    }

    public boolean getBoolean() {
        return (boolean)value;
    }

    // IS TYPE
    public boolean isString() {
        return value instanceof String;
    }

    public boolean isNumber() {
        return value instanceof Long;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isNull() {
        return isNull;
    }

    public boolean isTrue() {
        if (isNull) {
            return false;
        } else if (isString()) {
            return !getString().isEmpty();  // empty string is false
        } else if (isNumber()) {
            return getNumber() != 0;        // int == 0 is false
        } else if (isDouble()) {            // double can't be true nor false
            throw new TypeException("You cannot taste what you smell.", "Invalid conversion between double and boolean");
        } else if (isBoolean()) {           // bool is bool
            return getBoolean();
        } else {                            // this won't happen
            throw new UnknownException("func: Value.isTrue(), Value: " + value + " isNull: " + isNull);
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
            if (getDouble() == 0) {
                throw new ArithmeticException("You fool. Trying to flip a zero, huh? Not on my watch.", "Division by 0");
            }
            return new Value(1/getDouble());// flipping int and double
        } else if (isBoolean()) {
            return new Value(!getBoolean());// flipping bool
        } else {                            // this won't happen
            throw new UnknownException("func: Value.flip(), Value: " + value + " isNull: " + isNull);
        }
    }

    public Value opp() {
        if (isNull) {
            throw new TypeException("You cannot inverse what you don't have.", "Invalid operation 'the literal opposite of' on null value");
        } else if (isString()) {                // opposite string, it's reversed
            return new Value(new StringBuilder(getString()).reverse().toString());
        } else if (isNumber()) {
            return new Value(-1 * getNumber()); // opposite int
        } else if (isDouble()) {
            return new Value(-1 * getDouble()); // opposite double
        } else if (isBoolean()) {
            return new Value(!getBoolean());    // opposite bool
        } else {                                // this won't happen
            throw new UnknownException("func: Value.opp(), Value: " + value + " isNull: " + isNull);
        }
    }

    public Value mul(Value right) {
        if (isNull || right.isNull) {
            throw new TypeException("You cannot breed like what you don't have times.", "Invalid operation 'breeding like times' on null value");
        } else if (isString() && right.isString()) {
            throw new TypeException("You cannot breed hear with hear.", "Invalid operation 'breeding like times' on 'string' and 'string'");
        } else if (isNumber() && right.isString()) {
            return new Value(right.getString().repeat(getNumber()));
        } else if (isString() && right.isNumber()) {
            return new Value(getString().repeat(right.getNumber()));
        } else if (isDouble() && right.isString()) {
            throw new TypeException("You cannot breed taste with hear.", "Invalid operation 'breeding like times' on 'double' and 'string'");
        } else if (isString() && right.isDouble()) {
            throw new TypeException("You cannot breed hear with taste.", "Invalid operation 'breeding like times' on 'string' and 'double'");
        } else if (isBoolean() && right.isString()) {
            return getBoolean() ? new Value(right.getString()) : new Value("");
        } else if (isString() && right.isBoolean()) {
            return right.getBoolean() ? new Value(getString()) : new Value("");
        } else if (isNumber() && right.isNumber()) {
            return new Value(getNumber() * right.getNumber());
        } else if (isNumber() && right.isDouble()) {
            return new Value(getDouble() * right.getDouble());
        } else if (isDouble() && right.isNumber()) {
            return new Value(getDouble() * right.getDouble());
        } else if (isNumber() && right.isBoolean()) {
            return right.getBoolean() ? new Value(getNumber()) : new Value(0);
        } else if (isBoolean() && right.isNumber()) {
            return getBoolean() ? new Value(right.getNumber()) : new Value(0);
        } else if (isDouble() && right.isDouble()) {
            return new Value(getDouble() * right.getDouble());
        } else if (isBoolean() && right.isDouble()) {
            return getBoolean() ? new Value(right.getDouble()) : new Value(0);
        } else if (isDouble() && right.isBoolean()) {
            return right.getBoolean() ? new Value(getDouble()) : new Value(0);
        } else if (isBoolean() && right.isBoolean()) {
            return getBoolean() ? new Value(right.getBoolean()) : FALSE;
        } else {                                // this won't happen
            throw new UnknownException("func: Value.mul(), Value: " + value + " isNull: " + isNull);
        }
    }

    public Value mod(Value right) {
        return FALSE;
    }

    public Value add(Value right) {
        return FALSE;
    }

    // COMPARISON OPERATORS
    public Value gt(Value right) {
        return comparisonEval(right, (l, r) -> l > r);
    }

    public Value gte(Value right) {
        return comparisonEval(right, (l, r) -> l >= r);
    }

    public Value lt(Value right) {
        return comparisonEval(right, (l, r) -> l < r);
    }

    public Value lte(Value right) {
        return comparisonEval(right, (l, r) -> l <= r);
    }

    public Value eq(Value right) {
        if (isNumber() && right.isNumber()) {
            return comparisonEval(right, (l, r) -> l == r);
        } else if (isString() && right.isString()) {
            return getString().equals(right.getString()) ? TRUE : FALSE;
        }
        return FALSE;
    }

    public Value neq(Value right) {
        Value eq = eq(right);
        return eq.equals(TRUE) ? FALSE : TRUE;
    }

    public Value not() {
        if (getNumber() == 0) {
            return TRUE;
        }
        return FALSE;
    }

    public Value and(Value right) {
        return isTrue() && right.isTrue() ? TRUE : FALSE;
    }

    public Value or(Value right) {
        return isTrue() || right.isTrue() ? TRUE : FALSE;
    }

    private Value comparisonEval(Value right, BiFunction<Long, Long, Boolean> comparison) {
        if (comparison.apply((long) getNumber(), (long) right.getNumber())) {
            return TRUE;
        }
        return FALSE;
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