

public class Album extends Item{
	private String artista;
	private int numFaixas;
	
	public Album(String titulo, int ano, double tempReproducao, boolean gotIt, String comentario, String artista, int numFaixas) {
		super(titulo, ano, tempReproducao, gotIt, comentario);
	}
	
	public void imprime() {
		
	}
}
