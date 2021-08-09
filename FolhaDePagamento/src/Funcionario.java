
public class Funcionario {
	private int numeroFuncional;
	private String nome;
	private String email;
	private double salario;
	
	public Funcionario(int numeroFuncional, String nome, String email, double salario) {
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		
	}
	
	
	void reajustarSalario(double percentual){
		salario = salario + salario*percentual/100;
	}
	
	String exibirInfo() {
		return numeroFuncional+" "+nome+" ("+email+")"+" - R$"+salario;
	}
	
	double calcularImposto() {
		
		if (salario<=2000) {
			return 0;
		}
		else if(salario>2000 && salario<=3000) {
			return salario*15/100;
		}
		else if(salario>3000 && salario<=4500) {
			return salario*25/100;
		}
		else {
			return 2250;
		}
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
