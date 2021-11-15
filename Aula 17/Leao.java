public class Leao extends Animal {
	boolean juba;

	public void cacar() {
		System.out.println("O animal está caçando");
	}
	
	public String toStringLeao() {
		return String.format("Juba: " + juba);
	}
}