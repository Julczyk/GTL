package Values;

import GreenTextLangBase.GreenTextLangParser;

public class FunctionValue extends Value {

    public FunctionValue(GreenTextLangParser.Function_declarationContext func) {
        super(func, new Type(Type.BaseType.FUNCTION, func.NAME().getText()));
    }
}
