public class testePessoa {
  public static void main(String[]args){
    Pessoa pessoa1 = new Pessoa();
    pessoa1.nome = "dudinha";
    pessoa1.idade = 19;
    pessoa1.cidade = "Bh";

    Pessoa pessoa2 = new Pessoa();
    pessoa2.nome = "Maria";
    pessoa2.idade = 20;
    pessoa2.cidade = "Bh";


    pessoa1.apresentar();
    pessoa2.apresentar();
  }
}
