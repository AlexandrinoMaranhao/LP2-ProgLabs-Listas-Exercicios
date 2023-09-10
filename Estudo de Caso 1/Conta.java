package poo.gestaocontas;

public class Conta {
	private int numero;
	private Cliente titular;
	private int senha;
	private double saldo;
	private HistoricoDeLancamentos historico;

	public Conta(int numero, Cliente titular, int senha, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.senha = senha;
		this.saldo = saldo;
		this.historico = new HistoricoDeLancamentos(10);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double verificaSaldo(int senha) {
		if (senhaEhValida(senha)) {
			return this.saldo;
		}
		else
		{
		System.out.println("IMPOSSÍVEL RETORNAR SALDO OU CONTA INEXISTENTE");
		}
		return -1;
	}

	public boolean creditaValor(double valor, String operacaoBancaria) {
		if (valor > 0)
		{
		this.saldo += valor;
		this.historico.insereLancamento(new Lancamento(operacaoBancaria, valor));
		System.out.println("VALOR DE CR$" + valor + " CREDITADO COM SUCESSO");
		return true;
		}
		else
		{
		return false;
		}
	}

	public boolean debitaValor(double valor, int senha, String operacaoBancaria) {
		if (valor > 0 && this.saldo > 0 && senhaEhValida(senha)) {
			this.saldo -= valor;
			this.historico.insereLancamento(new Lancamento(operacaoBancaria, -valor));
			System.out.println("VALOR DE CR$" + valor + " DEBITADO COM SUCESSO");
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean debitaValorTransferencia(double valor,int numeroDaConta, int senha, String operacaoBancaria) {
		if (valor > 0 && this.saldo > 0 && senhaEhValida(senha) && numeroDaConta != 0) {
			this.saldo -= valor;
			this.historico.insereLancamento(new Lancamento(operacaoBancaria, -valor));
			System.out.println("VALOR DE CR$" + valor + " DEBITADO E TRANSFERIDO COM SUCESSO");
			return true;
		}
		else 
		{
			return false;
		}
	}

	private boolean senhaEhValida(int senha){
		return this.senha == senha;
	}

	public String toString() {
		return "++ Conta Banco Estadual do Maranhão e Grão-Pará ++ \nNumero da Conta: " + numero + titular + "\nSaldo da Conta: " + saldo;
			//"\nHistorico da Conta: " + historico;
	}
	

}
