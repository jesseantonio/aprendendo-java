package projetos;

public class Nadador {

	String nome;
	int idade;
	public String setNome;

	public Nadador(String nome, double media) {
		super();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = 0;
	}

	public double getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public String classificarNadador() {
		if (this.idade <= 10 && this.idade >= 8) {
			return "Infantil";
		} else if (this.idade >= 11 && this.idade <= 17) {
			return "Juvenil";
		} else if (this.idade >= 18 && this.idade <= 49) {
			return "Adulto";
		} else if (this.idade >= 50 && this.idade <= 60) {
			return "Terceira Idade";
		} else {
			return "Não pode ser nadador";
		}
	}

	public String toString() {
		return String.format("Nome: " + nome + "\nIdade: " + idade + "\nCategoria: " + classificarNadador());
	}
}
