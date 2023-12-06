package poo.aula2;

import java.util.ArrayList;
import java.util.Calendar;


public class Divida {
	private double total;
	private double valorPago;
	private String credor;
	private Cnpj cnpjCredor = new Cnpj();
	//private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private Pagamentos pagamentos = new Pagamentos();
	
	public Cnpj getCnpjCredor() {
		return this.cnpjCredor;
	}
	
	public double valorAPagar() {
		return this.total - this.valorPago;
	}
	
	public Pagamentos getPagamentos() {
		return this.pagamentos;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.credor = credor;

	}
	public void setTotal(double total) {
		this.total = total;
	}
}
