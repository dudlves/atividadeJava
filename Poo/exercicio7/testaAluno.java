package exercicio7;

public class testaAluno {
  public static void main(String[]args){
    Disciplina d1 = new Disciplina("Poo", 50);
    Aluno a1 = new Aluno("Natalia", 12346, 6, 6, 6, 6, 6, d1);
    System.out.println(a1.situacaoAluno());
    System.out.println(a1.disciplina.nome);

  }
}
