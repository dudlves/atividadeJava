
// Escrever um programa que peça dois valores inteiros e imprima o menu com as
// opções: soma, diferença, produto, divisão, o resto da divisão, a potência (de um
// pelo outro) e a raiz quadrada de cada número lido. Vale lembrar que na divisão
// deve-se evitar o denominador zero.


import java.util.Scanner;
public class exercicio18 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero");
    int n1 = scanner.nextInt();
    System.out.println("Digite o segundo numero");
    int n2 = scanner.nextInt();
    System.out.println("Escolha uma opção:");
    System.out.println("1. Soma");
    System.out.println("2. Diferença");
    System.out.println("3. Produto");
    System.out.println("4. Divisão");
    System.out.println("5. Resto da Divisão");
    System.out.println("6. Potência");
    System.out.println("7. Raiz Quadrada do Primeiro Número");
    System.out.println("8. Raiz Quadrada do Segundo Número");
    int escolha = scanner.nextInt();

    if (escolha == 1) {
      System.out.println("Soma: " + (n1 + n2));
    }
    if (escolha == 2) {
      System.out.println("Diferença: " + (n1 - n2));
    }
    if (escolha == 3) {
      System.out.println("Produto: " + (n1 * n2));
    } 
    if (escolha == 4) {
      System.out.println("Divisão: " + (n1 / n2));
    } 
    if (escolha == 5) {
      System.out.println("Resto da Divisão: " + (n1 % n2));
    } 
    if (escolha == 6) {
      System.out.println("Potência: " + Math.pow(n1, n2));
    }
    if (escolha == 7) {
      System.out.println("Raiz Quadrada do Primeiro Número: " + Math.sqrt(n1));
    }
    if (escolha == 7) {
      System.out.println("Raiz Quadrada do Primeiro Número: " + Math.sqrt(n2));
    }
    scanner.close();

  }
}
