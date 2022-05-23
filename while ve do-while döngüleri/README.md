# while ve do-while döngüleri


Belirli bir koşul varken kodun bir parçasını tekrarlamak için birkaç yaklaşım vardır. 
Tekrarlanan parça yürütme ve koşul değerlendirme sırasına göre farklılık gösterirler.

# while döngüsü

while döngüsü, bir kod bloğundan ve bir koşuldan(bir ```Boolean``` ifadesi) oluşur. Koşul ise ```true```, blok içindeki kod yürütülür. 
Bu kod, ```false``` olana kadar tekrar eder. Bu döngü, blok yürütülmeden önce durumu kontrol ettiğinden, kontrol yapısı ön test döngüsü olarak da bilinir. 

*while döngüsünü tekrar eden bir koşullu ifade olarak düşünebilirsiniz.*

while döngüsünün temel sözdizimi aşağıdaki gibidir:
```
while (koşul) {
    // gövde
}
```
Bir döngünün gövdesi, koşullu ifadeler ve hatta diğer döngüler dahil olmak üzere herhangi bir doğru Java ifadesini içerebilir; 
ikincisi iç içe döngüler olarak adlandırılır.
```
while (true) {
    // gövde
}
```
Sonsuz döngülerin uygulanması aşağıdaki konularda ele alınacaktır.

Örnek 1. Aşağıdaki döngü, 5'ten küçük olan tam sayıları yazdırır.
```
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
// Sonraki ifade
```
Bu döngünün nasıl çalıştığını açıklayalım. İlk olarak, i değişkenine 0 değeri atanır. 
Döngünün gövdesinin ilk yürütülmesinden önce program, koşulun ```i < 5``` doğru olup olmadığını kontrol eder. 
Bizim durumumuzda i = 0'dır, yani koşul doğrudur ve döngünün gövdesi çalışmaya başlar. 
Gövdenin iki ifadesi vardır: mevcut i değerini görüntülemek ve onu 1 artırmak. 
Bu yapıldıktan sonra ifade i < 5 false olana kadar tekrar değerlendirilir. 
Şimdi i 1'e eşittir, bu nedenle koşul true'dur ve döngünün gövdesi tekrar tekrarlanır. 
Bu, i 5 değeri alınana kadar tekrarlanır, ardından ifade i < 5 false olur ve bu döngünün yürütülmesi sona erer. Program döngüden sonraki ifadeye geçer.
```
Çıktı:

0
1
2
3
4
```
Örnek 2. Aşağıdaki program, harfleri tek bir satırda görüntüler.
```
public class WhileDemo {

    public static void main(String[] args) {
        char harf = 'A';
        while (harf <= 'Z') {
            System.out.print(harf);
            harf++;
        }
    }
}
```
Program ilk harfi 'A' ile başlar ve şöyle devam eder:
```
ABCDEFGHIJKLMNOPQRSTUVWXYZ
```
# do while döngüsü

Do-while döngüsünde önce gövde yürütülür, ardından koşul test edilir. 
Koşul true ise, blok içindeki ifadeler yeniden yürütülür. Bu, koşul false haline gelene kadar tekrarlanır. 
Do-while döngüleri, blok yürütüldükten sonra durumu kontrol ettiğinden, kontrol yapısı genellikle test sonrası döngü olarak da bilinir. 
Blok içindeki kod yürütülmeden önce koşulu test eden while döngüsünün aksine, do-while döngüsü bir çıkış koşulu döngüsüdür. 

*Bu nedenle, blok içindeki kod her zaman en az bir kez yürütülür.*

Bu döngü üç bölümden oluşur:

1. do (anahtar sözcük)
2. bir gövde
3. while(ifade)
```
do {
    // gövde
} while (koşul);
```
Bunu kullanmanın iyi bir örneği, bir kullanıcı belirli bir sayı veya dize girene kadar standart girdiden veri okuyan bir programdır. 
Aşağıdaki program standart girdiden tamsayı sayıları okur ve görüntüler. 
0 sayısı girilirse program bunu yazdırır ve ardından durur. Aşağıdaki örnek do-while döngüsünü göstermektedir:
```
public class DoWhileDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);
        } while (value != 0);
    }
}
```
Giriş numaraları:
```
1 2 4 0 3
```
Çıktı :
```
1
2
4
0
```
while döngüsünün yanı sıra do-while döngüsünün de sonsuz olabileceğini unutmayın.
Pratikte do-while döngüsü while döngüsünden daha az kullanılır. *Döngü içindeki kodun en az bir kez çalıştırılması gerektiğinde kullanılır.*

##Uzunluğu bilinmeyen bir diziyi okuma

Döngü, while isteğe bağlı uzunluktaki bir karakter dizisini okumak için de kullanılabilir. 
Bunun için ```hasNextInt()``` yöntemini çağırabiliriz.

Sağlanan dizideki tüm öğelerin toplamını hesaplayan bir kod:
```
Scanner scanner = new Scanner(System.in);

int sum = 0;
while (scanner.hasNextInt()) {
    int elem = scanner.nextInt();
    sum += elem;
}

System.out.println(sum);
```
Giriş sırası ```1 2 3``` ise, kod ```6``` yazdırılır.

Gördüğünüz gibi while döngüsü, programlarınızdaki farklı ilginç görevleri çözmek için kullanılabilir.

Kodunuzun bir kısmını birkaç kez gerçekleştirmenin farklı yolları vardır. 
Önce koşulu kontrol etmek ve sonuca göre işlemleri yapmak veya yok saymak istiyorsanız, while döngüsü sizin seçiminizdir. 
Her durumda döngünün bir yinelemesini yapmak ve ardından tekrar koşulunu değerlendirmek istiyorsanız, do-while öğesini seçin. 
