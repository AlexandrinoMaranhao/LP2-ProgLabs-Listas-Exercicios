package poo.aula6.atividades;

import java.util.Map;
import java.util.HashMap;

public class BancoDeDados {
	private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();
	
	public BancoDeDados(String endereco, String usuario, String senha) {
		System.out.println("Conectado com sucesso");
	}
	
	public void salva(Divida divida) {
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}
	
	public Divida carrega(Documento documentoCredor) {
		return dividasNoBanco.get(documentoCredor);
	}
	
	public void desconecta() {
		System.out.println("Desconectado com sucesso");
	}
}
