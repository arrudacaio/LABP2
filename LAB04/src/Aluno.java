/**
 * Representação de um Aluno.
 * 
 * @author Caio José dos Santos Arruda
 *
 */
public class Aluno {
	/**
	 * Representa o nome do aluno.
	 */
	private String nome;
	/**
	 * Representa a matrícula do aluno.
	 */
	private String matricula;
	/**
	 * Representa o curso do Aluno
	 */
	private String curso;

	/**
	 * Constrói um Aluno a partir de um nome, matrícula e um curso.
	 * 
	 * @param nome      nome do aluno
	 * @param matricula matricula do aluno
	 * @param curso     curso do aluno
	 */

	public Aluno(String nome, String matricula, String curso) {

		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	/**
	 * Retorna a string que representa um Aluno.
	 */
	@Override
	public String toString() {
		return "Aluno: " + this.matricula + " " + "-" + " " + this.nome + " " + "-" + " " + this.curso + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
