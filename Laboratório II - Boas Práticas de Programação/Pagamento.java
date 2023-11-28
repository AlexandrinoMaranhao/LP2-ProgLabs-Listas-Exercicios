package atividade1;

import java.util.Calendar;

public class Pagamento {
	private String pagador;
	private String cnpjPagador;
	private double valor;
	private Calendar data;
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
	
	
}
