
// Escreva um programa que solicite que o usuário informe um número 
// inteiro maior que 100 e mostre na tela se o número lido é primo ou não.

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    System.out.println("digite um numero um inteiro maior q 100");
    int num = scanner.nextInt();
    int i = 1;
    int d = 0;
    while (i <= num) {
      if (num % i == 0 ) {
        d++;
      }
      i++;
    }
    if(d==2){
      System.out.println("numero e primo");
    }else{
      System.out.println("numero não e primo");
    }
    scanner.close();
  }  
}
