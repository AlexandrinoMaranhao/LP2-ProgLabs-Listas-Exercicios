package poo.gestaodeacervo;

import poo.gestaodeusuarios.Usuario;

public class Dvd extends Item {
	private int nivelPrivilegio;

	public Dvd(String titulo, int nivel) {
		super(titulo);
		this.nivelPrivilegio = nivel;
	}

	public int getNivelPrivilegio() {
		return this.nivelPrivilegio;
	}

	public void setNivelPrivilegio(int nivel) {
		this.nivelPrivilegio = nivel;
	}

	public boolean empresta(Usuario u, int prazo) {
		if (this.getNivelPrivilegio() == 1 || (this.getNivelPrivilegio() == 2 && (u.isAluno() || u.isProfessor()))
				|| (this.getNivelPrivilegio() == 3 && u.isProfessor())) {
			prazo = this.periodoEmprestimo();
			return true;
		} else {
			return false;
		}
	}

	public boolean devolve(Usuario u) {
		if (u == this.retiradoPor) {
			this.retiradoPor = null;
			return true;
		} else {
			return false;
		}
	}

	// DVDs não são bloqueáveis e nem desbloqueáveis
	public boolean bloqueia() {
		return false;
	}

	public boolean desbloqueia() {
		return false;
	}

	private int periodoEmprestimo() {
		return 2;
	}
}