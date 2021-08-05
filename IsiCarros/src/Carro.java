
public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	void exibirInfo(){
		System.out.println("Automovel: "+ marca +" - "+ modelo);
		System.out.println("Ano: "+ ano);
		System.out.println("Cor: "+ cor);
		System.out.println("Preço: R$ "+ preco);
		System.out.println();		
	}
	
	void aplicarDesconto( double porcentagem) {
		preco -= preco* porcentagem/100;
	}
	
	double calcularIpva(){
		double valorIpva;
		if (ano<2000) {
			valorIpva = 0.0;
		}
		else {
			valorIpva = preco*0.02;
		}
		return valorIpva;
		
	}
	

}
