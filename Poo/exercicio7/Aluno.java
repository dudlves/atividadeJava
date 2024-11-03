package exercicio7;

public class Aluno {
  public String nome;
  public int matricula;
  public double nota_mat;
  public double nota_por;
  public double nota_fis;
  public double nota_geo;
  public double nota_quim;
  public Disciplina disciplina;

  public Aluno(String nome,  int matricula, double nota_mat, double nota_por, double nota_fis, double nota_geo,double nota_quim, Disciplina disciplina){
    this.nome =nome;
    this.matricula=matricula;
    this.nota_mat = nota_mat;
    this.nota_por = nota_por;
    this.nota_fis =nota_fis;
    this.nota_geo = nota_geo;
    this.nota_quim =nota_quim;
    this.disciplina = disciplina;
  }
  

  public double calcularMedia(){
    return(this.nota_mat + this.nota_por + this.nota_fis + this.nota_geo + this.nota_quim) / 5;
  }
 

  public String situacaoAluno(){
    if (calcularMedia() >= 6) {
      return "Aprovado";
    }else{
      return "Reprovado";
    }
  }


}
