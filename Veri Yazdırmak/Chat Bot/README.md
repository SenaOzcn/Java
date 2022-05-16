# Chatty Bot Sizi Karşılıyor

Dijital kişisel asistanlar,  insanların araba kullanmalarına, günlerini planlamalarına, çevrimiçi bir şeyler satın almalarına yardımcı oluyor. 
Bir anlamda, konuşabileceğiniz yapay zekanın basitleştirilmiş versiyonlarıdır.

İlk aşama için, bir selamlama, adını ve oluşturulma tarihini gösteren bir bot yazalım.

Programımız aşağıdaki satırları yazdırmalıdır:
```
Merhaba! Benim adım {botAdı}.
Ben {doğumTarihi} tarihinde oluşturuldum.
```
{botAdı} yerine bir robot adı ve {doğumTarihi} yerine bir yıl yazalım.

Çıktı şu şekilde olmalıdır : 
```
Merhaba! Benim adım Aid.
Ben 2022 tarihinde oluşturuldum.
```

Şimdi bunu koda dönüştürelim :
```
package bot;

public class SimpleBot {
   public static void main(String[] args) {
      System.out.println("Merhaba! Benim adım Aid.);
      System.out.println("Ben 2022 tarihinde oluşturuldum.);
   }
}
```
