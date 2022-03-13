package nivell2.Ex02;

public class Main {

	public static void main(String[] args) {

		ThrowException throwExceptions = new ThrowException();
		try {
			throwExceptions.f();
			System.out.println("Es correcto. Recuerde su nombre de usuario para proximas visitas. Gracias ");
		} catch (Exception e) {
			throwExceptions.g();
			System.out.println("Este nombre no es valido");
		}
	}
}
