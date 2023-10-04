package poo.outrogestaocontas;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(1, 2, new Cliente("Maria", "145"), 123, 500);
		Tributavel t = cc1;

		System.out.println(cc1.verificaSaldo(123));

		ContaCorrente cc2 = new ContaCorrente(2, 22, new Cliente("Maria", "123"), 123, 5000);
		SeguroDeVida s1 = new SeguroDeVida();
		SeguroDeVida s2 = new SeguroDeVida();
		SeguroDeVida s3 = new SeguroDeVida();

		GerenciadorImpostoDeRenda g = new GerenciadorImpostoDeRenda();

		g.adiciona(cc1);
		g.adiciona(cc2);
		g.adiciona(s1);
		g.adiciona(s2);
		g.adiciona(s3);

		System.out.println(g.getTotal());
	}
}
