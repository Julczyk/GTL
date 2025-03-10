# Types, variables and data structures in GTL

## basic datatypes:

### Keywords for basic types of variables:
- int       - `see`
- double    - `taste`
- string    - `hear`
- boolean   - `smell`
- other (structs, etc) - `spot`

### Assigning value:
After name instead of standard `=` keywords `giving` or `gives` and then value or [expression](expressions.md).

### Declaring variables:
\>{variable type} {variable name} (assigning value)

## collections
- `single` (jeśli będzie potrzebne - jeśli nie zaimplementujemy bez niego)
- `some` - keyword when declaring list
- `about` - keyword when declaring array
- `multiple` - keyword when declaring dictionary


## defining data structures:
data structure are defined from line
`>look around`\
followed by a line with structure name.\
Then fields are listed with standard declarations.\
End definition with `>vibe with it`

example:
```
>look around
>table
>see count
>hear contents
>hear about 5 attributes
>vibe with it
```
is equivalent with C++ code:
```C++
struct table{
    int count;
    String contents;
    String attributes[5];
}
```