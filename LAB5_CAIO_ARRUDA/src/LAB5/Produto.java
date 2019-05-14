package LAB5;
/**
 * Classe que representa um Produto
 * @author Caio Arruda
 *
 */

public class Produto {
	/**
	 * nome do produto
	 */
	private String nome;
	/**
	 * descricao do produto
	 */
	private String descricao;
	/**
	 * preço do produto
	 */
	private double preco;
	
	/**
	 * constrói um produto a partir do seu nome, descrição e preço
	 * @param nome nome do produto
	 * @param descricao descrição do produto
	 * @param preco preço do produto
	 */
	public Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String toString() {
		return this.nome + " - " + this.descricao + " - R$" + String.format("%.2f", this.preco);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	
	
}
