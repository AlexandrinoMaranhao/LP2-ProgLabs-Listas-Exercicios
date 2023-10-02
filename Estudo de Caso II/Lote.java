package poo.gestaodelotes;

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

	public void setMaiorLance(Lance maiorLance) {
		this.maiorLance = maiorLance;
	}

	public boolean verificaLance(Lance lance) {
		if ((maiorLance == null) || (lance.getValorLance() > maiorLance.getValorLance())) {
			maiorLance = lance;
			return true;
		} else {
			return false;
		}
	}

	public void lancePara(double valor, Pessoa licitante) {
		if (verificaLance(maiorLance) == true) {
			this.setMaiorLance(new Lance(valor, licitante));
		}
	}

	public String mostraDadosLote() {
		return "\nLote: " + this.getNumeroLote() + "\nDescrição: (" + this.getDescricao() + ")"
				+ "\nAtualmente tem um lance mínimo de: " + this.maiorLance.getValorLance()
				+ "\nO licitante com maior oferta" + this.maiorLance.getLicitante();
	}

}
