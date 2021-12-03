package br.com.senior.exception;

public class LivroDescricaoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public LivroDescricaoException(String msg) {
		super(msg);
	}
}
