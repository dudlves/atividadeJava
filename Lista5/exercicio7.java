// Elaborar um algoritmo que leia 15 valores inteiros. O algoritmo não poderá aceitar o número zero. Mostrar:
// a) quantidade de números positivos

// b) quantidade de números negativos

// c) soma de todos os valores positivos

// d) soma de todos os valores negativos
import java.util.Scanner;

public class exercicio7 {
  public static void main(String[]args){
    Scanner scanner =new Scanner(System.in);
    int num1;
    int positivo = 0;
    int negativo = 0;
    int somaPositivo = 0;
    int somaNegativo = 0;
    int i = 0;
    
    while (i < 15){
      System.out.println("digite um numero inteiro");
      num1 = scanner.nextInt();
      if (num1 == 0) {
        System.out.println("digite outro numero");
        i--;
      }
      if(num1 > 0){
        positivo++;
        somaPositivo += num1;
      }

      if(num1 < 0 ){
        negativo++;
        somaNegativo += num1;
      }
      i++;

    };
    
    System.out.println("os numeros positivos sao: " + positivo);
    System.out.println("os numeros negativos sao: " + negativo);
    System.out.println("os somas dos numeros possitivos sao: " + somaPositivo );
    System.out.println("os somas dos numeros possitivos sao: " + somaNegativo );
    scanner.close();

  }
}
