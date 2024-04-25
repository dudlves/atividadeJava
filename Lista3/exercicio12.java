// O custo de um carro novo é a soma do custo de fábrica com a porcentagem do
// distribuidor e dos impostos. Supondo que o percentual do distribuidor seja de
// 28% e os impostos de 45%, escrever um programa para ler o custo de fábrica
// de um carro, calcular e escrever o custo final ao consumidor.


import java.util.Scanner;

public class exercicio12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o preco o carro");
    double custoDeFabrica = scanner.nextDouble();
    double imposto = custoDeFabrica * 0.45;
    double distribuidor = custoDeFabrica * 0.28;
    double carroNovo = custoDeFabrica + imposto + distribuidor;
    System.out.println("O preco do carro novo é: " + carroNovo); 
    scanner.close();

  }
}
