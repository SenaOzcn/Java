// N sincap K tane fındık buldu ve bunları eşit olarak bölmeye karar verdi. Her sincapın kaç tane fındık alacağını belirleyin.
// Her biri 10000'den büyük olmayan iki pozitif N ve K sayısı vardır.

import java.util.Scanner;

class SincapFindik {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Sincap sayısı
    int n = scanner.nextInt();
    // Fındık sayısı
    int k = scanner.nextInt();
    
    final int result = k / n;
    // Paylaşılan fındık miktarını yazdırma
    System.out.println(result);
  }
}
