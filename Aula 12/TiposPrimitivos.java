import java.util.Scanner;
import java.text.DecimalFormat;

public class TiposPrimitivos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero = 0;
		String frase = "";

		do {
			System.out.println("-------------");
			System.out.println("Digite sua opção");
			System.out.println("1 Escrever frase");
			System.out.println("2 Deixar sua frase em maiuscula");
			System.out.println("3 Deixar sua frase em minuscula");
			System.out.println("4 Sair");

			numero = scan.nextInt();

			switch (numero) {
			case 1: {
				System.out.println("Digite");
				frase = scan.next();
				break;
			}
			case 2: {
				System.out.println(frase.toUpperCase());
				break;
			}
			case 3: {
				System.out.println(frase.toLowerCase());
				break;
			}
			default:

			}
		} while (numero != 4);
	}



    public class TiposPrimitivos {
    
        public static void main(String[] args) {
    
            Scanner scan = new Scanner(System.in);
            double salario = 0;
            String nome = "";
            String cargo = "";
            
    
            System.out.println("-------------");
            System.out.println("Digite seu nome");
            nome = scan.next();
    
            System.out.println("Digite seu salario");
            salario = scan.nextDouble();
    
            System.out.println("Digite seu cargo");
            cargo = scan.next();
    
            System.out.println("-----------------");
            System.out.println("Seu nome é: " + nome);
            System.out.println("Seu salário é: " + salario);
            System.out.println("Seu cargo é: " + cargo);
            System.out.println("-----------------");
        }
    
    }
    
    public class TiposPrimitivos {
    
        public static void main(String[] args) {
    
            Scanner scan = new Scanner(System.in);
            double salario = 0;
            String nome = "";
            String cargo = "";
            
    
            System.out.println("-------------");
            System.out.println("Digite seu nome");
            nome2 = scan.next();
    
            System.out.println("Digite seu salario");
            salario2 = scan.nextDouble();
    
            System.out.println("Digite seu cargo");
            cargo2 = scan.next();
    
            System.out.println("-----------------");
            System.out.println("Seu nome é: " + nome);
            System.out.println("Seu salário é: " + salario);
            System.out.println("Seu cargo é: " + cargo);
            System.out.println("-----------------");
        }
    
    }
}

public class TiposPrimitivos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		double[] salario = new double[3];
		String[] nome = new String[3];
		String[] cargo = new String[3];
		String nome2 = "";
		double salario2 = 0;
		String cargo2 = "";

		for (int i = 0; i < 3; i++) {
			System.out.println("-------------");
			System.out.println("Digite seu nome");
			nome2 = scan.next();
			nome[i] = nome2;

			System.out.println("Digite seu salario");
			salario2 = scan.nextDouble();
			if (salario2 < 1500) {
				double salarioNovo = (salario2 / 100) * 5;
				salario2 += salarioNovo;
			} else if (salario2 < 2100) {
				double salarioNovo = (salario2 / 100) * 6.2;
				salario2 += salarioNovo;
			} else {
				salario2 = salario2 + 150;
			}

			salario[i] += salario2;

			System.out.println("Digite seu cargo");
			cargo2 = scan.next();
			cargo[i] = cargo2;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("------------------------");
			System.out.println("Seu nome é: " + nome[i]);
			System.out.println("Seu salário é: " + df.format(salario[i]));
			System.out.println("Seu cargo é: " + cargo[i]);
			System.out.println("---------------------");
		}
	}

}