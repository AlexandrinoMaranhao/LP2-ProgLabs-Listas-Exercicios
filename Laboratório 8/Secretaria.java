package banco.gestaopessoal;

public class Secretaria extends Funcionario {
	private int numeroRamal;

	public Secretaria(String nome, String codigoFunc, double salarioBase, int numRamal) {
		super(nome, codigoFunc, salarioBase);
		this.numeroRamal = numRamal;
	}

	public int getNumeroRamal() {
		return this.numeroRamal;
	}

	public void setNumeroRamal(int numeroRamal) {
		this.numeroRamal = numeroRamal;
	}
	
	
}
