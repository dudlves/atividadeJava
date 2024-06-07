// Escreva um programa que solicite que o usuário informe um número inteiro maior que 20 e mostre na tela todos os 
// divisores do número informado. Todos os valores devem ser mostrados na mesma linha, separador por tabulação (“\t”)

import java.util.Scanner;
public class exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite um numero inteiro maior que 20");
    int numero = scanner.nextInt();
    int i = 1;
    if (numero < 20) {
      System.out.println("numero nao e maior que 20");
    }
    System.out.printf("O numeros divisores são: ","\t");

    while (i <= numero) {
      if (numero > 20 && numero % i == 0) {
        System.out.printf( i + "\t");
      }
      i++;
    }
    scanner.close();
  }
}
