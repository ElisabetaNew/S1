package Nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Alumno> Alumnos = new ArrayList<Alumno>();
		Alumnos.add(new Alumno("Ana", 22, "Java", 8.25));
		Alumnos.add(new Alumno("Pol", 33, "PHP", 7.50));
		Alumnos.add(new Alumno("Ruben", 25, "Python", 6.75));
		Alumnos.add(new Alumno("Cristina", 16, "Java", 4.20));

		/*
		 * Mostra per pantalla el nom i l’edat de cada alumne
		 */

		for (Alumno alumno : Alumnos) {
			System.out.println("Nombre: " + alumno.getNombre() + ", edad: " + alumno.getEdad());
		}
		/*
		 * Filtra la llista per tots els alumnes que el nom comenci per “a”, asigna-ho a
		 * un altre llista y mostra per pantalla la nova llista (tot amb lambdas)
		 */
		List<Alumno> AlumnosEmpiezaA = alumnosEmpiece(Alumnos, "A");
		for (Alumno alumno : AlumnosEmpiezaA) {
			System.out.println(alumno.toString());
		}

		/*
		 * Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota.
		 */

		System.out.println(alumnosAprobados(Alumnos, 5));

		/*
		 * Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota i que
		 * no siguin de PHP.
		 */

		System.out.println(alumnosAprobadosNoPHP(Alumnos, "PHP", 5));

		/*
		 * Mostra tots els alumnes que facin JAVA i siguin majors d’edat.
		 */

		System.out.println(alumnosJAVAMayores(Alumnos, "JAVA", 18));
	}

	public static List<Alumno> alumnosEmpiece(List<Alumno> lista, String start) {
		return lista.stream().filter(l -> l.getNombre().startsWith(start)).collect(Collectors.toList());
	}

	public static List<Alumno> alumnosAprobados(List<Alumno> lista, int nota) {
		return lista.stream().filter(l -> l.getNota() >= nota).collect(Collectors.toList());

	}

	public static List<Alumno> alumnosAprobadosNoPHP(List<Alumno> lista, String curso, int nota) {

		return lista.stream().filter(l -> l.getNota() >= nota && l.getCurso() != (curso)).collect(Collectors.toList());
	}

	public static List<Alumno> alumnosJAVAMayores(List<Alumno> lista, String curso, int edad) {

		return lista.stream().filter(l -> l.getEdad() > edad && l.getCurso().equalsIgnoreCase(curso))
				.collect(Collectors.toList());
	}
}
