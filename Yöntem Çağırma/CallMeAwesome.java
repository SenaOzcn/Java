/*
Here's the method callMeAwesome. Write the invocation of this method in the template below.

Sample Input 1:

Alice
Sample Output 1:

Alice, you're awesome!
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        callMeAwesome();
    }

    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}
