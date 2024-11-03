public class Emprestimo {
  public String tipoEmprestimo;
  public int qntDias;
  public double multa;

  public Emprestimo(String tipoEmprestimo, int qntDias){
    this.tipoEmprestimo = tipoEmprestimo;
    this.qntDias = qntDias;
  }

  public void setTipoEmprestimo(String tipoEmprestimo) {
    this.tipoEmprestimo = tipoEmprestimo;
  }

  public void setQntDias(int qntDias) {
    this.qntDias = qntDias;
  }

  public String getTipoEmprestimo() {
    return this.tipoEmprestimo;
  }

  public int getQntDias() {
    return this.qntDias;
  }

  public void emprestimo(){
    if (getTipoEmprestimo() == "curto") {
      multa= (3.50 + qntDias);
      System.out.println("O emprestimo foi " + getTipoEmprestimo() + ", por" + getQntDias() + "dias. A multa foi " + multa);
    } else if (getTipoEmprestimo() == "longo") {
      multa= (5.50 + qntDias);
      System.out.println("O emprestimo foi " + getTipoEmprestimo() + ", por" + getQntDias() + "dias. A multa foi " + multa);
    }else{
      System.out.println("o tipo de emprestimo foi invalido ");
    }
  }
}
