package nivell1.Ex02;

import java.util.ArrayList;


public class Main {

	public static ArrayList<CalculoDNI> listaDni = new ArrayList<CalculoDNI>();
	
	public static void main(String[] args) {
		almacenarDNI();

	}
	
	public static void almacenarDNI() {
		listaDni = new ArrayList<CalculoDNI>();
		
		//DNI's buscados por web para confirmar letra.
		CalculoDNI dni1 = new CalculoDNI ("11111111H");
		CalculoDNI dni2 = new CalculoDNI ("22222222J");
		CalculoDNI dni3 = new CalculoDNI ("33333333P");
		CalculoDNI dni4 = new CalculoDNI ("44444444A");
		CalculoDNI dni5 = new CalculoDNI ("55555555K");
		CalculoDNI dni6 = new CalculoDNI ("66666666Q");
		CalculoDNI dni7 = new CalculoDNI ("77777777B");
		CalculoDNI dni8 = new CalculoDNI ("88888888Y");
		CalculoDNI dni9 = new CalculoDNI ("99999999R");
		CalculoDNI dni10 = new CalculoDNI ("10101010P");
		
		listaDni.add(dni1);
		listaDni.add(dni2);
		listaDni.add(dni3);
		listaDni.add(dni4);
		listaDni.add(dni5);
		listaDni.add(dni6);
		listaDni.add(dni7);
		listaDni.add(dni8);
		listaDni.add(dni9);
		listaDni.add(dni10);
	}

	//el calculo de DNI es dividir el numero en 23 y el resultado buscar la posicion en la seguiente tabla.
	public static String calculoLetra(int numero) {
		String TABLALETRADNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		int posicionTablaDni = numero % 23;
		//convierto en String el char para poder comparar dos String (el atributo letra es String)
		String letraDNI = Character.toString(TABLALETRADNI.charAt(posicionTablaDni)); 
		return letraDNI;
	}

	}




