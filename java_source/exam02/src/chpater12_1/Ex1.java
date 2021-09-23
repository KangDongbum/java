package chpater12_1;

public class Ex1 {
	public static void main(String[] args) {
		Three Plasticprinter = new Three();
		Three Powderprinter = new Three();
		
		Plasticprinter.addmt(new Plastic());
		Powderprinter.addmt(new Powder());
		
		Plastic p1 = (Plastic)Plasticprinter.getMt();
		p1.doPrinting();
		
		Powder p2 = (Powder)Powderprinter.getMt();
		p2.doPrinting();
		
		System.out.println(Plasticprinter);
		System.out.println(Powderprinter);
	}
}
