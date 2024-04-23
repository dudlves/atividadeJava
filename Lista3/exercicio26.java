


import java.util.Scanner;

public class exercicio26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero");
    double numero1 = scanner.nextDouble();
    System.out.println("Digite um numero");
    double numero2 = scanner.nextDouble();

    if(numero1 == numero2){
      System.out.println("Números iguais");
    }
    if(numero1 > numero2){
      System.out.println("Primeiro e maior");
    }
    if(numero1 < numero2){
      System.out.println("Segundo e maior");
    }
    scanner.close();

  }

}
