package banco.teste;
import banco.gestaopessoal.*;

public class FuncionariosTeste {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("João", 1600.0, "admin", "admin123");
		Secretaria s1 = new Secretaria("Maria", 700.0, 1);
		Telefonista t1 = new Telefonista("Joana", 560.0, "1ABD4");
		
		Funcionario.reajusteValeRefeicao();
		g1.mostraDados();
		s1.mostraDados();
		t1.mostraDados();
		
	}

}
