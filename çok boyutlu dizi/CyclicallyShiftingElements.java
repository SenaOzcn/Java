/*
Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right: 
a[0] goes to the place of a[1], a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).

Input data format

The first line of the input contains the number of elements in the array. The second line contains the elements of the array.

Output data format

The single line should contain all shifted elements of the array. Elements must be separated by the space character.

Note that If your solution gets the code quality warning "System.arraycopy is more efficient", please simply ignore it in respect of this code challenge.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        numbers[0] = scanner.nextInt();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
