import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	 private Aluno aluno1;
	 private Aluno aluno2;
	 
	@BeforeEach
	void setUp() {
		this.aluno1 = new Aluno("Caio","250","Computação");
		this.aluno2 = new Aluno("Maely","250","Elétrica");
	}

	@Test
	void testAlunosIguais() {
		assertTrue(this.aluno1.equals(this.aluno2));
	}

}
