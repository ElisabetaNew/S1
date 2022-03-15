package nivell1.Ex04;

import java.util.Objects;

public class Trabajador {
	
	private String nombre;
	private String apellido;
	private String departamento;
	private int antiguedad;
	
	public Trabajador(String nombre, String apellido, String departamento, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", departamento=" + departamento
				+ ", antiguedad=" + antiguedad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(antiguedad, apellido, departamento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return antiguedad == other.antiguedad && Objects.equals(apellido, other.apellido)
				&& Objects.equals(departamento, other.departamento) && Objects.equals(nombre, other.nombre);
	}
	
	
	

}
