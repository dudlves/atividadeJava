package exercicio8;

public class Aluno {
  private String nome;
  private int idade;
  private String matricula;

  public Aluno(String nome, int idade, String matricula){
    this.nome = "";
    this.idade = 0;
    this.matricula = "";
  }

  public void setnome(String valorNome){
    this.nome = valorNome;
  }

  public String getnome(){
    return this.nome;
  }

  public void setidade(int valorIdade){
    this.idade = valorIdade;
  }

  public int getidade(){
    return this.idade;
  }

  public void setmatricula(String valorMatricula){
    this.matricula = valorMatricula;
  }

  public String getmatricula(){
    return this.matricula;
  }

  public void exibir(){
    System.out.println("nome: " + getnome());
    System.out.println("idade: " + getidade());
    System.out.println("matricula: " + getmatricula());


  }

}
