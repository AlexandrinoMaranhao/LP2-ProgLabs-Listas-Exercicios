package poo.gestaocaixaeletronico;
import poo.gestaocontas.Conta;

public class Caixa {
	private Terminal meuTerminal;
	private CadastroContas bdContas;
	private double fundosCaixa;
	
	public Caixa(Terminal terminal, CadastroContas bd)
	{
		this.meuTerminal = terminal;
		this.bdContas = bd;
	}
	
	public double consultaSaldo(int numeroDaConta, int senha)
	{
		Conta conta;
		conta = this.bdContas.buscaConta(numeroDaConta);
		
		if(conta != null)
		{
		 return conta.verificaSaldo(senha);
		}
		else
		{
		 return -1;
		}
	}
	
	public boolean efetuaSaque(int numeroDaConta, double valor, int senha)
	{
		if(valor < 0 || (valor%50)!= 0 || valor > 500 || valor > this.fundosCaixa)
		{
			return false;
		}
		
		Conta conta = this.bdContas.buscaConta(numeroDaConta);
		
		if(conta == null || !conta.debitaValor(valor, senha, "SAQUE AUTOMÁTICO"))
		{
		 return false;	
		}
		this.liberaCedulas((int)(valor%50));
		this.fundosCaixa -= valor;
		if(this.fundosCaixa < 500)
		{
			this.meuTerminal.setModo(0);
			System.out.println("CAIXA ESTÁ NA RESERVA EMERGENCIAL DE FUNDOS, ESPERE ATÉ A PRÓXIMA RECARGA");
		}
		return true;
	}
	
	public void recarregarCaixa()
	{
		this.fundosCaixa = 2000;
		this.meuTerminal.setModo(1);
	}
	
	private void liberaCedulas(int quantidade)
	{
		while(quantidade-- > 0)
		{
			System.out.println("===/ BANCO NACIONAL DA REPÚBLICA FEDERATIVA DE BRUZUNDANGA /===");
			System.out.println("|\n|\n|\n|\n CÉDULA DE CR$ 50,00 |\n|\n|\n|\n|");
		}
	}
}
