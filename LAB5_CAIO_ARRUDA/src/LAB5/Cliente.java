package LAB5;

public class Cliente implements Comparable<Cliente>{
	private String nome;
	private String email;
	private String local;
	private String cpf;

	public Cliente(String nome, String email, String local, String cpf) {
		this.nome = nome;
		this.email = email;
		this.local = local;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.local + " - " + this.email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.nome.trim().toUpperCase().compareTo(o.nome.trim().toUpperCase());
	}

}
