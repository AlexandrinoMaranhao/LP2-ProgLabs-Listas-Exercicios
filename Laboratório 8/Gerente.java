package banco.gestaopessoal;

public class Gerente extends Funcionario {
	private String usuarioAcesso;
	private String senhaAcesso;

	public Gerente(String nome, String codigoFunc, double salarioBase, String sistemaLogin, String sistemaSenha) {
		super(nome, codigoFunc, salarioBase);
		this.usuarioAcesso = sistemaLogin;
		this.senhaAcesso = sistemaSenha;
	}

	public String getUsuarioAcesso() {
		return this.usuarioAcesso;
	}

	public void setUsuarioAcesso(String usuarioAcesso) {
		this.usuarioAcesso = usuarioAcesso;
	}

	public String getSenhaAcesso() {
		return this.senhaAcesso;
	}

	public void setSenhaAcesso(String senhaAcesso) {
		this.senhaAcesso = senhaAcesso;
	}

}
