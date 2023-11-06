package poo.controlebiblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import poo.gestaodeacervo.Livro;
import poo.gestaodeacervo.Periodico;
import poo.gestaodeacervo.Dvd;
import poo.gestaodeacervo.Item;
import poo.gestaodeusuarios.Usuario;
import poo.gestaodeusuarios.UsuarioAluno;
import poo.gestaodeusuarios.UsuarioProfessor;

public class Controle {
	private TerminalBiblioteca meuTerminal;
	private Administrador meuAdmin;
	private ArrayList<Item> itens;
	private ArrayList<Usuario> usuarios;

	public Controle(TerminalBiblioteca terminal) {
		this.meuTerminal = terminal;
		this.itens = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public Item buscaItem(String titulo) {
		for (Item item : itens) {
			if (titulo.equalsIgnoreCase(item.getTitulo())) {
				return item;
			}
		}
		System.out.println("Titulo: " + titulo);
		return null;
	}

	public Usuario buscaUsuario(String nome) {
		for (Usuario usuario : usuarios) {
			if (nome.equalsIgnoreCase(usuario.getNome())) {
				return usuario;
			}
		}
		return null;
	}

	public void adicionaItem(String tituloItem, String tipoItem) {
		Item it;
		it = this.buscaItem(tituloItem);

		if (it == null) {
			if ("DVD".equalsIgnoreCase(tipoItem)) {
				int nivelPrivilegio = getInt("Nível de privilégio para acesso");
				Dvd dvd = new Dvd(tituloItem, nivelPrivilegio);
				itens.add(dvd);
			} else if ("LIVRO".equalsIgnoreCase(tipoItem)) {
				Livro livro = new Livro(tituloItem);
				itens.add(livro);
			} else if ("PERIODICO".equalsIgnoreCase(tipoItem)) {
				Periodico periodico = new Periodico(tituloItem);
				itens.add(periodico);
			} else {
				System.err.println("Tipo de item inválido.");
			}
		} else {
			System.err.println("ITEM " + "JÁ EXISTE");
		}
	}

	public void adicionaUsuario(String nomeUsuario, String nivelUsuario) {
		Usuario u;
		u = this.buscaUsuario(nomeUsuario);
		if (u == null) {
			usuarios.add(u);
		} else {
			System.err.println("USUÁRIO JÁ EXISTE");
		}
	}

	public void removeItem(String tituloItem, String tipoItem) {
		Item it;
		it = this.buscaItem(tituloItem);

		if (it != null) {
			itens.remove(it);
		} else {
			System.err.println("ITEM NÃO EXISTE NO ACERVO");
		}
	}

	public void removeUsuario(String nomeUsuario, String nivelUsuario) {
		Usuario u;
		u = this.buscaUsuario(nomeUsuario);

		if (u != null) {
			usuarios.remove(u);
		} else {
			System.err.println("USUÁRIO NÃO EXISTE");
		}
	}

	public void realizaEmprestimo(String nomeUsuario, String tituloItem, int prazo) {
		Usuario u;
		Item it;
		u = this.buscaUsuario(nomeUsuario);
		it = this.buscaItem(tituloItem);

		if (u != null && u.isAptoRetirar() && it.isDisponivel()) {
			System.out.println("Situação do item antes do empréstimo:");
			exibirEstadoItem(it);
		}
		if (u != null && u.isAptoRetirar() && it.isDisponivel()) {
			if (it instanceof Livro && u.isAptoRetirar()) {
				if (it.empresta(u, prazo)) {
					u.empresta(it);
					System.out.println("Empréstimo de livro realizado com sucesso.");
				} else {
					System.err.println("Item indisponível para empréstimo.");
				}
			} else if (it instanceof Dvd) {
				Dvd dvd = (Dvd) it;
				if (dvd.getNivelPrivilegio() <= getInt("NIVEL DE PRIVILEGIO") && prazo <= 2) {
					if (it.empresta(u, prazo)) {
						u.empresta(it);
						System.out.println("Empréstimo de DVD realizado com sucesso.");
					} else {
						System.err.println("Item indisponível para empréstimo.");
					}
				} else {
					System.err.println("Usuário não tem privilégios para emprestar este DVD.");
				}
			} else if (it instanceof Periodico && u.isProfessor()) {
				if (it.empresta(u, prazo)) {
					u.empresta(it);
					System.out.println("Empréstimo de periódico realizado com sucesso.");
				} else {
					System.err.println("Item indisponível para empréstimo.");
				}
			} else {
				System.err.println("Usuário não tem permissão para emprestar este item.");
			}
		} else {
			System.err.println("Usuário não está apto para realizar o empréstimo.");
		}
		System.out.println("Situação do item após o empréstimo:");
		exibirEstadoItem(it);
	}

	public void realizaDevolucao(String nomeUsuario, String tituloItem) {
		Usuario u;
		Item it;
		u = this.buscaUsuario(nomeUsuario);
		it = this.buscaItem(tituloItem);

		if (it.isEmprestado() || u.temPrazoVencido()) {
			System.out.println("Situação do item antes da devolução:");
			exibirEstadoItem(it);
		}

		if (it.isEmprestado() || u.temPrazoVencido()) {
			if (it.devolve(u)) {
				u.devolve(it);
				System.out.println("Devolução realizada com sucesso.");
			} else {
				System.err.println("Não foi possível realizar a devolução.");
			}
		} else {
			System.err.println("Item não está emprestado para o usuário.");
		}

		System.out.println("Situação do item após a devolução:");
		exibirEstadoItem(it);
	}

	public void realizaRenovacao(String nomeUsuario, Date novaData) {
		Usuario u;
		u = this.buscaUsuario(nomeUsuario);

		if (((UsuarioAluno) u).isAptoRenovar()) {
			if (u instanceof UsuarioAluno) {
				((UsuarioAluno) u).renovaCadastro(novaData);
			}
			System.out.println("Renovação de cadastro realizada com sucesso.");
		} else {
			System.err.println("Usuário não está apto para renovar o cadastro.");
		}
	}

	public void realizaBloqueio(String nomeUsuario, String tituloItem, int prazo) {
		Usuario u;
		Item it;
		u = this.buscaUsuario(nomeUsuario);
		it = this.buscaItem(tituloItem);

		System.out.println("Situação do item antes do bloqueio:");
		exibirEstadoItem(it);

		if (it instanceof Livro && u.isProfessor()) {
			if (it.bloqueia(u, prazo)) {
				System.out.println("Bloqueio de livro realizado com sucesso.");
			} else {
				System.err.println("Item indisponível para bloqueio.");
			}
		} else if (it instanceof Periodico && u.isProfessor()) {
			if (it.bloqueia(u, prazo)) {
				System.out.println("Bloqueio de periódico realizado com sucesso.");
			} else {
				System.err.println("Item indisponível para bloqueio.");
			}
		} else if (it instanceof Dvd) {
			System.err.println("Dvds não podem ser bloqueados.");
		}

		System.out.println("Situação do item após o bloqueio:");
		exibirEstadoItem(it);
	}

	public void realizaDesbloqueio(String nomeUsuario, String tituloItem) {
		Usuario u;
		Item it;
		u = this.buscaUsuario(nomeUsuario);
		it = this.buscaItem(tituloItem);
		
		System.out.println("Situação do item antes do desbloqueio:");
	    exibirEstadoItem(it);
		
		if (it instanceof Livro && u.isProfessor()) {
			if (it.desbloqueia(u)) {
				System.out.println("Desbloqueio de livro realizado com sucesso.");
			} else {
				System.err.println("Item indisponível para desbloqueio.");
			}
		} else if (it instanceof Periodico && u.isProfessor()) {
			if (it.desbloqueia(u)) {
				System.out.println("Desbloqueio de periódico realizado com sucesso.");
			} else
				System.err.println("Item indisponível para desbloqueio.");
		} else if (it instanceof Dvd) {
			System.err.println("Dvds não podem ser desbloqueados.");
		}
		
		System.out.println("Situação do item após o desbloqueio:");
	    exibirEstadoItem(it);
	}

	private int getInt(String nivel) {
		Scanner n = new Scanner(System.in);
		System.out.println("Entre com " + nivel);

		if (n.hasNextInt()) {
			return n.nextInt();
		} else {
			String st = n.next();
			System.out.println("ERRO NA LEITURA DE DADOS");
			return 0;
		}
	}

	private void exibirEstadoItem(Item item) {
		System.out.println("Título: " + item.getTitulo());
		System.out.println("Disponível: " + item.isDisponivel());
		System.out.println("Bloqueado: " + item.isBloqueado());
		System.out.println("Emprestado: " + item.isEmprestado());
		System.out.println("Em Atraso: " + item.isEmAtraso());
	}
}
