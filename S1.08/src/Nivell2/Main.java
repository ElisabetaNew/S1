package Nivell2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> ListaPersonaEdades = Arrays.asList("Ana", "25", "Pol", "18", "Ruben", "37", "Cristina", "48",
				"Eduardo", "32", "Jan", "10");

		/*
		 * longitud ( de més curta a més llarga)
		 */
		System.out.println("Orden de más corta a más larga");
		ordenMenorAMayor(ListaPersonaEdades, true);

		/*
		 * longitud inversa (de més llarga a més curta)
		 */
		System.out.println("\nOrden de más larga a más corta");
		ordenMenorAMayor(ListaPersonaEdades, false);

		/*
		 * alfabèticament pel primer caràcter (Nota: charAt (0) retorna el codi numèric
		 * del primer caràcter)
		 */
		System.out.println("\nOrden alfabetico");
		ordenAlfabetico(ListaPersonaEdades);

		/*
		 * Les cadenes que contenen "e" primer, tota la resta en segon lloc.(Nomes "e"
		 * minuscula) De moment ,poseu el codi directament a la lambda.
		 */
		System.out.println("\nPrimero contienen e");
		primeroE(ListaPersonaEdades, "e");

		/*
		 * Modifica tots els elements de la matriu per canviar els caracters “a” a “4”
		 */

		System.out.println("\nIntercambiar caracteres 'a' por '4'");
		intercambiarLetras(ListaPersonaEdades, "a", "4");

		/*
		 * Mostra només els elements que siguin 100% numerics . (tot i que estigui
		 * guardats com strings)
		 */
		System.out.println("\nSolo numeros");
		soloNumeros(ListaPersonaEdades);

	}

	public static void ordenMenorAMayor(List<String> llista, boolean asc) {
		if (asc) {
			llista.stream().sorted(Comparator.comparing(v -> v.length())).forEach(System.out::println);
		} else {
			llista.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

		}
	}

	public static void ordenAlfabetico(List<String> llista) {
		llista.stream().sorted(Comparator.comparing(v -> v.charAt(0))).forEach(System.out::println);
	}

	public static void primeroE(List<String> llista, String letra) {

		llista.stream().sorted(Comparator.comparing((String v) -> v.contains(letra)).reversed())
				.forEach(System.out::println);

	}

	public static void intercambiarLetras(List<String> llista, String oldValue, String newValue) {
		llista.stream().map(v -> v.replace(oldValue, newValue)).forEach(System.out::println);
	}

	public static void soloNumeros(List<String> llista) {

		String exprNumeros = "\\d+";
		llista.stream().filter(v -> v.matches(exprNumeros)).forEach(System.out::println);

	}
}
