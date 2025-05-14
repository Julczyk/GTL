# Zasięgi obowiązywania zmiennych , definicji i funkcji:

## Funkcje i zmienne globalne
Funkcje niebędące zadeklarowanymi wewnątrz innych funkcji są globalne. Zmienne globalne nie istnieją. Definicje struktur obowiązują w całym programie/pliku.

## Zakresy lokalne
Każda funkcja i zmienna niebędąca globalną obowiązuje w obrębie swojego zakresu i wszystkich podzakresów wewnątrz jego, lub do najbliższej pustej linii (cokolwiek wystąpi wcześniej).

Zakresami lokalnymi są m.in.:
- Ciała Funkcji
- Ciała Pętli
- Ciała Instrukcji warunkowych