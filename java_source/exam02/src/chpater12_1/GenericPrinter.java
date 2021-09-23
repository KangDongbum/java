package chpater12_1;

public class GenericPrinter<T> {
	T mt;
	
	public void addMt(T mt) {
		this.mt = mt;
	}
	
	public T getMt() {
		return mt;
	}
	
	public String toString() {
		return mt.toString();
	}
}
