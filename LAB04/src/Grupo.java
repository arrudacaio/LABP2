import java.util.HashSet;

/**
 * Representação de um Grupo de estudos.
 * 
 * @author Caio José dos Santos Arruda
 *
 */
public class Grupo {
	/**
	 * Representa o nome do grupo.
	 */
	private String nome;
	/**
	 * Representa um Conjunto de alunos.
	 */
	private HashSet<Aluno> alunos;

	/**
	 * Constrói um Grupo a partir de um nome passado como parametro e cria um
	 * Conjunto de alunos;
	 * 
	 * @param nome nome do grupo.
	 */
	public Grupo(String nome) {
		this.nome = nome;
		this.alunos = new HashSet<>();
	}

	/**
	 * Adiciona o aluno em um Conjunto de alunos.
	 * 
	 * @param aluno aluno a ser adicionado.
	 */

	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);

	}

	/**
	 * Representação textual de um Grupo de estudos.
	 * 
	 * @return String que representa o grupo.
	 */

	public String toStringGrupo() {
		String listaAlunos = "";
		for (Aluno aluno : alunos) {
			listaAlunos +=  "[" + aluno.toString() + "]";
		}

		return "Grupo: " + getNome() + "\n Alunos do grupo " + getNome() + ": \n" + listaAlunos;
	}

	/**
	 * Permite acessar o Conjunto de Alunos.
	 * @return Conjunto de alunos
	 */
	public HashSet<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * Permite acessar o nome do grupo.
	 * 
	 * @return nome do grupo
	 */

	public String getNome() {
		return nome;

	}
}