package projetos;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		Vendedor vendedor = new Vendedor(null, 0);
		int sair = 0;

		System.out.println("Digite o nome");
		vendedor.nome = scan.next();

		System.out.println("Digite a meta");
		vendedor.meta = scan.nextDouble();
		
		System.out.println("Digite o total vendido");
		vendedor.totalVendido = scan.nextDouble();

		System.out.println("-------------------------------");
		System.out.println(vendedor.toString());
		System.out.println("-------------------------------");

		
		

	}

}
