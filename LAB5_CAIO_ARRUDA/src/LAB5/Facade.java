package LAB5;

import easyaccept.EasyAccept;

public class Facade {
	
	public static void main(String[] args) {
		args = new String[] {"LAB5.Facade", "Easyaccept/use_case_1.txt", "Easyaccept/use_case_2.txt", "Easyaccept/use_case_3.txt"};
		EasyAccept.main(args);
	}
	
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

	public boolean removeCliente(String cpf) {
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
	
	public boolean editaFornecedor(String nome, String email, String telefone) {
		return this.controleFornecedor.editaFornecedorCadastrado(nome, email, telefone);
	}
	
	public boolean removeFornecedor(String nome) {
		return this.controleFornecedor.removeFornecedorCadastrado(nome);
	}
	
	public String exibeFornecedor(String nome) {
		return this.controleFornecedor.imprimeFornecedor(nome);
	}
	
	public String imprimeFornecedorCadastrados() {
		return this.controleFornecedor.imprimefornecedorCadastrados();
	}
	
	public boolean adicionaProduto(String fornecedor, String nome,  String descricao , double preco) {
		return this.controleFornecedor.cadastraProduto(fornecedor, nome, descricao, preco);
	}
	
	public String exibeProduto(String nome, String descricao, String fornecedor) {
		return this.controleFornecedor.getNomeF(fornecedor).exibeProduto(nome, descricao);
	}
	
	public String imprimeTodosProdutos(String nome) {
		return this.controleFornecedor.getNomeF(nome).imprimeTodosProdutos();
	}
	
	public boolean removeProduto(String nome, String descricao,String fornecedor) {
		return this.controleFornecedor.removeProduto(nome, descricao,fornecedor);
	}
	
	public boolean editaProduto(String nome, String descricao, String fornecedor, double novoPreco) {
		return  this.controleFornecedor.editaProduto(nome, descricao, fornecedor, novoPreco);
	}
}
