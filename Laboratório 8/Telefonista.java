package banco.gestaopessoal;

public class Telefonista extends Funcionario {
	private String codigoEstacao;

	public Telefonista(String nome, String codigo, double salarioBase, String codigoEstacao) {
		super(nome, codigo, salarioBase);
		this.codigoEstacao = codigoEstacao;
	}

	public String getCodigoEstacao() {
		return this.codigoEstacao;
	}

	public void setCodigoEstacao(String codigoEstacao) {
		this.codigoEstacao = codigoEstacao;
	}

}
