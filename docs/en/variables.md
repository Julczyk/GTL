# Types, variables and data structures in GTL

## basic datatypes:

### Keywords for basic types of variables:
- int       - `see`
- double    - `taste`
- string    - `hear`
- boolean   - `smell`
- other (structs, etc) - `spot`

### Assigning value:
After name, use the keyword `is` and then the value or [expression](expressions_and_math.md).

### Declaring variables:
\>{variable type} {variable name} (is {value/expression})

### examples
```GTL
(String mada = "elo")
>hear mada is "elo"
(String madb = mada)
>hear madb is mada
(double value)
>taste value
```

## collections
- `about` - keyword when declaring a fixed-size array.
- `multiple` - keyword when declaring a dynamic array.

### array
On declaration, we specify an array after the datatype.
- For fixed-size arrays: use `about` keyword followed by an expression for the amount of allocated memory.\
  For example: ` > see about 500 pigeons` allocates an array of 500 integers called "pigeons".
- For dynamic arrays: use `multiple` keyword.\
  For example: ` > see multiple birds` declares a dynamic array of integers called "birds".

#### Assigning values to the whole array
We can assign values after the `is` keyword using `,` or `and` as separators between values.

For example: ` > see about 8 pigeons is 5, 3, 7`. That will result in `[5, 3, 7, 0, 0, 0, 0, 0]` (assuming default initialization to 0 for integers if fewer values are provided than the size).
For dynamic arrays: ` > see multiple pigeons is 5, 3 and 7` results in `[5, 3, 7]`.

## Access through copy and reference

### Copy
To access a variable by copy, we do basically nothing, as this is the default behavior in GTL.\

### Reference
To access a variable by reference, we use the keyphrase `someone elses` before the variable name.\
(Note: General variable reference assignment might not be fully implemented yet, primarily used for function arguments.)
