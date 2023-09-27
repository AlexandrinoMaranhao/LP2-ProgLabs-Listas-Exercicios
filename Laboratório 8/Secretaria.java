package banco.gestaopessoal;

public class Secretaria extends Funcionario {
	private int numeroRamal;

	public Secretaria(String nome, double salario, int numRamal) {
		super(nome, salario);
		this.numeroRamal = numRamal;
	}

	public int getNumeroRamal() {
		return this.numeroRamal;
	}

	public void setNumeroRamal(int numero) {
		this.numeroRamal = numeroRamal;
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Número de Ramal: " + this.numeroRamal);
	}
}
