package Nivell1Fase3;

public class Main {

	public static void main(String arg[]) {
		Reverse mensaje = (a) -> {
			String mensajeInvertido = "";
			for (int i = 0; i < a.length(); i++) { // .length() te devuelve el tamaño de String
				char caracter = a.charAt(i); // separarlo por caracteres
				mensajeInvertido = caracter + mensajeInvertido; // invertirlo caracter por caracter
			}
			return mensajeInvertido;
		};

		System.out.println(mensaje.reverse("Esto es una prueba"));

	}
}
