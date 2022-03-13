package nivell1.Ex03;

public class Vehicle {

	// Atributos non-static
	private String marca;
	private String modelo;
	
	//Atributo static
	private static int ayudaestatal;
	
	//Bloque iniciacion static
	static {
		System.out.println("Ejecucion bloque iniciacion static");
		Vehicle.ayudaestatal = 1000;
	}
	
	//Bloque iniciacion non.static
	{
		System.out.println("Ejecucion bloque iniciacion non-static");
	}
	
	//Constructor
	public Vehicle() {
		System.out.println("Ejecucion metodo constructor");
	}

}


