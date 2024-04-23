// Escreva um programa para ler as dimensões de um retângulo (base e altura),
// calcular e escrever a área do retângulo


import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a base");
    double base = scanner.nextDouble();
    System.out.println("Digite a altura");
    double altura = scanner.nextDouble();
    double area = base * altura;
    System.out.println("A area do retangulo é: " + area);
    scanner.close();

  }
}
