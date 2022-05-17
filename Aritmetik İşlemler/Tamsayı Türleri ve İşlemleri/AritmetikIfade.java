// Standart girdiden bir n tamsayı değeri okuyan ve aşağıdaki aritmetik ifadenin sonucunu veren bir program yazın:
// ((n + 1) * n + 2) * n + 3

import java.util.Scanner;

class AritmetikIfade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    final int result = ((n + 1) * n + 2) * n + 3;
        
    System.out.println(result);
  }
}
