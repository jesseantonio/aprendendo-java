import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Parcelas extends Parcela{
 
    public static void main(String[] args) {
        
        Parcela parcela = new Parcela();
       
        parcela.setNumeroParcelas(4);
        parcela.setValorTotal(23.5);
        
        
        System.out.println(LocalDate.now().getDayOfMonth());
        
        System.out.println(LocalDate.now().plusDays(1));
        System.out.println(LocalDate.now().minusDays(10));
        

        // valorParcela valorParcela = new valorParcela();
        // valorParcela.setValorParcela(32);
       
        System.out.println(parcela.toString());

        

    }

}
