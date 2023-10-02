package poo.interfacepregao;

import java.util.ArrayList;
//import java.util.Iterator;

import poo.gestaodelotes.Pessoa;
import poo.gestaodelotes.Lance;
import poo.gestaodelotes.Lote;

public class Leilao {
	private TerminalDeLeiloes meuTerminal;
	private CadastroLotes cadLotes;
	private ArrayList<Lote> lotes;
	private int numProxLote;
	private boolean statusLeilao;

	public Leilao(TerminalDeLeiloes terminal, CadastroLotes cadL) {
		this.meuTerminal = terminal;
		this.cadLotes = cadL;
		this.lotes = new ArrayList<>();
		this.numProxLote = 1;
		this.statusLeilao = true;
	}

	public boolean getStatusLeilao() {
		return this.statusLeilao;
	}

	public void adicionaLote(String descricao) {
		this.lotes.add(new Lote(this.numProxLote, descricao));
	}

	public Lote removeLote(int numero) {
		this.getLote(numero);
		lotes.remove(numero);

		return lotes.set(numero, null);
	}

	public void realizarLance(double valor, Pessoa licitante) {
		this.getLote(numProxLote);
		this.getLote(numProxLote).lancePara(valor, licitante);

	}

	public Lote getLote(int numero) {
		if ((numero >= 1) && (numero < this.numProxLote)) {
			Lote loteSelecionado = this.lotes.get(numero - 1);
			if (loteSelecionado.getNumeroLote() != numero) {
				System.err.println("Erro!");
			}
			return loteSelecionado;
		} else {
			System.out.println("Lote numero " + numero + "não existe ou foi removido");
			return null;
		}
	}

	public void fecharLeilao() {
		this.meuTerminal.setStatusAtual(0);
	}

	public void mostraLotes() {
		for (Lote lote : lotes) {
			lote.mostraDadosLote();
			this.detalhaLote();
		}
	}

	public ArrayList getLotesNaoVendidos() {
		ArrayList<Lote> lotesNaoVendidos = new ArrayList<>();
		for (Lote lote : lotes) {
			if (lote.getMaiorLance() == null) {
				lotesNaoVendidos.add(lote);
			}
		}
		return lotesNaoVendidos;
	}

	public String detalhaLote() {
		if (this.getLote(numProxLote).getMaiorLance() != null) {
			return this.getLote(numProxLote).mostraDadosLote() + this.getLote(numProxLote).getMaiorLance();

		} else {
			return this.getLote(numProxLote).mostraDadosLote() + "\nNenhum lance para esse lote";
		}
	}
}
