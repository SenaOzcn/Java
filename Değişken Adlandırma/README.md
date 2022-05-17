# Adlandırma neden önemlidir?

Bildiğiniz gibi, her değişkenin onu diğer değişkenler arasında benzersiz şekilde tanımlayan bir adı vardır. Bir değişkene iyi bir isim vermek göründüğü kadar basit olmayabilir. Deneyimli programcılar, programlarının anlaşılmasını kolaylaştırmak için adlandırma konusuna çok dikkat ederler. Bu önemlidir çünkü programcılar zamanlarının çoğunu diğer programcılar tarafından yazılan kodu inceleyerek geçirirler. Değişkenlerin adları kötüyse, kendi kodunuz bile birkaç ay içinde size belirsiz görünecektir.

Her zaman tüm değişkenlere açıklayıcı ve özlü isimler vermeye çalışın. Sonuç olarak, herhangi bir programcı kodunuzdan uzun süre keyif alacaktır.

Ayrıca, değişkenler için olası adları kısıtlayan iki grup kural vardır.

# Değişkenleri adlandırma kuralları

Java'nın değişkenleri adlandırmak için bazı kuralları vardır:

- Adlar büyük/küçük harfe duyarlıdır;
- Bir ad, [Unicode](https://en.wikipedia.org/wiki/Unicode) harfler, rakamlar ve iki özel karakter ( $, _) içerebilir;
- İsim rakamla başlayamaz;
- Bir isim bir anahtar kelime olmamalıdır (class, static, int vb. yasadışı adlardır).

Bu kurallara dayanarak, bir değişken adında boşluklara izin verilmediği sonucuna varabilirsiniz.

*Bu kuralları çiğnememek önemlidir; aksi takdirde program çalışmayacaktır.*

# Değişkenler için adlandırma kuralları

Ayrıca, değişkenleri adlandırmak için aşağıdaki kurallar vardır:

- Değişken adı tek bir kelimeyse, küçük harf olmalıdır.(örneğin: number, price);
- Bir değişken ismi birden fazla kelime içeriyorsa, ```lowerCamelCase```içinde olmalıdır, 
yani ilk kelime küçük harf olmalı ve ilk kelimeden sonraki her kelimenin ilk harfi büyük yazılmalıdır.(örneğin: numberOfCoins);
- Değişken adları izin verildiği halde _ ve $ karakterleriyle başlamamalıdır.
- Mantıklı bir ad seçin.

Bu kurallar isteğe bağlıdır, ancak bunlara uyulması şiddetle tavsiye edilir. 
Kodunuzu siz ve diğer Java programcıları için daha okunabilir hale getirirler.
