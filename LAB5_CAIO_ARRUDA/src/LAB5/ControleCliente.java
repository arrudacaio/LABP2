package LAB5;

import java.util.HashMap;

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
		} throw new IllegalArgumentException("Cliente já cadastrado."); 

	}
	
	
	

}
