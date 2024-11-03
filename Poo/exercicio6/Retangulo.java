public class Retangulo{
  double largura;
  double altura;

  double calcularArea(){
    return largura * altura;
  }

  void exibirArea(){
    System.out.println("A área do retângulo é " + calcularArea());
  }
}