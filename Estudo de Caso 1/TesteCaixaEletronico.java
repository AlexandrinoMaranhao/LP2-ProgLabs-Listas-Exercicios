package poo.testecaixaeletonico;

import poo.gestaocaixaeletronico.*;
import poo.gestaocontas.*;
import java.util.Scanner;


public class TesteCaixaEletronico {
	public static void main(String[] args) {


		Cliente cl1, cl2, cl3, cl4, cl5;
		Conta c1, c2, c3, c4, c5;
		
		Cliente[] clientes = {cl1 = new Cliente("João", "123456-7"),cl2 = new Cliente("Julio", "789101-1"), cl3 = new Cliente("Karina", "121314-1"), cl4 = new Cliente("Luis", "516171-8"), cl5 = new Cliente("Maria", "192021-2")};
		Conta[] contas = {c1 = new Conta(101, cl1, 123, 5500), c2 = new Conta(102, cl2, 123, 5500), c3 = new Conta(103, cl3, 123, 500), c4 = new Conta(104, cl4, 123, 500), c5 = new Conta(105, cl5, 123, 500)};
		CadastroContas cad1 = new CadastroContas(5);
		
		for(int i = 0; i < contas.length; i++)
		{
			cad1.adicionaConta(c1);
			cad1.adicionaConta(c2);
			cad1.adicionaConta(c3);
			cad1.adicionaConta(c4);
			cad1.adicionaConta(c5);
			
		}
		
		Terminal term1 = new Terminal(cad1);
		
		term1.setModo(1);
		term1.iniciaOperacao();









		
	/*Cliente clientes[] = new Cliente[6]; 
	 Conta contas[] = new Conta[6];
	 
	 
	for(int i = 0; i < clientes.length; i++)
	{
		
	}
	 //bd.meuTerminal();	
	}
	}
}

 Cliente clientes[] = new Cliente[6]; 
	 //Conta;
	 CadastroContas cad1 = new CadastroContas(5);
	 //Terminal meuTerminal =  new Terminal(Conta bd.contas);
	/*Cliente cl1 = new Cliente("João", "123456-7");
		Cliente cl2 = new Cliente("Julio", "789101-1");
		Cliente cl3 = new Cliente("Karina", "121314-1");
		Cliente cl4 = new Cliente("Luis", "516171-8");
		Cliente cl5 = new Cliente("Maria", "192021-2");
		
		Conta c1 = new Conta(1, cl1, 123, 750);
		Conta c2 = new Conta(1, cl2, 456, 800);
		Conta c3 = new Conta(1, cl3, 789, 850);
		Conta c4 = new Conta(1, cl4, 101, 900);
		Conta c5 = new Conta(1, cl5, 213, 950);
	 
	for(int i = 0; i < clientes.length; i++)
	{
		
	}
	 //bd.meuTerminal();	
	}
	
	 /*System.out.println(c1);
	 System.out.println(c2);
	 System.out.println(c3);
	 System.out.println(c4);
	 System.out.println(c5);*/
}


