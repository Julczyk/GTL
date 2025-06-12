# Reading and Displaying Data.
## Reading from stdin:
GTL allows reading data from standard input (stdin) using the ` > swallow` command.\
Data entered by the user is automatically converted to the appropriate data type if possible.
By default, it is treated as text/string.

## Writing to stdout:
To write data to standard output (stdout), we use the ` > spit` command.\
Both L-values and R-values occurring after this command are converted to text/string (if they are not already) and displayed on the screen.

### Usage Example:
```
 > see value
 > swallow value
 > value is breeding like 2 times
 > spit value
```
This will print the given number multiplied by 2.