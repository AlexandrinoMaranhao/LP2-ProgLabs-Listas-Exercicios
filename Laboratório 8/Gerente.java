package banco.gestaopessoal;

public class Gerente extends Funcionario {
	private String sistemaLogin;
	private String sistemaSenha;

	public Gerente(String nome, double salario, String login, String senha) {
		super(nome, salario);
		this.sistemaLogin = login;
		this.sistemaSenha = senha;
	}

	public String getSistemaLogin() {
		return this.sistemaLogin
	}

	public void setSistemaLogin(String novoLogin) {
		this.sistemaLogin = novoLogin;
	}

	public String getSistemaSenha() {
		return this.sistemaSenha;
	}

	public void setSistemaSenha(String novaSenha) {
		this.sistemaSenha = novaSenha;
	}

	public double calculaBonus() {
		double bonificacao;
		bonificacao = 500;
		return bonificacao;
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("** Credenciais de Acesso ao Sistema **" + "\nLogin: " + this.sistemaLogin + "\nSenha: " + this.sistemaSenha);
	}

}
