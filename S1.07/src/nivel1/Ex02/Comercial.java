package nivel1.Ex02;

public class Comercial extends Trabajador {
	
		//atributos
		private String zona;
		private int bonusAnual;
		
		//constructor
		public Comercial(String nombre, String apellido, int edad, int antiguedad, String zona, int bonusAnual) {
			super(nombre, apellido, edad, antiguedad);
			this.zona = zona;
			this.bonusAnual = bonusAnual;
		}

		@Deprecated
		public String retornarZona() {
			return zona;
			
		}
		//Getters y setters	
		public String getZona() {
			return zona;
		}

		public void setZona(String zona) {
			this.zona = zona;
		}

		public int getBonus() {
			return bonusAnual;
		}

		public void setBonus(int bonusAnual) {
			this.bonusAnual = bonusAnual;
		}

		//metodo imprime nombre
		public void imprimirZona() {
			System.out.println(this.retornarZona());
			System.out.println(this.getZona());
		}
		
		//metodo calcularSueldo
		@Override
		public int calcularSueldo() {
			final int incrementoAntiguedad	= 10000;
					
			return super.sueldo + (incrementoAntiguedad * super.antiguedad) + bonusAnual;
		}

		//metodo ToString
		@Override
		public String toString() {
			return "Comercial [zona=" + zona + ", bonus anual=" + bonusAnual + "]";
		}

		
	}

