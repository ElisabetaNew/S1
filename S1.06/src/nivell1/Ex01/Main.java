package nivell1.Ex01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<NoGenericMethods> personas = new ArrayList<NoGenericMethods>();
		personas.add(new NoGenericMethods());
		personas.get(0).setNombre("Maria");
		personas.get(0).setPrimerApellido("Lopez");
		personas.get(0).setSegundoApellido("Lopez");
		
		personas.add(new NoGenericMethods());
		personas.get(0).setNombre("Cristina");
		personas.get(0).setPrimerApellido("Perez");
		personas.get(0).setSegundoApellido("Perez");
		
		personas.add(new NoGenericMethods());
		personas.get(0).setNombre("Pol");
		personas.get(0).setPrimerApellido("Rodriguez");
		personas.get(0).setSegundoApellido("Armengol");

		

		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i).toString());
		}
	}

}
