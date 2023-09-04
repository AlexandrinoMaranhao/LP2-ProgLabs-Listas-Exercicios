package poo.gestaocontas;

public class Lancamento {
	private String descricao;
	private double valor;

	public Lancamento(String descricao, double valor) {

		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
}
