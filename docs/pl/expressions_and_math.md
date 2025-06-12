# wyrażenia

### wartości logiczne (booleans)
- `:c` := false
- `c:` := true

## porządkowanie (ordering)
- `>` := `beats`
- `<` := `beaten by`
# `=` (przypisanie) to `is`. Do porównania równości użyj `==` (`vibe with`).
- `==` := `vibe with`
- `>=` := `unbeaten by`
- `<=` := `doesn't beat`

## Podstawowe operatory matematyczne
- dodawanie: ` > X joined by Y` - `X+Y`
- mnożenie: ` > X breeding like Y times` - `X*Y`
- negacja: ` > the literal opposite of X` - `-X`\
**UWAGA:** Odejmowanie osiąga się przez negację i dodawanie:\
(przykład: ` > X is joined by the literal opposite of Y` = `X-=Y`)
- modulo: ` > X is whatever left from Y` = `X%Y`
- odwrotność: ` > X flipped`\
**UWAGA:** Dzielenie osiąga się przez mnożenie i odwrotność:\
(przykład: ` > X is Y breeding like the literal opposite of Z times` = `X=Y*1/Z`= `X=Y/Z`)

## nawiasy
W GTL `(` i `)` są używane do grupowania wyrażeń w standardowy sposób.\

## Kolejność działań
Standardowa kolejność działań jest używana w wyrażeniach matematycznych.
1. Nawiasy `()`
2. Właściwości unarne:
   - `flipped`
   - `the literal opposite of`
3. Operacje multiplikatywne:
   - `breeding like Y times`
   - `whatever left from Y`
4. Operacje addytywne:
   - `joined by Y`
5. Operacje porównania:
   - `beats`, `beaten by`, `vibe with`, `doesn't vibe with`, `unbeaten by`, `doesn't beat`
6. Logiczne NOT:
   - `not`
7. Logiczne AND:
   - `also`
8. Logiczne OR:
   - `alternatively`

Operatory na tym samym poziomie pierwszeństwa są wykonywane od lewej do prawej.
