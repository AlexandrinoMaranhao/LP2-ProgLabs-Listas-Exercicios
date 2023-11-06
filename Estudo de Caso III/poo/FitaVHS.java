package poo.gestaodeacervo;

public class FitaVHS extends Item{

	public FitaVHS(String titulo) {
		super(titulo);
	}
	
	public int periodoEmprestimo() {
		return 21;
	}
}
