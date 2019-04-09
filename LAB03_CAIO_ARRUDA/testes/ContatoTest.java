import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab03.Contato;

class ContatoTest {
	private Contato contato1;
	private Contato contato2;

	@BeforeEach
	void setup() {
		this.contato1 = new Contato("Caio", "Arruda", "83 98883-0000");
		this.contato2 = new Contato("Caio", "Arruda", "84 90203-6569");

	}

	@Test
	void testContatosIguais() {
		assertTrue(contato1.equals(contato2));

	}

	@Test
	void testConstrutor() {
		assertEquals("Caio", this.contato1.getNome());
		assertEquals("Arruda", this.contato1.getSobrenome());
		assertEquals("83 98883-0000", this.contato1.getNumero());
		assertEquals("Caio", this.contato2.getNome());
		assertEquals("Arruda", this.contato2.getSobrenome());
		assertEquals("84 90203-6569", this.contato2.getNumero());
	}

	@Test
	void testToString() {
		assertEquals("Caio Arruda - 83 98883-0000", this.contato1.toString());
		assertEquals("Caio Arruda - 84 90203-6569", this.contato2.toString());
	}

	@Test
	void testImprimeContato() {
		assertEquals(" - Caio Arruda", this.contato1.imprimeContato());
		assertEquals(" - Caio Arruda", this.contato2.imprimeContato());
	}

}