// Ler uma medida de tempo em segundos, calcular e escrever a medida
// correspondente em horas, minutos e segundos


import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma medida de tempo em segundos: ");
    int seguntosDigitado = scanner.nextInt();
    int minutos = (seguntosDigitado / 60) ;
    int horas = (minutos / 60);

    int segundosRestos = (seguntosDigitado % 60);
    int minutosRestos = (minutos % 60);
    System.out.println("A media correspondente: " + horas + ":" + minutosRestos + ":" + segundosRestos) ;

    scanner.close();
  }

  
}

