package LAB5;

public class Facade {
	private ControleCliente controleCliente;

	public Facade() {
		this.controleCliente = new ControleCliente();

	}

	public String cadastraCliente(String nome, String email, String local, String cpf) {
		return this.controleCliente.cadastraCliente(nome, email, local, cpf);

	}

}
