// 2 - Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas
// de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a
// nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir
// de 0 até 10.0, sempre com uma casa decimal.
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
