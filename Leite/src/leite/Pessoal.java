package leite;

public class Pessoal implements Habilidades{

	private double autoEstima;
	private double nivelEmpatia;
	private int experienciaProf;
	
	public Pessoal(double autoEstima, double nivelEmpatia, int experienciaProf) {
		this.autoEstima = autoEstima;
		this.nivelEmpatia = nivelEmpatia;
		this.experienciaProf = experienciaProf;
	}
	
	@Override
	public double nivelHabilidade() {
		return 0.5* this.autoEstima + 0.3*(this.experienciaProf/10) + 0.2 * this.nivelEmpatia;
	}

}
