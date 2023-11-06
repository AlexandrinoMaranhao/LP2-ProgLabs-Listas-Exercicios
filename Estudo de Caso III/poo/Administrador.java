package poo.controlebiblioteca;

public class Administrador {
	private String usuarioLogin;
	private String senhaLogin;
	
	public Administrador(String usuario, String senha) {
		this.usuarioLogin = usuario;
		this.senhaLogin = senha;
	}
	
	public String getUsuarioLogin() {
		return this.usuarioLogin;
	}
	
	public String getSenhaLogin (){
		return this.senhaLogin;
	}
	
	public boolean validarLogin(String usuario, String senha) {
		return usuario.equals(this.usuarioLogin) && senha.equals(this.senhaLogin);
	}
}