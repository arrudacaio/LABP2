package lab03;

/**
 * 
 * Representação de um contato telefônico.
 *
 * 
 * @author Caio José dos Santos Arruda
 * 
 */
public class Contato {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
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
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}

	/**
	 * Nome do contato.
	 */
	private String nome;
	/**
	 * Sobrenome do contato.
	 */
	private String sobrenome;
	/**
	 * Representa o telefone do contato.
	 */
	private String numero;

	/**
	 * Constrói um Contato de uma pessoa, a partir do seu nome, sobrenome e
	 * telefone.
	 * 
	 * @param nome      nome do contato
	 * @param sobrenome sobrenome do contato
	 * @param numero    telefone do contato
	 */
	public Contato(String nome, String sobrenome, String numero) {
		verificaNomeNulo(nome);
		verificaNomeVazio(nome);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numero = numero;
	}

	/**
	 * Retorna o nome do contato.
	 * 
	 * @return o nome do Contato
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Modifica o nome do contato
	 * 
	 * @param nome nome do contato.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o sobrenome do contato.
	 * 
	 * @return o sobrenome do contato.
	 */

	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Modifica o sobrenome do contato.
	 * 
	 * @param sobrenome sobrenome do contato.
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * Retorna o número de telefone do contato.
	 * 
	 * @return telefone do contato
	 */

	public String getNumero() {
		return numero;
	}

	/**
	 * Modifica o telefone do contato.
	 * 
	 * @param numero numero de telefone do contato.
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Retorna a string que representa um contato.
	 * 
	 * @return a representação em String de um contato.
	 */

	public String toString() {
		return this.getNome() + " " + this.getSobrenome() + " " + "-" + " " + this.getNumero();
	}

	/**
	 * Retorna a string que representa um contato
	 * 
	 * @return a representação em string de um contato.
	 */
	public String imprimeContato() {
		return " " + "-" + " " + this.getNome() + " " + this.getSobrenome();
	}

	/**
	 * Verifica se o nome passado como parametro é vazio
	 * 
	 * @param nome nome do contato
	 */
	public void verificaNomeVazio(String nome) {
		if (nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("String vazia!");
		}

	}

	/**
	 * Verifica se o nome passado como parametro é nulo
	 * 
	 * @param nome nome do contato
	 */

	public void verificaNomeNulo(String nome) {
		if (nome == null) {
			throw new NullPointerException("String nula!");
		}

	}

}
