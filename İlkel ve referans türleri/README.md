# İlkel ve referans türleri

Java'da tüm veri türleri iki gruba ayrılır: 
1. ilkel türler
2. referans türleri

Java yalnızca sekiz ilkel tür sağlar. Anahtar sözcükler olarak dil sözdiziminde yerleşik olarak bulunurlar. 
**Tüm ilkel türlerin adları küçük harflidir.** En yaygın olarak kullanılan tür, ```int``` bir tamsayıyı temsil eden türdür.
```
int num = 100;
```
Referans türlerinin sayısı çok büyük ve sürekli artıyor. Hatta bir programcı kendi tipini oluşturabilir ve onu standart tipler gibi kullanabilir. 
En sık kullanılan başvuru türleri ```String```, ```Scanner``` ve ```diziler```dir. Java'nın çoğu programlama dili gibi büyük/küçük harfe duyarlı olduğunu unutmayın. 

## yeni anahtar kelime

Çoğu durumda,  ```new``` anahtar kelime kullanılarak referans türünde bir nesne oluşturulabilir. 
```new``` anahtar kelimeyi kullandığımızda, oluşturduğumuz nesne için bellek ayrılır. Buna **nesnenin somutlaştırılması** denir çünkü onun bir örneğini yaratırız. 
Daha sonra değişkene bir değer atayarak değişkeni başlatıyoruz. Çoğu zaman, örneğimizde olduğu gibi, tek satırla yapılır.

```
String language = new String("java"); 
//"java"
```

Dizeler için bir hazır bilgi de kullanabilirsiniz:

```
String language = "java";
```

```new``` anahtar kelime ile ilk yaklaşım, referans türleri için yaygındır, ikincisi ise yalnızca dizeye özgüdür. 
Her iki yaklaşım da bize diziler için aynı sonucu verir, ancak burada ele almayacağımız bazı teknik farklılıkları vardır.

## Ana fark

İlkel ve başvuru türleri arasındaki temel fark, ilkel türdeki bir değişkenin gerçek değerleri saklaması, 
buna karşın başvuru türündeki bir değişkenin, verilerin bulunduğu bellekte (referans) bir adres depolamasıdır. 
Veriler, parçaları olarak diğer veri türlerini içeren karmaşık bir yapı olarak sunulabilir.

Aşağıdaki resim bu farkı basitçe göstermektedir. İki ana bellek alanı vardır: ```stack``` ve ```heap```. 
İlkel türlerin tüm değerleri yığın belleğinde saklanır, ancak başvuru türlerinin değişkenleri yığın belleğinde bulunan nesnelerin adreslerini depolar.

![gorsel](https://ucarecdn.com/1f65bb80-d7af-44fa-b847-9bfcc674da63/)

## Atama

Veri depolamanın yolu, bir değişkenin değerini başka bir değişkene atama mekanizmasını da etkiler:

- **ilkel türler :** Değer sadece kopyalanır.
- **referans türleri :** Değerin adresi kopyalanır (veriler birkaç değişken arasında paylaşılır).

İşte bir kod parçası ve bunu gösteren bir resim.
```
int a = 100;
int b = a; // 100 değeri b'ye kopyalandı.

String language = new String("java");
String java = language;
```

Değişken b, a değişkeninde depolanan değerin bir kopyasına sahiptir. Ancak language ve java değerleri onu kopyalamak yerine aynı değeri referans alırlar. 
Aşağıdaki resim farkı açıkça göstermektedir.

![gorsel](https://ucarecdn.com/45c7da14-b310-49a3-8b74-c51aff294952/)

Bir referans değişkeninin bir değerini diğerine atarken, değerin kendisinden ziyade sadece referansın bir kopyasını oluşturduğumuzu unutmayın.

## Karşılaştırmalar

Referans türlerini ```==``` ve ```!=``` kullanarak karşılaştırmak, ilkel türleri karşılaştırmakla aynı şey değildir. 
Aslında, String türünde iki değişkeni karşılaştırırken, gerçek değerlerden ziyade referansları (adresleri) karşılaştırır.

Aşağıdaki kod bunu gösterir:

```
String s1 = new String("java");
String s2 = new String("java");
String s3 = s2;

System.out.println(s1 == s2); // false
System.out.println(s2 == s3); // true
```

Aşağıdaki resim bu etkiyi göstermektedir:

![gorsel](https://ucarecdn.com/0bdcd814-44e7-4f18-94a4-5605064c277c/)

Bu nedenle, değerleri karşılaştırmak istediğinizde karşılaştırma operatörlerini kullanmamalısınız. 
İçeriği karşılaştırmanın doğru yolu,  ```equals``` sözel yöntemi çağırmaktır.

```
String s1 = new String("java");
String s2 = new String("java");
String s3 = s2;

System.out.println(s1.equals(s2)); // true
System.out.println(s2.equals(s3)); // true
```

## Boş tür

İlkel türlerden farklı olarak, ```null``` başvuru türündeki bir değişken, henüz başlatılmadığı veya 
bir değeri olmadığı gerçeğini temsil eden özel bir değere başvurabilir.

```
String str = null;
System.out.println(str); // null
str = "hello";
System.out.println(str); // hello
```

İlkel bir türe sahip aşağıdaki ifade derlenmeyecektir.
```
int n = null; // derlenmez.
```
Ne yazık ki, ```null``` değerinin sık kullanımı programda kolayca hatalara yol açabilir ve kodu karmaşıklaştırabilir. 
Bu yüzden mümkün olduğunda kaçınmaya çalışın, yalnızca gerçekten ihtiyacınız varsa kullanın.
