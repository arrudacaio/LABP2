package lp2;

public class Coisa {

	public static void main(String[] args) {
		ContaLaboratorio contaLCC2 = new ContaLaboratorio("LCC2");

        contaLCC2.consomeEspaco(1999);

        System.out.println(contaLCC2.atingiuCota());

        contaLCC2.consomeEspaco(2);

        System.out.println(contaLCC2.atingiuCota());

        contaLCC2.liberaEspaco(1);

        System.out.println(contaLCC2.atingiuCota());

        contaLCC2.liberaEspaco(1);

        System.out.println(contaLCC2.atingiuCota());

        System.out.println(contaLCC2.toString());
	}

}
