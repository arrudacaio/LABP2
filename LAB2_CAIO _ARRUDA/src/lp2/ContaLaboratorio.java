package lp2;

/**
 * @author Caio Arruda
 */
public class ContaLaboratorio {
	private String nomeLaboratorio;
	private int espacoOcupado = 0 ;
	private int cota;
	
	
	
	public ContaLaboratorio(String nomeLaboratorio) { // Construtor 1
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) { //Construtor 2
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
		
	}
	
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
		
	}
	
	public boolean atingiuCota() { 
		return espacoOcupado >= cota;
		
	}
	
	public String toString() {
		return nomeLaboratorio + " " + espacoOcupado + "/" + cota;
		
	}

}
