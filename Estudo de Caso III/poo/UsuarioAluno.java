package poo.gestaodeusuarios;

import java.util.Date;

public class UsuarioAluno extends Usuario {
	private Date dataExpiracao;

	public UsuarioAluno(String nome, Date dataExp) {
		super(nome);
		this.dataExpiracao = dataExp;
	}

	public boolean isAluno() {
		return true;
	}

	public void renovaCadastro(Date data) {
		this.dataExpiracao = data;
	}

	public boolean isRegular() {
		Date hoje = new Date();
		return dataExpiracao.after(hoje);
	}

	public boolean isAptoRenovar() {
		return !isRegular();
	}

	public boolean isAptoDevolver() {
		if (this.itensRetirados.size() >= this.getCotaMaxima() || this.temPrazoVencido() || this.isAptoRenovar()) {
			return true;
		} else {
			return false;
		}
	}

	public int getCotaMaxima() {
		if (isRegular()) {
			return 3;
		} else {
			return super.getCotaMaxima();
		}
	}

	public int getPrazoMaximo() {
		if (isRegular()) {
			return 7;
		} else {
			return super.getPrazoMaximo();
		}
	}

	public String toString() {
		return "Aluno: " + getNome();
	}
}