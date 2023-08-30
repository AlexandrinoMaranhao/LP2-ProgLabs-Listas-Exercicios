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
