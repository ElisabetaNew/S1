package nivell1.Ex04;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Trabajador trabajador = new Trabajador();

		Trabajador t1 = new Trabajador("Maria", "Marqueting");
		Trabajador t2 = new Trabajador("Juan", "Administracion");
		Trabajador t3 = new Trabajador("Pedro", "Informatica");
		Trabajador t4 = new Trabajador("Cristina", "RRHH");
		Trabajador t5 = new Trabajador("Lola", "Ventas");

		ArrayList<Trabajador> trabajadoresA = new ArrayList<Trabajador>();
		trabajadoresA.add(t1);
		trabajadoresA.add(t2);
		trabajadoresA.add(t3);
		trabajadoresA.add(t4);
		trabajadoresA.add(t5);
		trabajador.recorrerColecion(trabajadoresA);

		LinkedList<Trabajador> trabajadoresL = new LinkedList<Trabajador>();
		trabajadoresL.add(t1);
		trabajadoresL.add(t2);
		trabajadoresL.add(t3);
		trabajadoresL.add(t4);
		trabajadoresL.add(t5);
		trabajador.recorrerColecion(trabajadoresL);

		HashSet<Trabajador> trabajadoresH = new HashSet<Trabajador>();
		trabajadoresH.add(t1);
		trabajadoresH.add(t2);
		trabajadoresH.add(t3);
		trabajadoresH.add(t4);
		trabajadoresH.add(t5);
		trabajador.recorrerColecion(trabajadoresH);

		LinkedHashSet<Trabajador> trabajadoresLH = new LinkedHashSet<Trabajador>();
		trabajadoresLH.add(t1);
		trabajadoresLH.add(t2);
		trabajadoresLH.add(t3);
		trabajadoresLH.add(t4);
		trabajadoresLH.add(t5);
		trabajador.recorrerColecion(trabajadoresH);

		TreeSet<Trabajador> trabajadoresT = new TreeSet<Trabajador>();
		trabajadoresT.add(t1);
		trabajadoresT.add(t2);
		trabajadoresT.add(t3);
		trabajadoresT.add(t4);
		trabajadoresT.add(t5);
		trabajador.recorrerColecion(trabajadoresT);

	}
}
