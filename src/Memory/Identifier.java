package Memory;

import GreenTextLangBase.GreenTextLangParser;
import Values.Type;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class Identifier {
    Object id;

    public Identifier(String name) {
        id = name;
    }

    public Identifier(GreenTextLangParser.Function_declarationContext funcCtx) {
        String name = funcCtx.NAME().getText();
        List<Type> types = new ArrayList<>();
        if (funcCtx.function_arguments() != null) {
            for (var arg : funcCtx.function_arguments().variable_declaration_ing()) {
                types.add(Type.inferType_ing(arg.type_ing()));
            }
        }
        id = new Pair<String, List<Type>>(name, types);
    }

    public Identifier(String name, List<Type> types) {
        id = new Pair<String, List<Type>>(name, types);
    }

    public Identifier(String name, GreenTextLangParser.Function_argumentsContext funcArgCtx) {
        List<Type> types = new ArrayList<>();
        for (var arg : funcArgCtx.variable_declaration_ing()) {
            types.add(Type.inferType_ing(arg.type_ing()));
        }
        id = new Pair<String, List<Type>>(name, types);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identifier that = (Identifier) o;
        return id.toString().equals(that.id.toString());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        if (id instanceof Pair) {
            var pair = (Pair<String, List<Type>>) id;
            var name = pair.a;
            var types = pair.b;
            return "function: " + name + " " + types;
        } else {
            return id.toString();
        }
    }
}
