import java.util.Scanner;

public class resolvidos {
    
    public static void main(String[] args){
        
        // Exercício 1
        String nome = "";
        String admin = "admin";
        
        nome += admin;
        System.out.println(nome);


        // Exercício 2
        Scanner scan = new Scanner(System.in);
        String nome2 = "";
        int idade = 0;
        int peso = 0;
        int altura = 0;
        int telefone = 0;

        System.out.println("Digite seu nome2: " );
        nome2=scan.nextLine();
        System.out.println("Digite sua idade: " );
        idade=scan.nextInt();
        System.out.println("Digite seu peso: " );
        peso=scan.nextInt();
        System.out.println("Digite sua altura: " );
        altura=scan.nextInt();
        System.out.println("Digite seu telefone " );
        telefone=scan.nextInt();
        
        System.out.println("-----------------------");
        System.out.println(nome2);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(telefone);
        System.out.println("-----------------------");

        // Exercício 3
        
        // Scanner scan = new Scanner(System.in);
        int largura = 0;
        int altura2 = 0;
        

        System.out.println("Digite a altura do seu quadrado: " );
        altura2=scan.nextInt();
        System.out.println("Digite a largura do seu quadrado: " );
        largura=scan.nextInt();
        
        int area = largura * altura;
        int perimetro = largura + altura;


        System.out.println("-----------------------");
        System.out.println(perimetro);
        System.out.println(area);
        System.out.println("-----------------------");

        // Exercício 4
        // Scanner scan = new Scanner(System.in);
        int qtdMeses = 0;

       System.out.println("Digite a quantidade de meses");
       qtdMeses = scan.nextInt();

       int dias = (qtdMeses * 30);
    
        System.out.println("-------------------");
        System.out.printf("A quantidade de dias e:  %s", dias);
        System.out.println("-------------------");


        // Exercício 5
        // Scanner scan = new Scanner(System.in);
        int numerooo = 0;

        System.out.println("Digite um numero");
        numerooo = scan.nextInt();

        int antecessor = (numerooo - 1);
        int sucessor = (numerooo + 1);
    
        System.out.println("-------------------");
        System.out.printf("O numero antecessor e %s",antecessor); 
        System.out.printf("\nE o sucessor e %s", sucessor);
        System.out.println("\n-------------------");

        // Exercício 6
        // Scanner scan = new Scanner(System.in);
        double pi = 3.14159;
        int raio = 0;

        System.out.println("Digite o valor do raio");
        raio = scan.nextInt();

        double volume = (4  * pi * (Math.pow(raio,3))) / 3;
    
        System.out.println("-------------------");
        System.out.printf("O volume da esfera e %s", volume); 
        System.out.println("\n-------------------");
    

        // Exercício 7
        //    Scanner scan = new Scanner(System.in);
        int base = 0;
        int altura1 = 0;

        System.out.println("--------------");
        System.out.println("Digite a base do seu triangulo");
        base = scan.nextInt();
        System.out.println("Digite a altura do seu triangulo");
        altura1 = scan.nextInt();

        double area1 = (base * altura) / 2;

        System.out.printf("A area do seu triangulo e %s", area1);
    
        // Exercício 8
        // Scanner scan = new Scanner(System.in);
        int preco = 0;
        int desconto = 0;

        System.out.println("Digite o preco do seu produto");
        preco = scan.nextInt();
        System.out.println("Digite o desconto do seu produto");
        desconto = scan.nextInt();

        double valorNovo = (preco / 100) * desconto;
        double valor =  preco - valorNovo;

        System.out.println("----------------");
        System.out.printf("TOTAL = %s", valor);
        System.out.printf("\nDESCONTO = %s", desconto);
        System.out.println("\n----------------");

        // Exercício 9
        // Scanner scan = new Scanner(System.in);
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
