package nivell2.Ex02;

public class Main {

	public static void main(String[] args) {
		
		ImplementadoraDoble impledobla1 = new ImplementadoraDoble(5, "Adios");
		System.out.println("Metodo 1:");
		impledobla1.metodo1();
		
		System.out.println("\nMetodo 2: ");
		impledobla1.metodo2();
		
		System.out.println("\nMetodo clase generica");
		System.out.println("Primer metodo:");
		ClaseGenerica.metode3(impledobla1);
		System.out.println("\nSegundo metodo:");
		ClaseGenerica.metode4(impledobla1);
		

	}

}
