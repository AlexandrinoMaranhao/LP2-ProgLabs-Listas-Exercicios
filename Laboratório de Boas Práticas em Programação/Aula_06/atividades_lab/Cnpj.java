package poo.aula06;

public class Cnpj implements Documento{
	private String valorCnpj;
	
	public Cnpj(String valor) {
		this.valorCnpj = valor;
	}
	
	public boolean ehValido() {
		return true;
	}
	
	public String getValor() {
		return valorCnpj;
	}
	
	public void setValor(String valor) {
		this.valorCnpj = valor;
	}
	
	@Override
	public int hashCode() {
		return this.valorCnpj.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cnpj)) {
			return false;
		}
		Cnpj objeto = (Cnpj) obj;
		return this.valorCnpj.equals(objeto.getValor());
	}

}
