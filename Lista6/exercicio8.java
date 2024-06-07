// Escreva um programa que leia um número maior que 30 pelo teclado e informe todos 
// os números entre 0 e o valor informado que são múltiplos de 2 ou 7.

import java.util.Scanner;

public class exercicio8 {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite um numero mior que 30");
    int num = scanner.nextInt();
    if (num > 30) {
      for(int i = 0; i <= num; i++){
        if (i % 2 == 0 || i % 7 == 0) {
          System.out.println("os multiplos e "+ i);

        }
      }
    }else{
      System.out.println("o numero não e maior que 30");

    }
    scanner.close();

  }
}
