package nivell1.Ex08;

import java.util.Comparator;

public class Trabajador implements Comparable<Trabajador> {
	
	private String codigo;
	private String nombre;

	
	public Trabajador (String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//To String solo trae nombre para no repetir dato
	@Override
	public String toString() {
		return "Trabajador [" + nombre + "]";
	}

	//Metodo que compara las claves
	@Override
	public int compareTo(Trabajador trabajador) {
		return this.codigo.compareTo(trabajador.getCodigo());
	}
	
	public final Comparator<Trabajador> NOMBRE = new Comparator<Trabajador>() {
	public int compare(Trabajador t1, Trabajador t2) {
		return t2.getCodigo().compareTo(t1.getCodigo());
}
};	
}
