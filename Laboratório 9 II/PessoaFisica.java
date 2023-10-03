package poo.gestaocontabancaria;

public class PessoaFisica {
	private String titular;
	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		this.titular = nome;
		this.cpf = cpf;
	}

	public String getTitular() {
		return titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "\nTitular = " + titular + "\nCPF = " + cpf;
	}

}
