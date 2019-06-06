/**
 * Representação de uma Caixa Circular 
 * @author Caio Arruda
 **
 */
public class CaixaCircular extends Caixa {

	/**
	 * Constrói uma caixa circular a partir do construtor da classe Pai (Caixa)
	 * @param descricao
	 * @param personalizacao
	 * @param formato
	 * @param dimensao
	 */
	public CaixaCircular(String descricao, String personalizacao, String formato, String dimensao) {
		super(descricao, personalizacao, formato, dimensao);
	}
	
	/**
	 * Calcula a area totla de uma caixa circular
	 */
	public double getAreaTotal() {
		double raio = Double.parseDouble(dimensao);
		return 3.14*(Math.sqrt(raio)); // Lançar exceçao caso dê <= 0 
	}
	/**
	 * Retorna o preço 
	 */
	public double getPreco() {
		return 0.10* getAreaTotal();
	}

	@Override
	public String toString() {
		return "CaixaCircular [descricao=" + descricao + ", personalizacao=" + personalizacao + ", formato=" + formato
				+ ", dimensao=" + dimensao + "]";
	}

	

}
