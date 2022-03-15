package nivell1.Ex04;

import java.util.*;

public class Trabajador {

	ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	private String nombre;
	private String departamento;

	public Trabajador(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;

	}

	public Trabajador() {
	}

	public void recorrerColecion(Collection<Trabajador> trabajadores) {
		Iterator<Trabajador> it = trabajadores.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", departamento=" + departamento + "]";
	}

}
