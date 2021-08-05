
public class Empregado {

	String nome;
	String cargo;
	double salario;

	void imprimir() {
		System.out.println("Funcionário: "+nome+"("+cargo+"): R$ "+salario);
	}

	void aumentarSalario(double aumento) {
		salario = salario + salario*aumento/100;		
	}

}
