// Escreva um programa para ler o número total de eleitores de um município, o
// número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
// cada um representa em relação ao total de eleitores
import java.util.Scanner;


public class exercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número total de eleitores:");
    int totalEleitores = scanner.nextInt();
    System.out.println("Digite o número de votos brancos:");
    int votosBrancos = scanner.nextInt();
    System.out.println("Digite o número de votos nulos:");
    int votosNulos = scanner.nextInt();
    System.out.println("Digite o número de votos válidos:");
    int votosValidos = scanner.nextInt();


    double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
    double percentualNulos = (votosNulos * 100.0) / totalEleitores;
    double percentualValidos = (votosValidos * 100.0) / totalEleitores;

    System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
    System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
    System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

    scanner.close();
  }
}
