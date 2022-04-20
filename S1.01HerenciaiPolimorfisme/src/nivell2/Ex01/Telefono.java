package nivell2.Ex01;

public class Telefono {
	
	//Atributos
	private String marca;
	private String modelo;
	
	//Constructor
	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//metodo
	public void trucar(String numeroTelf) {
		System.out.println("Llamando a " + numeroTelf );
	}



}
