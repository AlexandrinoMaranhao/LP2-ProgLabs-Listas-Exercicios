package poo.outrogestaocontas;

public class ContaCorrente extends Conta implements Tributavel {
	//private double limite;
	
	
	public ContaCorrente(int numeroConta, int numeroCartao, Cliente cliente, int senha, double saldo) {
		super(numeroConta, numeroCartao, cliente, senha, saldo);
		// TODO Auto-generated constructor stub
	}
	

	public double calculaTributos() {
		return super.verificaSaldo(getSenha()) * 0.01;
	}
}
