# Functions
## Declarations and arguments
A function in GTL is declared as follows:
```
>be {function name}
>{return type-ing} day
>love {argument1}, {argument2} and {argument3}
```
Arguments are declared like standard [variables](typing.md) with a key difference of data keyword ending with a -ing suffix.

example:
```
be foo
tasting day
love seeing about 5 chicks and tasting a guy
```
equivalent to
```c++
double foo(int chicks[5], double guy)
```


## return statements
The return statement consists of 3 lines:
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