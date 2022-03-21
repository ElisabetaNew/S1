package nivell1.Ex03;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Generadora generadora = new Generadora();

		Iterator<String> it = generadora.personajes.iterator();

		//Lista LinkedList
		LinkedList<String> personajesL = new LinkedList<String>();
		while (it.hasNext()) {
			String nombreL = generadora.siguientePersonaje(it.next());
			personajesL.add(nombreL);
		}

		System.out.println("Lista LinkedList: \n" + personajesL);

		/*
		 * Para volver al inicio del iterator volvemos a inicializarlo
		 */
		it = generadora.personajes.iterator();

		
		//Lista HashSet
		HashSet<String> personajesH = new HashSet<String>();
		while (it.hasNext()) {
			String nombreH = generadora.siguientePersonaje(it.next());
			personajesH.add(nombreH);
		}

		System.out.println("Lista HashSet :\n" + personajesH);

		it = generadora.personajes.iterator();

		
		//Lista LinkedHashSet
		LinkedHashSet<String> personajesLH = new LinkedHashSet<String>();
		while (it.hasNext()) {
			String nombreLH = generadora.siguientePersonaje(it.next());
			personajesLH.add(nombreLH);
		}

		System.out.println("Lista LinkedHashSet: \n" + personajesH);

		it = generadora.personajes.iterator();

		
		//Lista TreeSet
		TreeSet<String> personajesT = new TreeSet<String>();
		while (it.hasNext()) {
			String nombreT = generadora.siguientePersonaje(it.next());
			personajesT.add(nombreT);
		}

		System.out.println("Lista TreeSet: \n" + personajesH);

		it = generadora.personajes.iterator();
	}
}
