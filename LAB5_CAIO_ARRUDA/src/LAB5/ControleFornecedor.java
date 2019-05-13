package LAB5;

import java.util.HashMap;
import java.util.Set;

public class ControleFornecedor {
	private HashMap<String, Fornecedor> fornecedorCadastrados;
	private Validacao validacao;

	public ControleFornecedor() {
		this.fornecedorCadastrados = new HashMap<>();
		this.validacao = new Validacao();
	}

	public boolean cadastraFornecedor(String nome, String email, String telefone) {
		this.validacao.verificaCadastraFornecedor(nome, email, telefone);
		if (!this.fornecedorCadastrados.containsKey(nome)) {
			this.fornecedorCadastrados.put(nome, new Fornecedor(nome, email, telefone));
			return true;
		}
		throw new IllegalArgumentException("Erro no cadastro de fornecedor: fornecedor ja existe.");
	}

	public boolean editaFornecedorCadastrado(String nome, String atributo, String novoValor) {
		this.validacao.verificaEditaFornecedor(nome, atributo, novoValor);
		if (atributo.equals("nome")) {
			throw new IllegalArgumentException("Erro na edicao do fornecedor: nome nao pode ser editado.");
		}
		if (atributo.equals("email")) {
			if (this.fornecedorCadastrados.containsKey(nome)) {
				this.fornecedorCadastrados.get(nome).setEmail(novoValor);
				return true;
			}
		} else if (atributo.equals("telefone")) {
			if (this.fornecedorCadastrados.containsKey(nome)) {
				this.fornecedorCadastrados.get(nome).setTelefone(novoValor);
				return true;
			}
		} else {
			throw new IllegalArgumentException("Erro na edicao do fornecedor: atributo nao existe.");
		}

		return false;
	}

	public boolean removeFornecedorCadastrado(String nome) {
		this.validacao.verificaRemoveFornecedor(nome);
		if (!this.fornecedorCadastrados.containsKey(nome)) {
			throw new IllegalArgumentException("Erro na exibicao do fornecedor: fornecedor nao existe.");
		} else {
			this.fornecedorCadastrados.remove(nome);
			return true;
		}
	}

	public String imprimeFornecedor(String nome) {
		if(!this.fornecedorCadastrados.containsKey(nome)) {
			throw new IllegalArgumentException("Erro na exibicao do fornecedor: fornecedor nao existe.");
		}
		
		return this.fornecedorCadastrados.get(nome).toString();
		

	}

	public String imprimefornecedorCadastrados() {
		String result = "";
		Set<String> chaves = this.fornecedorCadastrados.keySet();
		for (String nome : chaves) {
			result += this.fornecedorCadastrados.get(nome).toString() + " | ";
		}
		if (result.equals("")) {
			return "Nenhum fornecedor cadastrado";
		} else {
			return result.substring(0, result.length() - 3);
		}

	}

	public Fornecedor getNomeF(String nome) {
		return this.fornecedorCadastrados.get(nome);
	}

	public boolean removeProduto(String nome, String descricao,String nomeF) {
		if(nomeF == null || "".equals(nomeF.trim())) {
			throw new IllegalArgumentException("Erro na remocao de produto: fornecedor nao pode ser vazio ou nulo.");
		} else if(!this.fornecedorCadastrados.containsKey(nomeF)) {
			throw new NullPointerException("Erro na remocao de produto: fornecedor nao existe.");
		} 
		
		return this.fornecedorCadastrados.get(nomeF).removeProduto(nome, descricao);
		
	}
	
	public boolean editaProduto(String nome, String descricao, String fornecedor,double novoPreco) {
		return this.fornecedorCadastrados.get(fornecedor).editaProduto(nome, descricao, novoPreco);
		}
	
	public boolean cadastraProduto(String fornecedor,String nome, String descricao, double preco) {
		validacao.cadastraProdutos(fornecedor,nome,descricao,preco);
		if(!this.fornecedorCadastrados.containsKey(fornecedor)) {
			throw new IllegalArgumentException("Erro no cadastro de produto: fornecedor nao existe.");
		}
		return this.fornecedorCadastrados.get(fornecedor).cadastraProdutos(nome, descricao, preco);
	}
	


	
}
