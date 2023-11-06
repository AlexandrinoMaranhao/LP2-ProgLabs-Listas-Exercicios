package poo.controlebiblioteca;

import java.util.Date;
import java.util.Scanner;
import poo.gestaodeacervo.*;
import poo.gestaodeusuarios.*;

public class TerminalBiblioteca {
	private Controle meuControle;
	private Administrador meuAdmin;
	private int modoAtual;

	public TerminalBiblioteca() {
		this.meuControle = new Controle(this);
	}

	// MODO 1 -> ADMIN MODE ; MODO 2 -> ATENDIMENTO MODE (DENTRO ESTÃO OS 3 TIPOS DE
	// USUÁRIOS)
	public void iniciaOperacao() {
		int opcao;
		int modo;
		int menu;

		do {
			System.out.println("\nInsira aqui em qual modo deseja acessar o sistema: ");
			System.out.println("1)Modo Administrador");
			System.out.println("2)Modo Atendimento");
			System.out.println("3)Sair ");
			menu = getInt("ESCOLHA MODO");
			limpaConsole();
			modo = menu;
			this.setModoAtual(modo);

			if (getModoAtual() == 1) {
				opcao = getOpcao();
				switch (opcao) {
				case 1:
					meuControle.buscaItem(getString("TITULO"));
					break;
				case 2:
					meuControle.buscaUsuario(getString("NOME"));
					break;
				case 3:
					meuControle.adicionaItem(getString("TITULO"), getString("TIPO"));
					break;
				case 4:
					meuControle.adicionaUsuario(getString("NOME"), getString("NIVEL"));
					break;
				case 5:
					meuControle.removeItem(getString("TITULO"), getString("TIPO"));
					break;
				case 6:
					meuControle.removeUsuario(getString("NOME"), getString("NIVEL"));
					break;
				case 11:
					break;
				}
			}
			if (getModoAtual() == 2) {
				//int nivelusuario = getInt("NÍVEL USUÁRIO");
				//switch (nivelusuario) {
				//case 1:
					opcao = this.getOpcao();
					switch (opcao) {
					case 7:
						 meuControle.realizaEmprestimo(getString("NOME"), getString("TITULO"), getInt("PRAZO"));
						break;
					case 8:
						 meuControle.realizaDevolucao(getString("NOME"), getString("TITULO"));
						break;
					case 11:
						break;
					}
					//break;
				//case 2:
					opcao = this.getOpcao();
					switch (opcao) {
					case 7:
						 meuControle.realizaEmprestimo(getString("NOME"), getString("TITULO"), getInt("PRAZO"));
						break;
					case 8:
						 meuControle.realizaDevolucao(getString("NOME"), getString("TITULO"));
						break;
					case 9:
						 meuControle.realizaRenovacao(getString("NOME"), getDate("DATA"));
						break;
					case 11:
						break;
					}
					//break;
				//case 3:
					opcao = this.getOpcao();
					switch (opcao) {
					case 7:
						 meuControle.realizaEmprestimo(getString("NOME"), getString("TITULO"), getInt("PRAZO"));
						break;
					case 8:
						 meuControle.realizaDevolucao(getString("NOME"), getString("TITULO"));
						break;
					case 9:
						 meuControle.realizaBloqueio(getString("NOME"), getString("TITULO"), getInt("PRAZO"));
						break;
					case 10:
						 meuControle.realizaDesbloqueio(this.getString("NOME"), this.getString("TITULO"));
						break;
					case 11:
						break;
					}
				}	
			//}
		} while (modo != 3);
	}

	public void setModoAtual(int modo) {
		if (modo == 1 || modo == 2) {
			this.modoAtual = modo;
		}
	}

	public int getModoAtual() {
		return this.modoAtual;
	}

	private int getOpcao() {
		int opcao;
		do {
			this.getModoAtual();
			if (this.modoAtual == 1) {
				opcao = getInt("\n== MENU DO ADMINISTRADOR DO SISTEMA =="
						+ "\n1)Busca Item \n2)Busca Usuario \n3)Adiciona Item \n4)Adiciona Usuario"
						+ "\n5)Remove Item \n6)Remove Usuario");
			} else {
				// Níveis de usuário dando match com os níveis de privilégio para dvds
				int nivelusuario = getInt("NÍVEL USUÁRIO");
				if (nivelusuario == 1) {
					opcao = getInt(
							"\n== MENU ATENDIMENTO AO USUÁRIO EXTERNO ==" + "\n7) Empresta Item \n8)Devolve Item");
				} else if (nivelusuario == 2) {
					opcao = getInt("\n== MENU ATENDIMENTO AO USUÁRIO ALUNO =="
							+ "7)Empresta Item \n8)Devolve Item \n9)Renova Cadastro");
				} else {
					opcao = getInt("\n== MENU ATENDIMENTO AO USUÁRIO PROFESSOR =="
							+ "\n7)Empresta Item \n8)Devolve Item \n9)Bloqueia Item" + "\n10)Desbloqueia Item");
				}
			}
		} while (opcao == 0);
		return opcao;
	}

	public final static void limpaConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {

		}
	}

	private int getInt(String numero) {
		Scanner r = new Scanner(System.in);
		System.out.println("Entre com " + numero);

		if (r.hasNextInt()) {
			return r.nextInt();
		} else {
			String st = r.next();
			System.out.println("ERRO NA LEITURA DE DADOS");
			return 0;
		}

	}

	private String getString(String info) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com " + info);

		if (s.hasNextLine()) {
			String entrada = s.nextLine();
			return entrada;
		}
		return null;
	}
	
	private Date getDate(String data) {
		Scanner d = new Scanner(System.in);
		System.out.println("Entre com " + data);

		if (d.hasNextLine()) {
			Date novaData = new Date();
			return novaData;
		}
		return null;
	}

	/* Era para ser uma maneira simplificada de organizar os menus,
	 *  Não implementada por motivos de tempo
	 * private void administradorMenu() {} private void atendimentoMenu() {}
	 */
}