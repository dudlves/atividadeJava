// Escreva um programa que leia dois números pelo teclado e mostre todos os números pares 
// que estão no intervalo entre o menor e o maior número informados pelo usuário.

import java.util.Scanner;
public class exercicio5 {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite um numero inteiro");
    int num1 = scanner.nextInt();
    System.out.println("digite um numero inteiro");
    int num2 = scanner.nextInt();
    int maior = num1;
    int menor = num1;
    if (num2 > maior) {
      maior = num2;
    }
    if (num2 < menor) {
      menor = num2;
    }
    if (menor % 2 != 0) {
      menor++;
    }

    while (menor < maior){
      System.out.println("Os numeros pares são " + menor);
      menor += 2;
     
    }
    scanner.close();
  }
}