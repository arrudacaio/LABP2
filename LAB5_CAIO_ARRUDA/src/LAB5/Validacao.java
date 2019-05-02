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

}
