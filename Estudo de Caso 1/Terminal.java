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
					System.out.println("SALDO ATUAL: CR$" + saldo);
				} else {
					System.out.println("SENHA OU CONTA INVÁLIDA, IMPOSSÍVEL ACESSAR SALDO");
				}
			case 2:
				boolean b = this.meuCaixa.efetuaSaque(getInt("NÚMERO DA CONTA"), (double) getInt("VALOR"), getInt("SENHA"));
				if (b == true) {
					System.out.println("RETIRE AS CÉDULAS DE DINHEIRO");
				} else {
					System.out.println("PEDIDO DE SAQUE RECUSADO, TENTE NOVAMENTE MAIS TARDE");
				}
				break;
			case 3:
				boolean c = this.meuCaixa.depositaDinheiro(getInt("NÚMERO DA CONTA"), (double) getInt("VALOR"));
				if (c == true)  {
					System.out.println("DEPÓSITO DE DINHEIRO EM ESPÉCIE FEITO COM SUCESSO");
				} else  {
					System.out.println("PEDIDO DE DEPÓSITO EM ESPÉCIE RECUSADO, TENTE NOVAMENTE OU DIRIJA-SE À AGÊNCIA MAIS PRÓXIMA");
				}
				break;
			case 4:
				boolean d = this.meuCaixa.depositaCheque(getInt("NÚMERO DA CONTA"), (double) getInt("VALOR"));
				if (d == true)  {
					System.out.println("DEPÓSITO DE CHEQUE REALIZADO COM SUCESSO");
				} else  {
					System.out.println("PEDIDO DE DEPÓSITO EM CHEQUE RECUSADO, VERIFIQUE SE NÃO É UM CHEQUE SEM FUNDO E TENTE NOVAMENTE MAIS TARDE");
				}
				break;
			case 5:
				boolean e = this.meuCaixa.realizaTransferencia(getInt("NÚMERO DA CONTA DE ORIGEM") + getInt("NÚMERO DA CONTA DE DESTINO"), getInt("SENHA DA CONTA DE ORIGEM"),(double)getInt("VALOR") );
				if (e === true)  {
					System.out.println("TRANSFERÊNCIA BANCÁRIA REALIZADA COM SUCESSO");
				} else  {
					System.out.println("TRANSFERÊNCIA RECUSADA, TENTE NOVAMENTE MAIS TARDE");
				}
				break;
			case 6:
				boolean f = this.meuCaixa.exibeExtrato(getInt("NÚMERO DA CONTA"));
				if (f == true)  {
					System.out.println("EXTRATO BANCÁRIO EMITIDO DE FORMA AUTOMÁTICA");
				} else  {
					System.out.println("PEDIDO DE EMISSÃO DE EXTRATO RECUSADO, TENTE NOVAMENTE MAIS TARDE");
				}
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
				opcao = getInt("++ MENU DO CLIENTE ++ \nOPCÕES \n1)CONSULTA SALDO \n2)SAQUE BANCÁRIO \n3)DEPÓSITO EM DINHEIRO \n4)DEPÓSITO EM CHEQUE \n5)TRANSFERÊNCIA BANCÁRIA \n6)EMITE EXTRATO BANCÁRIO \n8)SAIR");
				if(opcao != 1 & opcao != 2 & opcao != 3 & opcao != 4 & opcao != 5 & opcao != 6 & opcao != 8) {
					opcao = 0;
				}
			} else {
				opcao = getInt("++ MODO SUPERVISOR ++ \nOPÇÕES \n7)RECARREGAR FUNDOS DO CAIXA \n8)SAIR");
				if(opcao != 7 & opcao != 8) {
					opcao = 0;
				}
			}
		} while (opcao == 0);
		return opcao;
	}

	private int getInt(String string) {
		Scanner r = new Scanner(System.in);
		System.out.println("Entre com " + string);

			if (r.hasNextInt()) {
				return r.nextInt();
			} else {
				String st = r.next();
				System.out.println("ERRO NA LEITURA DE DADOS");
				return 0;
			}
		
		}
	}
}
