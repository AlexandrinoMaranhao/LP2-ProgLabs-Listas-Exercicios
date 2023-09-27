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
		return this.usuarioAcesso;
	}

	public void setSistemaLogin(String login) {
		this.usuarioAcesso = usuarioAcesso;
	}

	public String getSistemaSenha() {
		return this.sistemaSenha;
	}

	public void setSistemaSenha(String senha) {
		this.sistemaSenha = senhaAcesso;
	}

	public double calculaBonus() {
		double bonificacao;
		bonificacao = this.getSalario() + 500;
		return bonificacao;
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Credenciais de Acesso ao Sistema" + "\nLogin: " + this.sistemaLogin + "\nSenha: " + this.sistemaSenha);
	}

}
