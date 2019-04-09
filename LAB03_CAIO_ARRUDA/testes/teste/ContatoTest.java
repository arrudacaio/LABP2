package teste;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab03.Contato;

class ContatoTest {
	private Contato contato1;
	private Contato contato2;
	private Contato contato3;
	

	@BeforeEach
	void setup() {
		this.contato1 = new Contato("Caio", "Arruda", "83 98883-0000");
		this.contato2 = new Contato("Caio", "Arruda", "84 90203-6569");

	}

	/**
	 * Verifica se dois contatos são iguais
	 */
	@Test
	void testContatosIguais() {
		assertTrue(contato1.equals(contato2));

	}
	/**
	 * Verifica o construtor de um contato
	 */
	@Test
	void testConstrutor() {
		assertEquals("Caio", this.contato1.getNome());
		assertEquals("Arruda", this.contato1.getSobrenome());
		assertEquals("83 98883-0000", this.contato1.getNumero());
		assertEquals("Caio", this.contato2.getNome());
		assertEquals("Arruda", this.contato2.getSobrenome());
		assertEquals("84 90203-6569", this.contato2.getNumero());
	}
	/**
	 * Verifica o to string do contato, no caso, a mensagem de retorno
	 */
	@Test
	void testToString() {
		assertEquals("Caio Arruda - 83 98883-0000", this.contato1.toString());
		assertEquals("Caio Arruda - 84 90203-6569", this.contato2.toString());
	}

	/**
	 * Verifica o imprime contato,no caso, a mensagem de retorno na chamada do método
	 */
	@Test
	void testImprimeContato() {
		assertEquals(" - Caio Arruda", this.contato1.imprimeContato());
		assertEquals(" - Caio Arruda", this.contato2.imprimeContato());
	}

	/**
	 * Verifica se o nome é nulo
	 */
	@Test
	void testNomeNull() {
		try {
			contato3 = new Contato(null, "Arruda", "8820 5065");
		} catch (NullPointerException npe) {

			assertEquals(npe.getMessage(), "String nula!");
		}
	}

	/**
	 * Verifica se o nome é vazio
	 */
	@Test
	void testNomeVazio() {
		try {
			contato3 = new Contato("","Arruda","5520 2356");
		} catch (IllegalArgumentException npe) {
			assertEquals(npe.getMessage(), "String vazia!");
		}
	}

}