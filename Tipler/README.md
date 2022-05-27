# Tipler

Diyelim ki bir türden bir değeri başka bir türdeki bir değişkene atamanız gerekiyor. 
Bunu yapmak için programınızın kaynak türünü hedef türe dönüştürmesi gerekir. 

Java, ilkel türler için iki tür yayın sağlar: 
1. örtük
2. açık 

Birincisi mümkün olduğunda Java derleyicisi tarafından otomatik olarak gerçekleştirilir, ikincisi ise sadece bir programcı tarafından yapılabilir.

## Örtük döküm

Hedef tür kaynak türden daha geniş olduğunda, derleyici otomatik olarak örtük döküm gerçekleştirir. 
Aşağıdaki resim örtük ilkel tip dökümlerin yönünü göstermektedir.

![gorsel](https://ucarecdn.com/c00fb67e-ba08-44a2-ad8b-0ffbdfe8d642/)

Normalde, hedef türü kaynak türünden daha geniş olduğunda, bilgi kaybı olmaz. 
Ancak otomatik olarak geriye doğru sıralama yapmak mümkün değildir.

İşte örtük dökümlerin birkaç örneği:

- int'ten log'a çevirme:
```
int num = 100;
long bigNum = num; // 100L
```
- lond'dan double'a çevirme:
```
long bigNum = 100_000_000L;
double bigFraction = bigNum; // 100000000.0
```
- short'tan int'e çevirme:
```
short shortNum = 100;
int num = shortNum; // 100
```
- char'dan int'e çevirme:
```
char ch = '?';
int code = ch; // 63
```
Bazı durumlarda, örtük tip döküm, bazı bilgi kayıplarına neden olabilir. Bu da hassasiyet kaybına neden olur. 
Ancak, bu dönüştürmenin sonucu, tamsayı değerinin doğru yuvarlatılmış bir sürümü olacaktır ve bu, hedef türün genel aralığında olacaktır. 
Bunu anlamak için örneğe bakın:
```
long bigLong =  1_200_000_002L;
float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)
```
Alfabedeki harflerin (hem büyük hem küçük harf), rakamların ve diğer sembollerin tamsayı temsilidir. [Burada](https://ascii.cl/) ASCII'deki bazı standart 
sembolleri bulabilirsiniz.
```
char character = 'a';
char upperCase = 'A';

int ascii1 = character; // this is 97
int ascii2 = upperCase; // this is 65
```
Kesin konuşmak gerekirse Java, ASCII'nin bir üst kümesi olan ve çok daha büyük bir sembol kümesi içeren Unicode Karakter Gösterimlerini (UTF-16) kullanır. 
Ancak, 0-127 arasındaki sayılar ASCII ve Unicode'da aynı değerlere sahiptir.
Gördüğünüz gibi, örtük döküm kesinlikle şeffaf bir şekilde çalışıyor.

## Açık döküm

Hedef türü kaynak türünden daha dar olduğunda, dikkate alınan örtük döküm çalışmaz. 
Ancak programcılar, istedikleri başka bir türü elde etmek için bir kaynak türe açık döküm uygulayabilir. 
Sayısal bir değerin genel büyüklüğü hakkındaki bilgileri kaybedebilir ve ayrıca kesinliğini kaybedebilir.

Açık döküm gerçekleştirmek için, bir programcı hedef türünü kaynaktan önce **parantez içinde** yazmalıdır.
```
(targetType) source
```
Yukarıdaki resimde gösterilmeyen olası herhangi bir oyuncu seçimi, 
örneğin ```double```'dan ```int```'e ve ```long```'dan ```char```'a gibi bir yaklaşıma ihtiyaç duyar.

Örnekler:
```
double d = 2.00003;

long l =  (long) d; // 2

int i = (int) l; // 2 

int val = (int) (3 + 2L); // 5

char ch = (char) 55L; // '7'
```
Ancak, açık döküm, değeri kesebilir, çünkü long, int ve double değerinden çok daha büyük bir sayıyı depolayabilir.
```
long bigNum = 100_000_000_000_000L;
int n = (int) bigNum; // 276447232
```
Hata! Değer kesildi. Bu sorun, **tür taşması** olarak bilinir. Aynı sorun, int'ten short'a veya byte'a yayın yaparken de ortaya çıkabilir. 

Java'da long 64 bitlik bir sayı iken int 32 bitlik bir sayıdır. Programa dönüştürürken, yeni sayıyı temsil etmek için sadece son 32 biti alır. 

Açık döküm, örtülü döküm yeterli olduğunda da çalışır.
```
int num = 10;
long bigNum = (long) num;
```
Ancak bu gereksizdir ve kodunuzda gereksiz yapılardan kaçınmak için kullanılmamalıdır.

- Daha dar bir türü daha geniş bir türe dönüştürmek istiyorsanız, herhangi bir şey yazmanıza gerek yoktur.
- Java derleyicisi bunu sizin için otomatik olarak yapacaktır. Ancak bunun tersini istiyorsanız, atama operatörünün ardından gerekli türü parantez içinde belirtin. 
