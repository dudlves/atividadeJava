

import java.util.Scanner;


public class exercicio20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua nota");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite sua nota");
    double nota2 = scanner.nextDouble();
    double media = (nota1 + nota2) / 2;
    if (media >= 7.0) {
      System.out.println("Aprovado");
    }
    if (media < 7.0) {
      System.out.println("Digite sua nota do exame final");
      double novaNota = scanner.nextDouble();
      double mediaFinal = (media + novaNota) / 2 ;
      if (mediaFinal >= 7.0) {
        System.out.println("Aprovado com nota 6");
      }else{
        System.out.println("Reprovado");
      }
    }

    scanner.close();

  }

}
