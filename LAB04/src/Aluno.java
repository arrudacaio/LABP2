
public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	
	
	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome; 
		this.matricula = matricula;
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	
	
}
