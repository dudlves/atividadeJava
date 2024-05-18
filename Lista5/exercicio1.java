// Escreva um programa que leia 10 números pelo teclado e informe a média dos valores informados.
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int i = 0;
        double soma = 0;
        while (i < 10) {
            System.out.println("digite um numero");
            double numero = scanner.nextDouble(); 
            i++;  
            soma  += numero;
        }
        System.out.println("o valor medio e" + (soma / 10));

        scanner.close();
    }

}