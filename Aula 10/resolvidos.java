public class resolvidos {

    // Exercício 1

    public class ParImpar {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o numero:");
            int num = scan.nextInt();
            procuraParOuImpar(num);
        }

        public static void procuraParOuImpar(int num) {
            if (num % 2 == 0)
                System.out.println(num + " e par");
            else
                System.out.println(num + " e impar");
        }
    }

    // Exercício 2

    public class maiorMenor {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o primeiro numero:");
            int num = scan.nextInt();
            System.out.print("Digite o primeiro numero:");
            int num2 = scan.nextInt();

            maiorMenor(num, num2);
        }

        public static void maiorMenor(int num, int num2) {

            int maximo = Math.max(num, num2);
            int minimo = Math.min(num, num2);

            System.out.println("O maior numero e o: " + maximo);
            System.out.println("O menor numero e o: " + minimo);
        }
    }

    // Exercício 3

    public class potenciacao {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o primeiro numero:");
            double num = scan.nextDouble();
            System.out.print("Digite o primeiro numero:");
            double num2 = scan.nextDouble();
            potencia(num, num2);
        }

        public static void potencia(double num, double num2) {
            double potenciacao = Math.pow(num, num2);
            System.out.println("A potencia dos numeros e: " + potenciacao);
        }
    }

    // Exercício 4

    public class calcularMedia {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite a primeira nota: ");
            double nota1 = scan.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scan.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double nota3 = scan.nextDouble();

            calculoMedia(nota1, nota2, nota3);
        }

        public static void calculoMedia(double nota1, double nota2, double nota3) {

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A media dos numeros e: " + media);
        }
    }

    // Exercício 5
    public class calcularMediaAndConceito {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Digite a primeira nota: ");
            double nota11 = scan.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota22 = scan.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double nota33 = scan.nextDouble();

            calculoMedia2(nota11, nota22, nota33);
        }

        public static void calculoMedia2(double nota11, double nota22, double nota33) {

            double media2 = (nota11 + nota22 + nota33) / 3;
            String conceito = "";

            if (media2 >= 0 && media2 < 5) {
                conceito = "D";
            } else if (media2 >= 5 && media2 < 6.9) {
                conceito = "C";
            } else if (media2 >= 7 && media2 < 8.9) {
                conceito = "B";
            } else {
                conceito = "A";
            }
            System.out.println("A media dos numeros e: " + media2);
            System.out.println("O conceito do aluno e: " + conceito);

        }
    }

    // Exercício 6
    
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

            switch (sexo) {
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

}
