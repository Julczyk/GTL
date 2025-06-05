# Functions
## Simplest possible function
```
 > be a
 > profit
```
Where we just declare it. No arguments, no return value. Just profit.
## Declarations and arguments
A function in GTL is declared as follows:
```
 > be {function name}
 > {return type-ing} {return variable name}
 > likes {arg1 type-ing} {arg1 name}, {arg2 type-ing} {arg2 name}
 > and {arg3 type-ing} {arg3 name}
 ```
Arguments are declared like standard [variables](variables.md) with a key difference of data keyword ending with a -ing suffix.
Multiple parameters can be given also in consecutive lines starting with `likes` keyword.\

example:
```
 > be foo
 > tasting men
 > likes seeing about 5 chicks
```
equivalent to
```c++
double foo(int chicks[5], double guy)
```
### passing multiple arguments
We use one keyword likes after which we define list of all arguments.
Every two consecutive arguments can be separated by a comma `,` or the word `and`. \
Word `and` can also begin the new line if we want to split arguments into multiple lines.
couple examples of valid function declarations:

1. string, string, int:
```
 > be professor
 > seeing grade
 > likes hearing student_name, hearing project_name and seeing grade
```

### possible errors
defining multiple arguments with type not present or incorrect will result in unclosed function error.


## function calls
```
>call {function name} regarding {arg1}, {arg2} and {arg3}
```

examples:
- `call friend regarding a and b`
- `call bob regarding 2, "Ur mom" and :c`
- `call her`


## return statements
The return statement and end of a function body in GTL is done with the line `` > profit``.\
which works just as
```c++
return var;
}
```

where `var` is the return variable declared in the function body.

### Important:
Remember, since `profit` is the end of the function, it must be the last line in the function body.
This means that you can only have effectively one return statement in a function.

For emulating multiple returns, you can just set the return variable to different values and then call `profit` at the end.