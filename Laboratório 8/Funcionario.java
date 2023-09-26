package banco.gestaopessoal;

import java.lang.reflect.Constructor;

public class Funcionario {
	private String nome;
	private String codigoFuncionario;
	private double salarioBase;
	private static double valeRefeicaoDiario = 15.0;
	
	public Funcionario(String nome, String codigoFunc, double salarioBase) {
		this.nome = nome;
		this.codigoFuncionario = codigoFunc;
		this.salarioBase = salarioBase;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoFuncionario() {
		return this.codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFunc) {
		this.codigoFuncionario = codigoFunc;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public static void reajusteValeRefeicao() {
		
	}
}
