package lab03;

public class Agenda {
	private Contato[] arrayContatos;

	public Agenda() {

		this.arrayContatos = new Contato[100];
	}

	public boolean cadastraContato(String nome, String sobrenome, String numero, int posicao) {
		if (posicao >= 1 && posicao <= 100) {
			this.arrayContatos[posicao - 1] = new Contato(nome, sobrenome, numero);
			return true;
		}
		return false;
	}

	public String exibeContato(int posicao) {
		if (posicao < 1 || posicao > 100 || this.arrayContatos[posicao - 1] == null) {
			return "POSIÇÃO INVÁLIDA!";
		} else {
			return arrayContatos[posicao - 1].toString();
		}
	}

	public void listarContato(){
		for (int i = 0; i < this.arrayContatos.length; i++){
			if (this.arrayContatos[i] != null){
				return i++ + this.arrayContatos[i].imprimeContato();
			}
		}

	}
}
