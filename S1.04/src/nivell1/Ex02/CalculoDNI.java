package nivell1.Ex02;

public class CalculoDNI {

	private String dni;
	//separamos numeros :del digito 0 al penultimo (ultimo - 1)
	private int numero;
	//separamos letra: el ultimo
	private String letra;
	
	
	//Constructores
	public CalculoDNI(String dni) {
		this.dni = dni;
		this.numero = Integer.parseInt(dni.substring(0, dni.length()-1));
		this.letra = dni.substring(dni.length()-1,dni.length());
	}
	
	public CalculoDNI() {
	}

	/*
	 * Getter y setter: en este caso solo get/set de dni, pero Getter tambien de letra y numero
	 * por que quizas nos interese utilizar. Settes no porque es un calculo.
	 */
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getNumero() {
		return numero;
	}

	public String getLetra() {
		return letra;
	}
	
		
}
