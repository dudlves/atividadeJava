// Faça um programa para ler: a descrição do produto (nome), a quantidade
// adquirida e o preço unitário. Calcular e escrever o total (total = quantidade
// adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total -
// desconto), sabendo-se que:
// Se quantidade <= 5 o desconto será ́ de 2%
// Se quantidade > 5 e quantidade <= 10 o desconto será ́ de 3%
// Se quantidade > 10 o desconto será ́ de 5%



import java.util.Scanner;


public class exercicio27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a descrição do produto (nome)");
    String produto = scanner.nextLine();
    System.out.println("Digite a quantidade adquirida");
    double produtoQuantidade = scanner.nextDouble();
    System.out.println("Digite o preço unitário");
    double produtoPreco = scanner.nextDouble();
    double total = produtoQuantidade * produtoPreco;

    if (produtoQuantidade <= 5 ) {
      double desconto =  (produtoPreco * 0.02);
      double totalPagar = total - desconto ;
      System.out.println("O total a pagar e: " + totalPagar);
    }
    if (produtoQuantidade > 5 && produtoQuantidade <= 10) {
      double desconto =  (produtoPreco * 0.03);
      double totalPagar = total - desconto ;
      System.out.println("O total a pagar e: " + totalPagar);
    }
    if (produtoQuantidade > 10) {
      double desconto =  (produtoPreco * 0.5);
      double totalPagar = total - desconto ;
      System.out.println("O total a pagar e: " + totalPagar);
    }

    scanner.close();

  }

  
}