package poo.aula06;

import java.util.Calendar;

public class Pagamento {
	private double valor;
	private String pagador;
	private Documento docPagador;
	private Calendar data;
	
	public Documento getDocumentoPagador() {
		return this.docPagador;
	}
	
	public void setDocumentoPagador(Documento valor) {
		this.docPagador = valor;
	}
	
	public void setPagador(String nome) {
		this.pagador = nome;
	}
	
	public Calendar getData() {
		return this.data;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
}
