import java.io.Console;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        // Exercício 2 
        Scanner scan = new Scanner(System.in);
        String nome = "";
        String resp1, resp2, resp3, resp4, resp5 = "";
        int nota = 0;

        System.out.println("Digite seu nome");
        nome = scan.nextLine();

        System.out.println("-----------------------------");
        System.out.println("Pergunta 1");
        System.out.println("Qual a maior estrela do nosso sistema solar");
        System.out.println("a) Sol   | b) Lua   | c) Marte");
        resp1 = scan.nextLine();

        switch (resp1) {
            case "a":
                nota += 2;
                break;
                case "b":
                nota += 0;
                break;
                case "c":
                nota += 0;
                break;
            default:
                break;
        }

        System.out.println("-----------------------------");
        System.out.println("Pergunta 2");
        System.out.println("Qual a primeira letra do nosso alfabeto");
        System.out.println("a) Z   | b) B   | c) A");
        resp2 = scan.nextLine();

        switch (resp2) {
            case "a":
                nota += 0;
                break;
                case "b":
                nota += 0;
                break;
                case "c":
                nota += 2;
                break;
            default:
                break;
        }

        System.out.println("-----------------------------");
        System.out.println("Pergunta 3");
        System.out.println("2x10 e igual a?");
        System.out.println("a) 10   | b) 20   | c) 12");
        resp3 = scan.nextLine();

        switch (resp3) {
            case "a":
                nota += 0;
                break;
                case "b":
                nota += 2;
                break;
                case "c":
                nota += 0;
                break;
            default:
                break;
        }

        System.out.println("-----------------------------");
        System.out.println("Pergunta 4");
        System.out.println("O fantastico mundo de ____ (desenho dos anos 80)");
        System.out.println("a) Bob   | b) Carl   | c) Zec");
        resp4 = scan.nextLine();

        switch (resp4) {
            case "a":
                nota += 2;
                break;
                case "b":
                nota += 0;
                break;
                case "c":
                nota += 0;
                break;
            default:
                break;
        }

        System.out.println("-----------------------------");
        System.out.println("Pergunta 5");
        System.out.println("O valor de PI?");
        System.out.println("a) 3.10   | b) 3   | c) 3.14");
        resp5 = scan.nextLine();

        switch (resp5) {
            case "a":
                nota += 0;
                break;
                case "b":
                nota += 0;
                break;
                case "c":
                nota += 2;
                break;
            default:
                break;
        }

        System.out.printf("----------------------------\n");
        System.out.printf("O aluno %s%n", nome);
        System.out.printf("Atingiu a nota %s%n", nota);
        System.out.printf("----------------------------");
    }
}

// 1) Leia um vetor de 10 posições. Calcule e escreva quantos valores pares ele
// possui.