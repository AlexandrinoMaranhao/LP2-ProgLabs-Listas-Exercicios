package poo.aula06;

import java.util.ArrayList;
import java.util.Calendar;


public class Pagamentos {
	private double valorPago;
	private ArrayList<Pagamento> pagamentos = new ArrayList<>();

	public void registra(Pagamento pagamento) {
		double valor = pagamento.getValor();
		if (valor < 0) {
			throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		if (valor >= 100) {
			valor -= 8;
		}
		this.valorPago += valor;
		this.pagamentos.add(pagamento);
	}

	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : pagamentos) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosFeitosPor(String documentoPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : pagamentos) {
			if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosMaioresQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : pagamentos) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public double getValorPago() {
		return this.valorPago;
	}
	
	
}
