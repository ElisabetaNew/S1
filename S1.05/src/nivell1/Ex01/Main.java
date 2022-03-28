package nivell1.Ex01;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		/*
		 *  Creu una classe Java que llisti el contingut d'un directori rebut per paràmetre
		 *  ordenat alfabèticament
		 */
	
		//Libreria Java IO
		//Clase File
		//Crear un objeto de tipo File con el nombre del directorio que queremos listar
		File directorio = new File("C:\\Users\\emarc\\eclipse-workspace");
		
		//llamada metodo
		listaContenidoDirectorio(directorio);
	}
		
		//Metodo de clase File es list() asi recuperamos los ficheros que corresponden al directorio
		//Lo que devuelve es una array de cadenas
		public static void listaContenidoDirectorio(File directorio) {
						
		String[] ficheros = directorio.list();
				
		//evitar una excepcion NullPointerException por devolver resultados al invocar al metodo
		// Y recorrer la aaray para listar por pantalla
		if (ficheros == null)
			  System.out.println("No hay ficheros en el directorio especificado");
			else { 
			  for (int x=0;x<ficheros.length;x++)
			    System.out.println(ficheros[x]);
			}
		}
	}

