package nivell1.Ex05;

public class Animal {
	
	protected String nombre;
	protected int edad;
	protected String sexo;

	public void correr(String nombre, int edad, String sexo) {
		this.nombre	= nombre;
		this.edad	= edad;
		this.sexo	= sexo;
		System.out.println("Metodo correr1_Clase Animal");
	}
	
	public void correr(String nombre, String sexo) {
		this.nombre	= nombre;
		this.sexo	= sexo;
		System.out.println("Metodo correr2_Clase Animal");
	}
	
	public void correr() {
		System.out.println("Metodo correr3_Clase Animal");
	}
	
	
}
