package nivell1.Ex04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> personas = new ArrayList<String>();
		personas.add("Maria");
		personas.add("Pol");
		personas.add("Seila");


		System.out.println("Prueba Strings");
		GenericMethods.f(personas);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);

		System.out.println("\nPrueba int");
		GenericMethods.f(numeros);

	}

}
