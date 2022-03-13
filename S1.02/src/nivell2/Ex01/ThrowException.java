package nivell2.Ex01;

import java.util.Scanner;

public class ThrowException {

	public ThrowException() {
		
	}
	
	public void f() throws segunda_comprobacion{
		try {
			g();
		}catch(comprobacion_nombre e) {
			throw new segunda_comprobacion("Este no es un nombre de usuario correcto");
		}			
	}
	
	public void g() throws comprobacion_nombre {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un nombre de usuario de más de 6 caracteres");
		String nombre = sc.nextLine();
		sc.close();
		if(nombre.length()<6) {
			throw new comprobacion_nombre("Este nombre no es valido");
		}
	}
}
