/*
Write a program that calculates the sum of the elements of an array of ints.

Input data format

The first line contains the size of an array.

The second line contains elements of the array separated by spaces.


Output data format

The sum of the input array elements.

Note that If your solution gets the code quality warning "System.arraycopy is more efficient", please simply ignore it in respect of this code challenge.

Sample Input 1:

3
1 2 3
Sample Output 1:

6
Sample Input 2:

5
-1 0 1 2 -2
Sample Output 2:

0
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            } 
        }
        System.out.println(sum);
    }
}
