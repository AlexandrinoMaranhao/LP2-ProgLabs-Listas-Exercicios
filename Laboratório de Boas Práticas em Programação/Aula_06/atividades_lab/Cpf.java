package poo.aula06;

public class Cpf implements Documento {
	private String valorCpf;
	
	public Cpf(String valor) {
		this.valorCpf = valor;
	}
	
	public boolean ehValido() {
		return true;
	}
	
	public String getValor(){
		return valorCpf;
	}
	
	public void setValor(String valor) {
		this.valorCpf = valor;
	}
	
	@Override
	public int hashCode() {
		return this.valorCpf.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cpf)) {
			return false;
		}
		Cpf objeto = (Cpf) obj;
		return this.valorCpf.equals(objeto.getValor());
	}
}
