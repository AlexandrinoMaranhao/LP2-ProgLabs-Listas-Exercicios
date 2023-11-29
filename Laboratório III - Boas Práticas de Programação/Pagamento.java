package poo.Lab3;

import java.util.Calendar;

public class Pagamento {
	private String pagador;
	private String cnpjPagador;
	private double valor;
	private Calendar data;
	private String favorecido;
	private String formaDePagamento;
	private Movimentacao tipoMovimentacao = new Movimentacao(valor, null, null);
	
	
	public boolean foiMovimentado() {
		return (tipoMovimentacao != null);
	}
	// GETTERS E SETTERS
	public String getPagador() {
		return pagador;
	}
	public String getCnpjPagador() {
		return cnpjPagador;
	}
	public double getValor() {
		return valor;
	}
	public Calendar getData() {
		return data;
	}
	public String getFavorecido() {
		return favorecido;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	public void setCnpjPagador(String cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public Movimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(Movimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
}

