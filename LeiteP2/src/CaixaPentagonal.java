/**
 * Representação de uma Caixa Pentagonal
 * @author Caio Arruda
 *
 */
public class CaixaPentagonal extends Caixa {
	/**
	 * Constrói uma caixa pentagonal a partir do construtor de caixa
	 * @param descricao
	 * @param personalizacao
	 * @param formato
	 * @param dimensao
	 */
	public CaixaPentagonal(String descricao, String personalizacao, String formato, String dimensao) {
		super(descricao, personalizacao, formato, dimensao);
		
	}


	/**
	 * Calcula a area total de uma caixa pentagonal
	 */
	public double getAreaTotal() {
		double lado = Double.parseDouble(dimensao); 
		double altura = (lado / 2 * Math.sqrt(5 + 2) * Math.sqrt(5)) / 2;
		return 5.0 * (lado * altura) / 2; // Lançar exceçao caso dê <= 0 
	}
	
	/**
	 * Retorna o preço da caixa
	 */
	
	public double getPreco() {
		return 0.10* getAreaTotal();
	}


	@Override
	public String toString() {
		return "CaixaPentagonal [descricao=" + descricao + ", personalizacao=" + personalizacao + ", formato=" + formato
				+ ", dimensao=" + dimensao + "]";
	}



	
}
