package LAB5;

import java.util.HashMap;
import java.util.Set;

public class ControleFornecedor {
	private HashMap<String,Fornecedor> fornecedorCadastrados;
	private Validacao validacao;
	
	public ControleFornecedor() {
		this.fornecedorCadastrados = new HashMap<>();
		this.validacao = new Validacao();
	}
	
	public boolean cadastraFornecedor(String nome, String email, String telefone) {
		this.validacao.verificaCadastraFornecedor(nome, email, telefone);
		if(!this.fornecedorCadastrados.containsKey(nome)) {
			this.fornecedorCadastrados.put(nome, new Fornecedor(nome,email,telefone));
			return true;
		}
		throw new IllegalArgumentException("Erro no cadastro de fornecedor: fornecedor ja existe.");
	}
	
	public boolean editaFornecedorCadastrado(String nome, String atributo, String novoValor) {
		this.validacao.verificaEditaFornecedor(nome, atributo, novoValor);
		if (atributo.equals("nome")) {
			throw new IllegalArgumentException("Erro na edicao do fornecedor: nome nao pode ser editado");
		}
		if(atributo.equals("email")) {
			if(this.fornecedorCadastrados.containsKey(nome)) {
				this.fornecedorCadastrados.get(nome).setEmail(novoValor);
				return true;
			}
		} else if(atributo.equals("telefone")) {
			if(this.fornecedorCadastrados.containsKey(nome)) {
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
		if(!this.fornecedorCadastrados.containsKey(nome)) {
			throw new IllegalArgumentException("Erro na exibicao do fornecedor: fornecedor nao existe.");
		} else {
			this.fornecedorCadastrados.remove(nome);
			return true;
		}
	}
	
	public String imprimeFornecedor(String nome) {
		if(this.fornecedorCadastrados.get(nome) != null) {
			return this.fornecedorCadastrados.get(nome).toString();
		}
		throw new IllegalArgumentException("Erro na exibicao do fornecedor: fornecedor nao existe.");
		
	}
	
	public String imprimefornecedorCadastrados() {
		String result = "";
		Set<String> chaves = this.fornecedorCadastrados.keySet();
		for(String nome : chaves) {
			result += this.fornecedorCadastrados.get(nome).toString() + " | ";
		} 
		if (result.equals("")) {
			return "Nenhum fornecedor cadastrado";
		} else {
			return result.substring(0,result.length()-3);
		}
		
	}
	

	public boolean cadastraProdutoFornecedor(String nomeF, String nome, String descricao, double preco) {
		return this.fornecedorCadastrados.get(nomeF).cadastraProdutos(nome, descricao, preco);
		
	}
	
	
	public String exibeProdutoFornecedor(String nomeF, String nome, String descricao) {
		return this.fornecedorCadastrados.get(nomeF).exibeProduto(nome, descricao);
	}

	public String imprimeTodosProdutos(String nomeF) {
		return this.fornecedorCadastrados.get(nomeF).imprimeTodosProdutos();
	}
	
	
	
}
