/*
According to the formula, the area of a parallelogram is the result of the multiplication of the base and the height of the figure. 
Call the method countAreaOfParallelogram that calculates the area of the parallelogram with the following parameters bb and hh.

Sample Input 1:

8 10

Sample Output 1:

80
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        countAreaOfParallelogram(b, h);
    }
  
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
