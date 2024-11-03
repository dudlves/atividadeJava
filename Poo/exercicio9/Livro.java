public class Livro extends Material {
  public String id_livro;

  public Livro (String id_livro, String titulo, String anoPublicacao){
    super(titulo, 0);
    this.id_livro = id_livro;
  }
}
