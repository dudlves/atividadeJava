// Escreva um programa que leia um número pelo teclado e mostre o elemento da sequência de Fibonacci que está na posição
// representada pelo número lido. A sequência de Fibonacci é definida como f(1) = 1, f(2) = 1 ... f(n) = f(n-1)+f(n-2).

import java.util.Scanner;

public class exercicio6 {
   public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    System.out.println("digite um numero um inteiro maior q 100");
    int num = scanner.nextInt();
    int num2 = 0;
    int num3 = 1;
    int i = 1;
                                                                                                                                         
    while (i < num) {
      int soma  = num2 + num3;
      num2 = num3;
      num3 = soma;
      
      System.out.println("o numero e" + soma);
      i++;
    }
    scanner.close();

   }
}
