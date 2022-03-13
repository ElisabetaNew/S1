package nivell1.Ex02;

public class Main {

	public static void main(String[] args) {

		Object mensaje = new Object();
		mensaje = null;
		try {
			mensaje.toString();
		} catch (Exception e) {
			System.out.println("Tipo error :" + e.getClass().getName());
			System.out.println("Mensaje: " + e.getMessage());
		}

	}

}
