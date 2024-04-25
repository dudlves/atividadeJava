// Ler um caractere, determinar e escrever o seu antecessor e seu sucessor na
// tabela ASCII
import java.util.Scanner;
public class exercicio7 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Digite um caractere: ");
    char caractere = scanner.next().charAt(0);        
    int valorASCII = (int) caractere;    
    char antecessor = (char) (valorASCII - 1);
    char sucessor = (char) (valorASCII + 1);
        
    System.out.println("Antecessor na tabela ASCII: " + antecessor);
    System.out.println("Sucessor na tabela ASCII: " + sucessor);
        
    scanner.close();
  }
}
