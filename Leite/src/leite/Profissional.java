package leite;

public class Profissional implements Habilidades {

	private int experienciaProf;
	
	public Profissional(int experienciaProf) {
		this.experienciaProf = experienciaProf;
	}
	
	@Override
	public double nivelHabilidade() {
		return (this.experienciaProf/10);
	}

}
