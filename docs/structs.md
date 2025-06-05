
## defining data structures:
data structure are defined from line
` > look around`\
followed by a line with structure name.\
Then fields are listed with standard declarations of [variables/collections](data_types.md).\
#TODO: if needed follow with defini
End definition with ` > vibe with it`

example:
```
 > look around
 > table
 > see count
 > hear contents
 > hear about 5 attributes
 > vibe with it
```
is equivalent with C++ code:
```C++
struct table{
    int count;
    String contents;
    String attributes[5];
}
```
### Defining data structure with methods (de facto classes):
```
 > look around
 > room
 > see chair
 > hear mom
 > hear about 5 sister
 > be sister_talk
 > likes seeing it
 > think that it unbeaten by 5 joined by the literal opposite of it
 > spit it'th sister
 > profit
 > vibe with it
```

## Accessing data structures:
To access data structure fields we use the `'s` operator.

For example if we want to increment `count` field of `table` structure we can write:
```
 > table's count evolves
```

Similarily we can access methods of data structures:
Example to method declared above:
```
 > call room's sister_talk regarding 3
```
