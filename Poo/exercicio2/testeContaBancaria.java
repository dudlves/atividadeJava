public class testeContaBancaria {
  public static void main(String[] args){
    ContaBancaria Pessoal1 = new ContaBancaria();
    Pessoal1.numero = 001;
    Pessoal1.titular = "dudinha";
    Pessoal1.saldo = 3000;

    Pessoal1.depositar(4000);
    Pessoal1.sacar(2000);
    
    Pessoal1.exibir();
  }
  
}
