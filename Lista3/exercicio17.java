// Escrever um programa para ler cinco valores inteiros e escrever na tela o maior
// e o menor deles

import java.util.Scanner;
public class exercicio17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero");
    int n1 = scanner.nextInt();
    System.out.println("Digite o segundo numero");
    int n2 = scanner.nextInt();
    System.out.println("Digite o terceiro numero");
    int n3 = scanner.nextInt();
    System.out.println("Digite o quarto numero");
    int n4 = scanner.nextInt();
    System.out.println("Digite o quinto numero");
    int n5 = scanner.nextInt();
    int maior = n1;
    int menor = n1;

    if (n2 > maior) {
      maior = n2;
    }
    if (n3 > maior) {
      maior = n3;
    }
    if (n4 > maior) {
      maior = n4;
    }
    if (n5 > maior) {
      maior = n5;
    }

    if (n2 > menor) {
      menor = n2;
    }
    if (n3 > menor) {
      menor = n3;
    }
    if (n4 > menor) {
      menor = n4;
    }
    if (n5 > menor) {
      menor = n5;
    }

    System.out.println("o valor maior é " + maior + "o valor menor é " + menor);




    
    scanner.close();

  }

}
