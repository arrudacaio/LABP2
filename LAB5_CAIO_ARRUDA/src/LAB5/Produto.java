package LAB5;

public class Produto {
	private String nome;
	private String descricao;
	private double preco;
	
	
	public Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String toString() {
		return this.nome + " - " + this.descricao + " - R$" + this.preco;
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
