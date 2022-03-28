package nivell1.Ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la ruta del fichero a imprimir");
		String ruta = sc.nextLine();
		File fichero = new File(ruta);
		leerFichero(fichero);
		sc.close();
	}

	public static void leerFichero(File fichero) {
		FileReader fr = null;
		try {
			fr = new FileReader(fichero);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bf = new BufferedReader(fr);
		String sCadena;
		try {
			while ((sCadena = bf.readLine()) != null) {
				System.out.println(sCadena);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}