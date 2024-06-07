// Escreva um programa que solicite que o usuário informe um número inteiro maior que 20 
// re na tela todos os divisores do número informado. Todos os valores devem ser mostrados na mesma linha, 
// separador por tabulação (“\t”).


import java.util.Scanner;

public class exercicio3 {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero maior que 20");
    int num = scanner.nextInt();
    if (num > 20) {
      int divisores = 0;
      for(int i = 1; i <= num; i ++){
        if (num % i == 0) {
          divisores = i;
          System.out.printf(divisores + "\t");
        }
      }
    }else{
      System.out.print("digite outro numero, maior que 20");
    }
    scanner.close();

  }
}
