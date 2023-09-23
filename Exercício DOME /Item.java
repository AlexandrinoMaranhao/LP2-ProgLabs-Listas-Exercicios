package dome
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
	    System.out.println(this.titulo + "\n(" + this.ano + ")" + "\n(" + this.tempReproducao + " min)");

	    if(this.gotIt == true){
		    System.out.println("*");
	    } else {
		    Systme.out.println();
	    }

	    System.out.println("   " + this.comentario);
	}
}
