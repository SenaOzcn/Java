# break

break ifadesinin iki kullanımı vardır :

1. herhangi bir türdeki mevcut döngüyü sonlandırır(for , while , do-while );
2. switch ifadesinde bir vakayı sonlandırır;

Bu konuda, döngüleri sonlandırmak için nasıl kullanılacağını öğreneceğiz.

Aşağıdaki örnek, break içeren bir döngüyü gösterir.
```
int i = 10;
while (true) {
    if (i == 0) {
        break;
    }
    i--;
}
```
Yukarıdaki kodda, döngüye devam etme koşulu her zaman true'dur, ancak değişken şartlı ifadenin içinde kullanıldığında başarılı bir şekilde durdurulacaktır.
```break``` ifadesi yalnızca o anda bulunduğu döngüyü sonlandırır. Bu döngü başka bir döngü içinde gerçekleştirilirse, dış döngü durdurulmaz.

Aşağıdaki kod, bir sayı merdiveni yazdırır.
```
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
        if (i == j) {
            break;
        }
    }
    System.out.println();
}
```
Çıktı:
```
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 
0 1 2 3 4 5 
0 1 2 3 4 5 6 
0 1 2 3 4 5 6 7 
0 1 2 3 4 5 6 7 8 
0 1 2 3 4 5 6 7 8 9 
```
Dış döngüyü durdurmak için bir Boolean değişkeni bildirmek ve onu özel bir Boolean bayrağı olarak kullanmak istiyoruz.
```
boolean stopped = false;
for (int i = 0; (i < 10) && !stopped; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
        if (i == j) {
            stopped = true;
            break;
        }
     }
    System.out.println();
}
```
Çıktı:
```
0
```
# continue

Bir döngünün mevcut yinelemeyi atlayıp bir sonrakine geçmesine neden olur.

Bu ifade her türlü döngü içinde kullanılabilir.

for-döngüsü içinde, continue, kontrolün hemen artırma/azaltma ifadesine taşınmasına neden olur;
while veya do-while döngüsünün içinde, kontrol hemen koşula geçer.
Aşağıdaki örnekte, bir sayı dizisi çıktısı alınır. Tek sayılar atlanır.
```
int n = 10;
for (int i = 0; i < n; i++) {
    if (i % 2 != 0) {
        continue;
    }
    System.out.print(i + " ");
}
```
Çıktı:
```
0 2 4 6 8
```
Continue ve break yalnızca bulundukları döngüyü etkiler. Continue, dış döngünün geçerli yinelemesini atlayamaz.

Çoğu zaman, continue deyimini kullanmadan döngüyü yeniden yazabiliriz. İşte bir örnek:
```
int n = 10;
for (int i = 0; i < n; i++) { 
    if (i % 2 == 0) {
        System.out.print(i + " ");
    } 
}
```
Sonuç yukarıdakiyle aynı, ancak kod daha kısa ve daha okunaklı hale geldi.
