package nivell1.Ex04;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		Trabajador t1 = new Trabajador("Maria", "Lopez", "Marqueting", 2);
		Trabajador t2 = new Trabajador("Juan", "Rodriguez", "Administracion", 13);
		Trabajador t3 = new Trabajador("Pedro", "Blanco", "Informatica", 5);
		Trabajador t4 = new Trabajador("Cristina", "Hernandez", "RRHH", 10);
		Trabajador t5 = new Trabajador("Lola", "Molina", "Ventas", 3);
		

		ArrayList<Trabajador>trabajadoresA=new ArrayList<Trabajador>();
		trabajadoresA.add(t1);
		trabajadoresA.add(t2);
		trabajadoresA.add(t3);
		trabajadoresA.add(t4);
		trabajadoresA.add(t5);
		
		Iterator<Trabajador> it = trabajadoresA.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		
		LinkedList<Trabajador>trabajadoresL=new LinkedList<Trabajador>();
		trabajadoresL.add(t1);
		trabajadoresL.add(t2);
		trabajadoresL.add(t3);
		trabajadoresL.add(t4);
		trabajadoresL.add(t5);
		
		Iterator<Trabajador> it1 = trabajadoresL.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		HashSet<Trabajador>trabajadoresH=new HashSet<Trabajador>();
		trabajadoresH.add(t1);
		trabajadoresH.add(t2);
		trabajadoresH.add(t3);
		trabajadoresH.add(t4);
		trabajadoresH.add(t5);
		
		Iterator<Trabajador> it2 = trabajadoresH.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		LinkedHashSet<Trabajador>trabajadoresLH=new LinkedHashSet<Trabajador>();
		trabajadoresLH.add(t1);
		trabajadoresLH.add(t2);
		trabajadoresLH.add(t3);
		trabajadoresLH.add(t4);
		trabajadoresLH.add(t5);
		
		Iterator<Trabajador> it3 = trabajadoresLH.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		TreeSet<Trabajador>trabajadoresT=new TreeSet<Trabajador>();
		trabajadoresT.add(t1);
		trabajadoresT.add(t2);
		trabajadoresT.add(t3);
		trabajadoresT.add(t4);
		trabajadoresT.add(t5);
		
		Iterator<Trabajador> it4 = trabajadoresT.iterator();
		while(it4.hasNext()) {
			System.out.println(it4.next());
		}
	}
}
	
	


