/*
Şimdi botunuza saymayı öğreteceksiniz. Sayılar konusunda uzman olacak!

Amaç :

Bu aşamada, botu 0'dan kullanıcıların girdiği herhangi bir pozitif sayıya kadar sayacak şekilde programlayacaksınız.

Örnek :

Büyüktür sembolü > , kullanıcı girişini temsil eder. Girişin bir parçası olmadığını unutmayın.

Merhaba! Benim adım Aid.
2020 yılında oluşturuldum.
Bana adınızı söyleyin, lütfen.
> Sena
Ne harika bir ada sahipsin, Sena!
Yaşını tahmin etmeye çalışacağım.
Yaşınızın 3, 5 ve 7'ye bölümünden kalanlarını giriniz.
> 1
> 2
> 1
Yaşınız 22; Programlamaya başlamak için iyi bir yaş!
Şimdi sana istediğin kadar sayabileceğimi kanıtlayacağım.
> 5
0!
1!
2!
3!
4!
5!
Tamamlandı, iyi günler!
Not: Her sayı yeni bir satırla başlar ve bir sayıdan sonra bot ünlem işareti yazmalıdır.
*/

package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhaba! Benim adım Aid.");
        System.out.println("2020 yılında oluşturuldum");
        System.out.println("Bana adınızı söyleyin, lütfen.");

        String name = scanner.nextLine();

        System.out.println("Ne harika bir ada sahipsin " + name + "!");
        System.out.println("Yaşını tahmin etmeye çalışacağım.");
        System.out.println("Yaşınızın 3, 5 ve 7'ye bölümünden kalanlarını giriniz.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Yaşınız 22 " + age + "; Programlamaya başlamak için iyi bir yaş!");
        System.out.println("Şimdi sana istediğin kadar sayabileceğimi kanıtlayacağım.");

        int n = scanner.nextInt();
    
        for(int i = 0; i <= n; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Tamamlandı, iyi günler!");
    }
}
