package LAB5;

import java.util.HashMap;
import java.util.Set;

/**
 * Fornecedor 
 * @author Caio Arruda
 *
 */
public class Fornecedor {
	/**
	 * nome do fornecedor
	 */
	private String nome;
	/**
	 * email do fornecedor
	 */
	private String email;
	/**
	 * telefone do fornecedor
	 */
	private String telefone;
	/**
	 * mapa dos produtos
	 */
	private HashMap<String, Produto> mapaProdutos;
	/**
	 * valida os métodos
	 */
	private Validacao valida;
	/**
	 * Constrói um fornecedor a partir do seu nome, email e telefone
	 * @param nome nome do fornecedor
	 * @param email email do fornecedor
	 * @param telefone telefone do fornecedor
	 */
	public Fornecedor(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.mapaProdutos = new HashMap<>();
		this.valida = new Validacao();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.email + " - " + this.telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	/**
	 * Cadastra o produto a partir do seu nome,descricao e preço
	 * @param nome nome do produto
	 * @param descricao descricao do produto
	 * @param preco preço do produto
	 * @return true se der certo, false ,se não
	 */
	
	public boolean cadastraProdutos(String nome, String descricao, double preco) {
		
		if (this.mapaProdutos.containsKey(nome+descricao)) {
			throw new IllegalArgumentException("Erro no cadastro de produto: produto ja existe.");
		}
		this.mapaProdutos.put(nome + descricao, new Produto(nome, descricao, preco));
		return true;
		
	}

	/**
	 * Exibe o produto a partir do seu identificador(nome e descricao)
	 * @param nomeProduto nome do produto
	 * @param descricao descricao do produto
	 * @return representação textual de um produto
	 */
	public String exibeProduto(String nomeProduto, String descricao) {
		if(!this.mapaProdutos.containsKey(nomeProduto+descricao)){
			throw new IllegalArgumentException("Erro na exibicao do produto: produto nao existe.");
		}
		return this.mapaProdutos.get(nomeProduto + descricao).toString();
	}
	/**
	 * Imprime todos os produtos do fornecedor.
	 * @return representação textual dos produtos
	 */
	public String imprimeTodosProdutos() {
		String result = "";
		Set<String> chaves = this.mapaProdutos.keySet();
		for (String produto: chaves) {
			result+= this.mapaProdutos.get(produto).toString() + " | ";
		}
		result.substring(0,result.length()-3);
		return result;
	}

	/**
	 * Remove o produto de um fornecedor a partir do seu identificador(nome + descrição)
	 * @param nome do produto
	 * @param descricao descrição do produto
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */
	public boolean removeProduto(String nome, String descricao) {
		if(nome == null || "".equals(nome.trim())) {
			throw new IllegalArgumentException("Erro na remocao de produto: nome nao pode ser vazio ou nulo.");
		} else if (descricao == null || "".equals(descricao.trim())) {
			throw new IllegalArgumentException("Erro na remocao de produto: descricao nao pode ser vazia ou nula.");
		} else  if(!this.mapaProdutos.containsKey(nome+descricao)) {
		 		throw new IllegalArgumentException("Erro na remocao de produto: produto nao existe.");
		 	} 
			this.mapaProdutos.remove(nome+descricao);
			return true;
		
	}
	/**
	 * Edita produto a partir do seu nome, descrição e o novo preço
	 * @param nome nome do produto
	 * @param descricao descrição do produto
	 * @param novoPreco novo preço do produto
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */
	
	public boolean editaProduto(String nome, String descricao, double novoPreco) {
		valida.editaProduto(nome, descricao, novoPreco);
		this.mapaProdutos.get(nome+descricao).setPreco(novoPreco);
		return true;
	}
	
}

