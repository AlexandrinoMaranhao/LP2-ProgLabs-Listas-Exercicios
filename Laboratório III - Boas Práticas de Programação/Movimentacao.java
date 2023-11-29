package poo.Lab3;

import java.util.Calendar;

public class Movimentacao {
	private double valor;
	private Conta conta;
	private Calendar data;
	
	public Movimentacao(double valor, Conta conta, Calendar data) {
		this.valor = valor;
		this.conta = conta;
		this.data = data;
	}

	public double getEncargos() {
		return valor * 0.01;
	}

	//GETTERS E SETTERS
	public double getValor() {
		return valor;
	}

	public Conta getConta() {
		return conta;
	}

	public Calendar getData() {
		return data;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
	
}
