package nivell1.Ex02;

import java.util.HashSet;
import java.util.Set;

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

		Set<Month>mesesAño=new HashSet<Month>();
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
		
		
		Month m12 = new Month("Enero");
		mesesAño.add(m12);
		
		for(Month m: mesesAño) {
			System.out.println(m.getName());
		}
	}

}
