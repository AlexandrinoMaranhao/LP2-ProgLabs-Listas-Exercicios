package poo.gestaocaixaeletronico;
import java.util.Scanner;

public class Terminal {

	private Caixa meuCaixa;
	private int modoAtual;

	public Terminal(CadastroContas bd) {
		this.meuCaixa = new Caixa(this, bd);
	}

	public void iniciaOperacao() {
		int opcao;

		opcao = this.getOpcao();

		while (opcao != 8) {
			switch (opcao) {
			case 1:
				double saldo = this.meuCaixa.consultaSaldo(getInt("NÚMERO DA CONTA"), getInt("SENHA"));
				if (saldo != -1) {
					System.out.println("SALDO ATUAL: CR$ " + saldo);
				} else {
					System.out.println("SENHA OU CONTA INVÁLIDA, IMPOSSÍVEL ACESSAR SALDO");
				}
			case 2:
				boolean b = this.meuCaixa.efetuaSaque(getInt("NÚMERO DA CONTA"), (double) getInt("VALOR"),
						getInt("SENHA"));
				if (b) {
					System.out.println("RETIRE AS CÉDULAS DE DINHEIRO");
				} else {
					System.out.println("PEDIDO DE SAQUE RECUSADO, TENTE NOVAMENTE MAIS TARDE");
				}
				break;
			case 3:
				this.meuCaixa.depositaDinheiro();
				break;
			case 4:
				this.meuCaixa.depositaCheque();
				break;
			case 5:
				this.meuCaixa.realizaTransferencia(0, 0);
				break;
			case 6:
				this.meuCaixa.exibeExtrato();
				break;
			case 7:
				this.meuCaixa.recarregarCaixa();
				break;
			case 8:
				break;
			}
			opcao = getOpcao();
		}
	}

	public void setModo(int modo) {
		if (modo == 0 || modo == 1) {
			this.modoAtual = modo;
		}
	}

	private int getOpcao() {
		int opcao;
		do {
			if (this.modoAtual == 1) {
				opcao = getInt("++ MENU DO CLIENTE ++ \nOPCÕES \n1) CONSULTA SALDO \n2) SAQUE BANCÁRIO \n3)DEPÓSITO EM DINHEIRO \n4)DEPÓSITO EM CHEQUE \n5)TRANSFERÊNCIA BANCÁRIA \n6)EMITE EXTRATO BANCÁRIO \n8) SAIR");
				if (opcao != 1 || opcao != 2 || opcao != 7) {
					opcao = 0;
				}
			} else {
				opcao = getInt("++ MODO SUPERVISOR ++ \nOPÇÕES \n7) RECARREGAR FUNDOS DO CAIXA \n8) SAIR");
				if (opcao != 3 || opcao != 4) {
					opcao = 0;
				}
			}
		} while (opcao == 0);
		return opcao;
	}

	private int getInt(String string) {
		Scanner r = new Scanner(System.in);
		System.out.println("Entre com " + string);

		try {
			if (r.hasNextInt()) {
				return r.nextInt();
			} else {
				String st = r.next();
				System.out.println("ERRO NA LEITURA DE DADOS");
				return 0;
			}
		} finally {
			r.close();

		}
	}
}
