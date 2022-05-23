/*
Given natural number n not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:

If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.

For example, if the number n = 17, then the sequence looks as the following:

17 52 26 13 40 20 10 5 16 8 4 2 1
It was proved that such a sequence will stop at number 1 for any initial natural number n up to 2^68.

Output format:
Sequence of integers in a single line, separated by spaces.

Sample Input 1:

17
Sample Output 1:

17 52 26 13 40 20 10 5 16 8 4 2 1
Sample Input 2:

1
Sample Output 2:

1
*/

import java.util.Scanner;

class CollatzConjecture {

    private static int evenFunction(int n) {
        final int numberTwo = 2;
        return n / numberTwo;
    }
    
    private static int oddFunction(int n) {
        final int numberThree = 3;
        final int numberOne = 1;
        return n * numberThree + numberOne;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            n = n % 2 == 0 ? evenFunction(n) : oddFunction(n);
            System.out.print(n + " ");
        }
    }
}
