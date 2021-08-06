
public class Conta {
	int numeroConta;
	int digito;
	String titular;
	String cpf;
	double saldo;
	
		
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	String exibir() {
		return "Conta" + numeroConta + "/"+ digito+"\n"+
				"Titular: "+titular+"("+cpf+")"+"\n"+
				"Saldo: R$"+saldo;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}

	
}
