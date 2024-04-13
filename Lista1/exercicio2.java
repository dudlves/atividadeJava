import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {
  public static void main (String args[]){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite sua nota:");
    double A = scanner.nextDouble();
    System.out.println("Digite sua nota:");
    double B = scanner.nextDouble();
    double media = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
    System.out.println("MEDIA = " + String.format("%.5f", media));
    scanner.close();
  }
}
