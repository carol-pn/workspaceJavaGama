
public class Funcionario {
	private int numeroFuncional;
	private String nome;
	private String email;
	private double salario;
	
	
	void reajustarSalario(double percentual){
		salario = salario + salario*percentual/100;
	}
	
	String exibirInfo() {
		return "Funcionário: "+nome+" ("+numeroFuncional+")"+" - "+email+" - R$"+salario;
	}
	
	double calcularImposto() {
		double imposto = 0;
		if (salario<=2000) {
			imposto = 0;
		}
		else if(salario>2000 && salario<=3000) {
			imposto = salario*15/100;
		}
		else if(salario>3000 && salario<=4500) {
			imposto = salario*25/100;
		}
		else if(salario>4500) {
			imposto = 2250;
		}
		return imposto;
	}

	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
