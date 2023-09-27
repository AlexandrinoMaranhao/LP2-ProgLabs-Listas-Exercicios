package poo.sistemadeleiloes;

public class Lance {
   	  private double valorLance;
	  private Pessoa licitante;
	
	  public Lance(double valor, Pessoa licitante) {
		this.valorLance = valor;
		this.licitante = licitante;
	  }

	  public double getValorLance() {
		return this.valorLance;
  	}

	  public Pessoa getLicitante() {
		return this.licitante;
  	}
}
