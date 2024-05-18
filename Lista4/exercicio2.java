// 2) Faça um algoritmo que receba o nome e a idade de um paciente. De acordo com a idade do paciente, o mesmo será encaminhado 
// ao médico especialista para atendê-lo, observando a tabela abaixo. Imprima o nome do paciente, a idade e a especialidade do 
// médico que irá atendê-lo.

// Idade  Especialidade

// Até 12 anos  Pediatria

// Acima de 12 anos até 59 anos Clínica Geral

// Acima de 60 anos Geriatria

import java.util.Scanner;
public class exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = scanner.nextLine();
    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();
    if (idade <= 12) {
      System.out.println("o pasciente" + nome + " idade" + idade + "ira ser encaminhado para a Pediatria");
    }else if (idade > 12 && idade <= 59) {
      System.out.println("o pasciente" + nome + " idade" + idade + "ira ser encaminhado para a Clinica Geral");
    }else{
      System.out.println("o pasciente" + nome + " idade" + idade + "ira ser encaminhado para a Geriatrica");
    }
   


    scanner.close();
  }
  }


  // nome, idade irar ser encaminhado para 