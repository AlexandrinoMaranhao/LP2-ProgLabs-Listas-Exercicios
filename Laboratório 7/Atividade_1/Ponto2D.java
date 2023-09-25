package atividade1
import java.lang.reflect.Constructor;

public class Ponto2D {
  protected double eixoX;
  protected double eixoY;

	public Ponto2D(double eixoX, double eixoY) {
		this.eixoX = eixoX;
		this.eixoY = eixoY;
	}

	public Ponto2D() {
		this(0.0, 0.0);
	}

	public Ponto2D(Ponto2D p) {
		this(p.getEixoX(), p.getEixoY());
	}

	public double getEixoX() {
		return this.eixoX;
	}

	public double getEixoY() {
		return this.eixoY;
	}

	public void desloca(double dx, double dy) {
		if (dx != 0.0) {
			this.eixoX += dx;
		}
		if (dx != 0.0) {
			this.eixoY += dy;
		}
	}

	public Ponto2D somaPonto(double dx, double dy) {
		return new Ponto2D(this.eixoX + dx, this.eixoY + dy);
	}

	public Ponto2D somaPonto(Ponto2D p) {
		return new Ponto2D(this.eixoX + p.getEixoX(), this.eixoY + p.getEixoY());
	}

	public Ponto2D clone(){
		return new Ponto2D(this);
	}
	
	public String toString() {
		return "Coordenadas do Ponto de Duas Dimensões: " + "(" + this.eixoX + " , " + this.eixoY + ")";
		
	}
	
	
	public boolean equals(Object p) {
		if (p instanceof Ponto2D) {
			Ponto2D ponto = (Ponto2D) p;
			return this.eixoX == (ponto.getEixoX()) && this.eixoY == (ponto.getEixoY());
			
		} else
			return false;
		
	}
}
