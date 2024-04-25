// Escrever um programa para ler um valor inteiro e verificar se este valor é par ou
// ímpar.

import java.util.Scanner;
public class exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro");
    int numero = scanner.nextInt();
    if (numero % 2 == 0) {
      System.out.println("O numero e par");
    }else{
      System.out.println("O numero e impar");
    }
    scanner.close();

  }
}
