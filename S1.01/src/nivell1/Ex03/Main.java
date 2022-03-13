package nivell1.Ex03;

public class Main {

	public static void main(String[] args) {
		
		/**Demostra que el procés de càrrega d'una classe només té lloc una vegada. 
		 * Demostra que la càrrega pot ser provocada per la creació de la primera 
		 * instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.
		 */
		
		/*Creacion objeto1. 
		 *Se ejecuta bloque statico una vez porque es la primera vez que cargamos la clase
		 *Se ejecuta bloque non.statico porque se ejecuta al crear un nuevo objeto
		 *Se ejecuta el constructor, despues de los bloques de iniciacion
		 */
		Vehicle vehicle1 = new Vehicle();
		System.out.println(" ");
		
		/*Creacion objeto2. 
		 *Ya no se ejecuta bloque statico porque esta relacionado con la clase, no con la creacion del objeto.
		 *Se ejecuta bloque non.statico porque se ejecuta al crear un nuevo objeto
		 *Se ejecuta el constructor, despues de los bloques de iniciacion
		 */
		Vehicle vehicle2 = new Vehicle();
	
	}

}
