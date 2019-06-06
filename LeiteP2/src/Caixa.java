/**
 * Modelo de Caixa 
 * @author Caio Arruda
 *
 */
public abstract class Caixa {
	/**
	 * Descrição da caixa
	 */
	protected String descricao;
	/**
	 * Personalização da caixa
	 */
	protected String personalizacao;
	/**
	 * Formato da caixa
	 */
	protected String formato;
	/**
	 * Dimensao da caixa
	 */
	protected String dimensao;
	
	/**
	 * Constrói uma Caixa a partr de sua descricao, personalizacao, formato e dimensão
	 * @param descricao
	 * @param personalizacao
	 * @param formato
	 * @param dimensao
	 */
	public Caixa(String descricao, String personalizacao, String formato, String dimensao) {
		this.descricao = descricao;
		this.personalizacao = personalizacao;
		this.formato = formato;
		this.dimensao = dimensao;
	}
	/**
	 * Calcula a area total de uma caixa de um determinado formato
	 * @return
	 */
	public abstract double getAreaTotal();
	
	
	public String getDescricao() {
		return descricao;
	}

	public String getFormato() {
		return formato;
	}

	public String getDimensao() {
		return dimensao;
	}

	public void setPersonalizacao(String personalizacao) {
		this.personalizacao = personalizacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caixa other = (Caixa) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	/**
	 * Calcula o preço de uma caixa de um determinado formato
	 * @return reço
	 */

	public abstract double getPreco();
	
	public String getPersonalizacao() {
		return personalizacao;
	}
	

}
