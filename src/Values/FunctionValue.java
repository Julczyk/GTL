package Values;

import GreenTextLangBase.GreenTextLangParser;

import java.util.List;

public class FunctionValue extends Value {
    StructValue firstArgument = null;

    public FunctionValue(GreenTextLangParser.Function_declarationContext func) {
        super(func, new Type(Type.BaseType.FUNCTION, func.NAME().getText()));
    }

    public FunctionValue(FunctionValue func, StructValue firstArgument) {
        super(func.value, func.type);
        this.firstArgument = firstArgument;
    }

    public List<GreenTextLangParser.Statement_newlineContext> getFunctionBody() {
        return ((GreenTextLangParser.Function_declarationContext) value).statement_newline();
    }

    public GreenTextLangParser.Function_declarationContext getFunction() {
        return (GreenTextLangParser.Function_declarationContext) value;
    }

    public void setFirstArgument(StructValue value) {
        firstArgument = value;
    }

    public StructValue getFirstArgument() {
        return firstArgument;
    }

    @Override
    public String toString() {
        return "\b";
    }
}
