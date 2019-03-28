package lp2;

import java.util.Arrays;

/**
 * 
 * Representação de uma Disciplina/Cadeira. Toda Disciplina precisa de um nome
 * para identificação.
 *
 * 
 * @author Caio Arruda
 */
public class Disciplina {
	/**
	 * Nome da Disciplina.
	 */
	private String nomeDisciplina;
	/**
	 * Conta as horas estudadas.
	 */
	private int contaHoras;
	/**
	 * Cria um array para alocar as notas do aluno.
	 */
	private double[] notas;
	
	/**
	 * 
	 * Constrói uma Disciplina a partir do seu nome e suas 4 notas.
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
	}
	
	/**
	 * 
	 * Cadastra a quantidade de horas  para determinada Disciplina.
	 */
	public void cadastraHoras(int horas) {
		contaHoras += horas;

	}
	
	
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
	}

	public double media() {
		double acumulador = 0;
		for (int i = 0; i < notas.length; i++) {
			acumulador += notas[i];
		}
		double media = acumulador / notas.length;
		return media;
	}

	public boolean aprovado() {
		return (media() >= 7.0);

	}

	public String toString() {
		return nomeDisciplina + " " + contaHoras + " " + this.media() + " " + Arrays.toString(notas);

	}

}
