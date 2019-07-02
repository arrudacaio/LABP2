package leite;

public class Pessoa {
	private double autoEstima;
	private double nivelEmpatia;
	private int experienciaProf;
	private Habilidades habilidadeAtiva;

	
	
	
	public Pessoa(double autoEstima, double nivelEmpatia, int experienciaProf) {
		this.autoEstima = autoEstima;
		this.nivelEmpatia = nivelEmpatia;
		this.experienciaProf = experienciaProf;
		this.habilidadeAtiva = null;
	}
	
	public void ativaHabilidadePessoal() {
		this.setHabilidadeAtiva(new Pessoal(this.autoEstima,this.nivelEmpatia, this.experienciaProf));
		
	}
	
	public void ativaHabilidadeProfissional() {
		this.setHabilidadeAtiva(new Profissional(this.experienciaProf));
		
	}
	
	public void  ativaHabilidadeInterpessoal() {
		this.setHabilidadeAtiva(new Interpessoal(this.autoEstima, this.nivelEmpatia, this.experienciaProf));
	}

	public void setHabilidadeAtiva(Habilidades habilidadeAtiva) {
		this.habilidadeAtiva = habilidadeAtiva;
	}
	
	
	public double nivelHabilidade() {
		return this.habilidadeAtiva.nivelHabilidade();
	}
	
	
	
	

}
