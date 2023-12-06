package poo.aula2;

import java.util.Calendar;

import poo.aula05.Cnpj;

public class Pagamento {
	private String nomePagador;
	private String cnpjPagador;
	private double valor;
	private Calendar data;
	
	//GETTERS E SETTERS
	public String getNomePagador() {
		return nomePagador;
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
	public void setNomePagador(String nomePagador) {
		this.nomePagador = nomePagador;
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
