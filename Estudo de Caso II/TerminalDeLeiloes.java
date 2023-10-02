package poo.interfacepregao;

import java.util.Scanner;
import poo.gestaodelotes.*;

public class TerminalDeLeiloes {
	private Leilao meuLeilao;
	private int statusAtual;

	public TerminalDeLeiloes(CadastroLotes bd) {
		this.meuLeilao = new Leilao(this, bd);
	}

	public void iniciaOperacao() {
		int opcao;
		opcao = this.getOpcao();
		while (opcao != 7)
		{
			switch(opcao) 
			{
				case 1: this.meuLeilao.adicionaLote("  ");
					break;
				case 2: this.meuLeilao.removeLote(getInt("NUMERO DO LOTE"));
					break;
				case 3: this.meuLeilao.realizarLance((double)getInt("VALOR DO LANCE"), );
					break;
				case 4: this.meuLeilao.fecharLeilao();
					break;
				case 5: this.meuLeilao.mostraLotes();
					break;
				case 6: this.meuLeilao.getLotesNaoVendidos();
					break;
				case 7:
					break;
			}
			opcao = getOpcao();
		}
	}

	public void setStatusAtual(int modo) {
		if (modo == 1 && meuLeilao.getStatusLeilao() == true) {
			this.statusAtual = modo;
		} else {
			this.statusAtual = 0;
		}
	}

	private int getOpcao() {
		int opcao;
		do {
			if (this.statusAtual == 1) {
				opcao = getInt(
						"\n++ MENU DO PREGÃO RFD 20XX ++ \n++ PREGÃO ABERTO ATÉ ÀS 23H59MIN DE HOJE++ \nOPCÕES \n1)ADICIONAR LOTE \n2)REMOVER LOTE \n3)DAR LANCE \n4)ENCERRAR LEILÃO \n5)MOSTRAR LOTES \n7)SAIR");
				if (opcao != 1 & opcao != 2 & opcao != 3 & opcao != 4 & opcao != 5 & opcao != 6 & opcao != 7) {
					opcao = 0;
				}
			} else {
				opcao = getInt(
						"\n++ MENU DO PREGÃO RFD 20XX ++ \n++ PREGÃO ENCERRADO++ \nOPÇÕES \n5)MOSTRAR TODOS OS LOTES \n6)MOSTRAR LOTES NÃO VENDIDOS \n7)SAIR");
				if (opcao != 5 & opcao != 6 & opcao != 7) {
					opcao = 0;
				}
			}
		} while (opcao == 0);
		return opcao;
	}

	private int getInt(String string) {
		Scanner r = new Scanner(System.in);
		System.out.println("Entrada de: " + string);

		if (r.hasNextInt()) {
			return r.nextInt();
		} else {
			String st = r.next();
			System.out.println("ERRO NA LEITURA DE DADOS");
			return 0;
		}
	}

}
