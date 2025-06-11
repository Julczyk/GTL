# Błędy i komunikaty o błędach:
W GTL, ze względu na konwencję memiczną, błędy mają dwa tryby:
tryb **memiczny** i tryb **techniczny**.

Komunikaty o błędach są wieloczęściowe i składają się z:
1. Grafiki ASCII smutnej żaby pepe, widocznej poniżej.
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
2. Ścieżki pliku, w którym wystąpił błąd.
3. Linii kodu, w której wystąpił błąd, z konkretnym tokenem, który spowodował błąd, podświetlonym za pomocą `^^^`
4. komunikatu o błędzie w formie memicznej
zaczyna się od `Womp Womp at [X,Y]`, gdzie `[X,Y]` to pozycja błędu w linii."
5. komunikatu o błędzie w formie technicznej
Podobnie zaczyna się od `Error at [X,Y]`, gdzie `[X,Y]` to pozycja błędu w linii."

błędy mogą odnosić się do składni/semantyki lub czasu wykonania.
Oba typy zawierają sugestie dotyczące naprawy błędu, chociaż dotyczą one tylko najpopularniejszych przypadków, a nie prawie wszystkich, więc używaj ich ostrożnie.

## Przykład komunikatu o błędzie (oba tryby):
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
