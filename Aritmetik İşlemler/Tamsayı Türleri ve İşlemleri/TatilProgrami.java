// Tatile giden insanlara yardımcı olacak bir program yazın. Program, belirli bir süre boyunca iyi bir dinlenme için gerekli toplam parayı (örneğin $) hesaplamalıdır.

/*Dikkate alınması gereken dört parametre vardır:

gün cinsinden süre
günlük toplam yemek maliyeti
tek yön uçuş maliyeti
bir otelde bir gecenin maliyeti (gece sayısı eşit süre eksi bir)
Standart girdiden bu parametrelerin değerlerini okuyun ve ardından sonucu yazdırın.*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();
        
        int foodToDay = day * food;
        int twoWayTicket = flight * 2;
        int hotelToDay = (day - 1) * hotel;
        final int result = foodToDay + twoWayTicket + hotelToDay;
        
        System.out.println(result);
    }
}
