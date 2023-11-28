package atividade1;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	
	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}
	
	public double valorAPagar() {
		return this.total - this.valorPago;
	}
	
	public boolean validaCnpj() {
		return primeiroDigitoVerificadorCnpj() == primeiroDigitoCorretoCnpj() && segundoDigitoVerificadorCnpj() == segundoDigitoCorretoCnpj();
	}
	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data){
		ArrayList<Pagamento> pagamentosFiltrados= new ArrayList<Pagamento>();
		for(Pagamento pagamento : pagamentos) {
			if(pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> pagamentosMaioresQue(double valorMinimo){
		ArrayList<Pagamento> pagamentosFiltrados= new ArrayList<Pagamento>();
		for(Pagamento pagamento : pagamentos) {
			if(pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> pagamentosFeitosPor(String cnpjPagador){
		ArrayList<Pagamento> pagamentosFiltrados= new ArrayList<Pagamento>();
		for(Pagamento pagamento : pagamentos){
			if(pagamento.getCnpjPagador().equals(cnpjPagador)) {
			pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	private void paga(double valor){
		if(valor < 0) {
			throw new IllegalArgumentException("Não se pode pagar com valores negativos");
		}
		if(valor >= 100) {
			valor -= 8;
		}
		this.valorPago += valor;
	}
	
	private int primeiroDigitoVerificadorCnpj() {
		//
		return 0;
	}
	private int segundoDigitoVerificadorCnpj() {
		//
		return 0;
	}
	private int primeiroDigitoCorretoCnpj() {
		//
		return 0;
	}
	private int segundoDigitoCorretoCnpj() {
		//
		return 0;
	}
	//GETTERS E SETTERS
	public double getTotal() {
		return this.total;
	}
	public double getValorPago() {
		return this.valorPago;
	}
	public String getCredor() {
		return this.credor;
	}
	public String getCnpjCredor() {
		return this.cnpjCredor;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}
}
