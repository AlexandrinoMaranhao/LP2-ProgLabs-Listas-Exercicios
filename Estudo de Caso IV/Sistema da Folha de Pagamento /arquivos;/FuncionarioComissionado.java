package poo.gestaofuncionarios;

public class FuncionarioComissionado extends Funcionario{
	private double salarioBase;
	
	public FuncionarioComissionado(String nome, String cargo, double salario) {
		super(nome, cargo);
		this.salarioBase = salario;
		
	}
}
