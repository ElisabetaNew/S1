package nivel1.Ex01.PrimerIntento;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		NoGenericMethods primero = new NoGenericMethods();
		System.out.println("Objeto1: " + primero.getObjecte1());
		System.out.println("Objeto2: " + primero.getObjecte2());
		System.out.println("Objeto3: " + primero.getObjecte1());

		primero.setObjecte1("Mono");
		primero.setObjecte2("Tortuga");
		primero.setObjecte3("Elefante");

		System.out.println("\nDespues de almacenar objetos");
		System.out.println("Objeto1: " + primero.getObjecte1());
		System.out.println("Objeto2: " + primero.getObjecte2());
		System.out.println("Objeto3: " + primero.getObjecte1() +"\n");
		

		ArrayList<NoGenericMethods> objetos = new ArrayList<NoGenericMethods>();
		objetos.add(primero);

		for (int i = 0; i < objetos.size(); i++) {
			System.out.println(objetos.get(i).toString());
		}
		
	}

}
