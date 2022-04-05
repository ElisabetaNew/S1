package Nivell1Fase1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Tenint una llista de cadenes de noms propis,
		 * escriu un mètode que retorn e una llista de totes les cadenes que  
		 * comencen amb la lletra 'a' (mayuscula ) i  tenen exactament 3  lletres. 
		 * Imprimeix el resultat . 
		*/
		List<String> LlistaNomsPropis = Arrays.asList("Ana", "Pol", "Ruben", "Jan", "Cristina", "Eduardo");
		
		List<String> llistaResultat = getCadenesStart(LlistaNomsPropis, "A", 3);
		System.out.println("Metodo getCadenesStart");
		for(String s : llistaResultat)
		{
			System.out.println(s);
		}
		
		
		/*
		 * Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers.
		 * Cada element hauria d'anar precedit per la  lletra  "e" si el nombre és parell,
		 * i precedit de la lletra  "o" si el nombre és imparell.
		 * Imprimeix el  resultat. 
		 */
		
		List<Integer> LlistaNumeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("\nMetodo getNumerosToString");
		System.out.println(getNumerosToString(LlistaNumeros, " , "));
		
		
		/*
		 * Tenint una llista de Strings, escriu un mètode  que retorne una llista de totes les  cadenes
		 * que continguen la lletra ‘o’ i  imprimeix el resultat .
		 */
		
		List<String> llistaResultat1 = getCadenesContains(LlistaNomsPropis, "o");
		System.out.println("\nMetodo getCadenesContains");
		for(String s : llistaResultat1)
		{
			System.out.println(s);
		}
		
		/*
		 * Has de fer el mateix que en el punt anterior, però retornant una llista que  incloga
		 * els elements amb  més de 5 lletres. Imprimeix  el  resultat. 
		 */
		List<String> llistaResultat2 = getCadenesContains5(LlistaNomsPropis, "o", 5);
		System.out.println("\nMetodo getCadenesContains5");
		for(String s : llistaResultat2)
		{
			System.out.println(s);
		}
		
		/*
		 * Crea una llista amb  els noms dels mesos de  l’any. 
		 * Imprimeix tots els  elements de la llista amb  una lambda.
		 */
		
		List<String> LlistaMesosAny = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		System.out.println("\nListado meses año - lambda");
		LlistaMesosAny.stream().forEach(v -> System.out.println(v));
		
		/*
		 * Has de  fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference. 
		 */
		System.out.println("\nListado meses año - method reference");
		LlistaMesosAny.stream().forEach(System.out::println);
	}

		public static List<String> getCadenesStart(List<String> llista, String starts, int minLong) {

			return llista.stream().filter(l -> l.startsWith(starts)).filter(l -> l.length() >= minLong)
					.collect(Collectors.toList());
		}
		
		public static String getNumerosToString(List<Integer> llista, String separator) {
			return llista.stream()
					.map(n -> (n % 2 == 0) ? "e" + n : "o" + n)
					.collect(Collectors.joining(separator));
		}
		
		public static List<String> getCadenesContains(List<String> llista, String contains) {
			return llista.stream().filter(l -> l.contains(contains)).collect(Collectors.toList());
		}
		
		public static List<String> getCadenesContains5(List<String> llista, String contains, int minLong ) {
			return llista.stream().filter(l -> l.contains(contains)).filter(l -> l.length() >= minLong)
					.collect(Collectors.toList());
		}
		
	}


