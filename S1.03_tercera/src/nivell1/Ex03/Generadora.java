package nivell1.Ex03;

import java.util.*;

public class Generadora {

	ArrayList<String> personajes = new ArrayList<String>();

	private String personaje;

	public Generadora() {
		personajes.add("Blancanieves");
		personajes.add("Principe");
		personajes.add("Madrastra");

	}

	Iterator<String> it = personajes.iterator();

	public String siguientePersonaje(String it) {

		String nombre = "";

		if (personajes.iterator().hasNext()) {
			nombre = (String) it;

		}
		return nombre;

	}

}
