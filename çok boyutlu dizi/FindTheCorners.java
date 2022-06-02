/*
You need to implement printCorners method. It should print all corner elements of the twoDimArray in the following order: left to right and top to bottom.

The elements must be separated by space and printed as an example below.

Input array:

1 0 2
0 0 0
3 0 4
Printed corners:

1 2
3 4
Notice, that you must always print 4 corners, for example:

Input array:

1
2
3
Printed corners:

1 1
3 3
*/

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        System.out.print(twoDimArray[0][0] + " ");
    	System.out.print(twoDimArray[0][twoDimArray[0].length - 1] + " ");
    	System.out.println();
    	System.out.print(twoDimArray[twoDimArray.length - 1][0] + " ");
    	System.out.print(twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1] + " ");
    }
}
