// 3 - Faça um programa que receba o salário de um funcionário, calcule e mostre o novo
// salário, sabendo-se que este sofreu um aumento de 25%.
import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite o seu salario:");
    double salario = scanner.nextDouble();
    double aumento = (salario * 0.25);
    double novosalario = (salario + aumento);
    System.out.println("Seu salario ficou: " + novosalario);
    scanner.close();
  }
}
