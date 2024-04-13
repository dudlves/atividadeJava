// 1 - Faça um programa que receba quatro números inteiros, calcule e mostre a soma
// desses números
import java.util.Scanner;

public class exercicio1 {
  public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero:");
    int a = scanner.nextInt();
    System.out.println("Digite um numero:");
    int b = scanner.nextInt();
    System.out.println("Digite um numero:");
    int c = scanner.nextInt();
    System.out.println("Digite um numero:");
    int d = scanner.nextInt();
    int soma = ( a + b + c + d);
    System.out.println("A soma dos numeros " + a + " + " + b + " + "+ c + " + "+ d + " = " + soma);
    scanner.close();
  }
}