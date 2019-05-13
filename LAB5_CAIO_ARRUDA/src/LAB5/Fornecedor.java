package LAB5;

import java.util.HashMap;
import java.util.Set;

public class Fornecedor {
	private String nome;
	private String email;
	private String telefone;
	private HashMap<String, Produto> mapaProdutos;
	private Validacao valida;

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

	public boolean cadastraProdutos(String nome, String descricao, double preco) {
		
		if (this.mapaProdutos.containsKey(nome+descricao)) {
			throw new IllegalArgumentException("Erro no cadastro de produto: produto ja existe.");
		}
		this.mapaProdutos.put(nome + descricao, new Produto(nome, descricao, preco));
		return true;
		
	}

	public String exibeProduto(String nomeProduto, String descricao) {
		
		return this.mapaProdutos.get(nomeProduto + descricao).toString();
	}
	
	public String imprimeTodosProdutos() {
		String result = "";
		Set<String> chaves = this.mapaProdutos.keySet();
		for (String produto: chaves) {
			result+= this.mapaProdutos.get(produto).toString() + " | ";
		}
		result.substring(0,result.length()-3);
		return result;
	}

	
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
	
	public boolean editaProduto(String nome, String descricao, double novoPreco) {
		valida.editaProduto(nome, descricao, novoPreco);
		this.mapaProdutos.get(nome+descricao).setPreco(novoPreco);
		return true;
	}
	
}

