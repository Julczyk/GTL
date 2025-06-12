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

## konwersja typów
### Jawne Castowanie (Explicite)

*   **Składnia:** `let me <typ> <wyrażenie_atom>`
*   **Działanie:** Fraza `let me` służy do jawnego rzutowania wartości wynikającej z `<wyrażenie_atom>` na określony `<typ>`.
*  **Przykład w GTL:**
    `let me see "123"` – rzutuje string "123" na typ `see` (integer).
    `let me taste hearingAmount` – jeśli `hearingAmount` jest np. typu `hear` (string), to próbuje rzutować jego wartość na `taste` (double).

### 2. Niejawne Castowanie (Automatyczne)

GTL intensywnie wykorzystuje niejawne castowanie w różnych sytuacjach:

1.  **Przypisania do zmiennych:** - 
 Gdy przypisujesz wartość do zmiennej, która już istnieje (i ma określony typ), GTL próbuje automatycznie skonwertować przypisywaną wartość do typu zmiennej.
2.  **Przypisania do elementów tablicy:** -
Gdy ustawiasz wartość elementu tablicy, przypisywana wartość jest automatycznie konwertowana do typu elementów tej tablicy.
3.  **Operacje arytmetyczne i logiczne:**
   Jeśli bezpośrednia konwersja w ramach operacji nie jest możliwa, może być rzucony `wyjątek.
4.  **Przekazywanie argumentów do funkcji:**

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
