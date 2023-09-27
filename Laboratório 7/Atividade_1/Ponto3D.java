package atividade1;

public class Ponto3D extends Ponto2D {
		private double eixoZ;
		
		public Ponto3D(double eixoX, double eixoY, double eixoZ) {
			super(eixoX, eixoY);
			this.eixoZ = eixoZ;
		}
		
		public Ponto3D() {
			this(0.0, 0.0, 0.0);
		}
		
		public double getEixoZ() {
			return this.eixoZ;
		}
		
		public Ponto3D(Ponto3D p){
			this(p.getEixoX(), p.getEixoY(), p.getEixoZ());
		}
		
		public void desloca(double dx, double dy, double dz){
			super.desloca(dx, dy);
			if(dz != 0.0) {
				this.eixoZ += dz;
			}
		}
		
		public Ponto3D somaPonto(double dx, double dy, double dz) {
		    return new Ponto3D(super.getEixoX() + dx, super.getEixoY() + dy, this.eixoZ + dz);
		}

	'	public String toString() {
			return "Coordenadas do Ponto de Três Dimensões: " + "(" + this.eixoX + ", " + this.eixoY + ", " + this.eixoZ + ")";
			
		}
		
}
