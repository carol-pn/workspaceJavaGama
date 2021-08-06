import java.util.Scanner;
public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		int opcao;
		double valor;
		
		Conta c1 = new Conta();
		c1.setNumeroConta(12345);
		c1.setDigito(6);
		c1.setTitular("Fulano");
		c1.setCpf("123.456.789-10");
		c1.setSaldo(200.00);
		
		do {
			System.out.println("Bem vindo ao Banco! ");
			System.out.println("Digite 1- Info/ 2- Deposito/ 3- Saque/ 0- Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1: 
				System.out.println(c1.exibir());
				break;
			case 2:
				System.out.println("[DEPOSITO] Digite o valor: ");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("[SAQUE] Digite o valor: ");
				valor = teclado.nextDouble();
				if (c1.sacar(valor)) {
					System.out.println("	Saque autorizado");
				}
				else {
					System.out.println("	Saldo insuficiente");
				}
				
				break;
			case 0:
				System.out.println(" --- Obrigado pela preferencia ---");
				break;
			default:
				System.out.println("Erro: Opcao invalida");
			}
		}while(opcao!=0);
		
		teclado.close();
		
		
		
	}	
	

}
