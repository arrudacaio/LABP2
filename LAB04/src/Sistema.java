import java.util.Scanner;

public class Sistema {

	public static void menu() {
		System.out.println("(C)adastrar Aluno");
		System.out.println("(E)xibir Aluno");
		System.out.println("(N)ovo Grupo");
		System.out.println("(A)locar Aluno no Grupo e Imprimir Grupos");
		System.out.println("(R)egistrar Aluno que Respondeu");
		System.out.println("(I)mprimir Alunos que Responderam");
		System.out.println("(O)ra, vamos fechar o programa!");
		System.out.println("");
		System.out.println("Opção> ");

	}

	public static void main(String[] args) {
		menu();
		Scanner sc = new Scanner(System.in);
		String entrada, matricula, nome, curso;

		do {
			entrada = sc.nextLine();
			if (entrada.equals("C")) {
				System.out.print("Matrícula: ");
				matricula = sc.nextLine();
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Curso: ");
				curso = sc.nextLine();

				// CADASTRAR EM UM CONTROLE DE ALUNOS, POIS AQUI SÓ DEVE SER ENTRADA E SAÍDA DE
				// DADOS!!!
				// vou precisar criar um aluno aqui
				// Isolaaaaaaaaaar
				// chamar esse controle e chamar um méotod pra cadastrar?

			} else if (entrada.equals("E")) {

			} else if (entrada.equals("N")) {

			} else if (entrada.equals("A")) {

			} else if (entrada.equals("R")) {

			} else if (entrada.equals("I")) {

			} else if (entrada.equals("O")) {

			}

		} while (!entrada.equals("O"));
		sc.close();
	}
}
