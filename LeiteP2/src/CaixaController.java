import java.util.HashMap;

public class CaixaController {
	private HashMap<String, Caixa> mapaCaixa;

	public CaixaController() {
		this.mapaCaixa = new HashMap<>();
	}

	public boolean cadastraCaixa(String descricao, String personalizacao, String formato, String dimensao) {
		if(!this.mapaCaixa.containsKey(descricao)) {
			if(formato.equals("pentagonal")) {
				this.mapaCaixa.put(descricao, new CaixaPentagonal(descricao, personalizacao, formato, dimensao));
			}
			else if (formato.equals("retangular")){
				this.mapaCaixa.put(descricao, new CaixaRetangular(descricao, personalizacao, formato, dimensao));
			} 
			else if (formato.equals("circular")) {
				this.mapaCaixa.put(descricao, new CaixaCircular(descricao, personalizacao, formato, dimensao));
			}
		} return false;
		
	}
	
	public boolean editaPersonalizacao(String descricao, String novaPerso) {
		if(this.mapaCaixa.containsKey(descricao)) {
			this.mapaCaixa.get(descricao).setPersonalizacao(novaPerso);
		}
		
		return false;
	}
	
	public boolean removeCaixa(String descricao) {
		if(this.mapaCaixa.containsKey(descricao)) {
			this.mapaCaixa.remove(descricao);
			return true;
		} 
		return false ;
		
	}
	public boolean consultaCaixa(String descricao,String personalizacao,String formato) {
		if(this.mapaCaixa.containsKey(descricao)) {
			if(this.mapaCaixa.get(descricao).getFormato().equals(formato) && this.mapaCaixa.get(descricao).getPersonalizacao().equals(personalizacao)) {
				return true;
			}
		} return false;
	}
	
	public int totalCaixas() {
		return this.mapaCaixa.size();
	}

}
