// Codifique um programa que leia um par ordenado (x, y) e informe a qual
// quadrante ele pertence
import java.util.Scanner;


public class exercicio16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("qual valor de x?");
    int x = scanner.nextInt();
    System.out.println("qual valor de y?");
    int y = scanner.nextInt();
    if (x > 0 && y > 0) {
      System.out.println("primeiro quadrante!");
    } 
    if (x < 0 && y > 0) {
      System.out.println("Segundo quadrante!");
    }
    if (x < 0 && y < 0) {
      System.out.println("Terceiro quadrante!");
    }
    if (x > 0 && y < 0) {
      System.out.println("quarto quadrante!");
    }
   scanner.close();

  }

}
