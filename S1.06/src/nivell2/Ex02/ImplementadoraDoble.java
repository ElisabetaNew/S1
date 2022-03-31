package nivell2.Ex02;

public class ImplementadoraDoble implements Interface1, Interface2 {

	private int numero = 0;
	private String palabra;

	public ImplementadoraDoble(int numero, String palabra) {
		this.numero = numero;
		this.palabra = palabra;
	}

	public String metodo1() {
		return "La palabra escogida es: " + this.palabra;
	}

	public void metodo2() {

		int i = 0;
		do {
			System.out.println(metodo1());
			i++;
		} while (i <= this.numero);

	}

}
