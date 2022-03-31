package nivell1.Ex02;

public class GenericMethods<K> {
	
	private K objeto1;
	private K objeto2;
	private K objeto3;

	public GenericMethods() {
		this.objeto1 = null;
		this.objeto2 = null;
		this.objeto3 = null;
	}
	
	public void f(K objeto1, K objeto2, K objeto3) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
		this.objeto3 = objeto3;
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

	public K getObjeto3() {
		return objeto3;
	}

	public void setObjeto3(K objeto3) {
		this.objeto3 = objeto3;
	}

	@Override
	public String toString() {
		return "GenericMethods [objeto1=" + objeto1 + ", objeto2=" + objeto2 + ", objeto3=" + objeto3 + "]";
	}
	
}
