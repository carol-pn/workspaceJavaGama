package ui;

import core.Conta;
import core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta("Fulano","1234", 123);	
		System.out.println(c1.toString());	
		c1.creditar(100);
		
		System.out.println(c1.toString());
		
		if (c1.debitar(200)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(c1.toString());
		
		
		System.out.println("-------------");
		ContaEspecial c2;
		c2 = new ContaEspecial("Sicrano", "3456",8765, 200.0);
		System.out.println(c2.toString());
		c2.creditar(30.0);
		System.out.println(c2.toString());
		if (c2.debitar(200)) {
			System.out.println("debito efetivado");
		}
		else {
			System.out.println("saldo insuficiente");
		}
		System.out.println(c2.toString());
	}

}
