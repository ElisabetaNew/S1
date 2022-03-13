package nivell2.Ex01;

public class Main {

	public static void main(String[] args) {

		ThrowException throwExceptions = new ThrowException();
		try {
			throwExceptions.f();
			System.out.println("Es correcto. Recuerde su nombre de usuario para proximas visitas. Gracias ");
		} catch (Exception e) {
			System.out.println("Se ha producido un error");
		}
	}
}
