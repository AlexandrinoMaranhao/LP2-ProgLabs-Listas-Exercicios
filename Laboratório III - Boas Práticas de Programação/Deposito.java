package poo.Lab3;

public class Deposito {
	private String numeroEnvelope;
	private Movimentacao tipoMovimentacao = new Movimentacao(0, null, null);
	
	public boolean foiMovimentado() {
		return (tipoMovimentacao != null);
	}
	
	public double getEncargos() {
		throw new RuntimeException("Depósitos não sofrem encargos");
	}
}
