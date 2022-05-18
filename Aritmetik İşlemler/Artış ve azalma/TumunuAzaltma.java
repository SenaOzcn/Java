// Dört sayı okuyan ve her birini azaltan bir program yazın.
// Program, sonuçları boşluklarla ayrılmış olarak aynı sırada çıkarmalıdır.

import java.util.Scanner;

class TumunuAzaltma {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    while (scanner.hasNextInt()) {
      num = scanner.nextInt();
      System.out.print(--num + " ");
    }
  }
}
