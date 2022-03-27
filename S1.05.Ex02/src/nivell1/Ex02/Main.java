package nivell1.Ex02;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		/*
		 * indicant a més si és un directori (D) o un fitxer (F), i la seva última data
		 * de modificació.
		 */

		// Libreria Java IO
		// Clase File
		File directorio = new File("C:\\Users\\emarc\\eclipse-workspace\\S1.02");

		// listaContenidoDirectorio(directorio);
		listarArbolDirectorios(directorio);
	}

	// Metodo de clase File es list() asi recuperamos los ficheros que corresponden
	// al directorio
	public static void listaContenidoDirectorio(File directorio) {

		String[] ficheros = directorio.list();

		if (ficheros == null)
			System.out.println("No hay ficheros en el directorio especificado");
		else {
			for (int x = 0; x < ficheros.length; x++)
				System.out.println(ficheros[x]);
		}
	}

	// Metodo listar arbol de directorios con el contenido de todos sus niveles
	// (recursivamente)
	// de forma que se imprima en pantalla en orden alfabetico dentro de cada nivel
	// Dentro del bucle for preguntamos si el fichero encontrado es un directorio.
	public static void listarArbolDirectorios(File directorio) {
		File[] ficheros = directorio.listFiles();

		for (int i = 0; i < ficheros.length; i++) {
			File file = ficheros[i];
			if (file.isDirectory()) {
				System.out.println("D  " + file);
				listarArbolDirectorios(file);
			} else {
				/*
				 * para saber la fecha de modificacion de un fichero metodo .lastModified() pero
				 * nos da el resultados en milisegundos
				 */
				long milisegundos = file.lastModified();
				// convertir milisegundos en fecha utilizando la clase Calendar
				Date d = new Date(milisegundos);
				Calendar c = new GregorianCalendar();
				c.setTime(d);
				// sacamos los valores para obtener fecha
				String dia = Integer.toString(c.get(Calendar.DATE));
				String mes = Integer.toString(c.get(Calendar.MONTH));
				String year = Integer.toString(c.get(Calendar.YEAR));
				String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
				String minuto = Integer.toString(c.get(Calendar.MINUTE));
				String segundo = Integer.toString(c.get(Calendar.SECOND));
				System.out.println("F  " + file + "   Modificado: " + dia + "/" + mes + "/" + year + " " + hora + ":"
						+ minuto + ":" + segundo);

			}

		}
	}

}
