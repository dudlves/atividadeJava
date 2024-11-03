package exercicioSala;

public class Paciente {
  public int codigo;
  public String sobrenome;
  private String sangue;
  private String CPF;

  public Paciente (int codigo, String nome, String sobrenome){
    this.codigo = codigo;
    this.nome =nome;
    this.sobrenome =sobrenome;
    this.sangue = "";
    this.CPF ="";
  }

  public void set_tipo_sangue(String valor){
    this.sangue = valor;
  }
  public String getsangue(){
    return this.sangue;
  }

  public void exibir(){
    System.out.println("Codigo " + this.codigo);
    System.out.println("nome " + this.nome);
    System.out.println("sobrenome " + this.sobrenome);
    System.out.println("CPF " + this.CPF);
    System.out.println("sangue " + this.sangue);

  }
}
