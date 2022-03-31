package nivell2.Ex01;


public class Main {

	public static void main(String[] args) {
		
		//instancia de la clase Implementadora al metodo generico metodoGenerico().
		
		Implementadora imple1 = new Implementadora(3, 7, "Hola");

		System.out.println("Metodo 2:");
		imple1.metodo2(6);
		System.out.println("\nMetodo 3:");
		imple1.metodo3();
		
		System.out.println("\nMetodo Generico");
		Generica.metodoGenerico(imple1);
	}

}
