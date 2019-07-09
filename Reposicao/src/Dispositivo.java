
public abstract class Dispositivo {

	protected String nome;
	protected String modelo;
	protected int ano;
	protected int amperagem;
	protected String tipoDeTela;

	public Dispositivo(String nome, String modelo, int ano, int amperagem, String tipoDeTela) {
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.amperagem = amperagem;
		this.tipoDeTela = tipoDeTela;
	}

	public String getNome() {
		return nome;
	}

	public String getModelo() {
		return modelo;
	}

	public abstract double calculaPreco();

}
