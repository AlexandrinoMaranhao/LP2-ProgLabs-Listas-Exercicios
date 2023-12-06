package poo.aula2;


import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void registraDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.getCnpjCredor().setValor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
		}

	public void pagaDivida(String cnpjCredor, double valor,
		String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setNomePagador(nomePagador);
		pagamento.setValor(valor);
		divida.getPagamentos().registra(pagamento);
		}
	}
}
