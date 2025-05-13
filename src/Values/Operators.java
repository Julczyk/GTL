package Values;

import Exceptions.InterpreterException;
import Exceptions.TypeException;

public class Operators {

    public static String getString(Value val) {
        if (val.isNull) {
            return "null";
        }
        return val.getString();
    }

    public static Value automaticCastValue(Value valTo, Value valFrom) {
        return switch (valTo.type.baseType) {
            case BOOLEAN -> Operators.castBoolean(valFrom);
            case STRING -> Operators.castString(valFrom);
            case INT -> Operators.castInt(valFrom);
            case DOUBLE -> Operators.castDouble(valFrom);
            default ->
                    throw new TypeException("Unable to cast " + valFrom.getMemeType() + " to " + valTo.getMemeType(), "Unable to cast " + valFrom.type + " to " + valTo.type);
        };
    }

    public static Value castValue(Value valFrom, Type type) {
        if (valFrom.type.baseType == Type.BaseType.STRING) {
            if (type.baseType == Type.BaseType.INT) {      // parse string
                return new IntegerValue(valFrom.getString());
            }
            if (type.baseType == Type.BaseType.DOUBLE) {
                return new DoubleValue(valFrom.getString());
            }
            if (type.baseType == Type.BaseType.BOOLEAN) {
                return new BooleanValue(valFrom.getString());
            }
        }
        if (valFrom.type.baseType == Type.BaseType.BOOLEAN) {
            if (type.baseType == Type.BaseType.INT) {       // bool to int
                if (valFrom.getBoolean()) valFrom = new IntegerValue(1);
                else valFrom = new IntegerValue(0);
                return valFrom;
            }
            if (type.baseType == Type.BaseType.DOUBLE) {    // bool to double
                if (valFrom.getBoolean()) valFrom = new DoubleValue(1);
                else valFrom = new DoubleValue(0);
                return valFrom;
            }
        }
        // at last automatic
        return automaticCastValue(new Value(null, type), valFrom);
    }

    public static Value castString(Value val) {
        if (val.isNull) {
            return new StringValue(null);
        }
        return new StringValue(val.getString());
    }

    public static Value castInt(Value val) {
        if (val.isNull) {
            return new IntegerValue(null);
        }
        return new IntegerValue(val.getInt());
    }

    public static Value castDouble(Value val) {
        if (val.isNull) {
            return new DoubleValue(null);
        }
        return new DoubleValue(val.getDouble());
    }

    public static Value castBoolean(Value val) {
        if (val.isNull) {
            return new BooleanValue(null);
        }
        return new BooleanValue(val.getBoolean());
    }

    public static int getInt(Value val) {
        return val.getInt(); // TODO dirty hack
    }

    public static boolean isTrue(Value val) {
        if (val.isNull) {
            return false;
        }
        return val.getBoolean();
    }

    public static Value evolve(Value val) {
        if (val.isNull) {
            throw new TypeException("You cannot evolve what you don't have.", "Invalid operation 'evolve' on null value");
        }
        if (val.type.baseType != Type.BaseType.INT) {
            throw new TypeException("You cannot evolve "+ val.getMemeType() + ".", "Invalid operation 'evolve' on '" + val.type);
        }
        return val.add(new IntegerValue(1));
    }

    public static Value devolve(Value val) {
        if (val.isNull) {
            throw new TypeException("You cannot devolve what you don't have.", "Invalid operation 'devolve' on null value");
        }
        if (val.type.baseType != Type.BaseType.INT) {
            throw new TypeException("You cannot devolve "+ val.getMemeType() + ".", "Invalid operation 'devolve' on '" + val.type);
        }
        return val.add(new IntegerValue(-1));
    }

    public static Value flip(Value val) {
        if (val.isNull) {
            throw new TypeException("You cannot flip what you don't have.", "Invalid operation 'flipped' on null value");
        }
        return val.flip();
    }

    public static Value opp(Value val) {
        if (val.isNull) {
            throw new TypeException("You cannot inverse what you don't have.", "Invalid operation 'the literal opposite of' on null value");
        }
        return val.opp();
    }

    public static Value mul(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot breed like what you don't have times.", "Invalid operation 'breeding like times' on null value");
        }
        InterpreterException exception;
        try {return left.mul(right);}
        catch (TypeException e) {exception = e;}
        try {return right.mul(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value mod(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot see whatever is left from nothing.", "Invalid operation 'whatever left from' on null value");
        }
        try {return left.mod(right);}
        catch (TypeException e) {
            throw e;
        }
    }

    public static Value add(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot join nothing.", "Invalid operation 'joined by' on null value");
        }
        InterpreterException exception;
        try {return left.add(right);}
        catch (TypeException e) {exception = e;}
        try {return right.add(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value gt(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot be beat nothing.", "Invalid operation 'beats' on null value");
        }
        InterpreterException exception;
        try {return left.gt(right);}
        catch (TypeException e) {exception = e;}
        try {return right.lte(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value gte(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot be beat nothing.", "Invalid operation 'beats' on null value");
        }
        InterpreterException exception;
        try {return left.gte(right);}
        catch (TypeException e) {exception = e;}
        try {return right.lt(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value lt(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot be not beat nothing.", "Invalid operation 'doesn't beat' on null value");
        }
        InterpreterException exception;
        try {return left.lt(right);}
        catch (TypeException e) {exception = e;}
        try {return right.gte(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value lte(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot be beat nothing.", "Invalid operation 'beats' on null value");
        }
        InterpreterException exception;
        try {return left.lte(right);}
        catch (TypeException e) {exception = e;}
        try {return right.gt(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value eq(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot vibe with nothing.", "Invalid operation 'vibe with' on null value");
        }
        InterpreterException exception;
        try {return left.eq(right);}
        catch (TypeException e) {exception = e;}
        try {return right.eq(left);}
        catch (TypeException e) {
            throw exception;
        }
    }

    public static Value neq(Value left, Value right) {
        if (left.isNull || right.isNull) {
            throw new TypeException("You cannot not vibe with nothing.", "Invalid operation 'vibe with' on null value");
        }
        InterpreterException exception;
        try {return left.neq(right);}
        catch (TypeException e) {exception = e;}
        try {return right.neq(left);}
        catch (TypeException e) {
            throw exception;
        }
    }
}
