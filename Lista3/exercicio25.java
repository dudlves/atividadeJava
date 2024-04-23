// Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
// Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
// palavra EMPATE

import java.util.Scanner;


public class exercicio25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nome do primeiro time");
    String time1 = scanner.nextLine();
    System.out.println("Nome do segundo time");
    String time2 = scanner.nextLine();
    System.out.println("Digite quntos gols o primeiro time marcou");
    int golTime1 = scanner.nextInt();
    System.out.println("Digite quntos gols o segundo time marcou");
    int golTime2 = scanner.nextInt();
    if (golTime1 == golTime2) {
      System.out.println("EMPATE");
    }
    if (golTime1 > golTime2) {
      System.out.println("O time vencedor foi:" + time1);
    }
    if (golTime1 < golTime2) {
      System.out.println("O time vencedor foi:" + time2);
    }
    scanner.close();
  }
}
