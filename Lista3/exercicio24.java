// Faça um programa para ler três valores inteiros e escrevê -los em ordem
// crescente



import java.util.Scanner;


public class exercicio24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro");
    int numero1 = scanner.nextInt();
    System.out.println("Digite um numero inteiro");
    int numero2 = scanner.nextInt();
    System.out.println("Digite um numero inteiro");
    int numero3 = scanner.nextInt();
    int menor = numero1;
    if (numero2 > menor) {
      menor = numero2;
    }
    if (numero3 > menor) {
      menor = numero3;
    }

    int maior = numero1;
    if (numero2 < menor) {
      menor = numero2;
    }
    if (numero3 < menor) {
      menor = numero3;
    }
      int meio = (numero1 + numero2 + numero3) - (menor + maior);
      System.out.println("Os valores em ordem crescente são:");
      System.out.println(menor);
      System.out.println(meio);
      System.out.println(maior);

    scanner.close();


  }

}

  
