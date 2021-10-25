import java.lang.constant.Constable;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        // Exercício 9
        Scanner scan = new Scanner(System.in);
        String nomeVendedor = "";
        double salarioFixo = 0;
        int totalVendas = 0;

        System.out.println("Digite seu nome");
        nomeVendedor = scan.nextLine();
        System.out.println("Digite seu salario");
        salarioFixo = scan.nextDouble();
        System.out.println("Digite seu total de vendas (em dinheiro)");
        totalVendas = scan.nextInt();

        double comissao = (totalVendas / 100) * 15;
        double novoSalario = salarioFixo + comissao;
        
        System.out.println("-----------------");
        System.out.printf("TOTAL %s", novoSalario);
    }
}

// 21) Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
// Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
// Entrada:             SAIDA:
// JOAO                 TOTAL = R$ 684.54
// 500.00
// 1230.30

// PEDRO                SAIDA:
// 700.00               TOTAL = R$ 700.00
// 0.00