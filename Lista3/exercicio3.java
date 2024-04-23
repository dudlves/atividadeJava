// Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular
// e escrever o valor correspondente em graus Celsius.
// 𝐶    𝐹 − 32
// 5 =    9

import java.util.Scanner;


public class exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a temperatura em graus fahrenheit");
    double fahrenheit = scanner.nextDouble();
    double celsius = ((fahrenheit - 32) / 9) * 5;     
    System.out.println("O valor correspondente e grau Celsius" + celsius);
    scanner.close();

  }

  
}
