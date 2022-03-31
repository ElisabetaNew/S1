package nivell1.Ex04;

import java.util.ArrayList;

public class GenericMethods {
	
	public GenericMethods() {

	}
	
	public static <K> void f(ArrayList<K> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));			
		}
	}
	
}
