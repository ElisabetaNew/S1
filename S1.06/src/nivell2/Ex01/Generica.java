package nivell2.Ex01;

public class Generica {

	public static <K extends MiInterface> void metodoGenerico(Implementadora prueba) {
		prueba.metodo2(prueba.metodo3());
	}
}
