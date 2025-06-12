# Czytanie i wyświetlanie danych.
## Czytanie z stdin:
GTL pozwala na czytanie danych z wejścia standardowego (stdin) za pomocą polecenia ` > swallow`.\
Dane wprowadzone przez użytkownika są automatycznie konwertowane na odpowiedni typ danych, jeśli to możliwe.
Domyślnie są traktowane jako tekst/string.

## Wypisywanie na stdout:
Aby wypisać dane na standardowe wyjście (stdout), używamy polecenia ` > spit`.\
Zarówno L-wartości, jak i R-wartości występujące po tym poleceniu są konwertowane na tekst/string (o ile już nim nie są) i wyświetlane na ekranie.

### Przykład użycia:
```
 > see value
 > swallow value
 > value is breeding like 2 times
 > spit value
```
Wypisze nam podaną liczbę pomnożoną przez 2.