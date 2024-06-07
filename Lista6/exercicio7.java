// Elaborar um algoritmo que leia 15 valores inteiros. O algoritmo não poderá aceitar o número zero. Mostrar:
// a) quantidade de números positivos

// b) quantidade de números negativos

// c) soma de todos os valores positivos

// d) soma de todos os valores negativos

import java.util.Scanner;

public class exercicio7 {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int positivo = 0;
    int negativo = 0;
    int somaPositivo = 0;
    int somaNegativo = 0;
    for(int i = 0; i < 15; i ++){
      System.out.println("digite um numero");
      int num = scanner.nextInt();
      if(num == 0){
        System.out.println("digite outro numero");
      }else{
        if (num > 0) {
          positivo ++;
          somaPositivo += num;
        }
        if(num < 0 ){
          negativo++;
          somaNegativo += num;
        }
      }

    }
    System.out.println("os numeros positivos sao: " + positivo);
    System.out.println("os numeros negativos sao: " + negativo);
    System.out.println("os somas dos numeros possitivos sao: " + somaPositivo );
    System.out.println("os somas dos numeros possitivos sao: " + somaNegativo );
    scanner.close();
  }
}
