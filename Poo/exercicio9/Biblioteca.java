public class Biblioteca {
  public static void main(String[]aegs){
    Livro l1 = new Livro ("001", "Castelo animado","17/12/2004");
    Revista r1 = new Revista ("001", "Recreio", "17/12/2004");
    Emprestimo e1 = new Emprestimo("y", 0);

    e1.setQntDias(10);
    e1.setTipoEmprestimo("longo");
    e1.emprestimo();

    e1.setQntDias(10);
    e1.setTipoEmprestimo("curto");
    e1.emprestimo();

  }
}
