// 4 - Faça um programa que receba o salário de um funcionário e o percentual de aumento,
// calcule e mostre o valor do aumento e o novo salário
import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu salario:");
    double salario = scanner.nextDouble();
    System.out.println("Digite o aumento do salario:");
    double aumento = scanner.nextDouble();
    double porcentagem = salario * (aumento / 100);
    double soma = salario + porcentagem;
    System.out.println("O valor do aumento foi: " + porcentagem );
    System.out.println("o valor do novo salario foi: " + soma);
    scanner.close();

  }
}
