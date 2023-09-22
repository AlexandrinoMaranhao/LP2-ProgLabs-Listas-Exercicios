
import java.lang.reflect.Constructor;

public class Item {
	private String titulo;
	private int ano;
	private double tempReproducao;
	private boolean gotIt;
	private String comentario;
	
	public Item(String titulo, int ano, double tempReproducao, boolean gotIt, String comentario) {
		this.titulo =  titulo;
		this.ano = ano;
		this.tempReproducao = tempReproducao;
		this.gotIt = gotIt;
		this.comentario = comentario;
	}
	
	
	public void imprime(){
		
	}
}
