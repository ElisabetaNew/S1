package nivell1.Ex01.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nivell1.Ex01.Main;

class MesesTest {

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
	
	/*
	 * Resultat en diu que prevista 0 pero es 12 ¿no sé perque em diu que esta prevista 0 si li marco 12
	 * en la declaracio de assertEquals?
	 * Resolt el problema creant un metodo que primer ompli la ArrayList 
	 * i despres cridar el metodo contarMeses, sino no passava per .add si estava en Main
	 */
	@Test
	void validar12posiciones1() {	
		Main.crearMeses();
		assertEquals(Main.contarMeses(), 12);
	}
	
	/*
	 * Resultat en diu que prevista True pero es False pero si imprimeixo per pantalla 
	 * dins la clase Main la size de la ArrayList efectivament és 12 ¿no sé perque no em dona true?
	 * Resolt el problema creant un metodo que primer ompli la ArrayList 
	 * i despres cridar el metodo contarMeses, sino no passava per .add si estava en Main
	 */
	@Test
	void validar12posiciones2() {
		Main.crearMeses();
		assertTrue(Main.contarMeses()==12);
	}
	
	/*
	 * Provo amb directament fer crida a la ArrayList i demanar la size pero diu que és 0
	 * ¿Es perque no es una base de dades que guardi las entrades?
	 * Resolt el problema creant un metodo que primer ompli la ArrayList 
	 * i despres cridar el metodo contarMeses, sino no passava per .add si estava en Main
	 */
	@Test
	void validar12posiciones3() {
		Main.crearMeses();
		assertTrue(Main.mesesAño.size()==12);
		System.out.println(Main.mesesAño.size());
	}
	
	/*
	 * Una ArrayList nula és una ArrayList size 0.
	 * El resultat es True pero no hauria de ser en aquest cas ja que estan afegits 12 elements...
	 * Resolt el problema creant un metodo que primer ompli la ArrayList 
	 * i despres cridar el metodo contarMeses, sino no passava per .add si estava en Main
	 */
	@Test
	void validarNoEsNulo() {
		Main.crearMeses();
		assertFalse(Main.mesesAño.size()==0);
		System.out.println(Main.mesesAño.size());
	}
	
	/*
	 * Comprovar uqe la posicio 8 és Agost (index és 7 perque ArrayList comença per la posicio 0
	 * Pero no dona correcete el test perque la ArrayList torna buida....
	 * Resolt el problema creant un metodo que primer ompli la ArrayList 
	 * i despres cridar el metodo contarMeses, sino no passava per .add si estava en Main
	 */
	@Test
	void validarPosicioAgost() {
		Main.crearMeses();
		assertEquals(Main.mesesAño.get(7).getName(), "Agosto");
		System.out.println(Main.mesesAño.get(7).getName());
	}
}
