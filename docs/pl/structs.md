## definiowanie struktur danych:
struktury danych definiuje się od linii
` > look around`\
po której następuje linia z nazwą struktury.\
Następnie pola są wymieniane za pomocą standardowych deklaracji [zmiennych/kolekcji](variables.md).\
#TODO: w razie potrzeby uzupełnić definicję
Zakończ definicję za pomocą ` > lose interest`

przykład:
```
 > look around
 > table
 > see count
 > hear contents
 > hear about 5 attributes
 > lose interest
```
jest odpowiednikiem kodu C++:
```C++
struct table{
    int count;
    String contents;
    String attributes[5];
}
```
### Definiowanie struktury danych z metodami (de facto klasy):
```
 > look around
 > room
 > see chair
 > hear mom
 > hear about 5 sister
 > be sister_talk
 > likes seeing it
 > think that it unbeaten by 5 joined by the literal opposite of it
 > spit it'th sister
 > profit
 > lose interest
```

## Dostęp do struktur danych:
Aby uzyskać dostęp do pól struktury danych, używamy operatora `'s`.

Na przykład, jeśli chcemy zwiększyć pole `count` struktury `table`, możemy napisać:
```
 > table's count evolves
```

Podobnie możemy uzyskać dostęp do metod struktur danych:
Przykład do metody zadeklarowanej powyżej:
```
 > call room's sister_talk regarding 3
```
