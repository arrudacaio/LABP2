import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControleDeAlunosTest {
	private ControleDeAlunos controle;

	@BeforeEach
	void setUp() {
		this.controle = new ControleDeAlunos();
		this.controle.cadastraAlunos("118", "caio", "Computação");
		this.controle.cadastraAlunos("500", "maely", "Computação");
		this.controle.cadastraAlunoResponde("500");
	}

	@Test
	void testConsultaAluno() {
		assertEquals("Aluno: " + "118" + " " + "-" + " " + "caio" + " " + "-" + " " + "Computação" + "\n",this.controle.consultaAluno("118"));

	}

	@Test
	void testCadastraAlunos() {
		assertTrue(this.controle.cadastraAlunos("115", "caio", "Computação"));
	}

	@Test
	void testVerificaNomeVazio() {
		try {
			this.controle.cadastraAlunos("", "caio", "Computação");
		} catch (RuntimeException npe) {
			assertEquals(npe.getMessage(), "NOME VAZIO");
		}
	}

	@Test
	void testVerificaNomeNulo() {
		try {
			this.controle.cadastraAlunos(null, "caio", "Computação");
		} catch (RuntimeException npe) {
			assertEquals(npe.getMessage(), "NOME NULO");
		}
	}

	@Test
	void testCadastraGrupos() {
		assertTrue(this.controle.cadastraGrupos("nomeGrupo"));
	}

	@Test
	void grupoNomeVazio() {
		try {
			this.controle.cadastraGrupos("");
		} catch (RuntimeException npe) {
			assertEquals(npe.getMessage(), "NOME VAZIO");
		}
	}

	@Test
	void grupoNomeNulo() {
		try {
			this.controle.cadastraGrupos(null);
		} catch (RuntimeException npe) {
			assertEquals(npe.getMessage(), null);
		}
	}


	@Test
	void testCadastraAlunoResponde() {
		assertTrue(this.controle.cadastraAlunoResponde("110"));
	}
	@Test
	void testAlunoRespondeVazio() {
		try {
			this.controle.cadastraAlunoResponde("");
		} catch(RuntimeException npe) {
			assertEquals(npe.getMessage(), "STRING VAZIA");
		}
	}
	@Test
	void testAlunoRespondeNulo() {
		try {
			this.controle.cadastraAlunoResponde(null);
		} catch(RuntimeException npe) {
			assertEquals(npe.getMessage(), "STRING NULA");
		}
	}
	@Test
	void testImprimeResponderam() {
		assertEquals("Alunos: \n" + "Aluno: " + "500" + " " + "-" + " " + "maely" + " " + "-" + " " + "Computação" + "\n",this.controle.imprimeResponderam());
	}

}
