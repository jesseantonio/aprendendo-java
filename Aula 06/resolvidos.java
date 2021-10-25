import java.util.Scanner;

public class resolvidos {

    public static void main(String[] args) {

        // Exercício 1
        Scanner scan = new Scanner(System.in);
        int valorA = 0;

        System.out.println("Digite o valor A");
        valorA = scan.nextInt();

        if (valorA > 10) {
            System.out.println("O valor A e maior que 10");
        } else if (valorA == 10) {
            System.out.println("O valor A e igual a 10");
        } else {
            System.out.println("O valor A e menor que 10");
        }
        System.out.println("Programa finalizando...");

        // Exercício 2
        // Scanner scan = new Scanner(System.in);
        int valor = 0;

        System.out.println("Digite o valor");
        valor = scan.nextInt();

        if (valor % 2 == 0) {
            System.out.println(valor / 2);
        }

        System.out.println("Programa finalizando...");

        // Exercício 3
        // Scanner scan = new Scanner(System.in);
        // int valor = 0;

        System.out.println("Digite o valor");
        valor = scan.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O numero e par");
        } else {
            System.out.println("O numero e impar");
        }

        System.out.println("Programa finalizando...");

        // Exercício 4
        // Scanner scan = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero");
        numero = scan.nextInt();

        if (numero <= 20 || numero >= 90) {
            System.out.println("O numero esta fora da faixa");
        } else {
            System.out.println("O numero esta dentro da faixa");
        }

        // Exercício 5
        // Scanner scan = new Scanner(System.in);
        int valor1, valor2, valor3 = 0;

        System.out.println("Digite o valor 1");
        valor1 = scan.nextInt();
        System.out.println("Digite o valor 2");
        valor2 = scan.nextInt();
        System.out.println("Digite o valor 3");
        valor3 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor2) {
            System.out.println("O maior valor é o valor 1");
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é o valor 2");
        } else {
            System.out.println("O maior valor é o valor 3");
        }

        // Exercício 6
        // Scanner scan = new Scanner(System.in);
        int lado1, lado2, lado3 = 0;

        System.out.println("Digite o valor 1");
        lado1 = scan.nextInt();
        System.out.println("Digite o lado 2");
        lado2 = scan.nextInt();
        System.out.println("Digite o lado 3");
        lado3 = scan.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("EQUILATERO");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("ESCALENO");
        } else {
            System.out.println("ISOCELES");
        }

        // Exercício 7
        // Scanner scan = new Scanner(System.in);
        double numeroww = 0;

        System.out.println("Digite um numero");
        numeroww = scan.nextInt();

        if (numeroww > 0) {
            System.out.println(Math.sqrt(numeroww));
        } else {
            System.out.println("Numero invalido");
        }

        // Exercício 8
        // Scanner scan = new Scanner(System.in);
        int numerowww = 0;

        System.out.println("Digite um numero");
        numeroww = scan.nextInt();

        if (numerowww % 5 == 0) {
            System.out.println("Numero divisivel por 5");
        } else {
            System.out.println("Numero invalido");
        }

        // Exercício 9
        // Scanner scan = new Scanner(System.in);
        double n = 0;

        System.out.println("Digite um numero");
        n = scan.nextDouble();

        if (n > 0) {
            System.out.println(Math.sqrt(n));
        } else {
            System.out.println(Math.pow(n, 2));
        }

        // Exercício 10
        System.out.println("Digite o salario");
        salario = scan.nextDouble();

        System.out.println("Digite o valor da prestacao");
        prestacaoEmprestimo = scan.nextDouble();

        double checar = (salario / 100) * 20;

        if (prestacaoEmprestimo > checar) {
            System.out.println("Emprestimo nao concedido");
        } else {
            System.out.println("Emprestimo concedido");
        }

        // Exercício 11
        // Scanner scan = new Scanner(System.in);
        int num1, num2, num3 = 0;

        System.out.println("Digite o numero 1");
        num1 = scan.nextInt();
        System.out.println("Digite o numero 2");
        num2 = scan.nextInt();
        System.out.println("Digite o numero 3");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("--------A------------");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println("--------------------");
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println("---------B-----------");
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
            System.out.println("--------------------");
        } else if (num2 > num1 && num2 > num3 && num1 < num3) {
            System.out.println("-----------C---------");
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
            System.out.println("--------------------");
        } else if (num2 < num1 && num2 < num3 && num1 > num3) {
            System.out.println("-----CAIU---------------");
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
            System.out.println("--------------------");
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println("-----CAIU2---------------");
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("--------------------");
        } else {
            System.out.println("---------D-----------");
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
            System.out.println("--------------------");
        }


        // Scanner scan = new Scanner(System.in);
        String periodo = "";

        System.out.println("Digite seu turno M/V/N");
        periodo = scan.nextLine();


        switch (periodo.toUpperCase()) {
        case "M":
            System.out.println("Bom dia!");
            break;
        case "V":
            System.out.println("Bom tarde!");
            break;
        case "N":
            System.out.println("Bom noite!");
            break;
        default:
            System.out.println("Valor invalido");
            break;
        }

    }

}
