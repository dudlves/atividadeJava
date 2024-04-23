// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$
// 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
// salário total.

import java.util.Scanner;


public class exercicio22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu salario");
    double salario = scanner.nextDouble();
    System.out.println("Digite o valor das vendas efetuadas");
    double valorVenda = scanner.nextDouble();

    if (valorVenda < 1500) {
      double comissao = valorVenda * 0.03;
      double total = salario + comissao;
      System.out.println("Seu salario total e: " + total);

    }
    if (valorVenda > 1500) {
      double comissao = valorVenda * 0.05;
      double total = salario + comissao;
      System.out.println("Seu salario total e: " + total);
    }


    scanner.close();

  }
}
