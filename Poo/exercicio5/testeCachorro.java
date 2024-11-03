public class testeCachorro {
  public static void main(String[] args){
    Cachorro cachorro1 = new Cachorro();
    cachorro1.raca = "Husky siberiano";
    cachorro1.tamanho = 12;
    cachorro1.cor = "Amarelo";
    cachorro1.tem_rabo = true;
    cachorro1.late();

    Cachorro cachorro2 = new Cachorro();
    cachorro2.raca = "Buldogue";
    cachorro2.tamanho = 4;
    cachorro2.cor = "Marrom";
    cachorro2.tem_rabo = false;
    cachorro2.late();

    Cachorro cachorro3 = new Cachorro();
    cachorro3.raca = "Chihuahua";
    cachorro3.tamanho = 7;
    cachorro3.cor = "Amarelo";
    cachorro3.tem_rabo = false;
    cachorro3.late();


  }
}
