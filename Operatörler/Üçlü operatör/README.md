# Üçlü operatör

Üçlü operatör, bir koşulu değerlendiren ve yürütülecek iki durumdan birini seçen bir operatördür. Ayrıca **koşullu operatör** olarak da adlandırılır. 
if-else ifadesinin bir biçimi olarak düşünülebilir. Üçlü operatör, benzerliklerine rağmen koşullu ifadeyle karıştırılmamalıdır. 
Bu operatör, bir ifadenin beklendiği yerlerde kullanılabilir.

Bazen üçlü operatör, karşılık gelen if ifadesinden daha okunabilir ve kısadır.

Bu operatörü bir örnekle öğrenmeye başlayalım. En fazla iki int değişkeni(a ve b) bulmamız gerektiğini varsayalım. Koşullu bir ifade kullanarak yazmak kolaydır:
```
int a = ...;
int b = ...;
int max = ...;

if (a > b) {
    max = a;
} else {
    max = b;
}
```
Eşdeğer bir üçlü operatör şöyle görünür:
```
int max = a > b ? a : b;
```
Bu kod, yukarıdaki koddan daha kısa, değil mi?

Üçlü operatörün genel sözdizimi aşağıdaki gibidir:
```
sonu. = koşul ? true ise : değilse;
```
İki özel sembol içerir(? ve :).

Burada, koşul bir Boolean ifadedir. Bu ifade ise doğru ise, üçlü operatör değerlendirir, aksi takdirde ```:```'den sonraki ifade değerlendirilir. 
Ortak bir türe indirgenebilecek ifadeler olması önemlidir.

Bir sayının çift mi yoksa tek mi olduğunu yazdıran başka bir örneği ele alalım.
```
int num = ...; 
System.out.println(num % 2 == 0 ? "çift" : "tek");
```
Not: Java, bir üçlü operatörü diğerine yerleştirmemize izin verir, ancak karşılık gelen koşullu ifadeden daha az okunabilir olabilir. Bunu yaparsanız dikkatli olun.
```
int a = ...; 
int b = ...;
String result = a == b ? "eşittir" :
                a > b ? "büyüktür" : "küçüktür";
```
İlk başta, dış üçlü operatör a ve b sayıların eşitliğini kontrol eder. 
Doğruysa "eşittir" yazdırılır, aksi takdirde iç içe üçlü operatör a > b ? "büyüktür" değilse, ```:``` "küçüktür" hesaplanır. 
Okunabilirliği artırmak için tüm ifade 2 satıra bölünmüştür.
