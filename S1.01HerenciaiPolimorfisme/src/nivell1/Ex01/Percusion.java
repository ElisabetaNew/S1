package nivell1.Ex01;

public class Percusion extends Instrumento {
	

	public Percusion(String nombre, int precio) {
		super(nombre, precio);
	}
	
	{
		System.out.println("Bloque de incializacion Percusion");
	}
	
	public void tocar(){
		System.out.println("Esta sonando un instrumento de percusion");
	}

}
