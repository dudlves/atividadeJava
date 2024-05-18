// 1) Escreva um programa em Java que leia dois valores e calcule o valor a ser mostrado na tela seguindo a seguinte lógica:

// Caso um dos valores lidos seja pelo menos o dobro do outro valor, o valor final deve ser o resto da divisão do maior pelo menor valor.
// Do contrário, imprima o produto entre os dois valores lidos.
import java.util.Scanner;
public class exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero");
    int valor1 = scanner.nextInt();
    System.out.println("Digite um numero");
    int valor2 = scanner.nextInt();
 

    if (valor1 == valor2 * 2 || valor2 == valor1 * 2 ) {
      if (valor1 > valor2) {
        int total = valor1 % valor2;
        System.out.println("total e " + total);
      }else{
        int total = valor2 % valor1;
        System.out.println("total e " + total);
      } 
    }else{
      int total = valor1 * valor2;
      System.out.println("total e " + total);
    }


    scanner.close();

  }
}
