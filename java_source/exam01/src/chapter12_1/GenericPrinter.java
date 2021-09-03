package chapter12_1;

/**
 *  T - Type
 *  E - Element
 *  V - Value
 *  K - Key
 *  ...
 */
public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); 
	}
}
