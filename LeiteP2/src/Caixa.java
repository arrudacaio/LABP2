
public abstract class Caixa {
	private String descricao;
	private String personalizacao;
	private String formato;
	private String dimensao;
	
	public Caixa(String descricao, String personalizacao, String formato, String dimensao) {
		this.descricao = descricao;
		this.personalizacao = personalizacao;
		this.formato = formato;
		this.dimensao = dimensao;
	}
	
	public abstract void estipulaPreco();
	

}
