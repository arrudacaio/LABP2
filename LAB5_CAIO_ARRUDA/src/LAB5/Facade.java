package LAB5;

public class Facade {
	private ControleCliente controleCliente;
	private ControleFornecedor controleFornecedor;

	public Facade() {
		this.controleCliente = new ControleCliente();
		this.controleFornecedor = new ControleFornecedor();
	}

	public String cadastraCliente(String nome, String email, String local, String cpf) {
		return this.controleCliente.cadastraCliente(nome, email, local, cpf);
	}

	public boolean editaCadastraCliente(String cpf, String nome, String email, String local) {
		return this.controleCliente.editaCadastraCliente(cpf, nome, email, local);
	}

	public boolean removeClienteCadastrado(String cpf) {
		return this.controleCliente.removeClienteCadastrado(cpf);
	}

	public String imprimeCliente(String cpf) {
		return this.controleCliente.imprimeCliente(cpf);
	}

	public String imprimeClientesCadastrados() {
		return this.controleCliente.imprimeClientesCadastrados();
	}
	
	public boolean cadastraFornecedor(String nome, String email, String telefone) {
		return this.controleFornecedor.cadastraFornecedor(nome, email, telefone);
	}
	
	public boolean editaFornecedorCadastrado(String nome, String email, String telefone) {
		return this.controleFornecedor.editaFornecedorCadastrado(nome, email, telefone);
	}
	
	public boolean removeFornecedorCadastrado(String nome, String email, String telefone) {
		return this.controleFornecedor.removeFornecedorCadastrado(nome);
	}
	
	public String imprimeFornecedor(String nome) {
		return this.controleFornecedor.imprimeFornecedor(nome);
	}
	
	public String imprimeFornecedorCadastrados() {
		return this.controleFornecedor.imprimefornecedorCadastrados();
	}
}
