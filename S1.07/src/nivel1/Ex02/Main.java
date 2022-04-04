package nivel1.Ex02;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//String nombre, String apellido, int edad, int antiguedad, String zona, int bonusAnual)
		Comercial comercial1 = new Comercial("Ruben", "Mendoza", 30, 3,"Alicante", 25000);
		
		System.out.println("Si llegas al objetivo, tu salario anual en 2022 sera: " + comercial1.calcularSueldo() + "€");
		
		System.out.println(comercial1.toString());
		
			
		System.out.println("Metodo retornar Zona: " + comercial1.retornarZona());

		
		System.out.println("Metodo imprimir Zona: ");
		comercial1.imprimirZona();
	}

}
