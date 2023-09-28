package banco.gestaopessoal;

import java.lang.reflect.Constructor;

public class Funcionario {
	private String nome;
	private double salario;
	private static double valeRefeicaoDiario = 15.0;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nomeNovo) {
		this.nome = nomeNovo;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double valor) {
		this.salario = valor;
	}
	
	public static double reajusteValeRefeicao(double valor) {
		return Funcionario.valeRefeicaoDiario += valor;
	}
	
	public static double getValorValeRefeicao() {
		return Funcionario.valeRefeicaoDiario;
	}
	
	public double calculaBonus() {
		double bonificacao;
		bonificacao = this.salario * 0.10;
		return bonificacao;
	}

	public double somaBonus(){
        calculaBonus();
        getSalario();
        this.salario += calculaBonus();
        return this.salario;
    	} 
	
	public void mostraDados() {
	  	System.out.println("\nNome do Funcionário: " + this.nome + "\nSalário Bruto: " + this.salario + "\nSalário com Bonificação do Cargo: " + somaBonus()+ "\nVale Refeição Diário: " + Funcionario.getValorValeRefeicao());
	}

	
}
