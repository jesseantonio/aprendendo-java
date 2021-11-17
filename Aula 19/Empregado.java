public class Executa extends Animal {
	
	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo();
		cavalo.setCor("Branco");
		cavalo.setTamanho(120);
		cavalo.raca = "raça do cavalo";
		cavalo.fugir();
		System.out.println(cavalo.toString());
		System.out.println(cavalo.toStringCavalo());
		
		System.out.println("-------------------------");
		Leao leao = new Leao();
		leao.setCor("Branco");
		leao.setTamanho(150);
		leao.juba = false;
		leao.cacar();
		System.out.println(leao.toString());
		System.out.println(leao.toStringLeao());
	}
	
	
	
}