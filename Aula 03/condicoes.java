import java.util.Scanner;


public class condicoes {
    public static void main(String[] args){
     
         java.util.Scanner scan = new Scanner(System.in);
         int n1=0,n2=0,res=0;

         System.out.println("Digite um numeral ");
         n1=scan.nextInt();
         System.out.println("Digite o segundo numeral ");
         n2=scan.nextInt();
        res=n1+n2;
        System.out.printf("A soma de %d com %d é igual a %d",n1,n2,res);

    }
}


