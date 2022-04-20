package nivell1.Ex02;

public class Coche {
	
	//Atributos - Ninguno de ellos se pueden inicializar en el constructor
	
	/*
	 * Static: Este atributo no pertenece a cada instancia(objeto) sino a la propia clase.
	 * Es decir, todos los objetos comparten la misma copia. 
	 * Para acceder a un atributo static no necesitamos crear una instancia de la clase. 
	 * Podemos acceder a ellos mediante el nombre de la clase. 
	 */
	public static String modelo;
	
	/*
	 * Final: atributo inmutable. No se puede cambiar. Siempre sera el valor de 120.
	 */
	public final int POTENCIA = 120;

	/*
	 * Static Final: Pertenece a la clase, no a la instancia y es inmutable.
	 */
	public final static String MARCA = "Seat";

	//Getter y Setters
	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	public static String getMarca() {
		return MARCA;
	}

	//Metodos
	public static void frenar() {
		System.out.println("El vehiculo esta frenando");
	}
	
	public void acelerar() {
		System.out.println("El Vehiculo esta acelerando");
	}
	
	@Override
	public String toString() {
		return "Coche [POTENCIA=" + POTENCIA + " Modelo " + modelo + " Marca " + MARCA + "]";
	} 
	
	
}
