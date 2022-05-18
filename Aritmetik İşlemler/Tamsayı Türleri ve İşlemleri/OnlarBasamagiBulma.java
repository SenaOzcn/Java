// Verilen bir sayının onlar basamağını bulan program.

import java.util.Scanner;

class OnlarBasamagiBulma {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int mod = n % 100;
    final int result = mod / 10;
    System.out.println(result);
  }
}
