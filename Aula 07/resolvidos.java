public class resolvidos {
    public static void main(String[] args) {
        
        // Exercício 1
        String msg = "Ola mundo";

        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
        }

        // Exercício 2
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nEstou aparencendo na tela pela %s", (i + 1) + " vez");
        }

        // Exercício 3
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("FIM");
 
        // Exercício 4
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o primeiro numero");
            n1 = scan.nextInt();
            System.out.println("Digite o segundo numero");
            n2 = scan.nextInt();
            System.out.println(n1 - n2);
        }
        System.out.println("FIM");

        // Exercício 5
        for (int i = 0; i <= 100000; i+= 1000) {
            System.out.println(i);
        }
        System.out.println("FIM");

        // Exercício 6
        int soma = 0;
        // Scanner scan = new Scanner(System.in);
        int numero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            numero = scan.nextInt();
            soma += numero;

            
        }
        int media = soma / 5;
        System.out.println(soma);
        System.out.println(Math.round(media));
    }   
}
