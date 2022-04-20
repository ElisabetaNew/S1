package nivell1.Ex02;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Si los atributos los definimos como public para poderlos ver en el package, 
		 * podemos comprobar que sin necesitar de instanciar la clase podemos acceder a los atributos static
		 * ("atributo clase")
		 */
		
		System.out.println(Coche.modelo);
		System.out.println(Coche.MARCA);
		
		Coche coche1 = new Coche();
		System.out.println(coche1.toString());
		
		coche1.acelerar();
		Coche.frenar();
		
	}

}
