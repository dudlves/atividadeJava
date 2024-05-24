// Escreva um programa que leia um número maior que 30 pelo teclado 
// e informe todos os números entre 0 e o valor informado que são múltiplos de 2 ou 7.

import java.util.Scanner;

public class exercicio8 {
  public static void main(String[]args){
    Scanner scanner =new Scanner(System.in);
    System.out.println("digite um numero maior q 30");
    int num = scanner.nextInt();
    
    int i = 0;
    while (i < num) {
      if (num > 30 && num > 0) {
        if (i % 2 == 0 || i % 7 == 0) {
          System.out.println("o numeros e " + i);
        }  
      }  
      i ++;
    }                                 
    scanner.close();

  }
}
