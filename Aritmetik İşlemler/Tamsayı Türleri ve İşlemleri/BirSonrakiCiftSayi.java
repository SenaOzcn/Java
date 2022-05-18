// Girilen sayıdan sonraki çift sayıyı bulan program.

import java.util.Scanner;

class BirSonrakiCiftSayi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int result = 0;
    int mod = n % 2;
    
    if (mod == 0) {
      result = n + 2;
      System.out.println(result);
    } else {
      result = n + 1;
      System.out.println(result);
    }
  }
}
