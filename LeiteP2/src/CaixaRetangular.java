/**
 * Representação de uma Caixa Retangular
 * @author Usuário
 *
 */
public class CaixaRetangular extends Caixa {
	/**
	 * Constrói uma caixa retangular a partir de uma Caixa
	 * @param descricao
	 * @param personalizacao
	 * @param formato
	 * @param dimensao
	 */
	public CaixaRetangular(String descricao, String personalizacao, String formato, String dimensao) {
		super(descricao, personalizacao, formato, dimensao);
	}
	/**
	 * Calcula a area total de uma caixa retangular
	 */
	public double getAreaTotal() {
		double lado1 = Double.parseDouble(dimensao.split(",")[0]);
		double lado2 = Double.parseDouble(dimensao.split(",")[1]);
		return lado1*lado2; // Lançar exceçao caso dê <= 0 
		
		
	}
	/**
	 * Retorna o preço de uma caixa retangular
	 */
	public double getPreco() {
		return 0.10* getAreaTotal();
	}

	@Override
	public String toString() {
		return "CaixaRetangular [descricao=" + descricao + ", personalizacao=" + personalizacao + ", formato=" + formato
				+ ", dimensao=" + dimensao + "]";
	}
	
	

}
