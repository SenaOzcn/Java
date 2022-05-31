# Bir Yöntemi Çağırmak

Başlamak için bazı yöntemler arayacağız:
```
getVolume(a, b, h);
```

Burada, bazı geometrik şekillerin hacmini(h) ve değişkenleri hesaplayan yöntemin adı(a) ve (b) parametreleridir. 
Teknik olarak, bir yöntemin parametresi, yöntemin içinde kullanılan bir değerdir. 
Adın ve yöntemin parametrelerinin parantez içindeki kombinasyonu, yöntemi çağırma veya çağırma şeklimizdir.

## Yöntemin adı

Her yöntemin onu çağırmak için kullanılan bir adı vardır. Genellikle, yöntemin ne yaptığını yansıtır – yazdırır, bulur, hesaplar, bize bazı bilgiler sağlar.

Java derleyicisi, **yasal bir tanımlayıcı** olmak için bir yöntem adını gerektirir. Yasal tanımlayıcılar için kurallar şunlardır:

- tanımlayıcılar büyük/küçük harf duyarlıdır;
- bir tanımlayıcı, unicode harfleri, rakamları, alt çizgi _veya para birimi($) karakterlerini içerebilir;
- tanımlayıcı bir rakamla başlayamaz;
- tanımlayıcılar bir anahtar kelime olmamalıdır.

Ayrıca, olası yöntem adlarını kısıtlayan bir adlandırma kuralı vardır. İsteğe bağlıdır ancak geliştiriciler için arzu edilir. 
Kural olarak, tek kelimelik bir isim küçük harfli bir fiil olmalıdır: sum, multiply, veya round. 

Bir metodun çok kelimeli bir ismi varsa, ikincinin ilk harfi büyük yazılmalıdır: getValue, calculateNumberOfOranges, veya findLetter.

Tamam, şimdi yöntemlerin nasıl adlandırıldığını biliyoruz. Onları gerçekte nasıl adlandırdığımız hakkında konuşalım!

## Bir yöntemi çağırmak

Programınızda bir yöntemi çağırmak istiyorsanız, adını yazmalı ve parametrelerinin değerlerini parantez içinde iletmelisiniz:

printNumber(7); // 7

convertDoubleToInt(1.25);

findUserByName("Kate");

findUserByName örneğine bir göz atalım.

Burada, bir isim ile bir String değeri iletiyoruz. Bir metodu ait olduğu sınıfın dışından çağırmak için bir sınıfı önek olarak belirtmemiz gerekir:

```
Math.round(79.378);
Character.isLetter('a');
```

Bir yöntemi çağırarak küçük bir görevi gerçekleştirmeye çalışalım:

```
double weight = 63.85;
weight = Math.round(weight); // şimdi weight 64.0'a eşittir.
```

Burada parametre alan yöntemlerimiz var, peki ya size bazı yöntemlerin hiç parametre kabul etmediğini söylesem? Bu durumda parantezleri boş bırakın.

Bazı yöntemler biraz farklı bir şekilde çağrılır:

```
String name = new String("Anya"); // bir örnek oluşturuldu(1)
name = name.toLowerCase(); // anya (2)
```
Bunun gibi yöntemler, çağrılacak belirli bir sınıfın nesnesini gerektirir. 
Yöntemi çağırmadan önce, söz konusu yöntem dizelerle ilgilendiğinden, toLowerCase() adında bir nesne oluşturduk. 
Şimdi bu özel örnek (2) için yöntemi çağırabiliriz, bu da name dizgemizdeki tüm harfleri büyük harften ayırmayla sonuçlanır.

Gördüğünüz gibi, bu yöntem çağrılmadan önce bir örneğin oluşturulmasını gerektirir, bu yüzden bir örnek yöntemi olarak bilinir. 

## Yerleşik yöntemler

Neden önceden yazılmış algoritmaları yeniden yazmanız gerekiyor? Kullanıcıya her zaman açık olan önceden tanımlanmış yöntemleri kullanmak daha verimlidir. 
Bu nedenle Java'da iki tür yöntem vardır: 
1. yerleşik ve 
2. kullanıcı tanımlı yöntemler.

### Yerleşik yöntemler

Standart Java kitaplığına aittir. 
Artık değerleri dönüştüren veya karşılaştıran, çiftleri yuvarlayan, maksimum veya minimum değeri bulan ve birçok faydalı işlem yapan birçok yerleşik yöntem var. 
İhtiyacınız olan yöntemi Oracle belgelerinde bulabilirsiniz. 
Örneğin, [Matematik](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) kitaplığı bağlantısını kontrol edin.

### Kullanıcı tanımlı yöntemler 

Programcı tarafından oluşturulur. Belirli bir amaç için özelleştirilmiş bir alt program oluşturmak yaygın bir uygulamadır. 
Kendi yönteminizi oluşturabilir ve hatta kendi sınıfınıza koyabilirsiniz.

Genel olarak, bir yöntem, düzgün ve yeniden kullanılabilir bir kod stili hedefleyen bir programcı için gerekli bir araçtır. 
Yöntemlerin yardımıyla, ihtiyacımız olan herhangi bir özel görevi gerçekleştirebiliriz. 
Programın daha okunaklı görünmesini sağlarlar ve rutin kod satırlarını defalarca tekrarlamamız gerekmez. 
Bazı görevler, standart Java kitaplığının parçası olan özel yerleşik yöntemlere sarılır.

