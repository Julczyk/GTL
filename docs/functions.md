# Functions
## Declarations and arguments
A function in GTL is declared as follows:
```
>be {function name}
>{return type-ing} day
>love {argument1}, {argument2} and {argument3}
```
Arguments are declared like standard [variables](typing.md) with a key difference of data keyword ending with a -ing suffix.
Multiple parameters can be given also in consecutive lines starting with `loves`

example:
```
be foo
tasting day
loves seeing about 5 chicks and tasting a guy
```
equivalent to
```c++
double foo(int chicks[5], double guy)
```

## function calls
```
>call {function name} regarding {arg1}, {arg2} and {arg3}
```

examples:
- `call friend regarding a and b`
- `call bob regarding 2, "Ur mom" and :c`
- `call her`


## return statements
The return statement consists of 2 lines:
```
>{variable name}
>profit
```

example:
```
>var
>profit
```
which works just as
```c++
return var; 
```