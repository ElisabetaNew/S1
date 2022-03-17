package nivell1.Ex05;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * Crea un objecto List<Integer>
		 */
		
		List<Integer> lista1 = new LinkedList<Integer>();
		
		lista1.add(2);
		lista1.add(4);
		lista1.add(6);
		lista1.add(8);
		System.out.println("LinkedList1 : " + lista1.toString());

		/*
		 * Crea un segundo objeto List<Integer>
		 */
		List<Integer> lista2 = new LinkedList<Integer>();
		
		/*
		 * Instancia y incializa Iterator
		 * ListIterator hereda de Iterator pero ofrece más metodos (por ejemplo previous())
		 */
		
		ListIterator<Integer> it1 = lista1.listIterator();
		
		/*
		 * Recorre todo ListIterator per partir de la ultima posicion
		 */
		while(it1.hasNext()) {
			it1.next();
		}
		
		/*
		 * Como no volvemos a incializar estamos en la posicion ultima
		 */
		while (it1.hasPrevious()) {
			lista2.add(it1.previous());		
		}
		
		/*
		 * Imprime resultado
		 */
		System.out.println("LinkedList2 : " + lista2.toString());
		
		
		
		
		}

}
