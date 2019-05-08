package LAB5;

public class Validacao {

	public void verificaCadastraCliente(String nome, String email, String local, String cpf) {
		if (nome == null) {
			throw new NullPointerException("String nula!");
		}
		if (nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("String vazia!");
		}
		if (email == null) {
			throw new NullPointerException("String nula!");
		}
		if (email.equals("") || email.trim() == "") {
			throw new IllegalArgumentException("String vazia!");
		}
		if (local == null) {
			throw new NullPointerException("local nulo!");
		}
		if (local.equals("") || local.trim() == "") {
			throw new IllegalArgumentException("String vazia!");
		}
		if (cpf == null) {
			throw new NullPointerException("cpf nulo.");
		}
		if (cpf.equals("") || cpf.trim() == "") {
			throw new IllegalArgumentException("cpf vazio!");
		}

	}

	public void verificaCadastraFornecedor(String nome, String email, String telefone) {
		if (nome == null) {
			throw new NullPointerException("Nome nulo!");
		}
		if (nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("Nome vazio!");
		}
		if (email == null) {
			throw new NullPointerException("Email nulo!");
		}
		if (email.equals("") || email.trim() == "") {
			throw new IllegalArgumentException("Email vazio!");
		}
		if (telefone == null) {
			throw new NullPointerException("Telefone nulo!");
		}
		if (telefone.equals("") || telefone.trim() == "") {
			throw new IllegalArgumentException("Telefone vazio!");
		}

	}

}
