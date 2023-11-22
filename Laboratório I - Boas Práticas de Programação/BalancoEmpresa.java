package poo.Lab1;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas;

	public BalancoEmpresa() {
		this.dividas = new HashMap<String, Divida>();
	}

	public void registraDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, String nomePagador, String cnpjPagador, double valor) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
	}
}
