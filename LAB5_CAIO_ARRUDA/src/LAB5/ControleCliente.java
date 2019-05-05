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
		validacao.verificaCadastraCliente(nome, email, local, cpf);
		if (!this.clientesCadastrados.containsKey(cpf)) {
			this.clientesCadastrados.put(cpf, new Cliente(nome, email, local, cpf));
			return cpf;
		}
		throw new IllegalArgumentException("Cliente já cadastrado.");

	}
	
	public String editaCadastraCliente(String cpf, String nome, String email, String local) {
		this.clientesCadastrados.get(cpf).setNome(nome);
		this.clientesCadastrados.get(cpf).setEmail(email);
		this.clientesCadastrados.get(cpf).setLocal(local);
		return "Cadastro do Cliente editado.";
	}
	
	public String removeClienteCadastrado(String cpf) {
		this.clientesCadastrados.remove(cpf);
		return "Cliente Removido!";
	}
	

	public String imprimeCliente(String cpf) {
		return this.clientesCadastrados.get(cpf).toString();
	}

	public String imprimeClientesCadastrados() {
		String result = "";
		Set<String> chaves = this.clientesCadastrados.keySet();
		for (String chave : chaves) {
			result += this.clientesCadastrados.get(chave).toString() + " |  \n";

		}
		return result;

	}

}
