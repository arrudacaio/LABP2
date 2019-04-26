import java.util.HashMap;

public class ControleDeAlunos {
	private HashMap<String, Aluno> mapaMatriculaAlunos = new HashMap<>();
	
	
	


	public ControleDeAlunos(HashMap<String, Aluno> mapaMatriculaAlunos) {
		this.mapaMatriculaAlunos = mapaMatriculaAlunos;
	}





	public HashMap<String, Aluno> getMapaMatriculaAlunos() {
		return mapaMatriculaAlunos;
	}





	public String cadastraAlunos(String matricula, String nome, String curso) {
		String result;
		if (!this.mapaMatriculaAlunos.containsKey(matricula)) {
			Aluno aluno = new Aluno(nome, matricula, curso);
			this.mapaMatriculaAlunos.put(matricula, aluno);
			result = "CADASTRO REALIZADO!";
		} else {
			result = "MATRÍCULA JÁ CADASTRADA!";
		}

		return result;

	}





	@Override
	public String toString() {
		return "ControleDeAlunos [mapaMatriculaAlunos=" + mapaMatriculaAlunos + "]";
	}
}

	

	


