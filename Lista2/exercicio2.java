// 2 - Faça um programa que receba três notas, calcule e mostre a média aritmética entre
// elas.
import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner (System.in);
  System.out.println("Digite a nota:");
  double a = scanner.nextDouble();
  System.out.println("Digite a nota:");
  double b = scanner.nextDouble();
  System.out.println("Digite a nota:");
  double c = scanner.nextDouble();
  double soma = (a + b + c ) / 3;
  System.out.println("A media aritmetica " + soma);
  scanner.close();
  }  
}
