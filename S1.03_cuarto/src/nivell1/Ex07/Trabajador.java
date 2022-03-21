package nivell1.Ex07;

public class Trabajador {

	private String nombre;
	
	public Trabajador (String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
