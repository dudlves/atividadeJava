// 1) Escreva um algoritmo que leia a idade de um candidato e a altura (em cm) e sexo ( Feminino = 1 e Masculino = 2 Em seguida, validar a situação da pessoa.
// Se a altura for maior ou igual a 180 cm e a idade for superior a 16 anos e sexo for igual a 1 (Feminino) imprimir a mensagem "Apto a jogar no time Feminino Juvenil de Basquete.".
// Se a altura for maior ou igual a 180 cm e a idade for superior a 16 anos e sexo for igual a 2 (Masculino) imprimir a mensagem "Apto a jogar no time Masculino Juvenil de Basquete".
// Outros casos imprimir "Não apto".


import java.util.Scanner;
public class exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();
    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();
    System.out.println("Digite 1 se você for do sexo Feminino ou 2 se você for do sexo Masculino");
    double sexo = scanner.nextDouble();

    if((altura >= 1.80) && (idade > 16) && (sexo == 1)){
      System.out.println("Apto a jogar no time Feminino Juvenil de Basquete.");
    }else if ((altura >= 1.80) && (idade > 16) && (sexo == 2)) {
      System.out.println("Apto a jogar no time Masculino Juvenil de Basquete.");
    }else{
      System.out.println("Não apto");

    }
   


    scanner.close();
  }
  }