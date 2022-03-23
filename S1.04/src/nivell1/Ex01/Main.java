package nivell1.Ex01;

import java.util.ArrayList;


public class Main {

	public static ArrayList<Month> mesesAño = new ArrayList<Month>();
	
	public static void main(String[] args) {
		crearMeses();
		System.out.println(contarMeses());
	}
		
	public static void crearMeses() {
		/*
		 * Torno a incialitzar la ArrayList cada vegada perque sino al test em duplicava les dades.
		 * I si nomes la creava una vegada el test de validarPosicioAgost no donava corecte,
		 */
		
		mesesAño=new ArrayList<Month>();
		
		Month m1 = new Month ("Enero");
		Month m2 = new Month ("Febrero");
		Month m3 = new Month ("Marzo");
		Month m4 = new Month ("Abril");
		Month m5 = new Month ("Mayo");
		Month m6 = new Month ("Junio");
		Month m7 = new Month ("Julio");
		Month m8 = new Month ("Agosto");
		Month m9 = new Month ("Septiembre");
		Month m10 = new Month ("Octubre");
		Month m11 = new Month ("Noviembre");
		Month m12 = new Month ("Diciembre");

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
		mesesAño.add(m12);
		
		System.out.println(mesesAño.get(7).getName());
		
	}

		public static int contarMeses () {
			return mesesAño.size();
		}
	}




