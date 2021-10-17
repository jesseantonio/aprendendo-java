import java.util.Scanner;

public class resolver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = 0;

        System.out.println("Cadastro de Funcionários: ");

        System.out.println(
                "1) Cadastrar funcionário\n2) Listar funcionários\n3) Editar funcionário\n4) Deletar funcionário\n5) Sair ");
        System.out.println("-------------------");
        System.out.println("Digite um número: ");
        switch (numero = scan.nextInt()) {
            case 1:
                String cadastro = "";
                System.out.println("Digite um nome para o seu funcionário");
                cadastro = scan.next();
                System.out.printf("O seu funcionário cadastrado foi %s", cadastro);

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

// 2) Mostre na tela um menu para um sistema de cadastro de funcionários. O menu
// deve ser impresso
// com a função console.log()
// O menu deve estar no seguinte formato:

// Cadastro de Funcionários:
// 1) Cadastrar funcionário
// 2) Listar funcionários
// 3) Editar funcionário
// 4) Deletar funcionário
// 5) Sair