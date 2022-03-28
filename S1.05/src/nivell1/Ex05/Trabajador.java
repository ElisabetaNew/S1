package nivell1.Ex05;

import java.io.Serializable;

//Implentar una interfaz serializable a la clase
public class Trabajador implements Serializable {
	
	private String nombre;
	private String departamento;
	private int edad;

	
public Trabajador(String nombre, String departamento, int edad) {
	super();
	this.nombre = nombre;
	this.departamento = departamento;
	this.edad = edad;
}

public Trabajador() {
	
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDepartamento() {
	return departamento;
}


public void setDepartamento(String departamento) {
	this.departamento = departamento;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


@Override
public String toString() {
	return "Trabajador [nombre=" + nombre + ", departamento=" + departamento + ", edad=" + edad + "]";
}

}

