
public class CalculoFolhaPagamento {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNumeroFuncional(123456789);
		f1.setEmail("fulano@email.com");
		f1.setNome("Fulano");
		f1.setSalario(2500.0);
		
		System.out.println(f1.exibirInfo());
		System.out.println("Imposto: "+f1.calcularImposto());
		f1.reajustarSalario(10.0);
		System.out.println("Sal�rio ap�s reajuste: "+f1.getSalario());
		//System.out.println(f1.exibirInfo());
		System.out.println("Imposto ap�s reajuste: "+f1.calcularImposto());
	}

}
