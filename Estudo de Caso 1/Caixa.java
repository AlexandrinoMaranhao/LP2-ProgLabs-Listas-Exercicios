package poo.gestaocaixaeletronico;
import poo.gestaocontas.Conta;
import poo.gestaocontas.HistoricoDeLancamentos;
import poo.gestaocontas.Lancamento;

public class Caixa {
	private Terminal meuTerminal;
	private CadastroContas bdContas;
	private double fundosCaixa = 2000;

	public Caixa(Terminal terminal, CadastroContas bd) {
		this.meuTerminal = terminal;
		this.bdContas = bd;
	}

	public double consultaSaldo(int numeroDaConta, int senha) {
		Conta conta;
		conta = this.bdContas.buscaConta(numeroDaConta);

		if (conta != null) {
			return conta.verificaSaldo(senha);
		} else {
			return -1;
		}
	}

	public boolean efetuaSaque(int numeroDaConta, double valor, int senha) {
		if (valor < 0 || (valor % 50) != 0 || valor > 500 || valor > this.fundosCaixa) {
			return false;
		}

		Conta conta = this.bdContas.buscaConta(numeroDaConta);

		if (conta == null || !conta.debitaValor(valor, numeroDaConta, senha, " SAQUE AUTOMÁTICO")) {
			return false;
		}
		this.liberaCedulas((int) (valor/50));
		this.fundosCaixa -= valor;
		if (this.fundosCaixa < 500) {
			this.meuTerminal.setModo(0);
			System.out.println("O CAIXA ELETRÔNICO ESTÁ NA RESERVA EMERGENCIAL DE FUNDOS, ESPERE ATÉ A PRÓXIMA RECARGA");
		}
		return true;
	}
	
	public boolean depositaDinheiro(int numeroDaConta, double valor) {
		Conta conta;
		conta = this.bdContas.buscaConta(numeroDaConta);

		if (conta == null || !conta.creditaValor(valor, numeroDaConta, " DEPÓSITO EM ESPÉCIE")) {
			return false;
		}
		return true;
	}
	
	public boolean depositaCheque(int numeroDaConta, double valor)  {
		Conta conta;
		conta = this.bdContas.buscaConta(numeroDaConta);

		if (conta == null || !conta.creditaValor(valor, numeroDaConta, " DEPÓSITO EM CHEQUE")) {
			return false;
		}
		return true;
	}
	
	public boolean realizaTransferencia(int numeroDaConta, int senha, int numeroDaContaD, double valor) {
		Conta contaOrigem = this.bdContas.buscaConta(numeroDaConta);
		Conta contaDestino = this.bdContas.buscaConta(numeroDaContaD);
		if(contaOrigem == null || contaDestino == null || this.consultaSaldo(numeroDaConta, numeroDaContaD) != -1) {
			return false;
		}
		else
			contaOrigem.debitaValorTransferencia(valor, numeroDaConta, senha,  " DÉBITO DE TRANSFERÊNCIA");
			contaDestino.creditaValor(valor, numeroDaContaD, " CRÉDITO DE TRANSFERÊNCIA");
			return true;
	}
	
	public boolean exibeExtrato(int numeroDaConta, int senha) {
		Conta conta = this.bdContas.buscaConta(numeroDaConta);
		if(conta == null) {
			return false;
		}
		
		else {
		System.out.println("ESSE É O HISTÓRICO DAS ÚLTIMAS 10 OPERAÇÕES REALIZADAS NA CONTA DE NÚMERO " + numeroDaConta);
		HistoricoDeLancamentos historico = new HistoricoDeLancamentos(10);
		historico.geraHistoricoDeLancamentos();
		return true;
		}
	}
	
	public void recarregarCaixa() {
		this.fundosCaixa = 2000;
		this.meuTerminal.setModo(1);
	}

	private void liberaCedulas(int quantidade) {
		while (quantidade-- > 0) {
			System.out.println("===/ BANCO NACIONAL DA REPÚBLICA FEDERATIVA DE BRUZUNDANGA /===");
			System.out.println("[|	 CÉDULA DE CR$50,00	|]");
		}
	}
}

