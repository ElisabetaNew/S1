package nivell1.Ex05;

public class Main {

	public static void main(String[] args) {

		int i = -3;

		String[] empleados = new String[3];
		empleados[0] = "Maria Lopez";
		empleados[1] = "Pol Rodriguez";
		empleados[2] = "Biel Fernandez";

		do {
			try {
				while (i < empleados.length) {
					System.out.println(empleados[i]);
					i++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getClass().getName());
				i += 1;
			}
		} while (i < 0);
	}
}
