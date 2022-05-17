  # Girdi
  
  Standart **girdi**, bir programa giren veri akışıdır. İşletim sistemi tarafından desteklenmektedir.
  Varsayılan olarak standart girdi, klavye girişinden veri alır ancak bir dosyadan yönlendirme de mümkündür.
  
  Aslında, tüm programların standart giriş kullanması gerekmez. Programlama sorunlarını çözmenin tipik yolu şudur :
 1. Standart girdiden(System.in) verileri okuyun;
 2. Bir sonuç elde etmek için verileri işleyin;
 3. Sonucu standart çıktıya yazdırın(System.out).

Bu tür bir kod sorgulaması, farklı girdi verisi biçimleriyle kolayca test edilebilir.

# Tarayıcı ile Veri Okuma

Standart girdiden veri elde etmenin en basit yolu ```Scanner``` sınıfı kullanmaktır. Bir programın girdiden farklı türdeki değerleri okumasını sağlar.

Bu sınıfı kullanmak için aşağıdaki import ifadesini kaynak koduyla birlikte dosyanızın başına eklemelisiniz.

```
import java.util.Scanner;
```

İçe aktarma işleminden sonra aşağıdaki yapıyı eklersiniz:
```
Scanner scanner = new Scanner(System.in);
```
```System.in``` programın yazdığınız girdiyi okuyacağını belirtir. 

```Scanner```girilen dizeleri okumanın iki yolu vardır. Giri bir tamsayı veya tek bir kelime ise, ```next()```metodu kullanarak verileri okuyabiliriz.
```
String ad = scanner.next();
System.out.println("Merhaba, " + ad + "!");
```

 Tüm satırı okuyan ve çıktısı almak için, ```nextLine()``` yöntemine ihtiyacınız olacak.
 
 ```next()``` yöntemi yalnızca bir kelime okur ve boşluk içermez. Buna karşılık, ```nextLine()``` yöntemi karşılaştığı tüm boşluk karakterlerini içerir.
 
 *Java'da **boşluk** yalnızca boşluk karakterini değil, çoğunlukla yazdırıldığında boş görünen her şeyi içerir: bir sekme, yeni satır karakteri ve diğer yazdırılamayan karakterler.*
 
 # Çok Satırlı Bir Girişi Okuma
 
 ```
 import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        String kelime1 = scanner.next(); // "bu"
        String metin1 = scanner.nextLine(); // " basit bir " 
        String metin2 = scanner.nextLine(); // "çok satırlı"
        String kelime2 = scanner.next(); // " girdidir,"
        String metin3 = scanner.nextLine(); // "" 
        
    }
}
 ```
 
