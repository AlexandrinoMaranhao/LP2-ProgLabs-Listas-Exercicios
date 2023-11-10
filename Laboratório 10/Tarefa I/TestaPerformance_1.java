import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		
		double inicio1 = System.currentTimeMillis();
		int total = 30000;
		
		for(int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		double fim1 = System.currentTimeMillis();
		double tempo1 = fim1 - inicio1;
		System.out.println("Tempo gasto: " + tempo1);
		//
		double inicio2 = System.currentTimeMillis();
		
		for(int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		double fim2 = System.currentTimeMillis();
		double tempo2 = fim2 - inicio2;
		System.out.println("Tempo gasto: " + tempo2);
	}

}
