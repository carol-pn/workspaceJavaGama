package ui;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class Empresa {	
	public static void main(String[] args) {
		
//		Funcionario f1, f2, f3, f4;
//		
//		f1 = new Empreiteiro(1,"Empreiteiro",3000.0);
//		f2 = new Chefe(2,"Chefe",25000.0,15.0,2500.0);
//		f3 = new Comissionado(3,"Comissionado",5000.0,35.0);
//		f4 = new Horista(4,"Horista",200.0,75);
//		
//		System.out.println(f1.getNumRegistro()+" "+f1.getNome()+" R$ "+f1.calcularSalario());
//		System.out.println(f2.getNumRegistro()+" "+f2.getNome()+" R$ "+f2.calcularSalario());
//		System.out.println(f3.getNumRegistro()+" "+f3.getNome()+" R$ "+f3.calcularSalario());
//		System.out.println(f4.getNumRegistro()+" "+f4.getNome()+" R$ "+f4.calcularSalario());
//		
		
//		Funcionario lista[];
//		
//		lista = new Funcionario[6];
//		
//		lista[0] = new Empreiteiro(1,"Empreiteiro",3000.0);
//		lista[1] = new Chefe(2,"Chefe",25000.0,15.0,2500.0);
//		lista[2] = new Comissionado(3,"Comissionado",5000.0,35.0);
//		lista[3] = new Horista(4,"Horista",200.0,75);
//		lista[4] = new Empreiteiro(1,"Empreiteiro2",3000.0);
//		lista[5] = new Comissionado(3,"Comissionado2",5000.0,35.0);
//		lista[6] = new Horista(4,"Horista2",220.0,80);
//		
//		for (int pos = 0, pos < lista.length; pos++) {
//			System.out.println(lista[pos].getNumRegistro()+" "+lista[pos].getNome()+" R$ "+lista[pos].calcularSalario());
//		}
		
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Empreiteiro(1,"Empreiteiro",3000.0));
		lista.add(new Chefe(2,"Chefe",25000.0,15.0,2500.0));
		lista.add(new Comissionado(3,"Comissionado",5000.0,35.0));
		lista.add(new Horista(4,"Horista",200.0,75));
		lista.add(new Empreiteiro(1,"Empreiteiro2",3000.0));
		lista.add(new Comissionado(3,"Comissionado2",5000.0,35.0));
		lista.add(new Horista(4,"Horista2",220.0,80));
		
		for(Funcionario f : lista) {
			System.out.println(f.getNumRegistro()+" "+f.getNome()+" R$ "+f.calcularSalario());
		}
		
		
		
	}
}
