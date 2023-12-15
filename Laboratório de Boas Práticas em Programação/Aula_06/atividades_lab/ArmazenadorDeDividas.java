package poo.aula06;

public interface ArmazenadorDeDividas {
	public void salva(Divida divida);
	
	public Divida carrega(Documento documentoCredor);
}
