package poo.sistemadeleiloes;

public class Lance {
    private double valorLance;
	  private Pessoa licitante;
	
	  public Lance(double lance, Pessoa licitante) {
		this.valorLance = lance;
		this.licitante = licitante;
	  }

	  public double getValorLance() {
		return valorLance;
  	}

	  public Pessoa getLicitante() {
		return licitante;
  	}
}
