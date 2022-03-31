package nivell2.Ex01;


public class Implementadora implements MiInterface {
	
	private int numero1;
	private int numero2;
	private String palabra;

	public Implementadora(int numero1, int numero2, String palabra) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.palabra = palabra;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}


	public String metodo1() {
		
		return "La palabra escogida es: " + this.palabra;
	}

	public void metodo2(int repeticiones) {
		
		int i=0;
		do {
			System.out.println(metodo1());
			i++;
		}while (i<=repeticiones);
		
	}
	
	public int metodo3() {
		int suma = this.numero1 + this.numero2;
		System.out.println("La suma del numero 1 y numero 2 es: " + suma);
		return suma;
	}
}
