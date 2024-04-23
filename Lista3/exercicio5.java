// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
// dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
// com 365 dias e mês com 30 dias


import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a sua idade:");
    System.out.print("Anos: ");
    double ano = scanner.nextDouble();
    System.out.print("Meses: ");
    double mes = scanner.nextDouble();
    System.out.print("Dias: ");
    double dia = scanner.nextDouble();
    double ideiaDia = (ano * 365) + (mes * 30) + dia;
    System.out.println("A sua idade em dias é " + ideiaDia);
    scanner.close();

  }

  
}
