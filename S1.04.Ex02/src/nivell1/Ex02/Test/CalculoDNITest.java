package nivell1.Ex02.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import nivell1.Ex02.Main;

class CalculoDNITest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Abans de tot");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Despres de tot");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Abans de cada test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Despres de cada test");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Comprovar que la letra del DNI y la calculada son iguales en todos los elementos de la lista")
	void validarLetraDni() {
		
		Main.almacenarDNI();
		for (int i = 0; i < Main.listaDni.size(); i++) {
			int numero = (Main.listaDni.get(i).getNumero());
			String letraCalculada = Main.calculoLetra(numero);
			String letraIntroducida = Main.listaDni.get(i).getLetra();
			assertTrue(letraCalculada.equalsIgnoreCase(letraIntroducida));
		}
	}

}
