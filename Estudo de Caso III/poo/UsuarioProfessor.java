package poo.gestaodeusuarios;
import poo.gestaodeacervo.Item;
import poo.gestaodeacervo.Livro;
import poo.gestaodeacervo.Periodico;

public class UsuarioProfessor extends Usuario {
	
	public UsuarioProfessor(String nome) {
		super(nome);
	}

	public boolean isProfessor() {
		return true;
	}
	
	public boolean bloqueiaItem(Item it, int prazo) {
		if(it instanceof Livro || it instanceof Periodico)
		it.bloqueia((Usuario) this, prazo);
		return true;
	}
	
	public boolean desbloqueiaItem(Item it) {
		if(it instanceof Livro || it instanceof Periodico)
		it.desbloqueia((Usuario) this);
		return true;
	}
	
	public int getCotaMaxima() {
		return 5;
	}
	public int getPrazoMaximo() {
		return 14;
	}
	
	public String toString(){
		return "Professor: " + super.getNome();
	}
}

