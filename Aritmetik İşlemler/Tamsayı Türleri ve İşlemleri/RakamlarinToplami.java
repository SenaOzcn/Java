// Üç basamaklı bir tam sayı verilir (yani 100 ile 999 arasında bir tam sayı). Rakamlarının toplamını bulun.

import java.util.Scanner;

class RakamlarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        final int digit1 = 1000;
        final int digit2 = 100;
        final int digit3 = 10;
        
        final int mod1 = digit % digit1;
        final int mod2 = digit % digit2;
        final int mod3 = digit % digit3;
        
        final int division1 = mod1 / digit2;
        final int division2 = mod2 / digit3;
        
        final int sum = division1 + division2 + mod3;
        System.out.println(sum);
    }
}
