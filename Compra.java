import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Compra{

	//atributos
	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();
	//fim dos atributos da classe
	
	
	//metodos
	public Compra(Funcionario funcionario, Cliente cliente) {
		this.funcionario = funcionario;
		this.cliente = cliente;
	}
	//adiciona o produto na compra
	public void adicionaProduto(Produto prod) {
		this.produtos.add(prod);	
	}
	
	
	
	//TODO
	/** Em seguida, dever� listar todos os produtos comprados pelo cliente ordenado do menor
	para o maior valor do produto
	**/
	public void listarCompra() {
		//inicializa a variavel para somar o total da compra
		float total = 0;
		//lista a lista de produtos
		for (Produto produto : produtos) {
			System.out.println(produto);
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
