
public class Facade {
	private CaixaController controleCaixas;
	
	public Facade() {
		this.controleCaixas = new CaixaController();
	}

	public boolean cadastraCaixa(String descricao, String personalizacao, String formato, String dimensao) {
		return this.controleCaixas.cadastraCaixa(descricao, personalizacao, formato, dimensao);
	}
	
	public boolean editaPersonalizacao(String descricao, String novaPerso) {
		return this.controleCaixas.editaPersonalizacao(descricao, novaPerso);
	}
	public boolean removeCaixa(String descricao) {
		return this.controleCaixas.removeCaixa(descricao);
	}
	public int totalCaixas() {
		return this.controleCaixas.totalCaixas();
	}
	
	public boolean consultaCaixa(String descricao,String personalizacao,String formato) {
		return this.controleCaixas.consultaCaixa(descricao, personalizacao, formato);
	}
}
