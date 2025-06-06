# Types, variables and data structures in GTL

## basic datatypes:

### Keywords for basic types of variables:
- int       - `see`
- double    - `taste`
- string    - `hear`
- boolean   - `smell`
- other (structs, etc) - `spot`

### Assigning value:
**LEGACY:** After name instead of standard `=` keywords `giving` or `gives` and then value or [expression](expressions_and_math.md).\
**CURRENT:** After name instead of standard `=` keyword `is` and then value or [expression](expressions_and_math.md).


### Declaring variables:
\>{variable type} {variable name} (assigning value)

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
- `single` (jeśli będzie potrzebne - jeśli nie zaimplementujemy bez niego)
- `some` - keyword when declaring list
- `about` - keyword when declaring array
- `multiple` - keyword when declaring dictionary

### array
on declaration we specify array after datatype using `about` keyword followed by amount of allocated memory.\
For example: ` > see about 500 pigeons` allocates array of 500 integers called "pigeons".

#### Assigning values to the whole array
We can assign values after `giving` keyword using `,` or `and` as separators between values.

For example: ` > pigeons giving 5, 3 and 7.`\
or with declaration: ` > see about 8 pigeons giving 5, 3, 7`. That will result with `[5, 3, 7, 0, 0, 0, 0, 0]`.

## Access through copy and reference

### Copy
To access a variable by copy, we do basically nothing, as this is the default behavior in GTL.\

### Reference
To access a variable by reference, we use the keyphrase `someone elses` before the variable name.\

---
