package chapter12_1;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		Plastic plastic = new Plastic();
		Powder powder = new Powder();
		ThreeDPrinter printer = new ThreeDPrinter();
		
		printer.setMaterial(plastic);
		//System.out.println(printer);
		Plastic plastic2 = (Plastic)printer.getMaterial();
		plastic2.showInfo();
		
		
		printer.setMaterial(powder);
		//System.out.println(powder);
		Powder powder2 = (Powder)printer.getMaterial();
		powder2.showInfo();
	}
}
