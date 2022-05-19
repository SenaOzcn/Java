/* Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.

You are given three numbers: AA, BB and HH. According to TV, one should sleep at least AA hours per day, but no more than BB hours. HH is how many hours Ann sleeps.

Task: If Ann sleeps less then AA hours, print "Deficiency". If she sleeps more than BB hours, print "Excess". If her sleep fits the recommendations, print "Normal".

Input format: three numbers AA, BB, HH, where AA is always less than or equal to BB.*/

import java.util.Scanner;

class HealthySleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        
        boolean isLessThanA = h < a;
        boolean isGreaterThanB = h > b;
        
        if (isLessThanA) {
            System.out.println("Deficiency");
        } else if (isGreaterThanB) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
