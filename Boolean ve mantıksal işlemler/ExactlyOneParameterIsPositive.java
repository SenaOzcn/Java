// Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0).

// Otherwise, it should print false.

/*
Sample Input 1:

1 1 1

Sample Output 1:

false

Sample Input 2:

1 0 -1

Sample Output 2:

true
*/

import java.util.Scanner;

class ExactlyOneParameterIsPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean ad = a <= 0 ^ b <= 0 ^ c > 1;
        System.out.println(ad);
    }
}
