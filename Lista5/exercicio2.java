// Escreva um programa que leia 10 números pelo teclado e, após a leitura, informe o menor e o maior número informado.
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("digite um numero");
      double primeiro = scanner.nextDouble();
      double maior = primeiro;
      double menor = primeiro;
      int i = 0;
      while (i < 9) {
        double numero = scanner.nextDouble(); 
        if (maior > numero) {
          maior = numero;
        }
        if (menor < numero) {
          menor = numero;
        }
        i++;
      }
      System.out.println("digite um numero" + maior);
      System.out.println("digite um numero" + menor);

      scanner.close();

    }
}
