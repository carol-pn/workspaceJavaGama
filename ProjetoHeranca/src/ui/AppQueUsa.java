package ui;

import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Isidro");
		p.setEmail("isidro@email.com");		
		p.exibir();
		
		Estudante e = new Estudante();
		e.setNumeroMatricula(1234);
		e.setCurso("engenharia");
		e.setNome("Fulano");
		e.setEmail("fulano@email.com");		
		e.exibir();
		
	}

}
