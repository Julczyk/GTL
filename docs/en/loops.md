## Loops
## The "think that" loop
GTL has one basic type of loop - "think that".
Programmers using other languages probably know it as the "while" loop.

## Syntax
The main syntax of the "think that" loop is as follows:
```
 > think that {expression}
{body}
 > reconsider
```

The loop is executed as long as {expression} is true (i.e., it is not `:c` or zero).
Inside the loop, you can insert other loops and any number of instructions. Remember that the loop body is a [local scope](scopes.md).
