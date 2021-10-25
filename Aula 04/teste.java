import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        // Exercício 4
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int numero = 0;

        System.out.println("Digite o primeiro numero ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero ");
        num2 = scan.nextInt();

        System.out.println("-------------------");
        System.out.println("1) Somar\n2) Multiplicar\n3) Subtrair\n4) Dividir\n5) Sair ");
        System.out.println("-------------------");
        System.out.println("Digite um numero: ");
        switch (numero = scan.nextInt()) {
        case 1:
            System.out.printf("A soma foi igual %s", (num1 + num2));
            break;
        case 2:
            System.out.printf("A multiplicacao foi igual %s", (num1 * num2));
            break;
        case 3:
            System.out.printf("A subtracao foi igual %s", (num1 - num2));
            break;
        case 4:
            System.out.printf("A divisao foi igual %s", (num1 / num2));
            break;
        case 5:
            System.out.println("Fechando...");
            break;
        default:
            System.out.println("Digite um número por favor");
            break;
        }
    }
}

// 12) Crie um script que receba dois números e mostre na tela o resultado da
// soma entre esses dois números.

// 13) Faça um programa que receba duas notas do usuário, calcule a média e
// mostre o resultado na tela.

// 14) Faça um programa que receba 3 números, calcule o quadrado de cada um
// deles e mostre o resultado na tela.