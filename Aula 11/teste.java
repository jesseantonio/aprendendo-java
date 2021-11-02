import java.util.Scanner;
import java.util.Random;

    public class visualizarDivisores {

        public static void main(String[] args) {

            Scanner x = new Scanner(System.in);
            System.out.println("Escreva um número");
            int y = x.nextInt();
            for (int i = y; i > 0; i--) {
                if (y % i == 0) {
                    // System.out.println(i);

                    int[] vetor = new int[i];
                    
                    System.out.println(vetor[i]);
            }
        }
    }
}

// 11) Faça uma função que verifique se um valor é perfeito ou não. Um valor é dito perfeito quando ele é igual a 
// soma dos seus divisores excetuando ele próprio. (Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus divisores). 
// A função deve retornar um valor booleano. Receba um valor do usuário e mostre o resultado da função.