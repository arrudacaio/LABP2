package LAB5;

import java.util.HashMap;
import java.util.Set;

public class ControleCliente {
	private HashMap<String, Cliente> clientesCadastrados;
	private Validacao validacao;

	public ControleCliente() {
		this.clientesCadastrados = new HashMap<>();
		this.validacao = new Validacao();
	}

	public String cadastraCliente(String nome, String email, String local, String cpf) {
		validacao.verificaCadastraCliente(cpf,nome, email, local);
		if (!this.clientesCadastrados.containsKey(cpf)) {
			this.clientesCadastrados.put(cpf, new Cliente(nome, email, local, cpf));
			return cpf;
		}
		throw new IllegalArgumentException("Erro no cadastro do cliente: cliente ja existe.");

	}

	public boolean  editaCadastraCliente(String cpf, String atributo, String novoValor) {
		validacao.verificaEditaCadastraCliente(cpf, atributo, novoValor);
		if(!this.clientesCadastrados.containsKey(cpf)) {
			throw new IllegalArgumentException("Erro na edicao do cliente: cliente nao existe.");
		}
		if(atributo.equals("nome")) {
			if(this.clientesCadastrados.containsKey(cpf)) {
				this.clientesCadastrados.get(cpf).setNome(novoValor);
				return true;
			}
		} else if (atributo.equals("email")) {
			if(this.clientesCadastrados.containsKey(cpf)) {
				this.clientesCadastrados.get(cpf).setEmail(novoValor);
				return true;
			}
		} else if (atributo.equals("localizacao")) {
			if(this.clientesCadastrados.containsKey(cpf)) {
				this.clientesCadastrados.get(cpf).setLocal(novoValor);
				return true;
			}
		} else {
			throw new IllegalArgumentException("Erro na edicao do cliente: atributo nao existe.");
		}
		return false;
	}

	public boolean removeClienteCadastrado(String cpf) {
		if(!this.clientesCadastrados.containsKey(cpf)) {
			throw new IllegalArgumentException("Cpf não cadastrado.");
		} else {
			this.clientesCadastrados.remove(cpf);
			return true;
		}
	}

	public String imprimeCliente(String cpf) {
		if(cpf == null ) {
			throw new NullPointerException("Erro na edicao do cliente: cliente nao existe.");
		} 
		if(cpf.equals("") || cpf.trim() == "" ) {
			throw new IllegalArgumentException("Erro na edicao do cliente: cliente nao existe.");
		} else {
			if(this.clientesCadastrados.containsKey(cpf)) {
				return this.clientesCadastrados.get(cpf).toString();
			}
			throw new IllegalArgumentException("Erro na exibicao do cliente: cliente nao existe.");
		}
		
	}

	public String imprimeClientesCadastrados() {
		String result = "";
		Set<String> chaves = this.clientesCadastrados.keySet();
		for (String chave : chaves) {
			result += this.clientesCadastrados.get(chave).toString() + " | ";
		}
		if (result.equals("")) {
			return "Nenhum cliente cadastrado";
		} else {
			return result.substring(0, result.length()-3);
		}
	}

}
