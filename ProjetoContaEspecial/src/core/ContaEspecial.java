package core;

public class ContaEspecial extends Conta {
	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double limite) {
		super(nomeTitular, cpf, numeroConta);
		this.limite = limite;				
	}
	
	public boolean debitar(float valor) {
		if (super.saldoConta + this.limite >= valor) {
			super.saldoConta -= valor;
			return true;			
		}
		else {
			return false;
		}		
	}
	
	
	
	
	

}
