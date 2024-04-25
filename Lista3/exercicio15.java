// As maças custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
// 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o
// número de maças compradas, calcule e escreva o custo total da compra


import java.util.Scanner;
public class exercicio15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de maça comprada");
    double unidadeMaca = scanner.nextDouble();
    if (unidadeMaca < 12) {
      double total = unidadeMaca * 1.30;
      System.out.println("Preço total das maça foi:" + total);

    }
    if (unidadeMaca >= 12) {
      double total = unidadeMaca * 1.0;
      System.out.println("Preço total das maça foi:" + total);

    }

    scanner.close();

  }
}
