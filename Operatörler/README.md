# İlişkisel operatörler

Java, sayıları karşılaştırmak için altı ilişkisel operatör sağlar:

1. ==(eşittir)
2. !=(eşit değil)
3. >(büyüktür)
4. >=(büyük veya eşit)
5. <(küçüktür)
6. <=(küçük veya eşit)

İşlenenlere ilişkisel bir işleç uygulamanın sonucu, işlenen türlerinden bağımsız olarak boolean(true veya false) olacaktır.

## Tam sayıların karşılaştırılması

İlişkisel operatörler, diğer şeylerin yanı sıra iki tam sayıyı kolayca karşılaştırmanıza olanak tanır. Aşağıda bazı örnekler verilmiştir:
```
int one = 1;
int two = 2;
int three = 3;
int four = 4;

boolean oneIsOne = one == one; // true

boolean res1 = two <= three; // true
boolean res2 = two != four;  // true
boolean res3 = two > four;   // false
boolean res4 = one == three; // false
```
İlişkisel operatörler, aritmetik operatörlerle birlikte karma ifadelerde kullanılabilir. 
Bu tür ifadelerde ilişkisel operatörler, aritmetik operatörlerden daha az önceliğe sahiptir.

Aşağıdaki örnekte, önce iki toplam hesaplanır ve ardından operatör ```>``` kullanılarak bunlar karşılaştırılır.
```
int number = 1000;
boolean result = number + 10 > number + 9; // true
```
## Mantıksal operatörleri kullanarak ilişkisel işlemleri birleştirme

Java'da ```a <= b <= c``` gibi bir ifade yazamazsınız . 
Bunun yerine, ```||``` ve ```&&``` gibi mantıksal operatörleri kullanarak iki boolean ifadesini birleştirmelisiniz.

İşte bir örnek:
```
number > 100 && number < 200; // 100 < number < 200 
```
Ayrıca, okunabilirliği artırmak için ifadenin bölümlerini parantez içinde yazabiliriz:
```
(number > 100) && (number < 200);
```
Ancak parantezler burada gerekli değildir, çünkü ilişkisel işleçler mantıksal işleçlerden daha yüksek önceliğe sahiptir.

İşte daha genel bir değişken örnek:
```
int number = ...             
int low = 100, high = 200;  

boolean inRange = number > low && number < high; 
```
## Bir program örneği

Diyelim ki spor sınıfında üç çocuk var. 
Yüksekliklerinin azalan düzende düzenlenip düzenlenmediğini kontrol etmek istiyorsunuz. 
Aşağıdaki program, üç tamsayıyı okur ve h1 >= h2 ve h2 >= h3 olup olmadığını kontrol eder . h'nin bir çocuğun boyu anlamına geldiğini unutmayın.
```
import java.util.Scanner;

public class CheckDescOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = (h1 >= h2) && (h2 >= h3);

        System.out.println(descOrdered);
    }
}
```
İşte birkaç giriş-çıkış çifti:
```
Giriş 1 :

185 178 172

Çıkış 1 :

true

Giriş 2 :

181 184 177

Çıkış 2 :

false
```
Çıktıdan önce boolean sonucunu saklamak için ek bir değişken kullanmamak da mümkündür:
```
System.out.println((h1 >= h2) && (h2 >= h3));
```
Ancak durumunuz oldukça uzun olduğunda, bazı açıklamalar yapmadan kodun ne yaptığını anlamak zor. İyi bir ada sahip bir değişken böyle bir açıklama sağlar.

Bu nedenle, mantıksal operatörler, bir dizi ilişkisel işlemi tek bir ifadede birleştirmenize izin verir.
