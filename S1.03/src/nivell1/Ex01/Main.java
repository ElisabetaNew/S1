package nivell1.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Month m1 = new Month ("Enero");
		Month m2 = new Month ("Febrero");
		Month m3 = new Month ("Marzo");
		Month m4 = new Month ("Abril");
		Month m5 = new Month ("Mayo");
		Month m6 = new Month ("Junio");
		Month m7 = new Month ("Julio");
		Month m8 = new Month ("Septiembre");
		Month m9 = new Month ("Octubre");
		Month m10 = new Month ("Noviembre");
		Month m11 = new Month ("Diciembre");

		List<Month>mesesAño=new ArrayList<Month>();
		mesesAño.add(m1);
		mesesAño.add(m2);
		mesesAño.add(m3);
		mesesAño.add(m4);
		mesesAño.add(m5);
		mesesAño.add(m6);
		mesesAño.add(m7);
		mesesAño.add(m8);
		mesesAño.add(m9);
		mesesAño.add(m10);
		mesesAño.add(m11);
		
		for(Month m: mesesAño) {
			System.out.println(m.getName());
		}
		
		
		Month m12 = new Month("Agosto");
		/*es el numero de indice y en la ArrayList el indice empieza por cero 
		por eso el indice es 7 en lugar de 8 como podria parecer por ser Agosto.
		*/
		mesesAño.add(7, m12); 
		
		System.out.println("\n" + "Año completo");
		for(Month m: mesesAño) {
			System.out.println(m.getName());
		}
	}

}
