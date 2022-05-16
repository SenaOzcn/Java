# Programa Genel Bakış

```
public class Main {
   public static void main(String[] args) {
      System.out.println("Hello, World!");
   }
}
```

# Temel Teminoloji

- **Program** – Birbiri ardına öngörülebilir bir şekilde yürütülen bir dizi talimat (deyimler olarak adlandırılır). Sıralı akış, ifadelerin yazıldığı sırayla yukarıdan aşağıya sıralı bir şekilde yürütüldüğü en yaygın ve doğrudan ifade dizisidir;
- **Açıklama** – Noktalı virgülle (;) sonlandırılan tek bir eylem;
- **Blok** – Bir çift küme parantezi içine alınmış bir sıfır, bir veya daha fazla ifade grubu {...}; 
- **Yöntem** – Üst düzey bir işlemi temsil eden bir dizi ifade (alt program veya prosedür olarak da bilinir);
- **Sözdizimi** – Bir programın geçerli olması için nasıl yazılması gerektiğini tanımlayan bir dizi kural;
- **Anahtar Kelime**  – Programlama dilinde özel bir anlamı olan bir kelime (public, class ve diğerleri);
- **Tanımlayıcı veya ad** – Bir programdaki bir şeye atıfta bulunan bir kelime (bir değişken veya bir işlev adı gibi);
- **Yorum**  – Kodun ne yaptığının yazılı açıklaması. Java'da yorum için (//) kullanılır;
- **Boşluk** – Görünür olmayan tüm karakterler (boşluk, sekme, yeni satır vb.).

# Ayrıntılı Hello,World Program Anlatımı

**1. Public class** Bir programın temel birimidir. Her Java programının en az bir sınıfı olmalıdır. Bir sınıfın tanımı, ```class```anahtar kelime ardından yazılan sınıf adıyla oluşturulur. Bu isim Main, App yada Program olabilir ama bu sınıf ismi bir rakamla başlayamaz. Ardından küme parantezi ```{}```bu sınıfın gövdesini çevreler.

```
public class Main {
   // ...
}
```
**2. main Yöntemi** Programı çalıştırılabilir hale getirmek için bir sınıfın içinde ```main``` isimli bir metot kullanıldı. Java programı için giriş noktasıdır. Yine küme parantezi ```{}``` gövdesini çevreler.

```
public static void main(String[] args) {
   // İfadeler buraya yazılır.
}
```

Java'da büyük/küçük harf duyarlılığı vardır. Main ile MAIN farklıdır.

```String[] args```öğesi programa dış dünyadan iletilen bir dizi argümanını temsil eder.

**3. "Hello, World!" Yazdıralım** Yöntemin gövdesi, programın ne yapması gerektiğini belirleyen programlama ifadelerinden oluşur.

```
System.out.println("Hello, World!");
// Her ifade ";" ile bitmelidir.
```

Ekranda yeni bir satırın ardından bir dize görüntülemek için ```println``` yöntemi çağırılır.

"Hello, World!" bir anahtar kelime veya tanımlayıcı değildir; sadece yazdırılacak bir metindir.

**4. Anahtar Kelimeler** Basit bir Java programı bile, dilin parçaları olan *anahtar kelimeler dahil olmak üzere birçok öğeden oluşur.* 

Tüm anahtar kelimelere [buradan](https://en.wikipedia.org/wiki/List_of_Java_keywords) ulaşabilirsiniz.

```main``` bir anahtar kelime olmadığı için verilen listenin dışındadır.
