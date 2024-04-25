// Ler um caractere maiúsculo de A a Z, determinar e escrever o caractere
// minúsculo correspondente.


import java.util.Scanner;
public class exercicio8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um caractere maiúsculo de A a Z: ");
    char caractereMaiusculo = scanner.next().charAt(0);
    
    if (caractereMaiusculo >= 'A' && caractereMaiusculo <= 'Z') {
      char caractereMinusculo = (char) (caractereMaiusculo + ('a' - 'A'));
      System.out.println("O caractere minúsculo correspondente é: " + caractereMinusculo);
    } else {
      System.out.println("Por favor, insira um caractere maiúsculo de A a Z.");
    }
    
    scanner.close();
 }
}
