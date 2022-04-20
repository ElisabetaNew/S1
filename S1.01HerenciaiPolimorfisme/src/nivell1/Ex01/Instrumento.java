package nivell1.Ex01;

public abstract class Instrumento {
	
	//Atributos
	protected String nombre;
	protected int precio;
	
	// metodo constructor
	public Instrumento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//metodo abstracto costeVigilancia
	public abstract void tocar();
	
	static {
		System.out.println("bloque de inicializacion estatica");
	}


}
