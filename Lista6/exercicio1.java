// Escreva um programa que leia 10 números pelo teclado e informe a média dos valores
// informados.

import java.util.Scanner;

public class exercicio1 {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    int media = 0;
    for(int i = 0; i < 10; i++){
      System.out.println("Digite um numero");
      num = scanner.nextInt();
      media += num;
    }

    System.out.println("A media e "+(media / 10));
    scanner.close();

  }
  
}