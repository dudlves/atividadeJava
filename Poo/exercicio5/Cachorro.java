public class Cachorro {
  String raca;
  int tamanho;
  String cor;
  boolean tem_rabo;

  void late(){
    if(tem_rabo == true){
      System.out.println("Eu sou o " + raca + " de tamanho " + tamanho + " minha cor e " + cor + " e eu tenho rabo :) ");
    }else{
      System.out.println("Eu sou o " + raca + " de tamanho " + tamanho + " minha cor e " + cor + " e eu nao tenho rabo :( ");
    }
  }
}