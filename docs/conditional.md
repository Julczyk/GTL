# Conditional Statements in GTL
## syntax

(Propozycja 1:)
```
>implying {expression}
>{body}
>or sth
```

## Syntax
```
>implying {expression}
{body1}
>or {expression}
{body2}
>or not
{body3}
>or sth
```
which through standard conversion would be written as
```
if({expression}){
    body1;
}
else if({expression}){
    body2;
}
else({})