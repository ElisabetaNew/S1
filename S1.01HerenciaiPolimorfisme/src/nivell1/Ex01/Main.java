package nivell1.Ex01;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Demostra que la càrrega pot ser provocada per la creació de la primera instància 
		 * d'aquesta classe o per l'accés a un membre estàtic d'aquesta. 
		 */
		
		new Cuerda("Guitarra", 70);		
		new Viento("Trompeta", 40);
		new Percusion("Tambor", 60);
		
		
	}

}
