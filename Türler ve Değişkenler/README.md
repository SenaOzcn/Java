# Türler ve Değişkenler

## Bildirme ve Başlatma

Değişken, belirli bir **türdeki değeri depolamak için bir yer tutucudur.** Dize, sayı veya başka bir şey. Her değişkenin, onu diğerlerinden ayırt etmek için bir **adı**(*tanımlayıcı*) vardır. Bir değişkeni kullanmadan önce onu tanımamız gerekir.

- Bir değişkenin türü, değişken üzerinde hangi olası işlemlerin gerçekleştirilebileceğini ve içinde hangi değerlerin saklanabileceğini belirler.
- Ad(tanımlayıcı), değişkenin diğerlerinden ayırır. Bir değişkenin adı rakamla başlayamaz. Genelde bir harfle başlar. Kodumuzun anlaşılmasını kolaylaştırmak için her zaman değişkenler için anlamlı ve okunabilir adlar seçmeye çalışın.
- Atama operatörü(=), bir değişkene bir değer veya bir ifadenin sonucunu atamak için kullanılır.
- Başlatma, değişkene atanan ifadenin bir değer veya sonucudur.

Bu bildirime göre, **String** türünde bir değişken bildirebilir ve ona **"Java"** kelimesini atayalım :
```
String dil = "Java";
```
**int** bir tamsayıyı saklamak için bildirilir :
```
int elmalarinSayisi = 5;
```
## Bir Değişkenin Değerine Erişme

Bir değişken tanımlandıktan sonra, değerine isim kullanılarak erişilebilir ve değiştirilebilir.

Aşağıdaki örnekte, bir değişken tanımlıyoruz ve ardından onu yazdırıyoruz :
```
String haftaninGunu = "Pazartesi";
System.out.println(haftaninGunu);   // Pazartesi
```
Bir değişkenin değerini, diğerine atamak da mümkündür :
```
int bir = 1;
int sayi = bir;
System.out.println(sayi);   // 1
```
Değişkenlerin önemli bir özelliği de değiştirilebilir olmasıdır. Atama operatörü(=) kullanarak, bir değişkene yeni bir değer atayalım.

```haftaninGunu```değişkenini tanımlayalım ve değer atama önceki ve sonraki değerlerini yazdıralım.
```
String haftaninGunu = "Pazartesi";
System.out.println(haftaninGunu);   // Pazartesi

haftaninGunu = "Salı";
System.out.println(haftaninGunu);   // Salı
```

*Bir değişkene değer atamak için ilk değişkenin değeriyle atanan değerin türlerinin aynı olması gerekir.*
