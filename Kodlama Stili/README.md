# Kurallar

Basit tek satırlı programlardan daha karmaşık programlara geçerken karşılaştığınız bir soru var: Temiz ve okunması kolay kod nasıl yazılır? 
Bu, başlangıçta göründüğünden daha aldatıcıdır ve bu oldukça önemlidir: gerçek hayatta programlama, birlikte çalışan birçok insanı içeren bir süreçtir. 
Aslında, genellikle yazmaktan çok kodu okumak için zaman harcarsınız. 
Tek başınıza çalışıp "kendiniz için" bir program yazarken bile, bir süre sonra kendi programınızı kötü yazılmışsa anlamanız zorlaşabilir.

Bu nedenle, programlama stiliyle ilgili yaygın en iyi uygulamaları izlemeniz gerekir. Bu şekilde, diğer programcılar ve siz kodunuzu kolayca okuyabilirsiniz.

*İyi kodlama stili, doğru noktalama işaretleri gibidir: Onsuz da yönetebilirsiniz, ancak bu kesinlikle her şeyi daha kolay okunur hale getirir. 
– Hadley Wickham'ın Tidyverse Stil Rehberi*

# Java Sözleşmeleri

Belirli bir dil için nasıl kod yazılacağına ilişkin öneriler listesine genellikle kodlama stil kılavuzu veya stil kuralları denir . 
Kurallar, geliştiricilerin iyi okunabilir kodu standartlaştırmasına ve desteklemesine yardımcı olur. Bunlar katı kurallardan çok önerilere benzerler, 
ancak bir programcı bunları izleyerek diğer geliştiricilerin onunla çalışmaktan mutlu olması için temiz ve tutarlı kodlar oluşturur.

Çoğu durumda, şirketler ve bireysel geliştiriciler kendi stil kurallarını oluşturmazlar. Tüm dünyada kullanılan genel kabul görmüş iki Java kuralı vardır:

- [Oracle Kod Kuralları](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf)
- [Google Stil Kilavuzu](https://google.github.io/styleguide/javaguide.html)

Bazen ihtiyaçlarını karşılamak için belirli bir şirket tarafından değiştirilebilir veya genişletilebilirler.

# Boşluk Sayısı

İlk kural, tüm program kodunda girinti birimi olarak 4 boşluk kullanmaktır.

İyi örnek :

```
public class BoslukSayisi {

    public static void main(String[] args) {
        System.out.println("Selam!");
        System.out.println("Ben bir Java programıyım.");
    }
}
```

Kötü örnek :
```
public class BoslukSayisi {

  public static void main(String[] args) {
     System.out.println("Selam!");
   System.out.println("Ben bir Java programıyım.");
 }
}
```

Gördüğünüz gibi, ikinci kod örneği - düzensiz girintili - çirkin görünüyor ve okunması biraz çaba gerektiriyor.

# Küme Parantezlerin Yeri

İyi örnek :
```
public class BoslukSayisi {

    public static void main(String[] args) {
        System.out.println("Selam!");
        System.out.println("Ben bir Java programıyım.");
    }
}
```
O kadar da kötü değil, ama Java yolu değil: :
```
public class NumberOfSpacesExample 
{
    public static void main(String[] args) 
    {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
```

Burada, ikinci kod örneği çirkin görünmüyor, ancak Java'da genellikle böyle yapılmaz. Yaygın sözleşmelerin çoğu ilk örneği takip eder.

# Fazla Boşluk Bırakmaktan Kaçının

Bazen gerçekten ihtiyacınız olmasa bile bazı boşluklar ekleyebilirsiniz. Bu, kodunuzun okunabilirliğini azaltacaktır.
- **Parantez içinde fazladan boşluk bırakmaktan kaçının.**

İyi örnek :
```
System.out.println("Merhaba!");
```

Kötü örnek :
```
System.out.println( "Merhaba!" );
```
- **Bir parantezden önce fazladan boşluk bırakmaktan kaçının.**

İyi örnek :
```
System.out.println("İyi");
```
Kötü örnek :
```
System.out.println ("Parantez kayması");
```
- **Noktalı virgülden önce fazladan boşluk kullanmaktan kaçının.**

İyi örnek :
```
System.out.println("Fazla boşluk yok");
```
Kötü örnek :
```
System.out.println("Fazladan bir boşluk var") ;
```
