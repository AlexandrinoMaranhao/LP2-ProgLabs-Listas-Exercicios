package poo.aula06;

import java.util.Map;
import java.util.HashMap;

public class BalancoEmpresa {
	//private Map<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	private ArmazenadorDeDividas dividas;
	
	public BalancoEmpresa(ArmazenadorDeDividas dividas) {
		this.dividas = dividas;
	}
	
	public void registraDivida(Divida divida) {
		dividas.salva(divida);
	}
	
	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.carrega(documentoCredor);
		if(divida != null) {
			divida.registra(pagamento);
		}
	}
}
