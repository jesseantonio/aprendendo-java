package projetos;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Nadador nadador = new Nadador(null, 0);
		int sair = 0;

		do {
			System.out.println("Digite o nome");
			nadador.nome = scan.next();

			System.out.println("Digite a idade");
			nadador.idade = scan.nextInt();

			System.out.println("-------------------------------");
			System.out.println(nadador.toString());
			System.out.println("-------------------------------");
			
			System.out.println("Deseja continuar? - Aperte 5");
			sair = scan.nextInt();
		} while (sair == 5);

	}

}
