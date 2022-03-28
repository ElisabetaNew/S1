package nivell1.Ex05;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// Mostri com serialitzar un Objecte Java a un fitxer .ser i deserialícelo
		// després.
		
		//Crear objeto de la clase trabajador
		Trabajador trabajador1 = new Trabajador("Paco", "RRHH", 45);
		File fichero = new File("c:\\Users\\emarc", "ficheroEntradaEx5.ser");
		File fichero2 = new File("c:\\Users\\emarc", "ficheroSalidaEx5.ser");
		serializarObjeto(fichero, trabajador1);
		deserializarObjeto(fichero2, new Trabajador());
		
	}
	//Metodo serializar un Objecto Java a un fichero .ser
	public static void serializarObjeto(File fichero, Trabajador trabajador1) {
		
		try {
			FileOutputStream fos = new FileOutputStream(fichero);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(trabajador1);
			oos.close();
			fos.close();
			System.out.println("Trabajador1: " + trabajador1.toString());
			System.out.println("Serialización Hecha!!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		
	}	
	
	//Metodo deserializar un Objecto Java de un fichero .ser
	public static Trabajador deserializarObjeto(File fichero2, Trabajador trabajador) {
		Trabajador trabajador2=null;
		try {
			FileInputStream fis = new FileInputStream(fichero2);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				trabajador2 = (Trabajador) ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			System.out.println("Trabajador2: " + trabajador2.toString() );
			System.out.println("Deserialización Hecha!!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		return trabajador2;
	}

}
