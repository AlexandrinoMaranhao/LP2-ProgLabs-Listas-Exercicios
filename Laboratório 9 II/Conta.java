package poo.outrogestaocontas;

public class Conta {
	private int numero;
	private Cartao cartao;
	private int senha;
	private double saldo;

	public Conta(int numeroConta, int numeroCartao, Cliente cliente, int senha, double saldo) {
		this.numero = numeroConta;
		this.cartao = new Cartao(numeroCartao, cliente);
		this.senha = senha;
		this.saldo = saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getSenha() {
		return this.senha;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double verificaSaldo(int senha) {
		if (this.senhaEhValida(senha)) {
			//System.out.println("== Seu saldo no banco Limão Brothers: ==\n");
			return saldo;
		} else {
			System.out.println("\nSenha inválida, tente novamente!");
			return -1;
		}

	}

	public void creditaSaldo(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
			System.out.println("\nValor creditado com sucesso");
		} else {
			System.out.println("\nImpossível creditar valor, tente novamente!");
		}
	}

	public void debitaSaldo(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
			System.out.println("\nValor debitado com sucesso");
		} else {
			System.out.println("\nImpossível debitar valor, tente novamente!");
		}
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void alteraCartao(int numCart, Cliente titular) {
		this.cartao = new Cartao(numCart, titular);
	}

	private boolean senhaEhValida(int senha) {
		return this.senha == senha;
	}

	public String toString() {
		return "++ Conta Banco Limão Brothers ++ \nNumero = " + numero + cartao + "\nSaldo = " + saldo;
	}
}
