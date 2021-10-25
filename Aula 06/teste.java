import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
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

// 21) Usando o comando switch, faça um script que pergunte em que turno você
// estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
// Inválido!", conforme o caso.
