/**
 * 
 */
package br.com.senior.godev.geradorparcela;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jesse.effting
 *
 */
public class GeradorParcela {

	// vencimento
	// at� dia 10 e dia 10, ai no dia 10 do mesmo mes
	// maior que dia 10, vencimento para dia 10 do mes que vem

	public static List<Parcela> gerarParcelas(LocalDate dataCompra, BigDecimal valorTotalCompra, int numeroParcelas) {

		List<Parcela> parcelas = new ArrayList<>();

		BigDecimal valorParcela = valorTotalCompra.divide(new BigDecimal(numeroParcelas), 2, //
				RoundingMode.HALF_EVEN);

		System.out.println("Data de compra �: " + dataCompra);

		LocalDate dataVencimentoAux = dataCompra;

		if (dataVencimentoAux.getDayOfMonth() > 10) {
			dataVencimentoAux = dataVencimentoAux.plusMonths(1);
		}
		dataVencimentoAux = dataVencimentoAux.withDayOfMonth(10);

		for (int i = 0; i < numeroParcelas; i++) {
			parcelas.add(new Parcela(i + 1, dataVencimentoAux, valorParcela));
			dataVencimentoAux = dataVencimentoAux.plusMonths(1);

		}

		BigDecimal resto = valorTotalCompra.remainder(valorParcela);
		if (!resto.equals(BigDecimal.ZERO)) {
			Parcela parcela = parcelas.get(0);
			parcela.setValor(parcela.getValor().add(resto));
		}

		return parcelas;
	}

	private boolean isDia10() {
		return LocalDate.now().getDayOfMonth() == 10;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Parcela> parcelas = GeradorParcela.gerarParcelas(LocalDate.of(2021, Month.NOVEMBER, 11),
				new BigDecimal("100.0"), 3);

		System.out.println("Numero de parcelas: " + parcelas.size());

		for (Parcela parcela : parcelas) {
			System.out.println(String.format("%s - %s - %s", parcela.getNumero(), //
					parcela.getDataVencimento(), //
					parcela.getValor()));
		}
	}

}
