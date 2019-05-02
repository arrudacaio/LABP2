import java.util.ArrayList;
import java.util.HashMap;

/**
 * Constrói um controle de alunos.
 * 
 * @author Caio José dos Santos Arruda.
 *
 */
public class ControleDeAlunos {
	/**
	 * Representa um mapa de alunos matriculados. Cada aluno é associado a uma
	 * matrícula.
	 */
	private HashMap<String, Aluno> mapaMatriculaAlunos;
	/**
	 * Representa um mapa de Grupos. Cada aluno é associado a um nome.
	 */
	private HashMap<String, Grupo> mapaGrupos;
	/**
	 * ArraList do tipo Aluno, que armazena os alunos que responderam.
	 */
	private ArrayList<Aluno> responderam;

	/**
	 * Constrói um Controle de Alunos, possuindo um mapa de alunos, de grupos e uma
	 * Lista de alunos que responderam.
	 */
	public ControleDeAlunos() {
		this.mapaMatriculaAlunos = new HashMap<>();
		this.mapaGrupos = new HashMap<>();
		this.responderam = new ArrayList<>();
	}

	/**
	 * Consulta um Aluno a partir de sua matrícula;
	 * 
	 * @param matricula matrícula do Aluno.
	 * @return String que representa o Aluno.
	 */
	public String consultaAluno(String matricula) {
		String result = "Aluno não cadastrado.";
		if (this.mapaMatriculaAlunos.containsKey(matricula)) {
			result = this.mapaMatriculaAlunos.get(matricula).toString();
		}
		return result;
	}

	/**
	 * Cadastra Aluno no Mapa de Alunos a partir de sua matrícula, nome e curso.
	 * 
	 * @param matricula matrícula do aluno
	 * @param nome      nome do aluno
	 * @param curso     curso do aluno
	 * @return
	 */
	public boolean cadastraAlunos(String matricula, String nome, String curso) {
		if (!this.mapaMatriculaAlunos.containsKey(matricula)) {
			Aluno aluno = new Aluno(nome, matricula, curso);
			this.mapaMatriculaAlunos.put(matricula, aluno);
			return true;
		}
		return false;

	}

	/**
	 * Cadastra um Grupo a partir de seu nome.
	 * 
	 * @param nome nome do grupo
	 * @return True caso consiga cadastrar, se não, false.
	 */

	public boolean cadastraGrupos(String nome) {
		nome = nome.toLowerCase();
		if (!this.mapaGrupos.containsKey(nome)) {
			Grupo grupo = new Grupo(nome);
			this.mapaGrupos.put(nome, grupo);
			return true;
		}
		return false;

	}

	/**
	 * Aloca um aluno em um grupo a partir de uma matrícula.
	 * 
	 * @param matricula matrícula do aluno
	 * @param nomeGrupo nome do grupo
	 * @return String que indica se o aluno foi alocado no grupo ou não.
	 */

	public String alocaAluno(String matricula, String nomeGrupo) {
		try {
			Grupo grupo = this.mapaGrupos.get(nomeGrupo);
			Aluno aluno = this.mapaMatriculaAlunos.get(matricula);
			grupo.addAluno(aluno);
			return "ALUNO ALOCADO\n";
		} catch (NullPointerException exception) {
			return "Aluno ou grupo não cadastrado.";
		}
	}

	/**
	 * Representação em String dos Grupos cadastrados.
	 * 
	 * @param nomeGrupo nome do grupo
	 * @return String que representa os grupos.
	 */
	public String imprimeGrupos(String nomeGrupo) {
		return this.mapaGrupos.get(nomeGrupo).toStringGrupo();

	}

	/**
	 * Cadastra os alunos que responderam questões no quadro a partir de sua
	 * matrícula no array responderam.
	 * 
	 * @param matricula matricula do aluno
	 * @return True se cadastrou, se não, false.
	 */

	public boolean cadastraAlunoResponde(String matricula) {
		if (!this.responderam.contains(this.mapaMatriculaAlunos.get(matricula))) {
			this.responderam.add(this.mapaMatriculaAlunos.get(matricula));
			return true;
		}
		return false;
	}

	/**
	 * Rpresentação textual dos Alunos que Responderam.
	 * 
	 * @return string que representa os alunos que responderam, obedecendo a ordem.
	 */
	public String imprimeResponderam() {
		String result = "";
		for (Aluno aluno : this.responderam) {
			result += aluno.toString();
		}
		return "Alunos: \n" + result;
	}

	/**
	 * Permite acessar o mapa de matrícula dos Alunos
	 * @return mapa de matrícula dos alunos.
	 */
	public HashMap<String, Aluno> getMapaMatriculaAlunos() {
		return mapaMatriculaAlunos;
	}
	/**
	 * Permite acessar o mapa de grupos;
	 * @return retorna o mapa de grupos;
	 */
	public HashMap<String, Grupo> getMapaGrupos() {
		return mapaGrupos;
	}

	/**
	 * Permite acessar o conjunto dos alunos que responderam questões no quadro.
	 * @return
	 */
	public ArrayList<Aluno> getResponderam() {
		return responderam;
	}

}