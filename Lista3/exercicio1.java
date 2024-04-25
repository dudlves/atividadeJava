// Escrever um programa para ler um número inteiro e exibir seu sucessor e seu
// antecessor

import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro");
    int numero = scanner.nextInt();
    int sucessor = numero +1;
    int antecessor = numero -1;
    System.out.println("O numero sucessor é:" + sucessor);
    System.out.println("O numero antecessor é:" + antecessor);
    scanner.close();
  }
}