
public class BombaDeCombustivel {
	String nome;
	double precoLitro;
	double qntLitro;
	double total;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQntLitro() {
		return qntLitro;
	}
	public void setQntLitro(double qntLitro) {
		this.qntLitro = qntLitro;
	}
	public double getTotal() {
		return total;
	}
	public void setTotalPagar(double total) {
		this.total = total;
	}
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;		
	}
	
	public void abastecerPorLitros(double qntLitro) {
		//this.qntLitro = qntLitro;
		setQntLitro(qntLitro);
		total = qntLitro*precoLitro;				
	}
	
	public void abastecerPorValor(double total) {
		//this.total = total;
		setTotalPagar(total);
		qntLitro = total/precoLitro;
		
	}
	
	public String exibirRecibo() {
		  String recibo = "********************************************************"+"\n"+
				  		  "*                  POSTO DE GASOLINA                   *"+"\n"+
				  		  "Combustível: "+nome+"\n"+
				  		  "Preço do litro: R$"+String.format("%.3f\n", precoLitro)+
				  		  "Quantidade: "+String.format("%.3f", qntLitro)+" L\n"+
				  		  "Valor total: R$"+String.format("%.2f\n", total)+
				  		  "********************************************************";
		  
		  return recibo;
	}	
	

}
