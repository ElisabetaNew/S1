package nivell1.Ex01;

public class Cuerda extends Instrumento{

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
	}
	
	{
		System.out.println("Bloque de incializacion cuerda");
	}
	
	public void tocar(){
		System.out.println("Esta sonando un instrumento de cuenda");
	}

}
