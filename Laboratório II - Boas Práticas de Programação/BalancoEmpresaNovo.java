package pooLab2;

import java.util.HashMap;

public class BalancoEmpresaNovo {
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void registraDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if(divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador)
		}
	}
}
