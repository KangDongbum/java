package chpater12_1;

public class Ex2 {
	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.addMt(new Plastic());
		
		Plastic plastic = plasticPrinter.getMt();
		plastic.doPrinting();
		
		GenericPrinter <Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.addMt(new Powder());
		
		Powder powder = powderPrinter.getMt();
		powder.doPrinting();
	}
}
