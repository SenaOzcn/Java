# Boolean ve mantıksal işlemler

## Boolean türü

```boolean``` yalnızca iki olası değeri olan bir veri türüdür: false ve true. Bu aynı zamanda mantıksal tip olarak da bilinir.

Bu tür, programlama dillerinde açık veya kapalı , evet veya hayır vb. gibi yalnızca iki zıt durumu olan bir şeyi temsil etmenin yaygın bir yoludur.

![gorsel](https://ucarecdn.com/50cbf6b2-6d44-44d6-b5ef-b1426bdde305/)

Bir kapının açılıp kapanmasını takip eden bir uygulama yazıyorsanız, mevcut kapı durumunu saklamak için kullanmayı doğal bulacaksınız.

```
boolean acik = true;
boolean kapali = false;

System.out.println(acik);   // true
System.out.println(kapali); // false
```

**Önemli** ```boolean```bir veriye bir değer atayamazsınız. Java'da 0 ile ```false``` aynı değildir.

## Mantıksal operatörler

Java'nın NOT , AND , OR ve XOR olmak üzere dört mantıksal operatörü vardır :

- ```NOT``` , boolean değerini tersine çeviren tekli bir operatördür. ```!``` olarak gösterilir.
```
boolean f = false; // false
boolean t = !f;    // true
```
- ```AND```, her iki işlenen de ```true``` ise ```true``` dönen bir ikili işleçtir, aksi takdirde ```false``` döndürür. ```&&``` olarak gösterilir.
```
boolean b1 = false && false; // false
boolean b2 = false && true;  // false
boolean b3 = true && false;  // false
boolean b4 = true && true;   // true 
```
- ```OR```, en az bir işlenen ```true``` ise dönen ```true``` bir ikili operatördür, aksi takdirde ```false``` döndürür. ```||``` olarak gösterilir.
```
boolean b1 = false || false; // false
boolean b2 = false || true;  // true
boolean b3 = true || false;  // true
boolean b4 = true || true;   // true
```
- ```XOR``` (özel VEYA), boolean işlenenlerin farklı değerleri varsa ```true``` dönen bir ikili operatördür, aksi takdirde ```false``` döndürür. 
```^``` olarak gösterilir.
```
boolean b1 = false ^ false; // false
boolean b2 = false ^ true;  // true
boolean b3 = true ^ false;  // true
boolean b4 = true ^ true;   // false
```
XOR operatörü diğerlerinden daha az kullanılır. Sadece Java'nın sahip olduğunu unutmayın. Gerçekten ihtiyacınız varsa, kullanabilirsiniz.

## Mantıksal operatörlerin önceliği

Aşağıda, ifadelerdeki önceliklerine göre sıralanmış mantıksal işlemler verilmiştir: 

```!(NOT), ^(XOR), &&(AND), ||(OR).```

Yani, aşağıdaki değişken true:
```
boolean b = true && !false; // true, çünkü ! ifadesi önceliklidir.
```
Yürütme sırasını değiştirmek için parantez (...) kullanabilirsiniz.

## Bir örnek: trekking

Örnek olarak yaz aylarında ve diğer mevsimlerde trekking yapma olasılığını belirleyen karmaşık bir boole ifadesi yazalım. 
Diyelim ki trekking için doğru koşullar, yaz ve sonbaharda ılık ve kuru hava.
```
boolean soguk = false;
boolean kuru = true;
boolean yaz = false; // şu an sonbahar olduğunu gösterir.

boolean trekking = kuru && (!soguk || yaz); // true, hadi trekking yapalım!
```
Yukarıdaki ifadede kafanız karışmasın, aksi takdirde kötü havalarda trekking yaparsınız! 
Bir programcı sadece aritmetik değil, aynı zamanda mantıksal işlemleri de anlamalıdır.

## Kısa devre değerlendirmesi

İlginç bir şey, ```&&``` ve ```||``` operatörlerinin gerekli değilse ikinci argümanı değerlendirmemesidir. 
```&&``` operatörünün ilk argümanı false olarak değerlendirildiğinde, genel değer false olmalıdır;
```||``` operatörün ilk argümanı true olarak değerlendirildiğinde, genel değer true olmalıdır.
```
false && ...-> false, sağ tarafın ne olduğunu bilmek gerekmediği için false;
true || ...-> true, çünkü sağ tarafın ne olduğunu bilmek gerekli değildir.
```
Bu davranış, kısa devre değerlendirmesi olarak bilinir(bunu elektriksel kısa devre ile karıştırmayın). 
Hesaplama süresini azaltır, ancak programlarda bazı hataları önlemek için de kullanılabilir.
