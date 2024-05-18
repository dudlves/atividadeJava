// 4) Escreva um programa em Java que leia um valor inteiro X. Em seguida apresente os 4 valores ímpares consecutivos a 
// partir de X, um valor por linha, inclusive o X ser for o caso.
import java.util.Scanner;
public class exercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero");
    int valor = scanner.nextInt();
    if(valor % 2 == 0){
      int n1 = valor + 1;
      int n2 = n1 + 2;
      int n3 = n2 + 2;
      int n4 = n3 + 2;
      System.out.println("os numeros impares são:" + n1 + ", " + n2 + ", " + n3 + ", " + n4);
    }else{
      int n1 = valor + 2;
      int n2 = n1 + 2;
      int n3 = n2 + 2;
      int n4 = n3 + 2;
      System.out.println("os numeros impares são:" + valor + ","+ n1 + ", " + n2 + ", " + n3 + ", " + n4);
    }
    
    
    scanner.close();

  }
}