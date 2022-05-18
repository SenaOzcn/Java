# String

```String```, karakterlerden oluşan bir referans türüdür. 
Java'da en yaygın kullanılan türlerden biridir. İşte bir dize örneği: "Hello, Java". 
Bu dize, bir boşluk dahil 11 karakterlik bir dizidir.

Bu türün bazı özellikleri vardır:

- Değişmez tür : bir dizgedeki bir karakteri değiştirmek imkansızdır;
- Bireysel karakterleri almak ve alt dizileri çıkarmak için yöntemleri vardır;
- Bireysel karakterlere dizinler tarafından erişilebilir, ilk karakter 0 endeksine sahiptir , sonuncusu ise, dizenin uzunluğu – 1 ;
- İkel olmayan tip.

## Dize oluşturma

Bir dize String çift tırnak içine alınır, örneğin: 
```
String basitString = "Bu basit bir string ifadedir";
System.out.println(basitString);  // "Bu basit bir string ifadedir"

String baskaString = "Bu\nçok satırlı\nbir string'tir.";
System.out.printlnbaskaString);
```
Bir dize, uzun bir karakter dizisini (metni) temsil edebilir. Bir dize bir veya sıfır karakter içerebilir.
```
String yazi = "aaaaaaaaaaaassssssssssss gggggggggggggggggggg ddddddddddd qqqqqq ffff";

String bosString = "";

String s = "s";
```
Bir dize ```null``` olabilir. Bu, hiçbir değer atanmadığı anlamına gelir.
```
String nullString = null;
```
Bir değişken oluşturmanın başka bir yolu da ```String``` ```new``` anahtar kelimesini kullanmaktır.
```
String str = new String("benim-string'im");
```

## Bir dizenin uzunluğunu ve karakterlerini alın

Herhangi bir dizenin iki kullanışlı yöntemi vardır:

- length(): Dizedeki karakter sayısını döndürür;
- charAt(int index): Dizinine göre bir karakter döndürür;

İşte bir örnek:
```
String s = "Hi, all";

int len = s.length(); // 7

char theFirstChar = s.charAt(0);  // 'H'

char theFifthChar = s.charAt(4); // 'a'

char theLastChar = s.charAt(s.length() - 1); // 'l'
```
*Dizinden kolayca bir karakter dizisi alabilirsiniz, ancak karakterleri değiştiremezsiniz çünkü dizeler Java'da değişmezdir.*

## Kullanışlı dize yöntemleri

Java'nın standart kitaplığı, dizeleri işlemek için birçok yararlı yöntem sağlar:

- isEmpty(): Dize boşsa true döner, aksi takdirde false döner;
- toUpperCase(): Büyük harfle yeni bir dize döndürür;
- toLowerCase(): Küçük harfle yeni bir dize döndürür;
- startsWith(prefix): Dize verilen dize önekiyle başlıyorsa true, aksi takdirde false;
- endsWith(suffix): Dize verilen dize son ekiyle bitiyorsatrue, aksi halde false;
- contains(...): Dize verilen dizeyi veya karakteri içeriyorsa true döndürür;
- substring(beginIndex, endIndex): Aralıktaki dizenin bir alt dizesini döndürür: beginIndex, endIndex - 1;
- replace(old, new): Karakter veya dize olabilecek tüm oluşumları değiştirerek elde edilen yeni bir dize döndürür;
- trim(): Baştaki ve sondaki boşlukları atlayarak elde edilen dizenin bir kopyasını döndürür. 
Boşluğun yalnızca boşluk karakterini değil, çoğunlukla boş görünen her şeyi içerdiğini unutmayın: sekme, satır başı, yeni satır karakteri, vb.

Bu yöntemleri daha iyi anlamak için aşağıdaki örneğe bakın:
```
String yazi = "Bu bir metin.";

boolean bos = yazi.isEmpty(); // false

String yaziInUpperCase = text.toUpperCase(); // "BU BİR METİN"

boolean startsWith = yaziInUpperCase.startsWith("BU"); // true

String boslukYok = yaziInUpperCase.replace(" ", ""); // "BUBİRMETİN"

String yaziWithWhitespaces = "\t yazi whitespaces ile  !\n  \t";

String trimmedText = yaziWithWhitespaces.trim();
```
Farklı yöntemler ve argümanlar hakkında daha fazla bilgi edinmek için [belgelere](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) göz atabilirsiniz.

## Dizeleri işlerken istisnalar

Dizelerle çalışırken birkaç istisna olabilir.
1. ```NullPointerException```: Eğer string ```null```ise, string metodunu çağırdığınızda ```NullPointerException``` atar.
```
String s = null;
int length = s.length(); // NullPointerException
```
2. ```StringIndexOutOfBoundsException```: Eğer girilen metindende daha büyük bir endeksi çağırırsanız, ```StringIndexOutOfBoundsException``` atar.
```
String s = "ab";
char c = s.charAt(2); // StringIndexOutOfBoundsException atayacaktır. Çünkü indexler 0'dan başlar ve bu metinde 2. index yok.
```
## Dizeleri birleştirme

```"+"``` operatörü veya ```concat``` yöntemi kullanılarak iki dize birleştirilebilir. Her iki yaklaşım da aynı sonuçları verir.
```
String firstName = "Sena";
String lastName = "Özcan";

//  "+" operatörü ile birleştirelim
String fullName1 = firstName + " " + lastName; // "Sena Özcan"

// concat metodu ile birleştirelim
String fullName2 = firstName.concat(" ").concat(lastName); // "Sena Özcan"
```
*İki dizeyi birleştirdiğimizde yeni bir dize oluşturulur (çünkü dizeler **değişmezdir** ).*

**Önemli Not:** ```str1 + str2```ile ```str2 + str1``` aynı **değildir.**

## Bir dizeye değer ekleme

Bir dizgeye farklı türlerde değerler eklemek mümkündür. Değer otomatik olarak bir dizgeye dönüştürülecektir. Aşağıdaki bir örneğe bakın:
```
String str = "str" + 10 + false; // "str10false"
```
Yukarıdaki örnekte, yürütme sırası şöyledir:

1. "str" + 10 => "str10"
2. "str10" + false = "str10false"

Daha karmaşık bir örnek görelim:
```
String str = "str";
int sayi = 100;

String result1 = str + sayi + 50; // "str10050"
String result2 = sayi + 50 + str; // 150str
```
*İşlemlerin sırası önemlidir.*

## Dizeler nasıl doğru şekilde karşılaştırılır?

```String```bir dizenin gerçek içeriğinin eşdeğerini başka bir dizenin içeriğiyle karşılaştırmak için iki uygun yönteme sahiptir: 
equals() ve equalsIgnoreCase(). Aşağıdaki bir örneğe bakın:
```
String first = "first";
String second = "second";

String anotherFirst = "first";
String secondInUpperCase = "SECOND";

System.out.println(first.equals(second)); // false
System.out.println(first.equals(anotherFirst)); // true

System.out.println(second.equals(secondInUpperCase)); // false
System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true
```
