
public class Posto {
	public static void main(String[] args) {
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasolina", 5.6);
		BombaDeCombustivel b2 = new BombaDeCombustivel("Etanol", 4.49);
		
		b2.abastecerPorLitros(85.0);
		System.out.println(b2.exibirRecibo());
		
		b1.abastecerPorLitros(10.0);
		System.out.println(b1.exibirRecibo()); 		
		b2.abastecerPorValor(100);
		System.out.println(b2.exibirRecibo());
		
	}
}
