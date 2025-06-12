# Variable, definition, and function scopes:

## Global functions and variables
The global scope stores the following elements:
- **Functions** - Functions that are not defined inside a structure or another function are global.
- **Structure Definitions**
Functions not declared inside other functions are global. Global variables do not exist. Structure definitions are valid throughout the entire program/file.

### Tip: Creating a "global variable"
Since there are no variables in the global scope in GTL, to create something like a global variable, you should create a structure that will contain all the necessary variables. Then, you should create an instance of this structure in the global scope.

## Local scopes
Every function and variable that is not global is valid within its scope and all sub-scopes within it.

Local scopes are:
- Function Bodies
- Structure definition Bodies
- Loop Bodies
- Conditional Statement Bodies

### Tip: Creating an empty scope
The simplest way to create an empty scope is to create an always-true [if statement](conditional.md):
```
 > implying c:
 {scope/condition body}
 > or sth
```

## Visibility of objects in local scopes
Objects declared in a local scope are visible only in that scope and its sub-scopes.
Local scopes are de facto a stack, so whatever
## Redeclaring variables and accessing them
Variables already declared in a given scope (i.e., in the absence of global ones - all of them) can be redeclared in sub-scopes.

Referring to a variable name refers to its nearest declaration (i.e., the fewest scopes "up").
To refer to a variable that has been hidden by redeclaration, use the keyword `parent`.
The word `parent` can follow itself multiple times if the variable was redeclared in many sub-scopes,
to go down the stack of variable declarations with the same name.
### Example
```GTL
 > be pancake
 > see flour is 1
 > implying c:
 > see flour is 2
 > implying c:
 > see flour is 3
 > spit flour
 > spit parent flour
 > spit parent parent flour
 > or sth
 > or sth
 > profit
```
This will return
```
3
2
1
```
