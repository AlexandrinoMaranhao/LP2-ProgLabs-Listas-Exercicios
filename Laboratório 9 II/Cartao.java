package poo.outrogestaocontas;

public class Cartao {
	private int numeroCartao;
	private Cliente titular;

	public Cartao(int numCart, Cliente titular) {
		this.numeroCartao = numCart;
		this.titular = titular;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String toString() {
		return "\nNumero do Cartao = " + numeroCartao + titular;
	}

}
