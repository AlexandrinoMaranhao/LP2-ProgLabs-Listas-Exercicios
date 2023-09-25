package atividade1;

public class ComputacaoGraficaTeste {

	public static void main(String[] args) {
		
		Ponto2D pt1 = new Ponto2D(5.0, 5.0);
		Ponto2D pt2 = new Ponto2D(7.0, 7.0);
		Ponto2D pt3 = new Ponto2D();
		
		pt1.clone();
		System.out.println(pt1);
		System.out.println(pt1.clone());
		System.out.println(pt2);
		System.out.println(pt3);
		
		pt2.equals(pt1.clone());
		System.out.println(pt2.equals(pt1.clone()));
	}

}
