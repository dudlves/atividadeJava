// Faça um programa que receba o salário base de um funcionário, calcule e mostre o
// salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário
// base e paga imposto de 7% sobre este salário

import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu salario:");
    double salario = scanner.nextDouble();
    double gratificação = (salario * 0.05);
    double imposto = (salario * 0.07);
    double novosalario = salario + gratificação - imposto;
    System.out.println("O salario a receber: " + novosalario);
    scanner.close();
  }
}
