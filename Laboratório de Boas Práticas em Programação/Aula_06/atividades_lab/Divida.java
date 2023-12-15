package poo.aula06;

public class Divida {
	private double total;
	private String nomeCredor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();
	
	public Divida(){
		
	}
	
	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}
	
	public Documento getDocumentoCredor() {
		return this.documentoCredor;
	}
	
	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}
	
	public void setTotal(double valor){
		this.total = valor;
	}
	
	public void setCredor(String credor) {
		this.nomeCredor = credor;
	}
}
