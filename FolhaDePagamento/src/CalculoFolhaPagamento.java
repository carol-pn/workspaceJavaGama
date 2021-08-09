
public class CalculoFolhaPagamento {
	public static void main(String[] args) {
		Funcionario f1,f2,f3;
		f1 = new Funcionario(1111,"Fulano","fulano@email.com",2000.0);
		f2 = new Funcionario(1122,"Isidro","isidroo@email.com",3000.0);
		f3 = new Funcionario(1133,"Pedro","pedroo@email.com",4000.0);
		
//		f1.setNumeroFuncional(123456789);
//		f1.setEmail("fulano@email.com");
//		f1.setNome("Fulano");
//		f1.setSalario(2000.0);
//		
//		f2.setNumeroFuncional(234567891);
//		f2.setEmail("isidro@email.com");
//		f2.setNome("Isidro");
//		f2.setSalario(3000.0);
//
//		f3.setNumeroFuncional(345678912);
//		f3.setEmail("pedro@email.com");
//		f3.setNome("Pedro");
//		f3.setSalario(4000.0);
		
		System.out.println(f1.exibirInfo() + " Imposto: "+ f1.calcularImposto());
		System.out.println(f2.exibirInfo() + " Imposto: "+ f2.calcularImposto());
		System.out.println(f3.exibirInfo() + " Imposto: "+ f3.calcularImposto());
		f1.reajustarSalario(20.0);
		f2.reajustarSalario(20.0);
		f3.reajustarSalario(20.0);
		System.out.println();
		System.out.println(f1.exibirInfo() + " Imposto: "+ f1.calcularImposto());
		System.out.println(f2.exibirInfo() + " Imposto: "+ f2.calcularImposto());
		System.out.println(f3.exibirInfo() + " Imposto: "+ f3.calcularImposto());
		f1.reajustarSalario(20.0);
//		System.out.println("Salário após reajuste: "+f1.getSalario());
//		//System.out.println(f1.exibirInfo());
//		System.out.println("Imposto após reajuste: "+f1.calcularImposto());
		
	}
}
