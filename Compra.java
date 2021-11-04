import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Compra{

	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Compra(Funcionario funcionario, Cliente cliente) {
		//ArrayList<Produto> produtos = new ArrayList<>();
		this.funcionario = funcionario;
		this.cliente = cliente;
	}
	
	public void adicionaProduto(Produto prod) {
		//this.produtos = prod;
		this.produtos.add(prod);
		
	}
	
	
	
	//TODO
	/*O m�todo listar compra dever� informar o Funcion�rio que fez a venda e o cliente que
	fez a compra. Em seguida, dever� listar todos os produtos comprados pelo cliente ordenado do menor
	para o maior valor do produto
	Ao final mostrar o valor total da compra.
	O valor do Produto impresso deve possuir 2 casas decimais
	*/
	public void listarCompra() {
		//inicializa a variavel para somar o total da compra
		float total = 0;
		//lista a lista de produtos
		for (Produto produto : produtos) {
			System.out.println("" + produto);
			//soma o total de cada produto da lista
			total += produto.getValor();
		}
		//mostra o valor final da compra com 2 casas decimais
		System.out.printf("Total da compra: %.2f\n", total);
		//mostra o funcionário que efetuou a compra
		System.out.println("Funcionário: " + funcionario.getNome());
		//mosgra o cliente que comprou
		System.out.println("Cliente: " + cliente.getNome());

	}
	
}
