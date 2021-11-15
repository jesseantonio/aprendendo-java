public class Cavalo extends Animal {
	String raca;

	public void fugir() {
		System.out.println("O animal está fugindo");
	}

	public String toStringCavalo() {
		return String.format("Raça: " + raca);
	}
}