// Escrever um programa para ler a quantidade de horas-aula dadas de dois
// professores e o valor por hora recebido por cada um(valores diferentes pois um
// deles é mestre e o outro é doutor). Mostrar na tela qual dos professores tem
// salário total maior.
import java.util.Scanner;
public class exercicio19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Leitura da quantidade de horas-aula e valor por hora para o primeiro professor (mestre)
    System.out.println("Digite a quantidade de horas-aula dadas pelo primeiro professor (mestre):");
    int horasAulaMestre = scanner.nextInt();

    System.out.println("Digite o valor por hora do primeiro professor (mestre):");
    double valorHoraMestre = scanner.nextDouble();

    // Leitura da quantidade de horas-aula e valor por hora para o segundo professor (doutor)
    System.out.println("Digite a quantidade de horas-aula dadas pelo segundo professor (doutor):");
    int horasAulaDoutor = scanner.nextInt();

    System.out.println("Digite o valor por hora do segundo professor (doutor):");
    double valorHoraDoutor = scanner.nextDouble();

    // Cálculo dos salários totais de cada professor
    double salarioTotalMestre = horasAulaMestre * valorHoraMestre;
    double salarioTotalDoutor = horasAulaDoutor * valorHoraDoutor;

    // Verificando qual professor tem o salário total maior e exibindo na tela
    if (salarioTotalMestre > salarioTotalDoutor) {
        System.out.println("O primeiro professor (mestre) tem o salário total maior.");
        System.out.println("Salário total: R$" + salarioTotalMestre);
    }
    if (salarioTotalDoutor > salarioTotalMestre) {
        System.out.println("O segundo professor (doutor) tem o salário total maior.");
        System.out.println("Salário total: R$" + salarioTotalDoutor);
    } 
    if (salarioTotalDoutor == salarioTotalMestre)  {
        System.out.println("Os professores têm salários totais iguais.");
        System.out.println("Salário total: R$" + salarioTotalMestre);
    }

    scanner.close();
}
}
