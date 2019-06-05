import java.util.HashMap;

public class CaixaController {
	private HashMap<String, Caixa> mapaCaixa;

	public CaixaController() {
		this.mapaCaixa = new HashMap<>();
	}

	public void cadastraCaixa(String descricao, String personalizacao, String formato, String dimensao) {
		if(formato.equals("Pentagonal")) {
			this.mapaCaixa.put(descricao,  new CaixaPentagonal(descricao,personalizacao,formato,dimensao));
		} 
		else if (formato.equals("Retangular")) {
			this.mapaCaixa.put(descricao, new CaixaRetangular(descricao,personalizacao,formato,dimensao));
		} else if (formato.equals("Circular")) {
			this.mapaCaixa.put(descricao, new CaixaCircular(descricao,personalizacao,formato,dimensao));
			
		}
		
	}

}
