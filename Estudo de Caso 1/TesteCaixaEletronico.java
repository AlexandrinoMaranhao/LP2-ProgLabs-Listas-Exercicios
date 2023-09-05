package poo.testecaixaeletonico;

import poo.gestaocaixaeletronico.*;
import poo.gestaocontas.*;
import java.util.Scanner;


public class TesteCaixaEletronico {
	public static void main(String[] args) {
		
		
		Cliente cl1 = new Cliente("João", "123456-7");
		Cliente cl2 = new Cliente("Julio", "789101-1");
		Cliente cl3 = new Cliente("Karina", "121314-1");
		Cliente cl4 = new Cliente("Luis", "516171-8");
		Cliente cl5 = new Cliente("Maria", "192021-2");
		
		Conta c1 = new Conta(1, cl1, 123, 750);
		Conta c2 = new Conta(1, cl2, 456, 800);
		Conta c3 = new Conta(1, cl3, 789, 850);
		Conta c4 = new Conta(1, cl4, 101, 900);
		Conta c5 = new Conta(1, cl5, 213, 950);
		
	     CadastroContas cdc1[] =  new CadastroContas[6];
		
			
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    System.out.println(c5);
		
			
 
	}
}
