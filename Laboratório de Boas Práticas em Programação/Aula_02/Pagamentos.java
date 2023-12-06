package poo.aula2;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamentos extends ArrayList<Pagamento>{ //will be changed later
	private double valorPago;
	
	public void registra(Pagamento pagamento) {
		double valor = pagamento.getValor();
		if (valor < 0) {
		throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		if (valor >= 100) {
		valor = valor - 8;
		}
		this.valorPago += valor;
		this.add(pagamento);
	}
	
	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this/*this.pagamentos*/) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosMaioresQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this /*this.pagamentos*/) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosFeitosPor(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this /*this.pagamentos*/) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public double getValorPago() {
		return valorPago;
	}
}
