package nivel1.Ex01.PrimerIntento;

public class NoGenericMethods {

	private Object objecte1;
	private Object objecte2;
	private Object objecte3;
	
	public NoGenericMethods()
	{
		this.objecte1 = new Object();
		this.objecte2 = new Object();
		this.objecte3 = new Object();
	}

	public Object getObjecte1() {
		return objecte1;
	}

	public void setObjecte1(Object objecte1) {
		this.objecte1 = objecte1;
	}

	public Object getObjecte2() {
		return objecte2;
	}

	public void setObjecte2(Object objecte2) {
		this.objecte2 = objecte2;
	}

	public Object getObjecte3() {
		return objecte3;
	}

	public void setObjecte3(Object objecte3) {
		this.objecte3 = objecte3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [objecte1=" + objecte1 + ", objecte2=" + objecte2 + ", objecte3=" + objecte3 + "]";
	}
	
	
}
