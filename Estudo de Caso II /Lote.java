package poo.sistemadeleiloes;

public class Lote {
  private int numeroLote;
	private String descricao;
	private Lance maiorLance;

	public Lote(int numLote, String desc) {
		this.numeroLote = numLote;
		this.descricao = desc;
	}

	public int getNumeroLote() {
		return this.numeroLote;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public Lance getMaiorLance() {
		return this.maiorLance;
	}

	public void lancePara(double valor, Pessoa licitante) {

	}
}
