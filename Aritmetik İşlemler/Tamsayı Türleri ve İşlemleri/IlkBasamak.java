//Girilen iki basamaklı bir sayının ilk rakamını ekrana yazdıran program.

import java.util.Scanner;

class IlkBasamak {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    final result = n / 10;
    System.out.println(result);
  }
}
