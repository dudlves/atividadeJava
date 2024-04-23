

import java.util.Scanner;


public class exercicio21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro valor");
    double valor1 = scanner.nextDouble();
    System.out.println("Digite o segundo valor");
    double valor2 = scanner.nextDouble();
    System.out.println("Digite o terceiro valor");
    double valor3 = scanner.nextDouble();

    if ((valor1 + valor2) > valor3) {
      if ((valor1 + valor3) > valor2) {
        if ((valor2 + valor3) > valor1) {
          System.out.println("E um triângulo: ");
          if (valor1 == valor2 && valor1 == valor3 && valor2 == valor1 && valor2 == valor3) {
            System.out.println("equilátero");
          }
          if ((valor1 == valor2 && valor1 != valor3) || (valor1 == valor3 && valor1 != valor2) || (valor2 == valor3 && valor2 != valor1) ) {
            System.out.println("isósceles");
          }
          if (valor1 != valor2 && valor1 != valor3 && valor2 != valor1 && valor2 != valor3) {
            System.out.println("escaleno ");
          }
        }
      }
    }
    
    scanner.close();

  }
}
