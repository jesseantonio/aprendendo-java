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

        

    }

}
