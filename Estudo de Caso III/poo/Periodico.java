package poo.gestaodeacervo;
import poo.gestaodeusuarios.Usuario;

public class Periodico extends Livro{
	
	
	public Periodico(String titulo){
		super(titulo);
	}
	
	public boolean empresta(Usuario u, int prazo) {
		if (u.isProfessor()){
			return super.empresta(u, periodoEmprestimo());
		} else {
			System.err.println("IMPOSSÍVEL REALIZAR EMPRÉSTIMO DE PERIÓDICO, USUÁRIO NÃO AUTORIZADO");
			return false;
		}
	}
	
	private int periodoEmprestimo(){
		return 7;
	}
}