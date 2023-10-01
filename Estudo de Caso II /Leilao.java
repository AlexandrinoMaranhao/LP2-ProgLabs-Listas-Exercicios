package poo.sistemadeleiloes;

import java.util.ArrayList;
import java.util.Iterator;

public class Leilao {
	private ArrayList<Lote> lotes;
	private int numProxLote;

	public Leilao() {
		this.lotes = new ArrayList<>();
		this.numProxLote = 1;
	}

	public void adicionaLote(String descricao) {
		this.lotes.add(new Lote(this.numProxLote, descricao));
	}

	public void mostraLotes() {
		Iterator<Lote> it = this.lotes.iterator();
		while (it.hasNext()) {
			Lote lote = it.next();
			System.out.println(lote.getNumeroLote() + ":" + lote.getDescricao());
			Lance melhorLance = lote.getMaiorLance();

			if (melhorLance != null) {
				System.out.println("   Lance:" + melhorLance.getValorLance());
			} else {
				System.out.println("   (Nenhum lance foi feito)");
			}
		}
	}

	public Lote getLote(int numero) {
		if ((numero >= 1) && (numero < this.numProxLote)) {
			Lote loteSelecionado = this.lotes.get(numero - 1);
			if (loteSelecionado.getNumeroLote() != numero) {
				System.err.println("Erro!");
			}
			return loteSelecionado;
		} else {
			System.out.println("Lote numero " + numero + "não existe");
			return null;
		}
	}
}
