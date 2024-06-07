// Escreva um programa que solicite que o usuário informe um número inteiro maior que 100 
// e mostre na tela se o número lido é primo ou não.


import java.util.Scanner;

public class exercicio4 {
  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite um numero maior que 100");
    int num = scanner.nextInt();
    if (num > 100) {
      int primo = 0;
      for(int i = 1; i < num; i ++){
        if (num % i == 0) {
          primo ++;
        }
      }
      if(primo < 2){
        System.out.println("o numero e primo");
      }else{
        System.out.println("o numero não e primo");
      }
    }else{
      System.out.println("o numero não e maior que 100");
    }
    scanner.close();

  }
}
