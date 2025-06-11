## Pętle
## Pętla think that
GTL posiada jeden, podstawowy rodzaj pętli - "think that".
Programiści używający innych języków znają ją pewnie pod nazwą pętli "while".

## Składnia
Główna składnia pętli "think that" wygląda następująco:
```
 > think that {expression}
{body}
 > reconsider
```
Co w standardowej konwencji (np. C) zostałoby napisane jako
```
while({expression}){
    body;
}
```

Pętla jest wykonywana dopóki {expression} jest true (czyli nie jest `:c` lub zerem).
Wewnątrz pętli można wstawić inne pętle i dowolną liczbę instrukcji. Należy przy tym pamiętać, że ciało pętli jest [zakresem lokalnym](scopes.md).

Należy również pamiętać, że pętla nie zostanie wykonana ani razu, jeśli na początku warunek nie jest spełniony.