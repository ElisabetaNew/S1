package nivell1.Ex02;

public class Main {

	public static void main(String[] args) {
		
		//Creacion objeto de la clase Vehicle
		Vehicle vehicle = new Vehicle();
		
		//Invocacion metodo no-static inicar()
		vehicle.iniciar();
		
		//Invocacion metodo static parar() y acelerar()
		Vehicle.parar();
		Vehicle.acelerar();
		
	}

}
