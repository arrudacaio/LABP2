
public class Jogo extends Dispositivo {

	private int numeroDeJogos;
	private int numeroDeJoysticks;

	public Jogo(String nome, String modelo, int ano, int amperagem, String tipoDeTela, int numeroDeJogos,
			int numeroDeJoysticks) {
		super(nome, modelo, ano, amperagem, tipoDeTela);
		this.numeroDeJogos = numeroDeJogos;
		this.numeroDeJoysticks = numeroDeJoysticks;
	}

	public String toString() {
		return this.nome + " - " + this.modelo + " - " + this.numeroDeJogos + " jogo(s)/" + this.numeroDeJoysticks
				+ " joys";
		// NOME - MODELO - jogos / joysticks

	}

	@Override
	public double calculaPreco() {
		return 10 * (this.ano - 2000) * this.amperagem / 1000 + (100 * (this.numeroDeJogos));
	}

}
