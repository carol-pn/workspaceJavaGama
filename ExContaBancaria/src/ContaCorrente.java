public class ContaCorrente{
	
	int numeroConta;
	int digito;
	String titular;
	String cpf;
	double saldo;
	
	double depositar(double quantia){
		saldo += quantia;
		//System.out.println("Deposito de R$"+quantia+" concluido, saldo em conta: R$"+saldo);
		return saldo;
	}
	
	String exibirInfo(){
		String info;
		info = "Informações da conta\nNúmero da conta: "+numeroConta+"\nDigito: "+digito+"\nNome do titular:"+titular+"\nCPF: "+cpf+"\nSaldo: R$"+saldo;
		return info;
	}
	
//	double sacar(double quantia){
//		if (quantia <=saldo) {
//			saldo -= quantia;
//			System.out.println("Saque de R$"+quantia+" efetuado com sucesso, saldo em conta: R$"+saldo);
//		}
//		else {
//			System.out.println("Saldo insuficiente, saldo disponivel em conta: R$"+saldo);
//		}
//		return saldo;
//	}
	boolean sacar(double quantia){
		boolean resultado;
		if (quantia <= saldo) {
			saldo -= quantia;
			resultado= true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
}