package nivell1.Ex04;

public class Vehicle {

	// Atributos non-static
	private int codigoCoche;
	private final int DESCUENTO = 5000;

	// Atributo static: es comun para todos los objetos 
	private static final int ayudaFamiliaNumerosa = 1000;
	// private static final int ayudaFamiliaNumerosa = 3000; 
	private static int contador;

	// Bloque iniciacion static
	static {
		Vehicle.contador = 1;
		System.out.println("Se inicializa el atributo static contador: " + Vehicle.contador);
	}

	// Constructor
	public Vehicle() {
		this.codigoCoche = Vehicle.contador++;
		System.out.println("Creacion objeto: " + this.codigoCoche);
	}

	public int getDESCUENTO() {
		return DESCUENTO;
	}

	public static int getAyudafamilianumerosa() {
		return ayudaFamiliaNumerosa;
	}

	@Override
	public String toString() {
		return "Vehicle [codigoCoche=" + this.codigoCoche + ", DESCUENTO=" + this.DESCUENTO + ", ayudaFamiliaNumerosa="
				+ Vehicle.ayudaFamiliaNumerosa + "]";
	}

}


