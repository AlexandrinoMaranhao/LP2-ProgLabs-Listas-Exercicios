package problema1;

public class Produto 
{
 private String nome;
 private double preco;
 
 public Produto(String nomeProduto, double precoProduto)
 {
	 this.nome = nomeProduto;
	 this.preco = precoProduto;
 }

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}


public void reduzPreco(double taxa) {
	if(taxa > 0)
	{
	this.preco -= preco * (taxa/100);
	System.out.println("O preço foi reduzido no sistema em " + taxa + "%");	
	}
	else
	{
	 System.out.println("Numero inválido! Impossível reduzir o preço");
	}
}


public String toString() {
	return "Produto \nNome: " + nome + "\npreco: " + preco;
}
 
 
}


package problema1;

public class ProdutoTeste {

	public static void main(String[] args) 
	{
		Produto pdt1  = new Produto("Saca 30 Kg de Arroz", 60);
		Produto pdt2 = new Produto("Saca 20 Kg de Milho", 40);
		
		System.out.println(pdt1);
		System.out.println(pdt2);
		
		pdt1.reduzPreco(10);
		pdt2.reduzPreco(10);
		
		System.out.println(pdt1);
		System.out.println(pdt2);
	}

}
