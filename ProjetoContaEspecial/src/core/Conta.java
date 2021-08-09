package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldoConta;
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public Conta(String nomeTitular, String cpf, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldoConta = 0;
	}
		
	public String toString() {
		String dados = "Conta: "+String.format("%d", numeroConta)+
					   "\nTitular: "+nomeTitular+" ("+cpf+") \n"+
					   "Saldo: R$"+String.format("%.2f", saldoConta);
		return dados;
	}
	
	public boolean debitar(float valor) {
		if (valor<=saldoConta) {
			saldoConta -= valor;
			return true;			
		}
		else {
			return false;
		}		
	}
	
	public void creditar(double d) {
		saldoConta += d;
	}
	

}
