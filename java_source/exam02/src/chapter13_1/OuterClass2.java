package chapter13_1;

public class OuterClass2 {
	public int num = 100;
	static class InnerClass{
		public void innerMethod() {
			System.out.println("정적 내부 클래스 메소드");
		}
	}
	public void outerMethod() {
		
	}
	
	public static void outerStaticMethod() {
		
	}
}
