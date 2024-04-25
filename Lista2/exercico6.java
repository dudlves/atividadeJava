// Faça um programa que leia o valor de 4 produtos e informe o valor final que deverá ser
// pago pelo cliente de acordo com as seguintes regras:
// a. O cliente pagará 100% do valor caso o total da compra seja menor ou igual do que
// R$100,00.
// b. O cliente terá um desconto de 10% no valor do primeiro produto caso o valor total
// dos 4 produtos seja maior que R$100,00 e menor que R$200,00.
// c. O cliente terá um desconto de 15% no valor dos dois primeiros produtos caso o
// valor total dos 4 produtos esteja entre R$200,00 e R$500,00.
// d. O cliente terá 25% de desconto caso o valor total dos 4 seja maior que R$500,00.

import java.util.Scanner;

public class exercico6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor de um produto");
    double produto1 = scanner.nextDouble();
    System.out.println("Digite o valor de um produto");
    double produto2 = scanner.nextDouble();
    System.out.println("Digite o valor de um produto");
    double produto3 = scanner.nextDouble();
    System.out.println("Digite o valor de um produto");
    double produto4 = scanner.nextDouble();
    double total = (produto1 + produto2 + produto3 + produto4);
    if(total <= 100){
      System.out.println("Sua compra deu" + total);
    }
    if (total > 100 && total < 200) {
      double desconto1 = (produto1 * 0.10);
      System.out.println("Sua compra deu" + ((produto1 - desconto1) + (produto2 + produto3 + produto4)));
    }
    if (total > 200 && total < 500) {
      double desconto1 = (produto1 * 0.15);
      double desconto2 = (produto2 * 0.15);
      System.out.println("Sua compra deu" + ((produto1 - desconto1) + (produto2 - desconto2) + (produto3 + produto4)));
    }
    if(total > 500){
      double desconto1 = (total * 0.25);
      System.out.println("Sua compra deu" + (total - desconto1));
    }
    scanner.close();
  }
}
