
# Types, Variables, and Data Structures in GTL

## Basic Data Types:

### Keywords for Basic Variable Types:
- int       - `see`
- double    - `taste`
- string    - `hear`
- boolean   - `smell`
- other (structs, etc.) - `spot`

### Assigning Values:
After the name, use the keyword `is`, followed by a value or [expression](expressions_and_math.md).

### Declaring Variables:
>{variable type} {variable name} (is {value/expression})

### examples
```GTL
(String mada = "elo")
>hear mada is "elo"
(String madb = mada)
>hear madb is mada
(double value)
>taste value
```

## Type Conversion
### Explicit Casting

*   **Syntax:** `let me <type> <atomic_expression>`
*   **Action:** The phrase `let me` is used to explicitly cast the value resulting from `<atomic_expression>` to the specified `<type>`.
*  **Example in GTL:**
   `let me see "123"` – casts the string "123" to the `see` type (integer).
   `let me taste hearingAmount` – if `hearingAmount` is, for example, of type `hear` (string), it attempts to cast its value to `taste` (double).

### 2. Implicit Casting (Automatic)

GTL extensively uses implicit casting in various situations:

1.  **Assignments to variables:** -
    When you assign a value to a variable that already exists (and has a defined type), GTL attempts to automatically convert the assigned value to the variable's type.
2.  **Assignments to array elements:** -
    When you set the value of an array element, the assigned value is automatically converted to the type of the array's elements.
3.  **Arithmetic and logical operations:**
    If direct conversion within an operation is not possible, an `exception` may be thrown.
4.  **Passing arguments to functions:**

## Collections
- `about` - keyword when declaring a fixed-size array.
- `multiple` - keyword when declaring a dynamic array.

### Array
During declaration, we specify the array by data type.
- For fixed-size arrays: use the keyword `about`, followed by an expression specifying the amount of allocated memory.\
  For example: ` > see about 500 pigeons` allocates an array of 500 integers named "pigeons".
- For dynamic arrays: use the keyword `multiple`.\
  For example: ` > see multiple birds` declares a dynamic array of integers named "birds".

#### Assigning Values to the Entire Array
We can assign values after the `is` keyword using `,` or `and` as separators between values.

For example: ` > see about 8 pigeons is 5, 3, 7`. This will result in `[5, 3, 7, 0, 0, 0, 0, 0]` (assuming default initialization to 0 for integers if fewer values are provided than the size).
For dynamic arrays: ` > see multiple pigeons is 5, 3 and 7` will result in `[5, 3, 7]`.

## Access by Copy and Reference

### Copy
To access a variable by copy, we essentially do nothing, as this is the default behavior in GTL.\

### Reference
To access a variable by reference, we use the keyword phrase `someone elses` before the variable name.\
(Note: General reference assignment to a variable may not be fully implemented yet, mainly used for function arguments.)