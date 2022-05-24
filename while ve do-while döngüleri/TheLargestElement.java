/*
Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.

The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.

 Report a typo
Sample Input 1:

1
7
9
0
Sample Output 1:

9
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNumber = 0;
        int num;
        do {
            num = scanner.nextInt();
            largestNumber = num > largestNumber ? num : largestNumber;
        } while (num != 0);
        System.out.println(largestNumber);
    }
}
