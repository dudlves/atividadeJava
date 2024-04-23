

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua nota");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite sua nota");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite sua nota");
    double nota3 = scanner.nextDouble();
    double media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /  ( 2 + 3 + 5));
    System.out.println("A media da sua nota foi: " + media);

  
    scanner.close();

  }
}
