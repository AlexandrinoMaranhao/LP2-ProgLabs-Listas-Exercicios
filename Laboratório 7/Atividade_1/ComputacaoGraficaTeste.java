package atividade1;

public class ComputacaoGraficaTeste {

	public static void main(String[] args) {
		
		Ponto2D pt1 = new Ponto2D(5.0, 5.0);
		Ponto2D pt2 = new Ponto2D(7.0, 7.0);
		Ponto2D pt3 = new Ponto2D();
		Ponto3D pt4 = new Ponto3D (1.0, 1.0, 1.0);
		Pixel px = new Pixel(4.0, 4.0, 55);
		 
		pt1.desloca(4.0, 5.0);
		pt2.desloca(5.0, 5.0, 5.0);
		px.deslocaPixel(5.0, 5.0);
		px.mudaCor(65);
		System.out.println(px);
		
		pt1.clone();
		System.out.println(pt1);
		System.out.println(pt1.clone());
		System.out.println(pt2);
		System.out.println(pt3);
		System.out.println(pt4);
		
		pt2.equals(pt1.clone());
		System.out.println(pt2.equals(pt1.clone()));
	}

}
