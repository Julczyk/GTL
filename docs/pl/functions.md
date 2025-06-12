# Funkcje
## Najprostsza możliwa funkcja
```
 > be a
 > profit
```
Gdzie po prostu ją deklarujemy. Bez argumentów, bez wartości zwracanej. Tylko `profit`.

## Funkcja główna
Funkcja główna jest specjalną funkcją, która jest początkiem programu.
w GTLu nazywa się "me" i jest deklarowana w następujący sposób:
```
 > be me
```

## Deklaracje i argumenty
Funkcję w GTL deklaruje się następująco:
```
 > be {nazwa funkcji}
 > {typ zwracany}-ing {nazwa zmiennej zwracanej}
 > likes {typ arg1}-ing {nazwa arg1}, {typ arg2}-ing {nazwa arg2}
 > and {typ arg3}-ing {nazwa arg3}
 ```
Argumenty są deklarowane jak standardowe [zmienne](variables.md) z kluczową różnicą polegającą na tym, że słowo kluczowe danych kończy się przyrostkiem -ing.
Wiele parametrów można również podać w kolejnych liniach zaczynających się od słowa kluczowego `likes`.\
Domyślne wartości parametrów nie są obecnie obsługiwane.

przykład:
```
 > be foo
 > tasting men
 > likes seeing about 5 chicks
```
odpowiednik
```c++
double foo(int chicks[5], double guy)
```
### przekazywanie wielu argumentów
Używamy jednego słowa kluczowego `likes`, po którym definiujemy listę wszystkich argumentów.
Każde dwa kolejne argumenty mogą być oddzielone przecinkiem `,` lub słowem `and`. \
Słowo `and` może również rozpoczynać nową linię, jeśli chcemy podzielić argumenty na wiele linii.
kilka przykładów prawidłowych deklaracji funkcji:

1. string, string, int:
```
 > be professor
 > seeing grade
 > likes hearing student_name, hearing project_name and seeing grade
```

### możliwe błędy
definiowanie wielu argumentów z typem nieobecnym lub nieprawidłowym spowoduje błąd niezamkniętej funkcji.


## wywołania funkcji
```
>call {nazwa funkcji} regarding {arg1}, {arg2} and {arg3}
```

przykłady:
- `call friend regarding a and b`
- `call bob regarding 2, "Ur mom" and :c`
- `call her`


## instrukcje return
Instrukcja return i koniec ciała funkcji w GTL realizowane są za pomocą linii `` > profit``.\
która działa tak samo jak
```c++
return var;
}
```

gdzie `var` jest zmienną zwracaną zadeklarowaną w ciele funkcji.

### Ważne:
Pamiętaj, ponieważ `profit` jest końcem funkcji, musi to być ostatnia linia w ciele funkcji.
Oznacza to, że efektywnie możesz mieć tylko jedną instrukcję return w funkcji.

Aby emulować wielokrotne zwroty, możesz po prostu ustawić zmienną zwracaną na różne wartości, a następnie wywołać `profit` na końcu.
