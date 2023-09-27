package banco.gestaopessoal;

public class Telefonista extends Funcionario {
	private String codigoEstacao;

	public Telefonista(String nome, double salario, String codEstacao) {
		super(nome, salario);
		this.codigoEstacao = codEstacao;
	}

	public String getCodigoEstacao() {
		return this.codigoEstacao;
	}

	public void setCodigoEstacao(String codigo) {
		this.codigoEstacao = codigo;
	}

	public void mostraDados() {
		super.mostraDados();
		System.out.println("Código de Estação: " + this.codigoEstacao);
	}
}
