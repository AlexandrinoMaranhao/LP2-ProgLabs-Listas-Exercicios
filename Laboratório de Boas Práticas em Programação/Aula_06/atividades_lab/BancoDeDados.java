package poo.aula06;

import java.util.Map;
import java.util.HashMap;

public class BancoDeDados implements ArmazenadorDeDividas{
	private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();

	public BancoDeDados(String endereco, String usuario, String senha) {
		System.out.println("Conectado!");
	}

	public void salva(Divida divida) {
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}

	public Divida carrega(Documento documentoCredor) {
		return dividasNoBanco.get(documentoCredor);
	}

	public void desconecta() {
		System.out.println("Desconectado!");
	}
}
