import javax.swing.JOptionPane;
public class Banco {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		
		c1.numeroConta = 123456;
		c1.digito = 7;
		c1.titular = "Fulano";
		c1.cpf = "987.654.321-00";
		c1.saldo = 1000.00;
		
		c2.numeroConta = 234567;
		c2.digito = 8;
		c2.titular = "Beltrano";
		c2.cpf = "123.456.789-00";
		c2.saldo = 3000.00;
		
		JOptionPane.showMessageDialog(null, "Bem vindo");
		c1.depositar(50.0);
		
		if (c1.sacar(150.0)) {
			JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso, saldo em conta: R$"+c1.saldo);
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo induficiente");			
		}
		
		JOptionPane.showMessageDialog(null, c1.exibirInfo());
		
//		c1.exibirInfo();
//		System.out.println();
//		//c2.exibirInfo();
//		
//		c1.sacar(500.0);
//		
//		c1.depositar(500.0);
		
		
	}

}
