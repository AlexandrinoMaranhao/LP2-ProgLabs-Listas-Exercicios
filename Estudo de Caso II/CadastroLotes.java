package poo.interfacepregao;

import poo.gestaodelotes.Lote;

public class CadastroLotes {
	private Lote[] lotes;
	private int numeroDeLotes;

	public CadastroLotes(int numeroDeLotes) {
		this.lotes = new Lote[numeroDeLotes];
	}

	public boolean adicionaLote(Lote lote) {
		if (this.numeroDeLotes == this.lotes.length || this.buscaLote(lote.getNumeroLote()) != null) {
			return false;
		} else {
			this.lotes[this.numeroDeLotes++] = lote;
			return true;
		}
	}

	public Lote buscaLote(int numero) {
		for (int i = 0; i < this.numeroDeLotes; i++) {
			if (numero == this.lotes[i].getNumeroLote()) {
				return this.lotes[i];
			}
		}
		return null;
	}

	// banco de dados
}
