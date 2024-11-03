public class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  void depositar(double deposito){
    saldo += deposito;
  }

  void sacar(double valor){
    saldo -= valor;
  }

  void exibir(){
    System.out.println(saldo);
  }
}