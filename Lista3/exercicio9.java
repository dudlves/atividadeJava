// Ler um valor de x (ponto-flutuante), calcular e escrever o valor de todas as
// expressões abaixo, para este valor de x.
// a) 𝑦 = 𝑥3 + 5𝑥7 + 2𝑥9
// b) 𝑦 = 𝑠𝑒𝑛(𝑥)
// 𝑥
// c) 𝑦 = (1 + 1
// 𝑥)𝑥
// d) 𝑦 = √ln(|𝑥| + 1) + 𝑙𝑜𝑔2(|𝑥| + 1)
// e) 𝑦 = 𝑎𝑟𝑐𝑠𝑒𝑛(𝑥) + arccos (𝑥)

import java.util.Scanner;
import java.lang.Math;


public class exercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor de x: ");
    double x = scanner.nextDouble();
    double yA = Math.pow(x, 3) + 5 * Math.pow(x, 7) + 2 * Math.pow(x, 9);
    System.out.println("a) y = " + yA);
    double yB = (Math.sin(x)) / x;
    System.out.println("b) y = " + yB);
    double yC = Math.pow((1 + 1 / x), x);
    System.out.println("c) y = " + yC);
    double yD = Math.sqrt(Math.log(Math.abs(x) + 1)) + Math.log10(Math.abs(x) + 1);
    System.out.println("d) y = " + yD);
    double yE = Math.asin(x) + Math.acos(x);
    System.out.println("e) y = " + yE);
    scanner.close();
}
}
