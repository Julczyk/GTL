package Values;

import Exceptions.UnknownException;
import GreenTextLangBase.GreenTextLangParser;

public class Type {
    public BaseType baseType;  // base type
    public Object subType;  // string for structs and functions, Type for types

    public enum BaseType {STRING, INT, DOUBLE, BOOLEAN, STRUCT, ARRAY, FUNCTION}

    public Type(BaseType baseType) {
        if (baseType == BaseType.ARRAY) {
            throw new UnknownException("Type creation error");
        }
        this.baseType = baseType;
        this.subType = null;
    }

    public Type(BaseType baseType, Type subType) {
        if (baseType != BaseType.ARRAY) {
            throw new UnknownException("Type creation error");
        }
        this.baseType = baseType;
        this.subType = subType;
    }

    public Type(BaseType baseType, String structName) {
        if (baseType != BaseType.FUNCTION && baseType != BaseType.STRUCT) {
            throw new UnknownException("Type creation error");
        }
        this.baseType = baseType;
        this.subType = structName;
    }

    public boolean isString() {
        return baseType == BaseType.STRING;
    }

    public boolean isInt() {
        return baseType == BaseType.INT;
    }

    public boolean isDouble() {
        return baseType == BaseType.DOUBLE;
    }

    public boolean isBoolean() {
        return baseType == BaseType.BOOLEAN;
    }

    public static Type inferType(GreenTextLangParser.TypeContext typeCtx) {
        Type type;
        // primitive typeCtx
        if (typeCtx.primitive_type() != null) {
            type = new Type(inferPrimitiveType(typeCtx.primitive_type()));
        }
        // complex typeCtx
        else if (typeCtx.complex_type() != null) {
            var complexType = typeCtx.complex_type();
            if (complexType.primitive_type() != null) {
                // primitive array
                Type subType = new Type(inferPrimitiveType(complexType.primitive_type()));
                type = new Type(BaseType.ARRAY, subType);
            } else if (complexType.SPOT() != null) {
                // struct array
                Type struct = inferStruct(complexType.nested_name());
                type = new Type(BaseType.ARRAY, struct);
            } else {
                throw new UnknownException("Unhandled case: " + complexType.getText());
            }
        }
        // struct typeCtx
        else if (typeCtx.struct_type() != null) {
            type = inferStruct(typeCtx.struct_type().nested_name());
        } else {
            throw new UnknownException("Unhandled case: " + typeCtx.getText());
        }
        return type;
    }

    private static BaseType inferPrimitiveType(GreenTextLangParser.Primitive_typeContext primitiveType) {
        BaseType baseType;
        if (primitiveType.SEE() != null) {
            baseType = BaseType.INT;
        } else if (primitiveType.TASTE() != null) {
            baseType = BaseType.DOUBLE;
        } else if (primitiveType.HEAR() != null) {
            baseType = BaseType.STRING;
        } else if (primitiveType.SMELL() != null) {
            baseType = BaseType.BOOLEAN;
        } else {
            throw new UnknownException("Unhandled case: " + primitiveType.getText());
        }
        return baseType;
    }

    private static Type inferStruct(GreenTextLangParser.Nested_nameContext nestedName) {
        return new Type(BaseType.STRUCT, nestedName.getText()); // TODO it is not correct
    }

    public static Type inferType_ing(GreenTextLangParser.Type_ingContext type_ingCtx) {
        Type type;
        // primitive type_ingCtx
        if (type_ingCtx.primitive_type_ing() != null) {
            type = new Type(inferPrimitiveType_ing(type_ingCtx.primitive_type_ing()));
        }
        // complex type_ingCtx
        else if (type_ingCtx.complex_type_ing() != null) {
            var complexType = type_ingCtx.complex_type_ing();
            if (complexType.primitive_type_ing() != null) {
                // primitive array
                Type subType = new Type(inferPrimitiveType_ing(complexType.primitive_type_ing()));
                type = new Type(BaseType.ARRAY, subType);
            } else if (complexType.SPOTTING() != null) {
                // struct array
                Type struct = inferStruct(complexType.nested_name());
                type = new Type(BaseType.ARRAY, struct);
            } else {
                throw new UnknownException("Unhandled case: " + complexType.getText());
            }
        }
        // struct type_ingCtx
        else if (type_ingCtx.struct_type_ing() != null) {
            type = inferStruct(type_ingCtx.struct_type_ing().nested_name());
        } else {
            throw new UnknownException("Unhandled case: " + type_ingCtx.getText());
        }
        return type;
    }

    private static BaseType inferPrimitiveType_ing(GreenTextLangParser.Primitive_type_ingContext primitiveType) {
        BaseType baseType;
        if (primitiveType.SEEING() != null) {
            baseType = BaseType.INT;
        } else if (primitiveType.TASTING() != null) {
            baseType = BaseType.DOUBLE;
        } else if (primitiveType.HEARING() != null) {
            baseType = BaseType.STRING;
        } else if (primitiveType.SMELLING() != null) {
            baseType = BaseType.BOOLEAN;
        } else {
            throw new UnknownException("Unhandled case: " + primitiveType.getText());
        }
        return baseType;
    }

    public String getMemeType() {
        String basicType = getMemeType(this.baseType);
        if (subType != null) {
            String subType;
            if (this.subType == BaseType.STRUCT || this.subType == BaseType.FUNCTION) {
                subType = (String) this.subType;
            } else {
                subType = ((Type) this.subType).getMemeType();
            }
            return basicType + " " + subType;
        } else {
            return basicType;
        }
    }

    private static String getMemeType(BaseType baseType) {
        return switch(baseType) {
            case STRING -> "hear";
            case INT -> "see";
            case BOOLEAN -> "smell";
            case DOUBLE -> "taste";
            case ARRAY -> "multiple";
            case STRUCT -> "spot";
            case FUNCTION -> "be";
            default -> throw new UnknownException("func: Value.Type.getMemeType()" + baseType); // this won't happen
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        if (type.baseType.equals(baseType)) {
            if (type.subType == null && this.subType == null) {
                return true;
            } else if (type.subType == null || this.subType == null) {
                return false;
            } else {
                return this.subType.equals(type.subType);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return baseType.hashCode() + (subType != null ? subType.hashCode() : 0);
    }

    @Override
    public String toString() {
        return baseType.toString() + (subType != null ? (" " + subType.toString()) : "");
    }
}
