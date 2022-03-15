package nivell1.Ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Generadora personajes= new Generadora();
		
		
		siguientePersonaje();
		
		
	public static void siguientePersonaje() {
			boolean salir = false;
			Scanner sc = new Scanner (System.in);
			
			while(salir = false) {
			System.out.println("Introduce nombre de personajes de tu pelicula favorita");
			personaje = sc.nextLine();
			System.out.println("¿Desea añadir otro?");
			String answer = sc.nextLine();
			answer.toLowerCase();
			char continuar = answer.charAt(0);
			if(continuar == 'n') {
				salir = true;
			}
	}

}
