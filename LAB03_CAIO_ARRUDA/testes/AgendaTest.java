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

	@Test
	void testAgendasIguais() {
		agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 1);
		agenda2.cadastraContato("Caio", "Arruda", "83 9 99087301", 1);
		assertTrue(agenda1.equals(agenda2));
	}

	@Test
	void testCadastraContatos() {
		assertTrue(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 1));
		assertTrue(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 100));
		assertFalse(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 0));
		assertFalse(agenda1.cadastraContato("Caio", "Arruda", "4002 8922", 101));

	}

	@Test
	void testExibeContatos() {
		assertEquals("POSIÇÃO INVÁLIDA!", agenda1.exibeContato(0));
		assertEquals("POSIÇÃO INVÁLIDA!", agenda1.exibeContato(101));
		assertEquals("POSIÇÃO INVÁLIDA!", agenda1.exibeContato(2));
		assertEquals("Caio Arruda - 4002 8922", agenda1.exibeContato(1));

	}

	@Test
	void testListarContatos() {
		assertEquals("1 - Caio Arruda\n", agenda1.listarContato());

	}
}
