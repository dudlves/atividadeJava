// Ler um valor e escrever se é positivo, negativo ou zero

import java.util.Scanner;

  
public class exercicio23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero ");
    double numero = scanner.nextDouble();
    if (numero == 0) {
      System.out.println("numero e zero");
    }
    if (numero < 0) {
      System.out.println("numero negativo");
    }else{
      System.out.println("numero positivo");

    }
    
    scanner.close();
  }
}
