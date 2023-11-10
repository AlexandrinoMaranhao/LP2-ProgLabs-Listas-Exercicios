package comparing2;

import java.util.Collection;
import java.util.LinkedList;


public class TestaPerformance2 {

	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		Collection<Integer> teste = new LinkedList<>();
		
		double inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 30000; i++) {
			teste.add(0, i)
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio)/1000.0;
		System.out.println("Tempo Gasto: " + tempo);
		
	}

}
