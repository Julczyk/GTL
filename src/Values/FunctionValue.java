package Values;

import GreenTextLangBase.GreenTextLangParser;

import java.util.List;

public class FunctionValue extends Value {

    public FunctionValue(GreenTextLangParser.Function_declarationContext func) {
        super(func, new Type(Type.BaseType.FUNCTION, func.NAME().getText()));
    }

    public List<GreenTextLangParser.Statement_newlineContext> getFunctionBody() {
        return ((GreenTextLangParser.Function_declarationContext) value).statement_newline();
    }

    public GreenTextLangParser.Function_declarationContext getFunction() {
        return (GreenTextLangParser.Function_declarationContext) value;
    }
}
