# Typy, zmienne i struktury danych w GTL

## podstawowe typy danych:

### Słowa kluczowe dla podstawowych typów zmiennych:
- int       - `see`
- double    - `taste`
- string    - `hear`
- boolean   - `smell`
- inne (struktury, itp.) - `spot`

### Przypisywanie wartości:
Po nazwie użyj słowa kluczowego `is`, a następnie wartość lub [wyrażenie](expressions_and_math.md).

### Deklarowanie zmiennych:
\>{typ zmiennej} {nazwa zmiennej} (is {wartość/wyrażenie})

### przykłady
```GTL
(String mada = "elo")
>hear mada is "elo"
(String madb = mada)
>hear madb is mada
(double value)
>taste value
```

## kolekcje
- `about` - słowo kluczowe podczas deklarowania tablicy o stałym rozmiarze.
- `multiple` - słowo kluczowe podczas deklarowania tablicy dynamicznej.

### tablica
Podczas deklaracji określamy tablicę po typie danych.
- Dla tablic o stałym rozmiarze: użyj słowa kluczowego `about`, po którym następuje wyrażenie określające ilość przydzielonej pamięci.\
  Na przykład: ` > see about 500 pigeons` alokuje tablicę 500 liczb całkowitych o nazwie "pigeons".
- Dla tablic dynamicznych: użyj słowa kluczowego `multiple`.\
  Na przykład: ` > see multiple birds` deklaruje dynamiczną tablicę liczb całkowitych o nazwie "birds".

#### Przypisywanie wartości do całej tablicy
Możemy przypisywać wartości po słowie kluczowym `is` używając `,` lub `and` jako separatorów między wartościami.

Na przykład: ` > see about 8 pigeons is 5, 3, 7`. To da w wyniku `[5, 3, 7, 0, 0, 0, 0, 0]` (zakładając domyślną inicjalizację na 0 dla liczb całkowitych, jeśli podano mniej wartości niż rozmiar).
Dla tablic dynamicznych: ` > see multiple pigeons is 5, 3 and 7` da w wyniku `[5, 3, 7]`.

## Dostęp przez kopię i referencję

### Kopia
Aby uzyskać dostęp do zmiennej przez kopię, w zasadzie nic nie robimy, ponieważ jest to domyślne zachowanie w GTL.\

### Referencja
Aby uzyskać dostęp do zmiennej przez referencję, używamy frazy kluczowej `someone elses` przed nazwą zmiennej.\
(Uwaga: Ogólne przypisanie referencji do zmiennej może nie być jeszcze w pełni zaimplementowane, używane głównie dla argumentów funkcji.)
