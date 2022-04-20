package nivell1.Ex01;

public class Viento extends Instrumento {
	
	
	public Viento(String nombre, int precio) {
		super(nombre, precio);
	}
	
	{
		System.out.println("Bloque de incializacion viento");
	}

	public void tocar(){
		System.out.println("Esta sonando un instrumento de viento");
	}

}
