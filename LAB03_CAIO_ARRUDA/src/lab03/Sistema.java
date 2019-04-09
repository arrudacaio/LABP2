package lab03;

import java.util.Scanner;

public class Sistema {

	/**
	 * Imprime o menu de opções de uma agenda.
	 */
	public static void imprimeMenu() {
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air");
		System.out.print("Opção> ");
	}

	/**
	 * 
	 * Cadastra Contatos na Agenda telefônica se a posição for válida (1 até 100),
	 * se não, cadastro inválido
	 * 
	 * @param sc     scanner para leitura de dados
	 * @param agenda agenda de contatos
	 * 
	 * 
	 */

	public static void cadastraContatos(Scanner sc, Agenda agenda) {
		int posicao;
		String nome, sobreNome, numero;
		System.out.print("\nPosição: ");
		posicao = Integer.parseInt(sc.nextLine());
		if (posicao >= 1 && posicao <= 100) {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Sobrenome: ");
			sobreNome = sc.nextLine();
			System.out.print("Telefone: ");
			numero = sc.nextLine();
			agenda.cadastraContato(nome, sobreNome, numero, posicao);
			System.out.println("CADASTRO REALIZADO!\n");

		} else {
			System.out.println("\nPOSIÇÃO INVÁLIDA!\n");
		}

	}

	/**
	 * Listar contatos da agenda telefônica
	 * 
	 * @param sc     scanner para leitura de dados
	 * @param agenda agenda telefônica
	 */

	public static void listarContatos(Scanner sc, Agenda agenda) {
		System.out.println();
		System.out.print(agenda.listarContato());
		System.out.println();
	}

	/**
	 * Exibe o contato desejado
	 * 
	 * @param sc     scanner para leitura de dados
	 * @param agenda agenda telefônica
	 */
	public static void exibirContato(Scanner sc, Agenda agenda) {
		int contatoDesejado;
		System.out.print("Contato> ");
		contatoDesejado = Integer.parseInt(sc.nextLine());
		System.out.println(agenda.exibeContato(contatoDesejado));
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		String entrada;
		do {
			imprimeMenu();
			entrada = sc.nextLine();
			if (!entrada.equals("C") && !entrada.equals("L") && !entrada.equals("E")) {
				System.out.println("OPÇÃO INVÁLIDA!");
				System.out.println();
			} else if (entrada.equals("C")) {
				cadastraContatos(sc, agenda);
			}

			else if (entrada.equals("L")) {
				listarContatos(sc, agenda);

			} else if (entrada.equals("E")) {
				exibirContato(sc, agenda);
			}

		} while (!entrada.equals("S"));

	}

}
