import java.util.HashMap;

public class ControleDispositivo {

	public HashMap<String, Dispositivo> mapaDispositivo;

	public ControleDispositivo() {
		this.mapaDispositivo = new HashMap<>();
	}

	public void cadastrarCelular(String nome, String modelo, int ano, int amperagem, String tipoDeTela, int memoriaGb,
			int versaoAndroid) {
		if (ano <= 2000) {
			throw new IllegalArgumentException("ano invalido");
		}
		if (nome.equals("") || nome == null) {
			throw new IllegalArgumentException("nome invalido");
		}
		if (modelo.equals("") || modelo == null) {
			throw new IllegalArgumentException("modelo inexistente");
		}
		if (!this.mapaDispositivo.containsKey(nome + modelo)) {
			this.mapaDispositivo.put(nome + modelo,
					new Celular(nome, modelo, ano, amperagem, tipoDeTela, memoriaGb, versaoAndroid));
		}
	}

	public void cadastrarJogo(String nome, String modelo, int ano, int amperagem, String tipoDeTela, int numeroDeJogos,
			int numeroDeJoysticks) {
		if (ano <= 2000) {
			throw new IllegalArgumentException("ano invalido");
		}
		if (nome.equals("") || nome == null) {
			throw new IllegalArgumentException("nome invalido");
		}
		if (modelo.equals("") || modelo == null) {
			throw new IllegalArgumentException("modelo inexistente");
		}
		if (!this.mapaDispositivo.containsKey(nome + modelo)) {
			this.mapaDispositivo.put(nome + modelo,
					new Jogo(nome, modelo, ano, amperagem, tipoDeTela, numeroDeJogos, numeroDeJoysticks));
		}
	}

	public void cadastrarCamera(String nome, String modelo, int ano, int amperagem, String tipoDeTela, int resolucaoMP,
			String tipoDeSensor) {
		if (ano <= 2000) {
			throw new IllegalArgumentException("ano invalido");
		}
		if (nome.equals("") || nome == null) {
			throw new IllegalArgumentException("nome invalido");
		}
		if (modelo.equals("") || modelo == null) {
			throw new IllegalArgumentException("modelo inexistente");
		}
		if (!this.mapaDispositivo.containsKey(nome + modelo)) {
			this.mapaDispositivo.put(nome + modelo,
					new Camera(nome, modelo, ano, amperagem, tipoDeTela, resolucaoMP, tipoDeSensor));
		}

	}

	public String exibirDispositivo(String nome, String modelo) {
		String dispositivo = "";
		if (this.mapaDispositivo.get(nome + modelo) != null) {
			dispositivo = this.mapaDispositivo.get(nome + modelo).toString();
		}
		return dispositivo;
	}

	public double calcularPreco(String nome, String modelo) {
		double preco = 0;
		if (nome.equals("") || nome == null) {
			throw new IllegalArgumentException("nome invalido");
		}
		if (modelo.equals("") || modelo == null) {
			throw new IllegalArgumentException("modelo inexistente");
		}
		if (this.mapaDispositivo.get(nome + modelo) != null) {
			preco = this.mapaDispositivo.get(nome + modelo).calculaPreco();
		}

		return preco;
	}

}
