package nivell2.Ex01;

public class Smartphone extends Telefono implements Camara, Reloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void alarmar() {
		System.out.println("Esta sonando la alarma");
	}

	@Override
	public void fotografiar() {
		System.out.println("Se esta haciendo una foto");
	}

}
