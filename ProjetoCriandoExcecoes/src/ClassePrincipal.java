import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Produto p = new Produto();
		int _id;
		String _strId, _nome, _strPreco;
		double _preco;
		
		try {
			System.out.println("Digite o ID:");
			_strId = teclado.nextLine();
			_id = Integer.parseInt(_strId);
			p.setId(_id);
			
			System.out.println("Digite o nome:");
			_nome = teclado.nextLine();
			p.setNome(_nome);
			
			System.out.println("Digite o preco:");
			_strPreco = teclado.nextLine();
			_preco = Double.parseDouble(_strPreco);
			p.setPreco(_preco);
			
			System.out.println("Produto cadastrado!");
			
		}
		catch (Exception ex){
			System.out.println("erro no cadastro");
			System.out.println("mensagem de erro: "+ ex.getMessage());
		}
		
		
	}

}
