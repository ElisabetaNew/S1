package nivell2.Ex02;


public class ClaseGenerica {

	public static <T extends Interface1> void metode3(ImplementadoraDoble prueba) {
		System.out.println(prueba.metodo1());
		}


	public static <T extends Interface2> void metode4(ImplementadoraDoble prueba) {
		prueba.metodo2();

	}
}
