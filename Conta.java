package atividade1;

public class Conta 
{
 private int numero;
 private Cartao cartao;
 private int senha;
 private double saldo;

 
public Conta(int numero, Cartao cartao, int senha, double saldo) 
{
	this.numero = numero;
	this.cartao = cartao;
	this.senha = senha;
	this.saldo = saldo;
}


public int getNumero() {
	return numero;
}

public int getSenha() {
	return senha;
}

public double getSaldo() {
	return saldo;
}

public void verificaSaldo(int senha)
{
 if (this.senha == senha)
	 System.out.println("== Seu saldo no banco Limão Brothers: ==\n" + this.saldo);
 else
	 System.out.println("\nSenha inválida, tente novamente!");
 
}

public void creditaSaldo(double valor)
{
	if(valor >= 0)
	{
		this.saldo += valor;
		System.out.println("\nValor creditado com sucesso");
	}
	else
	{
		System.out.println("\nImpossível creditar valor, tente novamente!");
	}
}
public void debitaSaldo(double valor)
{
	if(valor > 0)
	{
		this.saldo -= valor;
		System.out.println("\nValor debitado com sucesso");
	}
	else
	{
		System.out.println("\nImpossível debitar valor, tente novamente!");
	}		
}

public Cartao getCartao() {
	return cartao;
}


public void setCartao(Cartao cartao) {
	this.cartao = cartao;
}


public String toString() {
	return "++ Conta Banco Limão Brothers ++ \nNumero = " + numero + cartao + "\nSaldo = " + saldo;
}
}

