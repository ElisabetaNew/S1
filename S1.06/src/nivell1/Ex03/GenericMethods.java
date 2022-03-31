package nivell1.Ex03;

public class GenericMethods<K> {
	
	private K objeto1;
	private K objeto2;
	private int objeto3;

	public GenericMethods() {
		this.objeto1 = null;
		this.objeto2 = null;
		this.objeto3 = 0;
	}
	
	public void f(K objeto1, K objeto2) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
		this.objeto3 = 100;
	}

	public K getObjeto1() {
		return objeto1;
	}

	public void setObjeto1(K objeto1) {
		this.objeto1 = objeto1;
	}

	public K getObjeto2() {
		return objeto2;
	}

	public void setObjeto2(K objeto2) {
		this.objeto2 = objeto2;
	}

	public int getObjeto3() {
		return objeto3;
	}

	public void setObjeto3(int objeto3) {
		this.objeto3 = objeto3;
	}

	@Override
	public String toString() {
		return "GenericMethods [objeto1=" + objeto1 + ", objeto2=" + objeto2 + ", objeto3=" + objeto3 + "]";
	}



	
}
