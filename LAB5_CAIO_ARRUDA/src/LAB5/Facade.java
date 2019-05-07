package LAB5;

public class Facade {
	private ControleCliente controleCliente;

	public Facade() {
		this.controleCliente = new ControleCliente();

	}

	public String cadastraCliente(String nome, String email, String local, String cpf) {
		return this.controleCliente.cadastraCliente(nome, email, local, cpf);
	}

	public String editaCadastraCliente(String cpf, String nome, String email, String local) {
		return this.controleCliente.editaCadastraCliente(cpf, nome, email, local);
	}

	public String removeClienteCadastrado(String cpf) {
		return this.controleCliente.removeClienteCadastrado(cpf);
	}

	public String imprimeCliente(String cpf) {
		return this.controleCliente.imprimeCliente(cpf);
	}

	public String imprimeClientesCadastrados() {
		return this.controleCliente.imprimeClientesCadastrados();
	}
}
