// Escreva um programa que leia 10 números pelo teclado e, após a leitura, 
// informe o menor e o maior número informado.


import java.util.Scanner;

public class exercicio2 {
  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    int maior = 0;
    int menor = 0;
    for(int i = 0; i < 10; i++){
      System.out.print("Digite um numero");
      int num = scanner.nextInt();
      if (num > maior) {
        maior = num;
      }
      if (num < menor) {
        menor = num;
      }
    }
    System.out.println("o maior é " + maior + "o menor e " + menor);
    scanner.close();

  }
}
