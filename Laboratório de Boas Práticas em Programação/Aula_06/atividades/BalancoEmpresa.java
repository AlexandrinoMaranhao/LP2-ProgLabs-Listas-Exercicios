package poo.aula6.atividades;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	
	public void registraDivida(Divida divida) {
		dividas.put(divida.getDocumentoCredor(), divida);
	}
	
	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		
	}
}
