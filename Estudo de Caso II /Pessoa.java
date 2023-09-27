package poo.sistemadeleiloes;

public class Pessoa {
    private String nome;
	
	  public Pessoa(String licitante) {
		this.nome = licitante;
	  }
	
	  public String getNomeLicitante() {
		return this.nome;
	  }

	  public void setNomeLicitante(String novoNome) {
		this.nome = novoNome;
	  }
}
