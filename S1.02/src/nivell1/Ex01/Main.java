package nivell1.Ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			validarDatos();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Ha finalizado el programa");
		}
	}

	public static void validarDatos() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		sc.close();
		if (edad > 110) {
			throw new Exception("El numero introducido es muy elevado");
		} else
			System.out.println("Tu edad es: " + edad);
	}

}
