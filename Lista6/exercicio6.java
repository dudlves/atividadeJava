// Escreva um programa que leia um número pelo teclado e mostre o elemento da sequência
//  de Fibonacci que está na posição representada pelo número lido. A sequência de Fibonacci 
//  é definida como f(1) = 1, f(2) = 1 ... f(n) = f(n-1)+f(n-2).


import java.util.Scanner;

public class exercicio6 {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite um numero");
    int num1 = scanner.nextInt();
    int num2 = num1 + num1;
   
    System.out.println(num2);
    for(int i = 1; i < 8; i ++){
      num1 = num1 + num2;
      num2 = num2 + num1;
      System.out.println(num1);
      System.out.println(num2);

    }
    scanner.close();

  }
}
