package nivell1.Ex02;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods <String> personas = new GenericMethods <String>();
		personas.f("Maria", "Pol", "Seila");
		System.out.println(personas.toString());
			
		GenericMethods <Integer> edad = new GenericMethods <Integer>();
		edad.f(10, 25, 44);
		System.out.println(edad.toString());
		
	}

}
