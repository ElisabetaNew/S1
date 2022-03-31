package nivell1.Ex03;

public class Main {

	public static void main(String[] args) {
				
		GenericMethods <String> personas = new GenericMethods <String>();
		personas.f("Maria", "Pol");
		System.out.println(personas.toString());
			
		GenericMethods <Integer> edad = new GenericMethods <Integer>();
		edad.f(10, 25);
		System.out.println(edad.toString());

	}

}
