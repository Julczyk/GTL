## Loops
In GTL loops do not exists, instead there are jumps and conditionals.
You can create an label by declaring `Ivans house` - creates a label named "Ivans"


```
> be me
> see baddie is 0
> my house
> increase baddie
> spit baddie
> go to my house
> profit
```
is equivalent with C++ code:
```C++
int main() {
  int baddie = 0;
my_label:
  baddie++;
  std::cout>>baddie;
  goto my_label
  return 0;
}
```

## think (while) loop
```
>think that {expression}
{body}
>reconsider
```
