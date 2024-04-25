// Escreva um programa para ler o salário mensal atual de um funcionário e o
// percentual de reajuste. Calcule e escreva o valor do novo salário.
import java.util.Scanner;

public class exercicio11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu salario");
    double salario = scanner.nextDouble();
    System.out.println("Digite o reajuste");
    double reajustePorcentgem = scanner.nextDouble();
    double reajuste= ((salario * reajustePorcentgem) / 100);
    double salarioNovo = salario + reajuste  ;
    System.out.println("Seu salario é: " + salarioNovo);
    scanner.close();

  }
}
