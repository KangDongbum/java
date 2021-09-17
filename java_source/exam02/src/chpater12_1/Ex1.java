package chpater12_1;

public class Ex1 {
	public static void main(String[] args) {
		ThreeDPrinter p1 = new ThreeDPrinter();
		p1.addMaterial(new Plastic());
		System.out.println(p1);
		
		p1.addMaterial(new Powder());
		System.out.println(p1);
	}
}
