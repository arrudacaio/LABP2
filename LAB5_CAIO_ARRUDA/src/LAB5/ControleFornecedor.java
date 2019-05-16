package LAB5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
/**
 * Classe que representa um Controle de Fornecedores
 * @author Caio Arruda
 *
 */
public class ControleFornecedor {
	/**
	 * Mapa dos fornecedores cadastrados
	 * 
	 */
	private HashMap<String, Fornecedor> fornecedorCadastrados;
	/**
	 * validacao para validar os métodos posteriores
	 */
	private Validacao validacao;

	/**
	 * Constrói um controle de fornecedores
	 */
	public ControleFornecedor() {
		/**
		 * Instancia um mapa de fornecedores cadastrados.
		 */
		this.fornecedorCadastrados = new HashMap<>();
		/**
		 * Instacia uma validacao para os métodos.
		 */
		this.validacao = new Validacao();
	}

	/**
	 * Cadastra fornecedor a partir do nome, email, telefone
	 * @param nome nome do fornecedor
	 * @param email email do fornecedor
	 * @param telefone telefone do fornecedor
	 * @return verdadeiro caso consiga cadastrar, se não, falso.
	 */
	public String cadastraFornecedor(String nome, String email, String telefone) {
		this.validacao.verificaCadastraFornecedor(nome, email, telefone);
		if (!this.fornecedorCadastrados.containsKey(nome)) {
			this.fornecedorCadastrados.put(nome, new Fornecedor(nome, email, telefone));
			return nome;
		}
		throw new IllegalArgumentException("Erro no cadastro de fornecedor: fornecedor ja existe.");
	}
	
	/**
	 * Edita um fornecedor cadastrado, a partir do nome, atributo que ele quer alterar e o novo valor do atributo.
	 * @param nome nome do fornecedor
	 * @param atributo atributo a ser alterado
	 * @param novoValor novo valor a ser colocado
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */

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

	/**
	 * Remove um fornecedor cadastrado a partir do seu nome(identificador)
	 * @param nome do fornecedor
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */
	public boolean removeFornecedorCadastrado(String nome) {
		this.validacao.verificaRemoveFornecedor(nome);
		if (!this.fornecedorCadastrados.containsKey(nome)) {
			throw new IllegalArgumentException("Erro na exibicao do fornecedor: fornecedor nao existe.");
		} else {
			this.fornecedorCadastrados.remove(nome);
			return true;
		}
	}
	/**
	 * Imprime a representação textual de um fornecedor a partir do seu nome
	 * @param nome nome do fornecedor
	 * @return representação textual de um fornecedor 
	 */

	public String imprimeFornecedor(String nome) {
		if(!this.fornecedorCadastrados.containsKey(nome)) {
			throw new IllegalArgumentException("Erro na exibicao do fornecedor: fornecedor nao existe.");
		} 
			return this.fornecedorCadastrados.get(nome).toString();
		
		
		
		

	}

	/**
	 * imprime fornecedores cadastrados
	 * @return representação textual dos fornecedores cadastrados.
	 */
	public String imprimefornecedorCadastrados() {
		String result = "";
		ArrayList<Fornecedor> fornecedorList = new ArrayList(this.fornecedorCadastrados.values());
		Collections.sort(fornecedorList);
		for (Fornecedor nome : fornecedorList) {
			result += nome.toString() + " | ";
		}
		if (result.equals("")) {
			return "Nenhum fornecedor cadastrado";
		} else {
			return result.substring(0, result.length() - 3);
		}

	}

	
	
	/**
	 * remove um produto a partir do seu nome, descrição e o nome do fornecedor associado.
	 * @param nome nome do produto
	 * @param descricao descricao do produto
	 * @param nomeF nome do fornecedor associado
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */

	public boolean removeProduto(String nome, String descricao,String nomeF) {
		if(nomeF == null || "".equals(nomeF.trim())) {
			throw new IllegalArgumentException("Erro na remocao de produto: fornecedor nao pode ser vazio ou nulo.");
		} else if(!this.fornecedorCadastrados.containsKey(nomeF)) {
			throw new NullPointerException("Erro na remocao de produto: fornecedor nao existe.");
		} 
		
		return this.fornecedorCadastrados.get(nomeF).removeProduto(nome, descricao);
		
	}
	/**
	 * edita um produto a partir do seu nome, descricao, e o o nome do fornecedor e o novo preço a ser colocado .
	 * @param nome nome do produto
	 * @param descricao descricao do produto
	 * @param fornecedor nome do fornecedor
	 * @param novoPreco novo preço a ser colocado
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */
	
	public boolean editaProduto(String nome, String descricao, String fornecedor,double novoPreco) {
		this.validacao.verificaFornecedor(fornecedor);
		if(!this.fornecedorCadastrados.containsKey(fornecedor)) {
			throw new IllegalArgumentException("Erro na edicao de produto: fornecedor nao existe.");
		}
		this.validacao.editaProduto(nome, descricao, novoPreco);
		return this.fornecedorCadastrados.get(fornecedor).editaProduto(nome, descricao, novoPreco);
		}
	
	public String exibeProduto(String nome, String descricao, String fornecedor) {
		validacao.exibeProduto(nome, descricao, fornecedor);
		if(!this.fornecedorCadastrados.containsKey(fornecedor)) {
			throw new IllegalArgumentException("Erro na exibicao de produto: fornecedor nao existe.");
		}
		return this.fornecedorCadastrados.get(fornecedor).exibeProduto(nome, descricao);
		
	}
	
	public String imprimeTodosProdutos(String fornecedor) {
		if(fornecedor == null || fornecedor.equals("") || fornecedor.trim() == "") {
			throw new NullPointerException("Erro na exibicao de produto: fornecedor nao pode ser vazio ou nulo.");
		} 
		return this.fornecedorCadastrados.get(fornecedor).imprimeTodosProdutos();
		
	}
	
	/**
	 * Cadastra produto a partir do nome do fornecedor e o nome, descrição e preço do produto
	 * @param fornecedor nome do fornecedor
	 * @param nome nome do produto
	 * @param descricao descricao do produto
	 * @param preco preco do produto
	 * @return verdadeiro caso consiga cadastrar, se não, falso
	 */
	public boolean cadastraProduto(String fornecedor,String nome, String descricao, double preco) {
		validacao.cadastraProdutos(fornecedor,nome,descricao,preco);
		if(!this.fornecedorCadastrados.containsKey(fornecedor)) {
			throw new IllegalArgumentException("Erro no cadastro de produto: fornecedor nao existe.");
		}
		return this.fornecedorCadastrados.get(fornecedor).cadastraProdutos(nome, descricao, preco);
	}
	


	
}
