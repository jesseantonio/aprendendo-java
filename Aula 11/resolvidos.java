import java.util.Random;
import java.util.Scanner;

public class resolvidos {

    // Exercício 1

    public class gerarRandom {
        public static void main(String[] args) {

            Random gerador = new Random();
            for (int i = 0; i < 1000; i++) {
                System.out.println(gerador.nextInt(1001));
            }

        }
    }

    // Exercício 2

    public class converterIdade {

        public static void main(String[] args) {

            int anos = 0;
            int meses = 0;
            int dias = 0;

            Scanner scan = new Scanner(System.in);
            System.out.println("Quantos anos de vida voce tem?");
            anos = scan.nextInt();
            System.out.println("Quantos meses de vida voce tem?");
            meses = scan.nextInt();
            System.out.println("Quantos dias de vida voce tem?");
            dias = scan.nextInt();

            conversor(anos, meses, dias);
        }

        public static void conversor(int anos, int meses, int dias) {

            anos = anos * 365;
            meses = meses * 30;

            int valorFinal = anos + meses + dias;
            System.out.println(valorFinal);

        }

    }

    // Exercício 3

    public class visualizarDivisores {

        public static void main(String[] args) {

            Scanner x = new Scanner(System.in);
            System.out.println("Escreva um número");
            int y = x.nextInt();
            for (int i = y; i > 0; i--) {
                if (y % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    // Exercício 4

    public class fatorar {

        public static void main(String[] args) {

            double x = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero para fatorar");
            x = scan.nextDouble();

            double f = x;

            while (x > 1) {
                f = f * (x - 1);
                x--;
            }
            System.out.println(f);
        }

    }
}

// 9) Faça uma função que recebe, por parâmetro, um valor inteiro e positivo
// e retorna o número de divisores
// desse valor.
