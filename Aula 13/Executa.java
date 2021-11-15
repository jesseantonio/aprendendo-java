package projetos;

import java.util.Scanner;

public class Executa  {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno(null, 0);
		
		System.out.println("Digite o nome");
		aluno.nome = scan.next();
		
		
		System.out.println("Digite a média");
		aluno.media = scan.nextDouble();
		
		System.out.println("--------------------");
		System.out.println(aluno.toString());
		System.out.println("--------------------");
    }
	
	
	

}
