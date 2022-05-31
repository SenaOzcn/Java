/*
Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains the elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.

Sample Input 1:

5
5 8 11 2 10
8
Sample Output 1:

21
Sample Input 2:

4
-5 -4 -6 -11
-10
Sample Output 2:

-15
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int j = 0; j < len; j++) {
            if (arr[j] > n) {
                count += arr[j];
            }
        }
        System.out.println(count);
    }
}
