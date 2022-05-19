/* In a computer game, each gamer has an army of units.

Write a program that will classify the army of your enemies corresponding to the following rules:

Units: Category

less than 1: no army

from 1 to 19: pack

from 20 to 249: throng

from 250 to 999: zounds

1000 and more: legion

The program should read the number of units and output the corresponding category. */

import java.util.Scanner;

class TheArmyOfUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enemy = scanner.nextInt();
        
        boolean isArmy = enemy < 1;
        boolean isPack = enemy >= 1 && enemy <= 19;
        boolean isThrong = enemy >= 20 && enemy <= 249;
        boolean isZounds = enemy >= 250 && enemy <= 999;
        
        if (isArmy) {
            System.out.println("no army");
        } else if (isPack) {
            System.out.println("pack");
        } else if (isThrong) {
            System.out.println("throng");
        } else if (isZounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}

