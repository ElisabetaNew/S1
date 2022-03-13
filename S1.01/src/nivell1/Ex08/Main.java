package nivell1.Ex08;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Los metodos los hemso creado non-static
		 */
		Frog frog1 = new Frog();

		frog1.comer("Miau");
		frog1.respirar("Miau");
		frog1.saltar("Miau");
		
		/*En el metodo moverse de la clase Amphibian hemos mantenido static
		 *Es por ello que nos avisa (no es error) el IDE y, o bien, declaramos el tipo (opcion1)
		 *o bien, instanciamos Frog (opcion2)
		 */
		frog1.moverse("Miau");
		Amphibian.moverse("Miau"); //opcion 1
		Frog.moverse("Miau"); //opcion 2
		
	}

}
