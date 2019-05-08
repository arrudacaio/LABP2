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
		return false;
	}
	
	public boolean editaFornecedorCadastrado(String nome, String email, String telefone) {
		if(this.fornecedorCadastrados.containsKey(nome)) {
			this.fornecedorCadastrados.get(nome).setEmail(email);
			this.fornecedorCadastrados.get(nome).setTelefone(telefone);
			return true;
		}
		return false;
		
	}
	
	public boolean removeFornecedorCadastrado(String nome) {
		if(!this.fornecedorCadastrados.containsKey(nome)) {
			throw new IllegalArgumentException("Fornecedor não cadastrado");
		} else {
			this.fornecedorCadastrados.remove(nome);
			return true;
		}
	}
	
	public String imprimeFornecedor(String nome) {
		return this.fornecedorCadastrados.get(nome).toString();
		
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
	

	
}
