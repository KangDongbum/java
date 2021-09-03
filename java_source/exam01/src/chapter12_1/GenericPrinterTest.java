package chapter12_1;

public class GenericPrinterTest {
	public static void main(String[] args) {
		Plastic plastic = new Plastic();
		Powder powder = new Powder();
		Water water = new Water();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter();
		plasticPrinter.setMaterial(plastic);
		//System.out.println(plasticPrinter);
		//Plastic plastic2 = plasticPrinter.getMaterial();
		plasticPrinter.printing();
		
		GenericPrinter<Powder>powderPrinter = new GenericPrinter();
		powderPrinter.setMaterial(powder);
		//Powder powder2 = powderPrinter.getMaterial();
		//powder.showInfo();
		powderPrinter.printing();
		
		//GenericPrinter<Water>waterPrinter = new GenericPrinter();
		//waterPrinter.setMaterial(water);
	}
}
