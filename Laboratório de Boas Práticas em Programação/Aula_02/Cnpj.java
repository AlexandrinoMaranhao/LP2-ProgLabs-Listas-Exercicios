package poo.aula2;

public class Cnpj {
	private String valor;

	public Cnpj() {
	}
	
	public boolean cnpjValido() {
		return primeiroDigitoVerificadorCnpj() == primeiroDigitoCorretoCnpj() 
				&& segundoDigitoVerificadorCnpj() == segundoDigitoCorretoCnpj();
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	private int primeiroDigitoCorretoCnpj() {
		return 0;
	}

	private int primeiroDigitoVerificadorCnpj() {
		return 0;
	}

	private int segundoDigitoCorretoCnpj() {
		return 0;
	}

	private int segundoDigitoVerificadorCnpj() {
		return 0;
	}
}
