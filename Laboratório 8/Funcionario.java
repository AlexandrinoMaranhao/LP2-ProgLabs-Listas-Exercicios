package banco.gestaopessoal;

import java.lang.reflect.Constructor;

public class Funcionario {
	private String nome;
	private double salario;
	private static double valeRefeicaoDiario = 15.0;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salarioBase = salarioBase;

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
	
	public static void reajusteValeRefeicao() {
		Funcionario.valeRefeicaoDiario += 15.0;
	}
	
	public static double getValorValeRefeicao() {
		return Funcionario.valeRefeicaoDiario;
	}

	public double calculaBonus() {
		double bonificacao;
		bonificacao = this.salario * 0.10;
		return bonificacao;
	}
	
	public void mostraDados() {
		System.out.println("Nome do Funcionário: " + this.nome + "\nSalário: " + this.salario + "\nBonificação do Cargo: " + calculaBonus());
	}

	
}
