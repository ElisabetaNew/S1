package nivell1.Ex03;

public class Main {

	public static void main(String[] args) {
		
	}

		/*
		 * Escriu el codi per a generar i capturar una excepció de tipus
		 * ArrayIndexOutOfBoundsException.
		 */
	public static void lanzaExcepcion() {
		try {
			String[] empleados = new String[2];
			empleados[0] = "Maria Lopez";
			empleados[1] = "Pol Rodriguez";
			empleados[2] = "Biel Fernandez";

			for (int i = 0; i < empleados.length; i++) {
				System.out.println(empleados[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

	}

}
