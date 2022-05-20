# For Döngüsü

Bazen bir kod bloğunu belirli sayıda tekrarlamamız gerekir. 
Bunu yapmak için Java, ```for``` dönügüsü sağlar. Bu döngü genellikle bir dizi değer üzerinde veya bir dizi üzerinden yineleme *(sayaç)* yapmak için kullanılır. 
Yineleme sayısı veya aralık sınırları **biliniyorsa, for döngüsü** kullanılması önerilir. **Bilinmiyorlarsa, while döngüsü** tercih edilen çözüm olabilir.

# For Döngüsü Söz Dizimi

```for``` döngüsü aşağıdaki temel sözdizimine sahiptir:
```
for (başlatma; koşul; arttırma-azaltma) {
    // gövde
} 
```
Döngünün parçaları:

- **başlatma ifadesi**, döngü başlamadan önce bir kez yürütülür; genellikle, döngü değişkenleri burada başlatılır;
- **koşul**, bir sonraki yineleme ihtiyacını belirleyen bir ```Boolean``` ifadedir; false olduğunda, döngü sona erer;
- **arttırma-azaltma**, döngü değişkenlerinin değerini değiştiren bir ifadedir; döngünün her yinelemesinden sonra çağrılır; 
genellikle, döngünün değişkenini değiştirmek için artırma veya azaltma kullanır.

Döngünün gövdesi içinde, program herhangi bir doğru Java ifadesini gerçekleştirebilir. Hatta başka döngüler de içerebilir.

Herhangi bir ```for-döngüsü``` için yürütme sırası her zaman aynıdır:

- başlatma ifadesi;

- koşul ise falsedöngüyü sonlandırın;

- koşul ise true, döngünün gövdesi yürütülür;

- arttırma-azaltma gerçekleştirilir;

- aşamaya geçin(koşul).

0'dan 9'a kadar olan tam sayıları aynı satıra yazdırmak için bir döngü yazalım.
```
int n = 9;
for (int i = 0; i <= n; i++) {
    System.out.print(i + " "); // her numaradan sonra boşluk bırakır.
}
```
Kod şunları görüntüler:
```
0 1 2 3 4 5 6 7 8 9 
```
Başlatma ifadesinde bildirilen değişkenler, yalnızca döngünün tüm bölümlerini içeren kapsam içinde görünür: koşul, gövde ve değişiklik. 
Tamsayı döngü değişkenleri genellikle i, j, k vb. olarak adlandırılır.

İşte başka bir örnek. For döngüsünü kullanarak 1'den 10'a kadar(10 dahil) tam sayıların toplamını hesaplayalım.
```
int startIncl = 1, endExcl = 11;

int sum = 0;
for (int i = startIncl; i < endExcl; i++) {
    sum += i;
}

System.out.println(sum); // "55"
```

Başlatma ifadesi, koşul ve değişiklik bölümleri isteğe bağlıdır, for döngüsü bunların tümüne sahip olmayabilir.

Döngünün dışında bir değişken bildirmek mümkündür:
```
int i = 10;
for (; i > 0; i--) {
    System.out.print(i + " ");
}
```
Ayrıca, bu parçalar olmadan sonsuz bir döngü yazmak da mümkündür:
```
for (;;) {
    // gövde
}
```

## İç içe geçmiş döngüler

Bir for döngüsünü başka bir for döngüsüne yerleştirmek mümkündür. Bu yaklaşım, tablolar(matrisler), veri küpleri vb. gibi çok boyutlu yapıları işlemek için kullanılır.

Örnek olarak, aşağıdaki kod, 1'den 9'a(9 dahil) sayıların çarpım tablosunu yazdırır.
```
for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
        System.out.print(i * j + "\t");
    }
    System.out.println();
}
```
Çıktı:
```
1   2   3   4   5   6   7   8   9  
2   4   6   8   10  12  14  16  18  
3   6   9   12  15  18  21  24  27  
4   8   12  16  20  24  28  32  36  
5   10  15  20  25  30  35  40  45  
6   12  18  24  30  36  42  48  54  
7   14  21  28  35  42  49  56  63  
8   16  24  32  40  48  56  64  72  
9   18  27  36  45  54  63  72  81 
```
