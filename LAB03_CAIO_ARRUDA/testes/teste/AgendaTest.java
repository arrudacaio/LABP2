package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab03.Agenda;

class AgendaTest {
	private Agenda agenda1;
	private Agenda agenda2;

	@BeforeEach
	void setUp() {
		this.agenda1 = new Agenda();
		this.agenda2 = new Agenda();
		agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 1);
	}

	/**
	 * Verifica se duas agendas são iguais
	 */

	@Test
	void testAgendasIguais() {
		agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 1);
		agenda2.cadastraContato("Caio", "Arruda", "83 9 99087301", 1);
		assertTrue(agenda1.equals(agenda2));
	}

	/**
	 * Verifica o cadastro dos contatos
	 */
	@Test
	void testCadastraContatos() {
		assertTrue(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 1));
		assertTrue(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 100));
		assertFalse(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 0));
		assertFalse(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 101));

	}

	/**
	 * Verifica o método de exibir os contatos
	 */
	@Test
	void testExibeContatos() {
		assertEquals("POSIÇÃO INVÁLIDA!", agenda1.exibeContato(0));
		assertEquals("POSIÇÃO INVÁLIDA!", agenda1.exibeContato(101));
		assertEquals("POSIÇÃO INVÁLIDA!", agenda1.exibeContato(2));
		assertEquals("Caio Arruda - 4002 8922", agenda1.exibeContato(1));

	}

	/**
	 * Verifica o método de listar os contatos
	 */
	@Test
	void testListarContatos() {
		assertEquals("1 - Caio Arruda\n", agenda1.listarContato());

	}

	/**
	 * Verifica se o nome é nulo
	 */
	@Test
	void testNomeNull() {
		try {
			assertTrue(agenda1.cadastraContato(null, "Arruda", "4002 8922", 1));
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
			assertTrue(agenda1.cadastraContato("", "Arruda", "4002 8922", 1));
		} catch (IllegalArgumentException npe) {
			assertEquals(npe.getMessage(), "String vazia!");
		}
	}

	/**
	 * Verifica se o sobrenome é nulo
	 */
	@Test
	void testSobrenomeNull() {
		try {
			assertTrue(agenda1.cadastraContato("Caio", null, "4002 8922", 1));
		} catch (NullPointerException npe) {

			assertEquals(npe.getMessage(), "String nula!");
		}
	}

	/**
	 * Verifica se o sobrenome é vazio
	 */
	@Test
	void testSobrenomeVazio() {
		try {
			assertTrue(agenda1.cadastraContato("Caio", "", "4002 8922", 1));
		} catch (IllegalArgumentException npe) {
			assertEquals(npe.getMessage(), "String vazia!");
		}
	}
	
	/**
	 * Verifica se o número de telefone é nulo
	 */
	@Test
	void testNumeroNull() {
		try {
			assertTrue(agenda1.cadastraContato("Caio", "Arruda", null , 1));
		} catch (NullPointerException npe) {

			assertEquals(npe.getMessage(), "String nula!");
		}
	}
	
	/**
	 * Verifica se o número de telefone é vazio
	 */
	@Test
	void testNumeroVazio() {
		try {
			assertTrue(agenda1.cadastraContato("Caio", "Arruda", "", 1));
		} catch (IllegalArgumentException npe) {
			assertEquals(npe.getMessage(), "String vazia!");
		}
	}

}
