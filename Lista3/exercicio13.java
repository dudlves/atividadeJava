// Ler um valor inteiro e escrever a mensagem É MAIOR QUE 10! se o valor lido for
// maior que 10, caso contrário escrever NÃ O É MAIOR QUE 10!


import java.util.Scanner;

public class exercicio13 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero inteiro");
    int numero = scanner.nextInt();
    if(numero >= 10){
    System.out.println("E MAIOR QUE 10!");

    }else{
    System.out.println("NAO E MAIOR QUE 10!");

    }

    scanner.close();
  }

}
