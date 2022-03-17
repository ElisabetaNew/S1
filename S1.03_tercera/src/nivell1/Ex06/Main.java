package nivell1.Ex06;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Crea un objecte buit LinkedList<Integer>. 
		 * Utilitzant un iterador ListIterator, 
		 * afegeixi valors sencers a la llista inserint-los sempre a la meitat d'aquesta.
		 */

		List<Integer> lista = new LinkedList<Integer>();
		ListIterator<Integer> it = lista.listIterator();

		System.out.println("¿Cuantos elementos quieres en tu lista?");
		Scanner sc = new Scanner(System.in);
		int numeroElementos = sc.nextInt();
		sc.close();
		int valor = 0;
		do {
			int mitad = (int)Math.ceil(lista.size()/2);
			lista.add(mitad, valor++);
		} while(numeroElementos!=lista.size());
		
		System.out.println(lista);
	}

}
