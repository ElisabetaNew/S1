package nivell1.Ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			validarDatos();
		} catch (Errornuevo e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		} finally {
			System.out.println("Ha finalizado el programa");
		}
	}

	public static void validarDatos() throws Errornuevo {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		sc.close();
		if (edad > 110) {
			throw new Errornuevo("El numero introducido es muy elevado");
		} else
			System.out.println("Tu edad es: " + edad);
	}

}
