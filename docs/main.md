# GTL documentation

Nazwa: Green Text Programming Language, w skrócie GTL (GreenTextLang)
Jest to język programowania, który ma na celu zmienić programowanie w pisanie krótkich historii, podobnych do klasycznego formatu greentext z 4chana.
# Główna właściwość
każda linia kodu musi być rozpoczęta sekwencją ` > `.
## Komentarze

Każda linijka musi być porzedzona znakiem `>`, po tym znaku musi nastąpić spacja.
Linijka nie poprzedzona tym znakiem jest traktowana jako komentarz.
Komentarz w tej samej linijce musi być poprzedzony znakiem `#`.

## Zmienne

Zmienne muszą mieć podany swój typ: `type var_name`.

Kilka wbudowanych typów prostych:
- int       - `see`
- double    - `taste`
- string    - `hear`
- boolean   - `smell`
- other (structs, etc) - `spot`

Oraz typów złożonych:
- `multiple` - słowo to poprzedza typ, aby zdefiniować tablicę
- `ref`      - słowo to poprzedza nazwę zmiennej, aby zdefiniować referencję do niej

Aby stworzyć własną strukturę/typ należy napisać:\
`> look around`\
`> struct_name`\
tutaj podać typy proste\
`> vibe with it` - oznacza koniec definicji typu (struktury)

Nazwy stuktur nie mogą zaczynać się od cyfry. Po za tym dozwolone są wszystkie (włącznie z emotikonami) oprócz spacji. Spacja oznacza koniec nazwy.

Przypisanie do zmiennej jest przez słowo kluczowe `is`.
```
> taste baddie is 9
```

Funkcje są definiowanej słowem kluczowym `be func_name`. W następnej linijce jest podana wartość zwracana. Zwracana zmienna jest wtedy tworzona. Do niej należy wpisywać wartości, które chcemy zwrócić, ponieważ przy zakończeniu funkcji nie podaje się zwracanej zmiennej. W następnej arguementy w postaci: `likes type arg1, type arg2`. Argumenty są odzielone przecinkami lub słowem `and`.
Jeśli przed argumentem użyje się słowa `ref`, jest ono przekazywane przez referencje, czyli nie jest tworzony dublikat. Pozostałe argumenty są przekazywane przez wartość, są kopiowane.
```
 > be {function name}
 > {return type-ing} day
 > likes {argument1}, {argument2} and {argument3}
```
Funkcja, aby zwrocić wartość musić zawierać słowo `profit`. Przy tym słowie nie podaje się zwracanej zmiennej, ponieważ ta zmienna jest już stworzona i funkcja ją zwróci.
```
 > be Anon
 > see money
 > likes see ref baddie and see math
 > money is math joined by literal opposite of baddie
 > baddie is joined by 1
 > profit
tutaj zwracany jest money
```
Funkcja może być nazwana podobnie jak zmienna, lecz z wyjąkiem słowa `me`. Funkcja o nazwie `me` oznacza main(). Jest onna domyślnie wykonywana przy uruchomieniu programu.

