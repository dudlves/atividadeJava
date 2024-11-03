public class Revista extends Material{
  public String id_revista;

  public Revista (String id_revista, String titulo, String anoPublicacao){
    super(titulo, 0);
    this.id_revista = id_revista;
  }
}
