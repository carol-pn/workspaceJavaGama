
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado f1;
		Empregado f2;
		Empregado f3;
		
		f1 = new Empregado();
		f2 = new Empregado();
		f3 = new Empregado();
		
		f1.nome = "Fulano";
		f1.cargo = "Analista JR";
		f1.salario = 3000.0;

		f2.nome = "Sicrano";
		f2.cargo = "Analista PL";
		f2.salario = 5000.0;

		f3.nome = "Beltrano";
		f3.cargo = "Analista SR";
		f3.salario = 7000.0;
		
		f1.imprimir();
		f2.imprimir();
		f3.imprimir();
		
		f1.aumentarSalario(30.0);
		f2.aumentarSalario(20.0);
		f3.aumentarSalario(10.0);
		
		System.out.println();		
		f1.imprimir();
		f2.imprimir();
		f3.imprimir();
		
		
		
	}

}
