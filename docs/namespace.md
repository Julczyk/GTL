## Namespace
Current namespace is defined with > symbols before every line in current namespace.
To nest namespace you add multiple > symbols, depending on the nest level.
```
> be me
> > be Ivona
> > like taste baddie
> > spit baddie
> > profit
> taste baddie is 6.9
> call Ivona with baddie
> profit

>profit
```
is equivalent with C++ code:
```C++
int main() {
  void Ivona(double baddie) {
    cout>>baddie;
    return;
  }
  double baddie = 6.9;
  Ivona(baddie);
  return 0;
}
```
