import java.util.Scanner;

// Exercício 4
public class pesoIdeall {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu sexo (M/F): ");
        String sexo = scan.nextLine();
        System.out.print("Digite a sua altura:");
        double altura = scan.nextDouble();
    
        pesoIdeal(sexo, altura);
    }

    public static void pesoIdeal(String sexo, double altura) {
        double pesoIdeal = 0;
        
        switch(sexo) {
            case "M":
                pesoIdeal = 62.1 * altura - 44.7;
                System.out.println(pesoIdeal);
                break;
            case "F":
                pesoIdeal = 72.7 * altura - 58;
                System.out.println(pesoIdeal);
                break;
            default:
                System.out.println("Sexo invalido");
        }
    }
}

// 7) Faça um procedimento que lê 50 valores inteiros e retorna o maior e o menor deles. 
// Utilize a função Math.random() para gerar valores aleatórios entre 1-1000.
