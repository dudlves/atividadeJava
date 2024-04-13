// 1 - Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
// Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel
// calcular”, caso haja uma divisão por 0 ou raiz de número negaƟvo.
import java.util.Scanner;
import java.util.Locale;

public class exercicio1 {
  public static void main (String args[]){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite um valor:");
    double a = scanner.nextDouble();
    System.out.println("Digite um valor:");
    double b = scanner.nextDouble();
    System.out.println("Digite um valor:");
    double c = scanner.nextDouble();
    double delta = b * b - 4 * a * c;
    if(delta < 0 || delta == 0){
      System.out.println("Impossivel cacular");
    }else{
      double x1 = (- b + Math.sqrt(delta)) /( 2 * a);
      double x2 = (+ b + Math.sqrt(delta)) /( 2 * a);
      System.out.println("R1 =" + String.format("%.5f", x1));
      System.out.println("R2 =" + String.format("%.5f", x2));
    }
    scanner.close();
  }
}