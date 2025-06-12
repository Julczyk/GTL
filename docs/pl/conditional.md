# Instrukcje warunkowe w GTL

Instrukcje warunkowe strukturalnie przypominają klasyczne if else.

## Składnia
```
>implying {wyrażenie}
{ciało1}
>or {wyrażenie}
{ciało2}
>or not
{ciało3}
>or sth
```
co zgodnie ze standardową konwencją (np. C) zostałoby napisane jako
```
if({wyrażenie}){
    ciało1;
}
else if({wyrażenie}){
    ciało2;
}
else{
    ciało3;
}
```

## Szczegóły
### instrukcja if:
```
 > implying {wyrażenie}
 > {ciało instrukcji}
 > or sth
```
linia `> or sth` może być postrzegana jako nawias zamykający instrukcję. Blok kodu między ` > implying ...` a ` > or sth` jest oceniany, jeśli `{wyrażenie}` jest `c:` lub niezerowe.

### instrukcja if / else:
```
 > implying {wyrażenie}
 > {ciało if}
 > or not
 > {ciało instrukcji}
 > or sth
```
linia `> or sth` może być postrzegana jako nawias zamykający instrukcję else.\
`> or not` opuszcza blok kodu instrukcji if i wchodzi do instrukcji else. To jest podstawowe else bez dalszych warunków. Dla else if spójrz poniżej.

### instrukcja if / else if / else:
```
 > implying {wyrażenie}
 > {ciało if}
 > or {wyrażenie}
 > {ciało pierwszego else if}
 > or {wyrażenie}
 > {ciało kolejnego else if}
 > or not
 > {ciało else}
 > or sth
```
