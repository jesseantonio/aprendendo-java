/**
 * 
 */
package br.com.senior.godev.geradorparcela;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author jesse.effting
 *
 */
public class Parcela {

	private Integer numero;
	private LocalDate dataVencimento;
	private BigDecimal valor;

	public Parcela() {

	}

	public Parcela(Integer numero, LocalDate dataVencimento, BigDecimal valor) {
		this.numero = numero;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataVencimento
	 */
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	/**
	 * @param dataVencimento the dataVencimento to set
	 */
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
