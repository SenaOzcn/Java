/*
You need to implement printTheThirdRow method. It should print the third row of the twoDimArray. The elements should be separated by space.

It is guaranteed that twoDimArray has at least 3 rows.
*/

class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        for (int i : twoDimArray[2]) {
            System.out.print(i + " ");
        }
    }
}
