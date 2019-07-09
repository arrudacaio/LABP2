
public class Camera extends Dispositivo {

	private int resolucaoMP;
	private String tipoDeSensor;

	public Camera(String nome, String modelo, int ano, int amperagem, String tipoDeTela, int resolucaoMP,
			String tipoDeSensor) {
		super(nome, modelo, ano, amperagem, tipoDeTela);
		this.resolucaoMP = resolucaoMP;
		this.tipoDeSensor = tipoDeSensor;
	}

	public String toString() {
		return this.nome + " - " + this.modelo + " - " + this.tipoDeSensor + " (" + this.resolucaoMP + ") ";
	}

	@Override
	public double calculaPreco() {
		double preco = 0;
		if (this.tipoDeSensor.equals("CCD")) {
			preco = 10 * (this.ano - 2000) * this.resolucaoMP;
		} else if (this.tipoDeSensor.equals("CMOS")) {
			preco = 10 * (this.ano - 2000) * this.resolucaoMP / 2;
		}
		return preco;
	}

}
