
public class Celular extends Dispositivo {

	private int memoriaGb;
	private int versaoAndroid;

	public Celular(String nome, String modelo, int ano, int amperagem, String tipoDeTela, int memoriaGb,
			int versaoAndroid) {
		super(nome, modelo, ano, amperagem, tipoDeTela);
		this.memoriaGb = memoriaGb;
		this.versaoAndroid = versaoAndroid;
	}

	public String toString() {
		return this.nome + " - " + this.modelo + " (" + this.tipoDeTela + ") - " + this.memoriaGb + " ("
				+ this.versaoAndroid + ") ";
		// NOME - MODELO (TELA) - memória (Android)
	}

	@Override
	public double calculaPreco() {
		return 10 * (this.ano - 2000) * this.memoriaGb / 32 * this.versaoAndroid;

	}

}
