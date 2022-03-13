package nivell2.Ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {

	public ThrowException() {
		
	}
	
	public void f() throws segunda_comprobacion{
		try {
			g();
		}catch(InputMismatchException e) {
			throw new segunda_comprobacion("Este no es un nombre de usuario correcto");
		}			
	}
	
	public void g() throws InputMismatchException {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una contraseña solo de numeros");
		int password = sc.nextInt();
		sc.close();
	}
	
}
