package poo.gestaodeusuarios;

import java.util.ArrayList;

import poo.gestaodeacervo.Item;
import poo.gestaodeacervo.Livro;

public class Usuario {
	private String nome;
	protected ArrayList<Item> itensRetirados;

	public Usuario(String nome) {
		this.nome = nome;
		this.itensRetirados = new ArrayList<Item>();
	}

	public String getNome() {
		return this.nome;
	}

	public boolean isProfessor() {
		return false;
	}

	public boolean isAluno() {
		return false;
	}

	public boolean empresta(Item it) {
		if (this.isAptoRetirar()) {
			if (it.empresta(this, getPrazoMaximo())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean devolve(Item it) {
		if (it.devolve(this)) {
			this.itensRetirados.remove(it);
			return true;
		} else {
			return false;
		}
	}

	public boolean isAptoDevolver() {
		if (this.itensRetirados.size() >= this.getCotaMaxima() || this.temPrazoVencido()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAptoRetirar() {
		return (!this.isAptoDevolver());
	}

	public boolean temPrazoVencido() {
		for (Item item : itensRetirados) {
			if (item.isEmAtraso()) {
				item.toString();
				return true;
			}
		}
		return false;
	}

	public int getCotaMaxima() {
		return 2;
	}

	public int getPrazoMaximo() {
		return 4;
	}

	public String toString() {
		return ("Usuário Externo: " + this.getNome());
	}
}