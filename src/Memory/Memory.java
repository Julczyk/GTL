package Memory;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangParser;
import GreenTextLangBase.GreenTextLangParserVisitor;
import Values.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Memory.Memory for main program
 */
public class Memory {

    public Stack<HashMap<Identifier, Value>> locals = new Stack<>(); // working memory, available scopes
    public Stack<Stack<HashMap<Identifier, Value>>> locals_stack = new Stack<>();  // drop off memory
    public HashMap<Identifier, Value> globals = new HashMap<>();  // global statements

    private final int STACK_LIMIT = 200;
    private final Path filePath;

    public Memory(Path filePath) {
        this.filePath = filePath;
    }

    private void addLocation(InterpreterException ex, ParserRuleContext ctx) {
        ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), filePath);
    }

    private boolean isGlobal() {
        return locals_stack.size() == 0 ? locals.size() == 1 : false;
    }

    private void assertNotExists(Identifier memoryName) throws VariableNotFoundException {
        if (locals.peek().containsKey(memoryName)) {
            throw new VariableNotFoundException("Double " + memoryName.toMemeString() + " and give it to the next person.",
                    "Variable '" + memoryName + "' has already been declared.");
        }
    }

    private void assertNotExistsGlobal(Identifier memoryName) throws VariableNotFoundException {
        if (globals.containsKey(memoryName)) {
            throw new VariableNotFoundException("Double " + memoryName.toMemeString() + " and give it to the next person.",
                    "Variable '" + memoryName + "' has already been declared.");
        }
    }

    public void createVariable(String name, GreenTextLangParser.TypeContext typeCtx) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType(typeCtx);
            if (type.baseType == Type.BaseType.STRUCT) {
                Value value = getVariable((String) type.subType);
                StructValue struct = (StructValue) value;
                StructValue newStruct = new StructValue(struct);
                locals.peek().put(memoryName, newStruct);
            } else {
                locals.peek().put(memoryName, new Value(null, type, true));
            }
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createVariable(String name, GreenTextLangParser.Type_ingContext typeCtx) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType_ing(typeCtx);
            if (type.baseType == Type.BaseType.STRUCT) {
                Value value = getVariable((String) type.subType);
                StructValue struct = (StructValue) value;
                StructValue newStruct = new StructValue(struct);
                locals.peek().put(memoryName, newStruct);
            } else {
                locals.peek().put(memoryName, new Value(null, type, true));
            }
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createVariable(String name, GreenTextLangParser.TypeContext type, Value value) {
        createVariable(name, type);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, type); throw e;
            }
        }
    }

    public void createVariable(String name, GreenTextLangParser.Type_ingContext type, Value value) {
        createVariable(name, type);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, type); throw e;
            }
        }
    }

    public void createArray(String name, GreenTextLangParser.Type_ingContext typeCtx, int length) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType_ing(typeCtx);
            locals.peek().put(memoryName, new ArrayValue(new Value[length], type));
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createArray(String name, GreenTextLangParser.TypeContext typeCtx, int length) {
        // check if exists
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            Type type = Type.inferType(typeCtx);
            locals.peek().put(memoryName, new ArrayValue(new Value[length], type));
        } catch (InterpreterException e) {
            addLocation(e, typeCtx);
            throw e;
        }
    }

    public void createArray(String name, GreenTextLangParser.Type_ingContext typeCtx, int length, Value value) {
        createArray(name, typeCtx, length);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, typeCtx);
                throw e;
            }
        }
    }

    public void createArray(String name, GreenTextLangParser.TypeContext typeCtx, int length, Value value) {
        createArray(name, typeCtx, length);
        if (value != null) {
            try {
                assign(name, value);
            } catch (InterpreterException e) {
                addLocation(e, typeCtx);
                throw e;
            }
        }
    }

    public void createFunction(GreenTextLangParser.Function_declarationContext funcCtx) {
        var memoryName = new Identifier(funcCtx);
        try {
            assertNotExists(memoryName);
            if (isGlobal()) {
                assertNotExistsGlobal(memoryName);
                globals.put(memoryName, new FunctionValue(funcCtx));
            } else {
                locals.peek().put(memoryName, new FunctionValue(funcCtx));
            }
        }  catch (InterpreterException e) {
            addLocation(e, funcCtx);
            throw e;
        }
    }

    public void createStruct(String name, HashMap<Identifier, Value> struct, GreenTextLangParser.Struct_declarationContext structCtx) {
        var memoryName = new Identifier(name);
        try {
            assertNotExists(memoryName);
            if (isGlobal()) {
                assertNotExistsGlobal(memoryName);
                globals.put(memoryName, new StructValue(struct, name));
            } else {
                locals.peek().put(memoryName, new StructValue(struct, name));
            }
        }  catch (InterpreterException e) {
            addLocation(e, structCtx);
            throw e;
        }
    }

    private void assign(String name, Value value) throws InterpreterException {
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                Value curr_val = loc.get(memoryName);
                curr_val = Operators.automaticCastValue(curr_val, value);
                loc.put(memoryName, curr_val);
                return;
            }
        }
        throw new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public StructValue getStruct(String name, GreenTextLangParser.Parent_variableContext parentCtx) {
        int scope = parentCtx.PARENT().size();
        var ctx = parentCtx.variable();
        var memoryName = new Identifier(name);
        Value value = null;
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                value = loc.get(memoryName);
                if (value.type.baseType != Type.BaseType.STRUCT) {
                    var e = new TypeException("not a struct", "Trying to access struct from not struct type.");
                    addLocation(e, ctx);
                    throw e;
                }
                return (StructValue) value;
            }
        }
        if (globals.containsKey(memoryName)) {
            value = globals.get(memoryName);
            if (value.type.baseType != Type.BaseType.STRUCT) {
                var e = new TypeException("not a struct", "Trying to access struct from not struct type.");
                addLocation(e, ctx);
                throw e;
            }
            return (StructValue) value;
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
        addLocation(e, parentCtx);
        throw e;
    }

    public void assignToStruct(StructValue struct, GreenTextLangParser.VariableContext varCtx, Value value) {
        HashMap<Identifier, Value> structMem = struct.getStruct();
        if (varCtx.S() != null) {
            String name = varCtx.NAME().getText();
            var memoryName = new Identifier(name);
            if (structMem.containsKey(memoryName)) {
                Value currValue = structMem.get(memoryName);
                if (currValue.type.baseType != Type.BaseType.STRUCT) {
                    var e = new TypeException("not a struct", "Trying to access struct from not struct type.");
                    addLocation(e, varCtx.variable());
                    throw e;
                }
                StructValue subStruct = (StructValue) currValue;
                assignToStruct(subStruct, varCtx.variable(), value);
                return;
            }
        }else if (varCtx.TH() != null) {
            int index;
            if (varCtx.NAME() != null) {
                Value idxValue = getVariable(varCtx.NAME().getText());
                if (idxValue.type.baseType != Type.BaseType.INT) {
                    var e = new TypeException("int in array", "Cannot access index which is not an int.");
                    addLocation(e, varCtx);
                    throw e;
                }
                index = Operators.getInt(idxValue);
            } else {
                index = Integer.parseInt(varCtx.DECIMAL_LITERAL().getText());
            }
            String name = varCtx.variable().NAME().getText();
            var memoryName = new Identifier(name);
            try {
                Value currValue = structMem.get(memoryName);
                if (currValue.type.baseType != Type.BaseType.ARRAY) {
                    throw new TypeException("not an array", "Trying to get element from not array type");
                }
                ArrayValue array = (ArrayValue) currValue;
                array.set(index, value);
                structMem.put(memoryName, array);
                return;
            } catch (InterpreterException e) {
                addLocation(e, varCtx);
                throw e;
            }
        }
        // else
        String name = varCtx.NAME().getText();
        var memoryName = new Identifier(name);
        if (structMem.containsKey(memoryName)) {
            try {
                Value currValue = structMem.get(memoryName);
                currValue = Operators.automaticCastValue(currValue, value);
                structMem.put(memoryName, currValue);
                return;
            } catch (InterpreterException e) {
                addLocation(e, varCtx);
                throw e;
            }
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is not in the " + struct.type.subType + ".",
                "Variable '" + memoryName + "' has not been found in the '" + struct.type.subType + "' struct");
        addLocation(e, varCtx);
        throw e;
    }

    public void assign(GreenTextLangParser.Parent_variableContext parentCtx, Value value) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            var e = new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
            addLocation(e, parentCtx);
            throw e;
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            StructValue structValue = getStruct(varCtx.NAME().getText(), parentCtx);
            assignToStruct(structValue, varCtx.variable(), value);
            return;
        } else if (varCtx.TH() != null) {
            int index;
            if (varCtx.NAME() != null) {
                Value idxValue = getVariable(varCtx.NAME().getText());
                if (idxValue.type.baseType != Type.BaseType.INT) {
                    var e = new TypeException("int in array", "Cannot access index which is not an int.");
                    addLocation(e, parentCtx);
                    throw e;
                }
                index = Operators.getInt(idxValue);
            } else {
                index = Integer.parseInt(varCtx.DECIMAL_LITERAL().getText());
            }
            var subVarCtx = varCtx.variable();  // sub arrays are not supported
            if (subVarCtx.TH() != null) {
                var e = new NotImplementedException("Sub arrays");
                addLocation(e, subVarCtx);
                throw e;
            }
            name = subVarCtx.NAME().getText();
            var memoryName = new Identifier(name);
            for (int i = 0; i < locals.size(); i++) {
                if (scope > i) continue;
                var loc = locals.get(locals.size() - i - 1); // reversed
                if (loc.containsKey(memoryName)) {
                    Value struct;
                    try {
                        Value curr_val = loc.get(memoryName);
                        if (curr_val.type.baseType != Type.BaseType.ARRAY) {
                            throw new TypeException("not an array", "Trying to get element from not array type");
                        }
                        ArrayValue array = (ArrayValue) curr_val;
                        if (subVarCtx.S() == null) {  // not a struct
                            array.set(index, value);
                            loc.put(memoryName, array);
                            return;
                        } else {  // it is a struct
                            struct = array.get(index);
                        }
                    } catch (InterpreterException e) {
                        addLocation(e, subVarCtx);
                        throw e;
                    }
                    if (subVarCtx.S() != null) { // it is a struct
                        if (struct.type.baseType != Type.BaseType.STRUCT) {
                            var e = new TypeException("not a struct", "Trying to access struct from not struct type.");
                            addLocation(e, subVarCtx);
                            throw e;
                        }
                        StructValue structValue = (StructValue) struct;
                        assignToStruct(structValue, subVarCtx.variable(), value);
                        return;
                    }
                }
            }
            return;
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name);
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                try {
                    Value curr_val = loc.get(memoryName);
                    curr_val = Operators.automaticCastValue(curr_val, value);
                    loc.put(memoryName, curr_val);
                    return;
                } catch (InterpreterException e) {
                    addLocation(e, parentCtx);
                    throw e;
                }
            }
        }
        if (globals.containsKey(memoryName)) {
            try {
                Value curr_val = globals.get(memoryName);
                curr_val = Operators.automaticCastValue(curr_val, value);
                globals.put(memoryName, curr_val);
                return;
            } catch (InterpreterException e) {
                addLocation(e, parentCtx);
                throw e;
            }
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
        addLocation(e, parentCtx);
        throw e;
    }

    public Value getVariable(String name) throws InterpreterException {
        var memoryName = new Identifier(name);
        for (var loc : locals.reversed()) {
            if (loc.containsKey(memoryName)) {
                return loc.get(memoryName);
            }
        }
        if (globals.containsKey(memoryName)) {
            return globals.get(memoryName);
        }
        throw new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
    }

    public Value getFromStruct(StructValue struct, GreenTextLangParser.VariableContext varCtx) {
        HashMap<Identifier, Value> structMem = struct.getStruct();
        if (varCtx.S() != null) {
            String name = varCtx.NAME().getText();
            var memoryName = new Identifier(name);
            if (structMem.containsKey(memoryName)) {
                Value value = structMem.get(memoryName);
                if (value.type.baseType != Type.BaseType.STRUCT) {
                    var e = new TypeException("not a struct", "Trying to access struct from not struct type.");
                    addLocation(e, varCtx.variable());
                    throw e;
                }
                StructValue subStruct = (StructValue) value;
                return getFromStruct(subStruct, varCtx.variable());
            }
        } else if (varCtx.TH() != null) {
            int index;
            if (varCtx.NAME() != null) {
                Value idxValue;
                try {
                    idxValue = getVariable(varCtx.NAME().getText());
                } catch (InterpreterException e) {
                    addLocation(e, varCtx);
                    throw e;
                }
                if (idxValue.type.baseType != Type.BaseType.INT) {
                    var e = new TypeException("int in array", "Cannot access index which is not an int.");
                    addLocation(e, varCtx);
                    throw e;
                }
                index = Operators.getInt(idxValue);
            } else {
                index = Integer.parseInt(varCtx.DECIMAL_LITERAL().getText());
            }
            Value arrayValue = getFromStruct(struct, varCtx.variable());
            if (arrayValue.type.baseType != Type.BaseType.ARRAY) {
                var e = new TypeException("not an array", "Trying to get element from not array type");
                addLocation(e, varCtx.variable());
                throw e;
            }
            ArrayValue array = (ArrayValue) arrayValue;
            try {
                return array.get(index);
            } catch (InterpreterException e) {
                addLocation(e, varCtx.variable());
                throw e;
            }
        }
        // else
        String name = varCtx.NAME().getText();
        var memoryName = new Identifier(name);
        if (structMem.containsKey(memoryName)) {
            return structMem.get(memoryName);
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is not in the " + struct.type.subType + ".",
                "Variable '" + memoryName + "' has not been found in the '" + struct.type.subType + "' struct");
        addLocation(e, varCtx);
        throw e;
    }

    public Value getVariable(GreenTextLangParser.Parent_variableContext parentCtx) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            var e = new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
            addLocation(e, parentCtx);
            throw e;
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            StructValue struct = getStruct(varCtx.NAME().getText(), parentCtx);
            return getFromStruct(struct, varCtx.variable());
        } else if (varCtx.TH() != null) {
            int index;
            if (varCtx.NAME() != null) {
                Value idxValue;
                try {
                    idxValue = getVariable(varCtx.NAME().getText());
                } catch (InterpreterException e) {
                    addLocation(e, parentCtx);
                    throw e;
                }
                if (idxValue.type.baseType != Type.BaseType.INT) {
                    var e = new TypeException("int in array", "Cannot access index which is not an int.");
                    addLocation(e, parentCtx);
                    throw e;
                }
                index = Operators.getInt(idxValue);
            } else {
                index = Integer.parseInt(varCtx.DECIMAL_LITERAL().getText());
            }
            var subVarCtx = varCtx.variable();  // sub arrays are not supported
            if (subVarCtx.TH() != null) {
                var e = new NotImplementedException("Sub arrays");
                addLocation(e, subVarCtx);
                throw e;
            }
            // get name
            name = subVarCtx.NAME().getText();
            var memoryName = new Identifier(name);
            for (int i = 0; i < locals.size(); i++) {
                if (scope > i) continue;
                var loc = locals.get(locals.size() - i - 1); // reversed
                if (loc.containsKey(memoryName)) {
                    Value value;
                    try {
                        Value curr_val = loc.get(memoryName);
                        if (curr_val.type.baseType != Type.BaseType.ARRAY) {
                            var e = new TypeException("not an array", "Trying to get element from not array type");
                            addLocation(e, subVarCtx);
                            throw e;
                        }
                        ArrayValue array = (ArrayValue) curr_val;
                        value = array.get(index);
                    } catch (InterpreterException e) {
                        addLocation(e, subVarCtx);
                        throw e;
                    }
                    if (subVarCtx.S() != null) {
                        if (value.type.baseType != Type.BaseType.STRUCT) {
                            var e = new TypeException("not a struct", "Trying to access struct from not struct type.");
                            addLocation(e, subVarCtx);
                            throw e;
                        }
                        StructValue structValue = (StructValue) value;
                        return getFromStruct(structValue, subVarCtx.variable());
                    } else {
                        return value;
                    }
                }
            }
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name);
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                return loc.get(memoryName);
            }
        }
        if (globals.containsKey(memoryName)) {
            return globals.get(memoryName);
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                "Variable '" + memoryName + "' has not been found in this scope");
        addLocation(e, parentCtx);
        throw e;
    }

    public FunctionValue getFunctionFromStruct(StructValue struct, GreenTextLangParser.VariableContext varCtx, List<Type> funcArgs) {
        HashMap<Identifier, Value> structMem = struct.getStruct();
        if (varCtx.S() != null) {
            String name = varCtx.NAME().getText();
            var memoryName = new Identifier(name);
            if (structMem.containsKey(memoryName)) {
                Value value = structMem.get(memoryName);
                if (value.type.baseType != Type.BaseType.STRUCT) {
                    var e = new TypeException("not an struct", "Trying to access struct from not struct type.");
                    addLocation(e, varCtx.variable());
                    throw e;
                }
                StructValue subStruct = (StructValue) value;
                return getFunctionFromStruct(subStruct, varCtx.variable(), funcArgs);
            }
        } else if (varCtx.TH() != null) {
            var e = new NotImplementedException("Array");
            addLocation(e, varCtx.variable());
            throw e;
        }
        // else
        String name = varCtx.NAME().getText();
        var memoryName = new Identifier(name, funcArgs);
        if (structMem.containsKey(memoryName)) {
            Value function = structMem.get(memoryName);
            if (function instanceof FunctionValue) {
                return (FunctionValue) function;
            } else {
                var e = new UnknownException("Memory.getFunctionFromStruct");
                addLocation(e, varCtx);
                throw e;
            }
        }
        // try to do it with struct as first argument
        funcArgs.addFirst(struct.type);
        memoryName = new Identifier(name, funcArgs);
        if (structMem.containsKey(memoryName)) {
            Value function = structMem.get(memoryName);
            if (function instanceof FunctionValue) {
                return new FunctionValue((FunctionValue) function, struct);
            } else {
                var e = new UnknownException("Memory.getFunctionFromStruct");
                addLocation(e, varCtx);
                throw e;
            }
        }
        var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is not in the " + struct.type.subType + ".",
                "Variable '" + memoryName + "' has not been found in the '" + struct.type.subType + "' struct");
        addLocation(e, varCtx);
        throw e;
    }

    public FunctionValue getFunction(GreenTextLangParser.Parent_variableContext parentCtx, List<Type> funcArgs) {
        int scope = parentCtx.PARENT().size();
        if (scope >= locals.size()) {
            var e = new VariableNotFoundException("Bro you high, cause you went too high.", "Not enough scopes to escape.");
            addLocation(e, parentCtx);
            throw e;
        }
        var varCtx = parentCtx.variable();
        String name;
        if (varCtx.S() != null) {
            StructValue struct = getStruct(varCtx.NAME().getText(), parentCtx);
            return getFunctionFromStruct(struct, varCtx.variable(), funcArgs);
        } else if (varCtx.TH() != null) {
            var e = new NotImplementedException("Array");
            addLocation(e, parentCtx);
            throw e;
        } else {
            name = varCtx.NAME().getText();
        }
        var memoryName = new Identifier(name, funcArgs);
        Value function = null;
        for (int i = 0; i < locals.size(); i++) {
            if (scope > i) continue;
            var loc = locals.get(locals.size() - i - 1); // reversed
            if (loc.containsKey(memoryName)) {
                function = loc.get(memoryName);
            }
        }
        if (function == null && globals.containsKey(memoryName)) {
            function = globals.get(memoryName);
        }
        if (function == null) {
            var e = new VariableNotFoundException("Your " + memoryName.toMemeString() + " is missing, maybe he went to buy milk and hasn't returned yet.",
                    "Variable '" + memoryName + "' has not been found in this scope");
            addLocation(e, parentCtx);
            throw e;
        }
        if (function instanceof FunctionValue) {
            return (FunctionValue) function;
        } else {
            var e = new UnknownException("Memory.getFunction");
            addLocation(e, parentCtx);
            throw e;
        }
    }

    public void beginScope() {
        locals.push(new HashMap<>());
    }

    public void endScope() {
        locals.pop();
    }

    public void beginStruct() {
        locals_stack.push(locals);
        locals = new Stack<>();
        beginScope();
    }

    public void endStruct() {
        endScope();
        locals = locals_stack.pop();
    }

    public void beginFunction(FunctionValue func) throws StackOverflowException {
        if (locals_stack.size() >= STACK_LIMIT) {
            throw new StackOverflowException("Don't repeat yourself. Don't repeat yourself. Don't repeat your... Error",
                    "Max recursion limit reached.");
        }
        locals_stack.push(locals);
        locals = new Stack<>();
        beginScope();
        createFunction(func.getFunction()); // for recursion
    }

    public void endFunction() {
        endScope();
        locals = locals_stack.pop();
    }

    public void free() {
        locals.clear();
        globals.clear();
    }
}