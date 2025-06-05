
# Errors and error messages:
In GTL, due to the meme convention, errors have two modes:
**meme** mode and **technical** mode.

Error messages are multi-part and consist of:
1. ASCII art of a sad frog pepe seen below.
```
⠀⠀⠀⠀⠀⢠⠔⠊⠉⣉⡑⢴⠒⠉⠁⠢⡀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢠⠃⠀⠊⠁⢀⣈⣙⣶⡀⠉⣉⣑⡢⡀⠀⠀⠀⠀⠀
⠀⠀⢀⡎⠏⠀⠰ ⢶⣊⠁⠀⠀⢀⡏⠁⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀
⠀⠀⡎⠀⠀⠀⠀⠀⠈⣷⠛⢭⡭⠟⢋⣹⣽⣩⡝⠁⠀⠀⠀⠀⠀
⠀⢸⠀⠀⠀⠀⠀⢀⣉⡀⠀⠀⠀⠀⠀⠀⠋⠀⢱⠀⡀⢖⡟⡖ ⡆
⠀⠸⡀⠀⠀⠀⠸⣑⣒⣒⡫⢭⣭⣶⡶⠶⠬⣵⢃⡟⠾⠘⢈⠏
⢀⡤⠵⣦⠄⣀⣀⣀⠀⠀⡦⡏⠇⡟⣾⢿⠉⢹⠉⢀⣀⠔⠁⠀
⠈⠀⠀⠀⠉⠐⠒⠒⠐⠛⠓⡥⠄⢤ ⠵⣏⠀⢸⠀⠀⢣⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡃⠀⢸⠀⠈⠳⡤⠆⠀⢸⡄⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
```
2. Path of the file where the error occurred.
3. Line of code where the error occurred with specific token which caused the error highlighted with `^^^`
4. error message in meme form
it starts with `Womp Womp at [X,Y]` where `[X,Y]` is the position of the error in the line."
5. error message in technical form
Similarily it starts with `Error at [X,Y]` where `[X,Y]` is the position of the error in the line."

the errors can refer either to syntax/semantic or runtime.
Both types have suggestions for fixing the error, though it's only for the most popular case, and not nearly all cases, so use them with caution.

## Example of an error message (both modes):
```
⠀⠀⠀⠀⠀⢠⠔⠊⠉⣉⡑⢴⠒⠉⠁⠢⡀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢠⠃⠀⠊⠁⢀⣈⣙⣶⡀⠉⣉⣑⡢⡀⠀⠀⠀⠀⠀
⠀⠀⢀⡎⠏⠀⠰⢶⣊⠁⠀⠀⢀⡏⠁⠀⠀⠀⢱⠀⠀⠀⠀⠀
⠀⠀⡎⠀⠀⠀⠀⠈⣷⠛⢭⡭⠟⢋⣹⣽⣩⡝⠁⠀⠀⠀⠀⠀
⠀⢸⠀⠀⠀⠀⠀⢀⣉⡀⠀⠀⠀⠀⠀⠋⠀⢱⠀⡀⢖⡟⡖⡆
⠀⠸⡀⠀⠀⠀⠸⣑⣒⣒⡫⢭⣭⣶⡶⠶⠬⣵⢃⡟⠾⠘⢈⠏
⢀⡤⠵⣦⠄⣀⣀⣀⠀⠀⡦⡏⠇⡟⣾⢿⠉⢹⠉⢀⣀⠔⠁⠀
⠈⠀⠀⠀⠉⠐⠒⠒⠐⠛⠓⡥⠄⢤⠵⣏⠀⢸⠀⠀⢣⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡃⠀⢸⠀⠈⠳⡤⠆⠀⢸⡄⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀
(..)GTL/examples/tests/nested.gtl:72:20
 > implying yeet'th number doesn't vibe with 0
                    ^
Womp womp at [72, 20]: You are not long enough you have only 5 but you wanted 5
Error at [72, 20]: Index 5 is out of bounds for an array of length 5
```