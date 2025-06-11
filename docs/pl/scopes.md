# Zasięgi obowiązywania zmiennych , definicji i funkcji:

## Funkcje i zmienne globalne
Globalny zakres przechowuje następujące elementy:
- **Funkcje** - Funkcje, które nie są zdefiniowane wewnątrz struktury, lub innej funkcji są globalne
- **Definicje struktur**
Funkcje niebędące zadeklarowanymi wewnątrz innych funkcji są globalne. Zmienne globalne nie istnieją. Definicje struktur obowiązują w całym programie/pliku.

### Porada: Utworzenie "zmiennej globalnej"
Ponieważ w GTL w scopie globalnym nie istnieją zmienne, aby stworzyć coś w rodzaju zmiennej globalnej, należy stworzyć strukturę, która będzie zawierała wszystkie potrzebne zmienne. Następnie należy stworzyć instancję tej struktury w scopie globalnym.

## Zakresy lokalne
Każda funkcja i zmienna niebędąca globalną obowiązuje w obrębie swojego zakresu i wszystkich podzakresów wewnątrz niego.

Zakresami lokalnymi są:
- Ciała Funkcji
- Ciała definicji struktur
- Ciała Pętli
- Ciała Instrukcji warunkowych

### Porada: Utworzenie pustego zakresu
Najprostszym sposobem na utworzenie pustego zakresu jest utworzenie zawsze prawdziwego [ifa](conditional.md):
```
 > implying c:
 {ciało zakresu/warunku}
 > or sth
```

## Widoczność obiektów w zakresach lokalnych
Obiekty zadeklarowane w zakresie lokalnym są widoczne tylko w tym zakresie i jego podzakresach.
Zakresy lokalne są de facto stosem, więc cokolwiek
## Redeklarowanie zmiennych i dostęp do nich
Zmienne zadeklarowane już w danym zakresie (czyli przy braku globalnych - wszystkie) mogą być redeklarowane, w podzakresach.

Odniesienie się do nazwy zmiennej odnosi się do jej najbliższej deklaracji (czyli najmniej zakresów "do góry")
Aby odwołać się do zmiennej, która została zakryta redeklaracją należy użyć słowa kluczowego `parent`.
Słowo `parent` może następować po sobie wiele razy, jeśli zmienna była redeklarowana w wielu podzakresach,
aby schodzić w dół stosu deklaracji zmiennych o tej samej nazwie.
### Przykład
```GTL
 > be pancake
 > see flour is 1
 > implying c:
 > see flour is 2
 > implying c:
 > see flour is 3
 > spit flour
 > spit parent flour
 > spit parent parent flour
 > or sth
 > or sth
 > profit
```
Zwróci nam
```
3
2
1
```
