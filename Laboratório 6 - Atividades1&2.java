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


/*public void setCartao(Cartao cartao) {
	this.cartao = cartao;
}*/

public void alteraCartao(int numCart, PessoaFisica titular) {
	this.cartao = new Cartao(numCart, titular);
}


public String toString() {
	return "++ Conta Banco Limão Brothers ++ \nNumero = " + numero + cartao + "\nSaldo = " + saldo;
}
}


package atividade1;

public class PessoaFisica 
{
 private String titular;
 private String cpf;
 
 public PessoaFisica(String nome, String cpf)
 {
	 this.titular = nome;
	 this.cpf = cpf;
 }
public String getTitular() {
	return titular;
}
public String getCpf() {
	return cpf;
}

public void setTitular(String titular) {
	this.titular = titular;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String toString() {
	return "\nTitular = " + titular + "\nCPF = " + cpf;
}

}

package atividade1;

public class Cartao 
{
 private int numeroCartao;
 private PessoaFisica titular;
 
 public Cartao(int numCart, PessoaFisica titular)
 {
	 this.numeroCartao = numCart;
	 this.titular = titular;
 }
public int getNumeroCartao() {
	return numeroCartao;
}
public PessoaFisica getTitular() {
	return titular;
}
 
public void setTitular(PessoaFisica titular) {
	this.titular = titular;
}

public String toString() {
	return "\nNumero do Cartao = " + numeroCartao + titular;
}


 
}

package atividade1;

public class ContaTeste {

	public static void main(String[] args) 
	{
	 PessoaFisica pf1 = new PessoaFisica("Joaquim", "03944565453-9");
	 Cartao ct1 = new Cartao(134567, pf1);
	 Conta c1 = new Conta(1, ct1, 3443, 500);
	 
	 c1.creditaSaldo(550);
	 c1.debitaSaldo(50);
	 c1.verificaSaldo(3443);
	 c1.alteraCartao(134568, pf1);
		
	 System.out.println(c1.getCartao());
	 System.out.println(c1);
	}

}
