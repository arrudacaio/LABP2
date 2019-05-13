package LAB5;

import java.util.HashMap;
import java.util.Set;

public class ControleProdutos {
	private HashMap<String, Produto> mapaProdutos;

	public ControleProdutos() {
		this.mapaProdutos = new HashMap<>();

	}

	public boolean cadastraProdutos(String nome, String descricao, double preco) {
		if (!this.mapaProdutos.containsKey(nome+descricao)) {
			this.mapaProdutos.put(nome + descricao, new Produto(nome, descricao, preco));
			return true;

		}
		return false;
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

	
}
