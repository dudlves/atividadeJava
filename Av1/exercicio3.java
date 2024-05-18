// 3) Escreva um programa em Java que leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. 
// Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

// 0 - 2000,00 = Isento

// 2000,01 - 3000,00 = 8%

// 3000,01 - 4500,00 = 18%

// >4500 = 28%

// Lembre-se que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica
// de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% 
// sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira seu salário:");
        double salario = scanner.nextDouble();
        if (salario > 0 && salario < 2000) {
            System.out.println("não paga imposto!");
        } else if (salario > 2000.01 && salario < 3000) {
            double a = salario - 2000;
            System.out.println(" o valor a ser pago é: RS " + a * 0.08);
        } else if (salario > 3000.01 && salario < 4500) {
            double b = ((salario - 3000) * 0.18) + (0.08 * 1000);
            System.out.println(" o valor a ser pago é: RS " + b);
        } else {
            double c = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.println("o valor a ser pago é: RS " + c);
        }
        scanner.close();
    }

}