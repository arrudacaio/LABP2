import java.util.HashMap;
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
		System.out.print("Opção> ");

	}

	public static void main(String[] args) {
		ControleDeAlunos controle = new ControleDeAlunos();
		Scanner sc = new Scanner(System.in);
		String entrada, matricula, nome, curso, grupo, opcao;

		do {
			menu();
			entrada = sc.nextLine();
			if (entrada.equals("C")) {
				System.out.print("Matrícula: ");
				matricula = sc.nextLine();
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Curso: ");
				curso = sc.nextLine();
				if (controle.cadastraAlunos(matricula, nome, curso)) {
					System.out.println("CADASTRO REALIZADO!\n");
				} else {
					System.out.println("MATRÍCULA JÁ CADASTRADA!\n");
				}

			} else if (entrada.equals("E")) {
				System.out.print("Matrícula a ser consultada: ");
				matricula = sc.nextLine();
				System.out.println(controle.consultaAluno(matricula));

			} else if (entrada.equals("N")) {
				System.out.print("Grupo: ");
				grupo = sc.nextLine();
				if (controle.cadastraGrupos(grupo)) {
					System.out.println("CADASTRO REALIZADO!\n");
				} else {
					System.out.println("GRUPO JÁ CADASTRADO\n");
				}

			} else if (entrada.equals("A")) {
				System.out.print("(A)locar Aluno ou (I)mprimir Grupo ");
				opcao = sc.nextLine();
				if (opcao.equals("A")) {
					System.out.print("Matricula: ");
					matricula = sc.nextLine();
					System.out.print("Grupo: ");
					grupo = sc.nextLine();
					grupo = grupo.toLowerCase();
					System.out.println(controle.alocaAluno(matricula, grupo));
				} else if (opcao.equals("I")) {
					System.out.print("Grupo: ");
					grupo = sc.nextLine();
					grupo = grupo.toLowerCase();
					System.out.println(controle.imprimeGrupos(grupo));

				}

			} else if (entrada.equals("R")) {
				System.out.print("Matricula: ");
				matricula = sc.nextLine();
				if (controle.cadastraAlunoResponde(matricula)) {
					System.out.println("ALUNO REGISTRADO!");
				} else {
					System.out.println("Aluno não cadastrado.");
				}

			} else if (entrada.equals("I")) {
				System.out.println(controle.imprimeResponderam());
			} 
			
		} while (!entrada.equals("O"));
		sc.close();
	}
}
