package LAB5;

public class Validacao {

	public void verificaCadastraCliente(String cpf,String nome, String email, String local) {
		if (nome == null) {
			throw new NullPointerException("Erro no cadastro do cliente: nome nao pode ser vazio ou nulo.");
		}
		if (nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("Erro no cadastro do cliente: nome nao pode ser vazio ou nulo.");
		}
		if (email == null) {
			throw new NullPointerException("Erro no cadastro do cliente: email nao pode ser vazio ou nulo.");
		}
		if (email.equals("") || email.trim() == "") {
			throw new IllegalArgumentException("Erro no cadastro do cliente: email nao pode ser vazio ou nulo.");
		}
		if (local == null) {
			throw new NullPointerException("Erro no cadastro do cliente: localizacao nao pode ser vazia ou nula.");
		}
		if (local.equals("") || local.trim() == "") {
			throw new IllegalArgumentException("Erro no cadastro do cliente: localizacao nao pode ser vazia ou nula.");
		}
		if (cpf == null || cpf.length() != 11) {
			throw new NullPointerException("Erro no cadastro do cliente: cpf invalido.");
		}
		if (cpf.equals("") || cpf.trim() == "" || cpf.length() != 11) {
			throw new IllegalArgumentException("Erro no cadastro do cliente: cpf invalido.");
		}

	}
	
	public void verificaEditaCadastraCliente(String cpf, String atributo, String novoValor) {
		if(cpf == null) {
			throw new NullPointerException("Erro na edicao do cliente: cliente nao existe");
		} 
		if(cpf.equals("") || cpf.trim() == "") {
			throw new IllegalArgumentException("Erro na edicao do cliente: cliente nao existe");
		}
		if(cpf.length() != 11) {
			throw new IllegalArgumentException("Erro na edicao do cliente: cliente nao existe.");
		}
		if(atributo == null) {
			throw new NullPointerException("Erro na edicao do cliente: atributo nao pode ser vazio ou nulo.");
		} 
		if(atributo.equals("") || atributo.trim() == "") {
			throw new IllegalArgumentException("Erro na edicao do cliente: atributo nao pode ser vazio ou nulo.");
		}
		if(novoValor == null) {
			throw new NullPointerException("Erro na edicao do cliente: novo valor nao pode ser vazio ou nulo.");
		} 
		if(novoValor.equals("") || novoValor.trim() == "") {
			throw new IllegalArgumentException("Erro na edicao do cliente: novo valor nao pode ser vazio ou nulo.");
		}
		
		
	}

	public void verificaCadastraFornecedor(String nome, String email, String telefone) {
		if (nome == null) {
			throw new NullPointerException("Erro no cadastro do fornecedor: nome nao pode ser vazio ou nulo.");
		}
		if (nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("Erro no cadastro do fornecedor: nome nao pode ser vazio ou nulo.");
		}
		if (email == null) {
			throw new NullPointerException("Erro no cadastro do fornecedor: email nao pode ser vazio ou nulo.");
		}
		if (email.equals("") || email.trim() == "") {
			throw new IllegalArgumentException("Erro no cadastro do fornecedor: email nao pode ser vazio ou nulo.");
		}
		if (telefone == null) {
			throw new NullPointerException("Erro no cadastro do fornecedor: telefone nao pode ser vazio ou nulo.");
		}
		if (telefone.equals("") || telefone.trim() == "") {
			throw new IllegalArgumentException("Erro no cadastro do fornecedor: telefone nao pode ser vazio ou nulo.");
		}

	}

	public void verificaEditaFornecedor(String nome, String atributo, String novoValor) {
		if(nome == null) {
			throw new NullPointerException("Erro na edicao do fornecedor: nome nao pode ser vazio ou nulo.");
		} 
		if(nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("Erro na edicao do fornecedor: nome nao pode ser vazio ou nulo.");
		}
	
		if(atributo == null) {
			throw new NullPointerException("Erro na edicao do fornecedor: atributo nao pode ser vazio ou nulo.");
		} 
		if(atributo.equals("") || atributo.trim() == "") {
			throw new IllegalArgumentException("Erro na edicao do fornecedor: atributo nao pode ser vazio ou nulo.");
		}
		if(novoValor == null) {
			throw new NullPointerException("Erro na edicao do fornecedor: novo valor nao pode ser vazio ou nulo.");
		} 
		if(novoValor.equals("") || novoValor.trim() == "") {
			throw new IllegalArgumentException("Erro na edicao do fornecedor: novo valor nao pode ser vazio ou nulo.");
		}
		
	}
	
	public void verificaRemoveFornecedor(String nome) {
		if(nome == null) {
			throw new NullPointerException("Erro na remocao do fornecedor: nome do fornecedor nao pode ser nulo.");
		} 
		if(nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("Erro na remocao do fornecedor: nome do fornecedor nao pode ser vazio.");
		}
	}
}
