# Size ve Range

Temel türler anlamlarına göre birkaç gruba ayrılabilir. Aynı gruptan türler aynı şekilde çalıştırılabilir, 
ancak farklı boyutlara sahiptir ve sonuç olarak farklı değer aralıklarını temsil eder.

Tüm bu bilgileri ezbere bilmenize gerek yok, çünkü bunları belgelerde veya sadece Google'da bulmak kolaydır. 
Ancak iş görüşmelerinde ve uygulamada bu kavramların ortak bir şekilde anlaşılması önemlidir.

## Sayılar

Java, tamsayılar ve kesirli sayılar için çeşitli türler sağlar. Bu türler genellikle aritmetik ifadelerde kullanılır.

Tam sayılar (0, 1, 2, ...) aşağıdaki dört türle temsil edilir: 
1. long
2. int 
3. short
4. byte(en büyükten küçüğe). 

Bu türler farklı boyutlara sahiptir ve farklı değer aralıklarını temsil edebilir. 
Bir tamsayı türünün aralığı −(2 <sup>n−1</sup> ) ile (2 <sup>n−1</sup> )−1 olarak hesaplanır, burada n, bit sayısıdır. 
Aralık, üst sınırdan 1'in çıkarılmasının nedeni olan 0'ı içerir.

- byte: boyut 8 bit (1 bayt), -128 ile 127 arasında değişir
- short: boyut 16 bit (2 bayt), -32768 ile 32767 arasında değişir
- int: boyut 32 bit (4 bayt), −(2<sup>31</sup> ) ile (2<sup>31</sup> )−1 aralığında
- long: boyut 64 bit (8 bayt), −(2<sup>63</sup> ) ile (2<sup>63</sup> )−1 aralığında

Aşağıdaki tablo ilkel veri tiplerini ve onların gömüldüğü sınıfları göstermektedir:

| İlkel Veri Tipi | Uzunluk | Min Değer | Max Değer | Gömüldüğü Sınıf |
|--- | --- | --- | --- | --- |
| void | - | - | - | Void |
| boolean | 1-bit |  true  ya da  false | | Float |
| byte | 8-bit | -128 | +127 | Byte |
| char | 16-bit | Unicode 0 | Unicode 2<sup>16</sup>-1 | Character |
| short | 16-bit | -2<sup>15</sup>(-32.768) | +2<sup>15</sup>-1 (32.767) | Short |
| int | 32-bit | -2<sup>31</sup> (-2.147.483.648) | +2<sup>31</sup>-1 (2.147.483.647) | Integer |
| float | 32-bit |  32-bit IEEE 754 floating-point numbers (kesirli sayı) | | Float |
| double | 64-bit | 64-bit IEEE 754 floating-point numbers (kesirli sayı) | | Double |
| long | 64-bit | -2<sup>63</sup> (-9.223.372.036.854.775.808) | +2<sup>63</sup>-1 (9.223.372.036.854.775.807) | Long |

Türlerin boyutları her zaman aynıdır. İşletim sistemine veya donanıma bağlı değildirler ve değiştirilemezler.

En sık kullanılan tamsayı türleri intve long'dur.
```
int one = 1;
long million = 1_000_000L;
```
```Float```, kesirli kısımlara sahip sayıları temsil eder. 
Java'nın iki türü vardır: 
1. double(64 bit)
2. float(32 bit) 

Bu türler yalnızca sınırlı sayıda önemli ondalık basamak saklayabilir (float için ~6-7 ve double için ~14-16).
```
double pi = 3.1415;
float e = 2.71828f;
```
```float``` bir değişkeni bildirip başlattığımızda, atanan değeri özel harf ```f``` ile işaretlememiz gerekir. 
Benzer şekilde,```long``` bir değer ```L``` harfi ile işaretlenir.

## Karakterler

Java, harfleri (büyük ve küçük harf), rakamları ve diğer sembolleri temsil eden ```char``` türüne sahiptir.

*Her karakter, tek tırnak içine alınmış tek bir harftir.*
```
char lowerCaseLetter = 'a';
char upperCaseLetter = 'Q';
char dollar = '$';
```
Karakterler, hiyeroglifler de dahil olmak üzere birçok alfabenin sembollerini ve bazı özel sembolleri temsil eder.

## Boolean değerleri

Java, yalnızca iki değeri depolayabilen ```boolean``` adında bir tür sağlar : 
1. true
2. false

Yalnızca bir bit bilgiyi temsil eder, ancak boyutu tam olarak tanımlanmamıştır.
```
boolean enabled = true;
boolean bugFound = false;
```
Bu türü genellikle koşullu ifadelerde ve iki sayıyı karşılaştırmanın bir sonucu olarak kullanacağız.

Özet olarak, en sık kullanılan türlerin int, long, boolean, char ve double olduğunu not ediyoruz. 
Ayrıca, long'un en geniş tamsayı türü olduğunu unutmayın.
