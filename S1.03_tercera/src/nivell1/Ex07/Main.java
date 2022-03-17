package nivell1.Ex07;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *Emplena un HashMap amb parelles clau-valor.
		 */
		Map<Integer, Trabajador> personal = new HashMap<Integer, Trabajador>();
		personal.put(2, new Trabajador("Maria"));
		personal.put(1, new Trabajador("Pol"));
		personal.put(4, new Trabajador("Pablo"));
		personal.put(3, new Trabajador("Seila"));
		System.out.println("HashMap" + personal);
		
		/*
		 * Ordeni les parelles segons el codi hash i imprimeixi el resultat (Idea: fer servir un TreeMap).
		 */
	    Map<Integer, Trabajador> personalT = new TreeMap<Integer, Trabajador>();
	    personalT.putAll(personal);
		System.out.println("TreeMap" + personalT);
		
		/*Extregui les parelles ordenades i introdueixi-les en un mapa LinkedHashMap
		 * (Idea: fer servir el seu constructor).
		 */
		Map<Integer, Trabajador> personalLHM = new LinkedHashMap<Integer, Trabajador>();
		for (Map.Entry<Integer, Trabajador> recorrido : personalT.entrySet()) {
			Integer key = recorrido.getKey();
			Trabajador val = recorrido.getValue();
			personalLHM.put(key, val);
		}
		
		/*
		 *Demostri que es manté l'ordre d'inserció. 
		 */
		System.out.println("LinkedHashMap" + personalLHM);
		
		
		/* 
		 * Extregui només les claus ordenades i introdueixi-les primer en un HashSet 
		 * i després en un LinkedHashSet. Es manté l'ordre?
		 */
		Map<Integer, Trabajador> calvesH = new HashMap<Integer, Trabajador>();
		System.out.println("HashMap: ");
		for (Map.Entry<Integer, Trabajador> recorrido : personalT.entrySet()) {
			Integer key = recorrido.getKey();
			System.out.print(key);
		}
		
		System.out.println("\nLinkedHashMap: ");
		Map<Integer, Trabajador> calvesLH = new LinkedHashMap<Integer, Trabajador>();
		for (Map.Entry<Integer, Trabajador> recorrido : personalT.entrySet()) {
			Integer key = recorrido.getKey();
			System.out.print(key);
		}
		}
		
	}


