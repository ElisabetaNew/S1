package nivell1.Ex07;

public class Main {

	public static void main(String[] args) {
		
		/*Los metodos de Amphibian los dispone la clase Frog tambien al ser hija
		 *Los metodos de clase Frog no los dispone la clase Amphibian, ya que en las herencias
		 *la relacion es contra más arriba (madre) más general, contra más bajo(hijas) más especifico.
		 */

		Amphibian.comer();
		Frog.comer();
		Amphibian.moverse();
		Frog.moverse();
		Amphibian.respirar();
		Frog.respirar();
//		Amphibian.saltar(); //incorrecto
		Frog.saltar(); //correcto
		
	}

}
