package projetos;

public class Vendedor {
	String nome;
	double meta;
	double totalVendido;
	
	public Vendedor(String nome, double media) {
		super();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMeta(int idade) {
		this.meta = 0;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	public double getMeta() {
		return meta;
	}

	public String getNome() {
		return nome;
	}
	
	public double getTotalVendido() {
		return totalVendido;
	}
	
	public double calcularComissao(double comissao, double totalVendido) {
		if(totalVendido < (meta / 2)) {
			 comissao = ((totalVendido / 100) * 1);
			totalVendido += comissao;	
			return comissao;
		}
		else if(totalVendido >= meta / 2 && totalVendido <= (meta / 4) * 3) {
			 comissao = (totalVendido / 100) * 2.5;
			 return comissao;
			
		}
		else if(totalVendido >= totalVendido * 0.75) {
			 comissao = (totalVendido / 100) * 3.5;
			return comissao;
			
		}
		else {
			 comissao = (totalVendido / 100) * 5;
			 return comissao;
		}
		
		
	}
	public String toString() {
		return String.format("Nome: " + nome + "\nMeta: " + meta + "\nTotal Vendido: " + totalVendido + "\nValor da comissão " + calcularComissao(meta, totalVendido));
	}
}

