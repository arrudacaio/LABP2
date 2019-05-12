package LAB5;

public class Facade {
	private ControleCliente controleCliente;
	private ControleFornecedor controleFornecedor;

	public Facade() {
		this.controleCliente = new ControleCliente();
		this.controleFornecedor = new ControleFornecedor();
	}

	public String adicionaCliente(String cpf,String nome, String email, String localizacao) {
		return this.controleCliente.cadastraCliente(nome, email, localizacao, cpf);
	}

	public boolean editaCliente(String cpf, String atributo, String novoValor) {
		return this.controleCliente.editaCadastraCliente(cpf,atributo, novoValor);
	}

	public boolean removeClienteCadastrado(String cpf) {
		return this.controleCliente.removeClienteCadastrado(cpf);
	}

	public String exibeCliente(String cpf) {
		return this.controleCliente.imprimeCliente(cpf);
	}

	public String imprimeClientesCadastrados() {
		return this.controleCliente.imprimeClientesCadastrados();
	}
	
	public boolean adicionaFornecedor(String nome, String email, String telefone) {
		return this.controleFornecedor.cadastraFornecedor(nome, email, telefone);
	}
	
	public boolean editaFornecedorCadastrado(String nome, String email, String telefone) {
		return this.controleFornecedor.editaFornecedorCadastrado(nome, email, telefone);
	}
	
	public boolean removeFornecedor(String nome, String email, String telefone) {
		return this.controleFornecedor.removeFornecedorCadastrado(nome);
	}
	
	public String exibeFornecedor(String nome) {
		return this.controleFornecedor.imprimeFornecedor(nome);
	}
	
	public String imprimeFornecedorCadastrados() {
		return this.controleFornecedor.imprimefornecedorCadastrados();
	}
}
