import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Parcela {

    private Double valorTotal;
    private Integer numeroParcelas;
    private BigDecimal valorParcela;
    private LocalDate dataVencimento;

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public LocalDate calcularData(LocalDate dataVencimento) {
       if(LocalDate.now().getDayOfMonth() == 10){
            System.out.println("pode passar");
       }
        
        return "a";
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    private List<Parcelas> gerarParcelas(double valorTotal, Integer valorParcelas) {
        List<Parcelas> parcelas = new ArrayList<>();

        System.out.println(parcelas);

        return parcelas;

    }

    @Override
    public String toString() {
        return "ValorTotal: " + valorTotal + "\nNumeroParcela: " + numeroParcelas + "\nValorParcela: " + valorParcela;
    }

}
