package Value;

import Exceptions.TypeException;
import Exceptions.UnknownException;

/**
 * Value.Value class that encapsulates numeric and string values.
 * Contains all operations between them and all type errors.
 * Empty Value.Value is filled with "", 0, false appropriately
 */
public class Value {
    // Globals
    public static final Value FALSE = new BooleanValue(false);
    public static final Value TRUE = new BooleanValue(true);
    // Fields
    Object value;
    boolean isNull = false;
    public Type type;
    public enum Type {STRING, INT, DOUBLE, BOOLEAN, STRUCT, ARRAY}
    // Constructors
    Value(Object value, Type type) {
        this.value = value;
        this.type = type;
        if (value == null) this.isNull = true;
    }

    public Value(Object value, Type type, boolean isNull) {
        this.value = value;
        this.type = type;
        this.isNull = isNull;
    }
    // TYPE CASTING
    String getString() {
        return String.valueOf(value);  // There is always string representation
    }

    int getInt() {
        throw new TypeException("You cannot see what you " + getMemeType() + ".", "Invalid type conversion between integer and " + type.toString().toLowerCase());
    }

    boolean getBoolean() {
        throw new TypeException("You cannot smell what you " + getMemeType() + ".", "Invalid type conversion between boolean and " + type.toString().toLowerCase());
    }

    double getDouble() {
        throw new TypeException("You cannot taste what you " + getMemeType() + ".", "Invalid type conversion between double and " + type.toString().toLowerCase());
    }

    // ARITHMETIC OPERATIONS
    Value flip() {
        throw new TypeException("You cannot flip "+ getMemeType() + ".", "Invalid operation 'flipped' on '" + type);
    }

    Value opp() {
        throw new TypeException("You cannot the literal opposite "+ getMemeType() +".", "Invalid operation 'the literal opposite of' on '" + type);
    }

    Value mul(Value right) {
        throw new TypeException("You cannot breed like "+ getMemeType() +" with "+ right.getMemeType() +".", "Invalid operation 'breeding like' on '"+ type +"' and '"+ right.type +"'");
    }

    Value mod(Value right) {
        throw new TypeException("You cannot whatever is left from "+ getMemeType() +" with "+ right.getMemeType() +".", "Invalid operation 'whatever left from' on '"+ type +"' and '"+ right.type +"'");
    }

    Value add(Value right) {
        throw new TypeException("You cannot join "+ getMemeType() +" with "+ right.getMemeType() +".", "Invalid operation 'joined by' on '"+ type +"' and '"+ right.type +"'");
    }

    // COMPARISON OPERATORS
    Value gt(Value right) {
        throw new TypeException("You cannot compare "+ getMemeType() +" with "+ right.getMemeType() +".", "Invalid operation 'comparison' on '"+ type +"' and '"+ right.type +"'");
    }

    Value gte(Value right) {
        return gt(right).equals(TRUE) ? TRUE : eq(right);
    }

    Value lt(Value right) {
        throw new TypeException("You cannot compare "+ getMemeType() +" with "+ right.getMemeType() +".", "Invalid operation 'comparison' on '"+ type +"' and '"+ right.type +"'");
    }

    Value lte(Value right) {
        return lt(right).equals(TRUE) ? TRUE : eq(right);
    }

    Value eq(Value right) {
        throw new TypeException("You cannot compare "+ getMemeType() +" with "+ right.getMemeType() +".", "Invalid operation 'comparison' on '"+ type +"' and '"+ right.type +"'");
    }

    Value neq(Value right) {
        return eq(right).equals(TRUE) ? FALSE : TRUE;
    }


    // STATIC FUNCTIONS
    String getInfo() {
        return ", Value.Value: " + value + ", isNull: " + isNull + ", type: " + type;
    }

    String getMemeType() {
        return switch(type) {
            case STRING -> "hear";
            case INT -> "see";
            case BOOLEAN -> "smell";
            case DOUBLE -> "taste";
            default -> throw new UnknownException("func: Value.Value.getMemeType()" + getInfo()); // this won't happen
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