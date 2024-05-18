// 2) Escreva um programa em Java que leia quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
// p1(x1, y1) e p2(x2, y2) e calcule a distância entre eles, mostrando o resultado com 4 casas decimais após a vírgula.

import java.util.Scanner;
import java.lang.Math;
public class exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero");
    int x1 = scanner.nextInt();
    System.out.println("Digite um numero");
    int x2 = scanner.nextInt();
    System.out.println("Digite um numero");
    int y1 = scanner.nextInt();
    System.out.println("Digite um numero");
    int y2 = scanner.nextInt();
    double total = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y1 - y2), 2 ));
    System.out.printf("o resultado foi %.4f" , total);

    scanner.close();

  }
}
