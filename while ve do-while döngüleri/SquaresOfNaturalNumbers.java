/*
Read an integer number N from the input and print all the squares of positive integers:

less than or equal to N,
in ascending order.
 Report a typo
Sample Input 1:

50
Sample Output 1:

1
4
9
16
25
36
49
Sample Input 2:

1
Sample Output 2:

1
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while (i * i <= num) {
            System.out.println(i * i);
            i++;  
        }
    }
}
