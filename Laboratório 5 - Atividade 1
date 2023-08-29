package atividade1;

public class Automovel {
	private String placa;
	private double quilometragem = 0; // Initial
	private double capacidadeCombustivelTanque;
	private double eficienciaMotor;
	private double quantidadeCombustivelTanque = 2;
	private int quantidadeViagens;

	public Automovel(String placa, double capacidadeCombustivelTanque, double eficienciaMotor) {
		this.placa = placa;
		this.capacidadeCombustivelTanque = capacidadeCombustivelTanque;
		this.eficienciaMotor = eficienciaMotor;
	}

	public String getPlaca() {
		return placa;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public double getCapacidadeCombustivelTanque() {
		return capacidadeCombustivelTanque;
	}

	public double getEficienciaMotor() {
		return eficienciaMotor;
	}

	public double getQuantidadeCombustivelTanque() {
		return quantidadeCombustivelTanque;
	}

	public int getQuantidadeViagensRealizadas() {
		return quantidadeViagens;
	}

	public void abastecer(double quantidade) {
		if (quantidadeCombustivelTanque >= 0 && quantidadeCombustivelTanque < capacidadeCombustivelTanque
				&& quantidade > 0) {
			quantidadeCombustivelTanque += quantidade;
		} else {
			System.out.println("Tanque cheio ou quantidade insufciente de combustível, impossível abastecer");
		}
	}

	public void dirigir(double distancia) {
		if (distancia > 0 && quantidadeCombustivelTanque > 0 && distancia <= autonomiaVeiculo()) {
			this.quantidadeViagens++;
			this.quilometragem += distancia;
			this.quantidadeCombustivelTanque -= this.gastoDeCombustivel(distancia);

		} else {
			this.quilometragem += autonomiaVeiculo();
			this.quantidadeCombustivelTanque -= this.gastoDeCombustivel(autonomiaVeiculo());
			System.out.println("Impossível prosseguir adiante, sem combustível!");
		}
	}

	public double gastoDeCombustivel(double distancia) {
		return distancia / this.eficienciaMotor;
	}

	public double autonomiaVeiculo() {
		return this.quantidadeCombustivelTanque * this.eficienciaMotor;
	}

	public String toString() {
		return "== Ficha do Automovel == \nPlaca = " + placa + "\nQuilometragem = " + quilometragem
				+ "\nCapacidade de Combustivel no Tanque = " + capacidadeCombustivelTanque + "\nEficiência do Motor = "
				+ eficienciaMotor + "\nQuantidade de Combustivel no Tanque = " + quantidadeCombustivelTanque
				+ "\nQuantidade de Viagens = " + quantidadeViagens;
	}

}




package atividade1;

public class AutomovelTeste {

	public static void main(String[] args) 
	{
		Automovel auto1 = new Automovel("PTY5B23", 50, 10);
		
		System.out.println("Estado do Automovel em 23/05/91");
		System.out.println(auto1);
		
		auto1.abastecer(50);
		System.out.println("\nQuantidade de combustível no tanque após abastecimento: " + auto1.getQuantidadeCombustivelTanque());
		auto1.dirigir(400);
		System.out.println("\nQuantidade de combustível no tanque após a primeira viagem: " + auto1.getQuantidadeCombustivelTanque());
		System.out.println("\nQuantidade de viagens do automóvel: " + auto1.getQuantidadeViagensRealizadas());
		System.out.println("\nQuilometragem do veículo: " + auto1.getQuilometragem());
		auto1.dirigir(150);
		
		System.out.println("\nEstado do Automovel em 24/05/91");
		System.out.println(auto1);
	}

}
