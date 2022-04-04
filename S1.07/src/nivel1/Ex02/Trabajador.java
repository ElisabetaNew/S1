package nivel1.Ex02;

public abstract class Trabajador {

	//atributos
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int antiguedad;
	final protected int SUELDOBASE = 50000;
	protected int sueldo;
	
	//Constructor
	public Trabajador(String nombre, String apellido, int edad, int antiguedad) {
		this.nombre		= nombre;
		this.apellido	= apellido;
		this.edad		= edad;
		this.antiguedad	= antiguedad;
		this.sueldo		= 50000;
	}
	
	//Gettes y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	//metodo abstracto calcular sueldo
	public abstract int calcularSueldo();

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", antiguedad="
				+ antiguedad + ", SUELDOBASE=" + SUELDOBASE + ", sueldo=" + sueldo + "]";
	}
	
}
