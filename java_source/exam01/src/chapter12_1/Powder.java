package chapter12_1;

public class Powder extends Material {

	public void doPrinting() {
		System.out.println("Powder 재료로 프린팅");
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "Powder 재료";
	}
	
}
