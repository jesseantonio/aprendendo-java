public class Animal {
	private float tamanho;
	private String cor;

	public void comer() {
		System.out.println("O animal está comendo");
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public float getTamanho() {
		return tamanho;
	}

	public String toString() {
		return "Cor: " + cor + "\nTamanho: " + tamanho;
	}

}