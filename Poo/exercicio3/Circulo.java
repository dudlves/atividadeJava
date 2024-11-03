public class Circulo {
  double raio;

  void area(){
    double calcularArea = Math.PI * Math.pow(raio, 2);
    System.out.println(calcularArea);
  }

  void perimetro(){
    double calcularperimetro = 2 * Math.PI * raio;
    System.out.println(calcularperimetro);
  }
  
}