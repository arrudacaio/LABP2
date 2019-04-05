package lab03;

import java.util.Scanner;

public class Sistema {

	public static void imprimeMenu() {
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air\n");
		System.out.print("Opção> ");
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
			}
			else if (entrada.equals("C")) {
				int posicao;
				String nome,sobreNome,numero;
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
					System.out.println("POSIÇÃO INVÁLIDA!");
				}
				
			}

			else if (entrada.equals("L")) {
				System.out.println(agenda.listarContato());


			} else if (entrada.equals("E")) {
				int contatoDesejado;
				System.out.print("Contato> ");
				contatoDesejado = Integer.parseInt(sc.nextLine());
				System.out.println(agenda.exibeContato(contatoDesejado));
				System.out.println();
			}

		} while (!entrada.equals("S"));

	}

}
