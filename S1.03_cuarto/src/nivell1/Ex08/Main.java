package nivell1.Ex08;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *LinkedHashMap conserva el orden de inserción
		 *Emplena un mapa LinkedHashMap amb claus de tipus String i objectes del tipus que prefereixi.
		 */
		LinkedHashMap<String, Trabajador> personal = new LinkedHashMap<>();
		Trabajador trabajador1 = new Trabajador("BBB", "Maria");
		Trabajador trabajador2 = new Trabajador("AAA", "Pol");
		Trabajador trabajador3 = new Trabajador("CCC", "Pablo");
		Trabajador trabajador4 = new Trabajador("CAB", "Seila");
		personal.put(trabajador1.getCodigo(), trabajador1);
		personal.put(trabajador2.getCodigo(), trabajador2);
		personal.put(trabajador3.getCodigo(), trabajador3);
		personal.put(trabajador4.getCodigo(), trabajador4);
		System.out.println(personal);
		
		
		HashMap<String, Trabajador>listapersonal = new HashMap<>();
		
		Iterator<Map.Entry<String, Trabajador>>iter = personal.entrySet().iterator();
		ArrayList<String>claves = new ArrayList<>();
		
		System.out.println(personal);
		

		/*
		 * Ordenar los elementos de LinkedHashMap en una ArrayList por claves, 
		 * esto funciona porque en la clase Trabajador hay implementada la interfaz Comparable 
		 */
		while(iter.hasNext()) {
			Map.Entry<String, Trabajador> claveValor = iter.next();
			listapersonal.put(claveValor.getKey(), claveValor.getValue());
			claves.add(claveValor.getKey());
		}
		
		personal.clear();
		System.out.println(personal);
		System.out.println(listapersonal);
		
		claves.sort(Comparator.naturalOrder());
		
		for(int i=0; i<claves.size(); i++) {
			personal.put(claves.get(i), listapersonal.get(claves.get(i)));
		}
		
		
		System.out.println(personal);

		
		//Todos los intentos fallidos:
		
//		List<String> listaPersonal = new ArrayList<>(personal.keySet());
//		Collections.sort(listaPersonal);
//		
//
//		for (String string : personal) {
//			System.out.println(listaPersonal);
//			
//		}
//		Map<String, Trabajador> personal = new LinkedHashMap<>();
//		Map<String, Trabajador> listaPersonal2 = listaPersonal.stream()
//		        .sorted(Map.Entry.comparingByKey())
//		        .collect(Collectors.toMap(
//		                Map.Entry::getKey,
//		                Map.Entry::getValue
//		        ));
//
//		
//		Map<String, Trabajador> listaPersonal2 = personal.entrySet().stream()
//		        .sorted(Map.Entry.comparingByKey())
//		        .collect(Collectors.toMap(
//		                Map.Entry::getKey,
//		                Map.Entry::getValue
//		        ));
//
//		listaPersonal.entrySet().forEach(System.out::println);
//		Set setClaves = personal.keySet();
//
//        /*
//         * Convertir el Set en lista (ArrayList)
//         */
//        List listaPersonal
//            = new ArrayList<Map.Entry<String, Trabajador> >(setClaves);
//        
//        /*
//         * Ordenarlo alfabeticament
//         */
//        Collections.sort(listaPersonal);	
//        System.out.println(listaPersonal);
//        System.out.println(listaPersonal2);
//        
//         
	}
}
        
        
 
