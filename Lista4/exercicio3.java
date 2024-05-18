// 3)  Faça um algoritmo que receba o nome do produto e o valor da compra. De acordo com a tabela abaixo é calculado o 
// preço de venda. Imprima o nome do produto, valor da compra e o valor da venda.

// Valor da Compra Valor da Venda

// Valor < 100,00 Lucro de 70%

// De 100,00 a 200,00 Lucro de 50%

// Acima de 200,00 Lucro de 30%


import java.util.Scanner;
public class exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite nome do produto");
    String produto = scanner.nextLine();
    System.out.println("Digite o valor da compra");
    double compra = scanner.nextDouble();
    if (compra < 100.00) {
      double venda = compra * 0.70;
      System.out.println("O valor da venda foi "+ venda + " do produto " + produto + " com o valor " + compra);
    }
    if (compra < 100) {
      double venda = compra * 0.70;
      System.out.println("O valor da venda foi "+ venda + " do produto " + produto + " com o valor " + compra);
    }else if (compra > 100 && compra <= 200) {
      double venda = compra * 0.50;
      System.out.println("O valor da venda foi "+ venda + " do produto " + produto + " com o valor " + compra);
    }else{
      double venda = compra * 0.30;
      System.out.println("O valor da venda foi "+ venda + " do produto " + produto + " com o valor " + compra);
    }


    scanner.close();
  }
  }