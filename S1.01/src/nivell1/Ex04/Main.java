package nivell1.Ex04;

public class Main {

	public static void main(String[] args) {

		/*
		 * A la classe Vehicle afegeix un camp static final, un camp final i un camp
		 * static. Demostra la diferència entre els tres. Quins es poden inicialitzar al
		 * constructor de la classe?
		 */

		/*
		 * Creacion objeto1.
		 */
		Vehicle vehicle1 = new Vehicle();
		System.out.println(vehicle1.toString());
		System.out.println(" ");

		/*
		 * Creacion objeto2. Campo static = El atributo contador ya no se vuelve a
		 * inicializar porque solo lo hace una vez al cargar la clase, no por el
		 * objecto.
		 */
		Vehicle vehicle2 = new Vehicle();
		System.out.println(vehicle2.toString());

		Vehicle vehicle3 = new Vehicle();
		System.out.println(vehicle3.toString());

		/*
		 * Atributos final no son modificables (no setters) pero si desde codigo
		 * modificasemos atributo static final como es comun para todos los objetos, el
		 * valor en todos los objetos queda reflejado el cambio
		 * 
		 */

	}

}
