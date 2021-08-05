
public class Loja {
	public static void main(String[] args) {
		Carro c1;
		Carro c2;
		
		c1 = new Carro();
		c2= new Carro();
		
		c1.marca = "porchy";
		c1.modelo = "kaineni";
		c1.ano = 2021;
		c1.cor = "preto";
		c1.preco = 780000;
		
		c2.marca = "xevrole";
		c2.modelo = "corssa";
		c2.ano = 1997;
		c2.cor = "prata";
		c2.preco = 7500;
		
		c1.exibirInfo();
		c2.exibirInfo();
		
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		
		System.out.println("-----------------");
		
		c1.exibirInfo();
		c2.exibirInfo();
		
//		double ipvaC1 = c1.calcularIpva();
//		double ipvaC2 = c2.calcularIpva();
		
		System.out.println("Valor do IPVA do "+c1.modelo+" = "+c1.calcularIpva());
		System.out.println("Valor do IPVA do "+c2.modelo+" = "+c2.calcularIpva());



	}
}
