package leite;

public class Interpessoal implements Habilidades{
	
	private double autoEstima;
	private double nivelEmpatia;
	private int experienciaProf;

	
	
	public Interpessoal(double autoEstima, double nivelEmpatia, int experienciaProf) {
		this.autoEstima = autoEstima;
		this.nivelEmpatia = nivelEmpatia;
		this.experienciaProf = experienciaProf;
	}



	@Override
	public double nivelHabilidade() {
		return 0.3 * this.autoEstima + 0.2*(this.experienciaProf/10) + 0.5 * this.nivelEmpatia;
	}

}
