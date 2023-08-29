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
