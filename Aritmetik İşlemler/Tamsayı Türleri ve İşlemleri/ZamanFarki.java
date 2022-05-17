// Aynı gündeki iki an arasında kaç saniye geçtiğini bulun.
// Size bu anları temsil eden tamsayı değerleri verilir: her biri için saat, dakika ve saniye. Girişte önceki anın ilk sırada yer alması garanti edilir.

import java.util.Scanner;

class ZamanFarki {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Kullanıcıdan veri alma
    int hour1 = scanner.nextInt();
    int min1 = scanner.nextInt();
    int sec1 = scanner.nextInt();
    
    int hour2 = scanner.nextInt();
    int min2 = scanner.nextInt();
    int sec2 = scanner.nextInt();
    
    // Saati ve dakikayı saniyeye çevirme
    final int minToSec = 60;
    final int hourToSec = 3600;
    
    // Saniye hesaplama
    int firstSec = sec1 + min1 * minToSec + hour1 * hourToSec;
    int secondSec = sec2 + min2 * minToSec + hour2 * hourToSec;
    
    int result = secondSec - firstSec;
    
    // Sonucu yazdırma
    System.out.println(result);
  }
}
