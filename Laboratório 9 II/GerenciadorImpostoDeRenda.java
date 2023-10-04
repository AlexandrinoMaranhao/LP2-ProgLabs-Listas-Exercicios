package poo.outrogestaocontas;

public class GerenciadorImpostoDeRenda {
	private int total;
	
	
	public double getTotal() {
		return this.total;
	}
	
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		this.total += t.calculaTributos();
	}
	
}
