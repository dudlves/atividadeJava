// Faça um programa que leia três notas de um aluno, calcule e escreva a média
// final deste aluno. Considerar que a média é ponderada e que o peso das notas é
// 2, 3 e 5. Fórmula para o cálculo da média final é :
//         𝑚𝑒𝑑𝑖𝑎 = 𝑛1 × 2 + 𝑛2 × 3+ 𝑛3 × 5
//                     2 + 3 + 5

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua nota");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite sua nota");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite sua nota");
    double nota3 = scanner.nextDouble();
    double media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /  ( 2 + 3 + 5));
    System.out.println("A media da sua nota foi: " + media);

  
    scanner.close();

  }
}
