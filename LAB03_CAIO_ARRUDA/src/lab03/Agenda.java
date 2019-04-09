package lab03;

import java.util.Arrays;

/**
 * Representação de uma Agenda de contatos telefônicos.
 * 
 * @author Caio José dos Santos Arruda
 *
 */
public class Agenda {
	/**
	 * Lista de contatos no formato de Array.
	 * 
	 */
	private Contato[] arrayContatos;

	/**
	 * Constrói uma Agenda de contatos com disponibilidade de 100 contatos.
	 * 
	 * 
	 */
	public Agenda() {
		this.arrayContatos = new Contato[100];
	}

	/**
	 * 
	 * @param nome      nome do contato
	 * @param sobrenome sobrenome do contato
	 * @param numero    numero de telefone do contato
	 * @param posicao   posicao do contato à ser salvo na agenda telefônica
	 * @return Retorna verdadeiro caso o cadastro seja realizado, falso, se falhar o
	 *         cadastro
	 */
	public boolean cadastraContato(String nome, String sobrenome, String numero, int posicao) {
		verificaNomeNulo(nome);
		verificaNomeVazio(nome);
		if (posicao >= 1 && posicao <= 100) {
			this.arrayContatos[posicao - 1] = new Contato(nome, sobrenome, numero);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param posicao posição do contato na agenda telefônica
	 * @return retorna uma String que representa a posição inválida ou os dados do
	 *         contato.
	 */

	public String exibeContato(int posicao) {
		if (posicao < 1 || posicao > 100 || this.arrayContatos[posicao - 1] == null) {
			return "POSIÇÃO INVÁLIDA!";
		} else {
			return arrayContatos[posicao - 1].toString();
		}
	}

	/**
	 * 
	 * @return String que representa os dados de um Contato, caso não esteja vazio.
	 */

	public String listarContato() {
		String texto = "";
		for (int i = 0; i < this.arrayContatos.length; i++) {
			if (this.arrayContatos[i] != null) {
				texto += i + 1 + this.arrayContatos[i].imprimeContato() + "\n";
			}
		}
		return texto;
	}
	
	/**
	 * Verifica se o nome passado como parametro é vazio
	 * @param nome nome do contato
	 */
	public void verificaNomeVazio(String nome){
		if (nome.equals("") || nome.trim() == "") {
			throw new IllegalArgumentException("String vazia!");
		}
		

	}
	/**
	 * Verifica se o nome passado como parametro é nulo
	 * @param nome nome do contato
	 */
	
	public void verificaNomeNulo(String nome) {
		if  (nome == null) {
			throw new NullPointerException("String nula!");
		}
		
	}

	/**
	 * Gera o hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arrayContatos);
		return result;
	}

	/**
	 * Gera o método equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(arrayContatos, other.arrayContatos))
			return false;
		return true;
	}
}
