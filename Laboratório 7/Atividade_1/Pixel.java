package atividade1;

public class Pixel extends Ponto2D{
	private int valorCor;
	
	public Pixel(double eixoX, double eixoY, int valorCor) {
		
		super(eixoX, eixoY);
		this.valorCor = valorCor%100;
	}
	
	public Pixel() {
		super();
		this.valorCor = 0;
	}
	
	public int getCor(){
		return this.valorCor;
	}
	
	public void mudaCor(int cor) {
		this.valorCor =  cor;
	}
	
	public void deslocaPixel(double dx, double dy) {
		super.desloca(dx, dy);
	}

	public String toString() {
		return "Coordenadas e Valor da cor do Pixel: " + "(" + this.eixoX + ", " + this.eixoY + ", " + ")";
		
	}
}
