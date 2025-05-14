# Conditional Statements in GTL

Conditional statements structurally resemble classical if else.

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
which through standard convention (i.e. C) would be written as
```
if({expression}){
    body1;
}
else if({expression}){
    body2;
}
else{
    body3;
}
```

## Details
### if statement:
```
 > implying {expression}
 > {body of statement}
 > or sth
```
the line `> or sth` can be viewed as a closing bracket of the statement. The codeblock between ` > implying ...` and ` > or sth` is evaluated if `{expression}` is `:c` or non-zero.

### if / else statement:
```
 > implying {expression}
 > {body of if}
 > or not
 > {body of statement}
 > or sth
```
the line `> or sth` can be viewed as a closing bracket of the else statement.\
`> or not` exits the codeblock of the if statement and enters the else statement. This is basic else w/o further conditions. For else if look below.

### if / else if / else statement:
```
 > implying {expression}
 > {body of if}
 > or {expression}
 > {body of first else if}
 > or {expression}
 > {body of another else if}
 > or not
 > {body of else}
 > or sth
```
