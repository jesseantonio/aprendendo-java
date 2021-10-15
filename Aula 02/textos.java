public class textos {
    public static void main(String[] args) {
        
        int n1 = 1;
        int n2 = 2;        
        int n3 = 3;
        
        int res = n1 + n2 + n3;
        int total = res * 4;
        
        int a = 10;
        int b = a; // copia o vlor de a e coloca em b
        int c = b++;  // adiciona + 1 em b, ficando 11
        System.out.println(c); // a ainda é 10
        
        System.out.println(-2.0 / 0.0); // -infinity
        System.out.println(+2.0 / 0.0); // infinity


        System.out.println(2.0 % 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(Math.sqrt(-1));


        System.out.println((total / 4) / 2);
        System.out.println("Teste print linha");
        System.out.printf("%s - %d", "Jessé", 17);
    }
}
