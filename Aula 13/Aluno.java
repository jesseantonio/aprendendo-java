package projetos;

public class Aluno {

	String nome;
	String conceito;
	double media;
	public String setNome;

	public Aluno(String nome, double media) {
		super();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMedia(double media) {
		this.media = 0;
	}

	public double getMedia() {
		return media;
	}

	public String getNome() {
		return nome;
	}

	public String verificarConceito() {
		if (this.media > 9) {
			return  "A";
		} else if (this.media < 8.9 && this.media > 8) {
			return "B";
		} else if (this.media < 7.9 && this.media > 6) {
			return "C";
		} else {
			return "D";
		}
	}
	public String toString() {
		 return String.format("Aluno: " + nome + "\nMedia: " + media + "\nConceito: " + verificarConceito());
	}
}
