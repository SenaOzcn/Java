# Tamsayı türleri ve işlemleri

Java, pozitif, negatif ve sıfır dahil olmak üzere tam sayıları temsil eden birkaç tür sağlar. 
Uygulamada en çok kullanılan türler ```int``` ve ```long```. 
İlk tür, ikincisinden daha küçük bir aralıktaki sayıları saklayabilir, ancak genellikle yeterlidir. 
Tüm aritmetik işlemleri ( +, -, *, /, %) tamsayı türündeki değişkenlerle gerçekleştirebilirsiniz.

## Tamsayı türleri: temel bilgiler

Aşağıda bazı örneklere bakalım.

```
int iki = 2;
int on = 10;

int onIki = iki + on; // 12
int sekiz = on - iki;  // 8
int yirmi = iki * on; // 20
int bes = on / iki;   // 5
int sifir = on % iki;   // 0

int eksiIki = -iki; // -2
```
Kodunuzun okunabilirliğini artırmak için, bir sayı içindeki basamak gruplarını ayırmak için alt çizgi ```_``` karakteri kullanılabilir.

```
int milyon = 1_000_000;
```

Tüm aritmetik işlemler ```long``` türle de çalışır.
```
long bir = 1L;
long yirmiIki = 22L;
long buyukSayi = 100_000_000_000L;

long sonuc = buyukSayi + yirmiIki - bir; 
System.out.println(sonuc); // 100000000021
```
*```long``` Sayılarını yalnızca gerçekten gerekliyse kullanın(iki milyardan büyük sayılarla uğraşırken). Diğer durumlarda ```int``` sayıları tercih edin.*

## Atama operatörünün formları

Bir değişkene bir değer eklemek istediğinizi varsayalım. Bunun gibi bir şey yazabilirsiniz:
```
int n = 10;
n = n + 4; // 14
```
Atama operatörü ```=```, değişkeni iki kez tekrar etmekten kaçınmak için onu bir işlemle birleştiren çeşitli biçimlere sahiptir:
```
int n = 10;
n += 4; // 14
```

## Standart girişten sayıları okuma

```
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
```
Girilen sayıların oldukça büyük olabileceğini biliyorsak, ```int``` yerine ```long``` okuyabiliriz:
```
long a = scanner.nextLong();
long b = scanner.nextLong();

long sum = a + b;
```
