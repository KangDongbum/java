package chapter13_1;

public class OuterClass2 {
	int num = 10;
	static int snum = 20;
	
	static class InnerClass {
		static int slnNum =30;
		int inNum =30;
		
		void method() {
			//num = 20;
			//outerMethod2();
			snum = 20;
			outerMethod();
			
			slnNum = 40;
			inNum = 50;
			
			System.out.println("static 내부 클래스 메소드");
		}
	}
	
	void outerMethod2() {}
	
	static void outerMethod() {
		//num =20;
		snum = 20;
	}
}
