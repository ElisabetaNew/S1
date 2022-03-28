package nivell1.Ex03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		// Libreria Java IO
		// Clase File
		File directorio = new File("C:\\Users\\emarc\\eclipse-workspace\\S1.02");

		// System.out.println("Metodo listaContenidoDirectorio:");
		// listaContenidoDirectorio(directorio);
		System.out.println("Metodo listarArbolDirectorios");
		try {
			File fichero = crearFichero();
			listarArbolDirectorios(directorio, fichero);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

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

	// Crear un fichero Txt con el resultado de la funcion
	// listarArbolDirectorios(File directorio)
	public static File crearFichero() {
		// directorio y nombre del fichero que ceremos crear
		
		File fichero = new File("c:\\Users\\emarc", "respuesta.txt");
		
		/*
		 * invocar metodo createNewFile como este metodo puede lanzar la excepcion
		 * IOException debemos hacer un try/catch
		 */
		
		try {
			if (fichero.createNewFile()) {
				System.out.println("El fichero se ha creado correctamente");
			} else {
				System.out.println("No ha podido ser creado el fichero");
			}
		} catch (IOException ioe) {
		}
		
		return fichero;
	}

	// Metodo listar arbol de directorios con el contenido de todos sus niveles
	// (recursivamente)
	// de forma que se sobreescriba en el fichero txt que hemoscreado
	// en orden alfabetico dentro de cada nivel

	public static void listarArbolDirectorios(File directorio, File fichero) throws IOException {
		File[] ficheros = directorio.listFiles();
		BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));

		for (int i = 0; i < ficheros.length; i++) {
			File file = ficheros[i];
			if (file.isDirectory()) {
				bw.write("D  " + file);
				bw.newLine();
				listarArbolDirectorios(file, fichero);
			} else {
				long milisegundos = file.lastModified();
				Date d = new Date(milisegundos);
				Calendar c = new GregorianCalendar();
				c.setTime(d);
				String dia = Integer.toString(c.get(Calendar.DATE));
				String mes = Integer.toString(c.get(Calendar.MONTH));
				String year = Integer.toString(c.get(Calendar.YEAR));
				String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
				String minuto = Integer.toString(c.get(Calendar.MINUTE));
				String segundo = Integer.toString(c.get(Calendar.SECOND));
				bw.write("F  " + file + "   Modificado: " + dia + "/" + mes + "/" + year + " " + hora + ":" + minuto
						+ ":" + segundo);
				bw.newLine();
			}
		}
		bw.close();
	}
}

