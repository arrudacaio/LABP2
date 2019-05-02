import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrupoTest {
	private Grupo grupoEstudo;
	private Aluno aluno,aluno2,aluno3,aluno4;

	@BeforeEach
	void setUp() {
		this.grupoEstudo = new Grupo("lista");
		this.aluno = new Aluno(" ", "100", "computação");
		this.aluno2 = new Aluno(null , "100" , "elétrica");
		this.aluno3 = new Aluno("Caio", "1250" , "elétrica");
		this.aluno4 = new Aluno("chico", "700" , "elétrica");
		this.grupoEstudo.addAluno(aluno4);
	}

	
	@Test
	void testNomeVazio() {
		try {
			this.grupoEstudo.addAluno(this.aluno);
		} catch (RuntimeException npe) {
			assertEquals(npe.getMessage(), "String vazia!");
		}
	}
	@Test
	void testNomeNulo() {
		try {
			this.grupoEstudo.addAluno(this.aluno2);
		} catch (RuntimeException npe) {
			assertEquals(npe.getMessage(), "String nula!");
		}
	}
	
	@Test
	void testAddAluno() {
		this.grupoEstudo.addAluno(aluno3);
		assertTrue(this.grupoEstudo.getAlunos().contains(aluno3));
		assertFalse(this.grupoEstudo.getAlunos().contains(aluno2));
	}
	
	
	@Test
	void toStringGrupo() {
		assertEquals("Grupo: " + this.grupoEstudo.getNome() + "\n Alunos do grupo " + this.grupoEstudo.getNome() + ": \n" + this.grupoEstudo.getAlunos().toString(),this.grupoEstudo.toStringGrupo());
	}
	

}
