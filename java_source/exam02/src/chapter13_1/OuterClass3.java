package chapter13_1;

public class OuterClass3 {
	public InnerAbstract outerMethod(int num) {
		class InnerClass extends InnerAbstract{
			public void innerMethod() {
				// num -> public final int num -> 상수화
				System.out.println("num : " + num);
				System.out.println("지역 내부 클래스 메소드");
			}
		}
		
		InnerClass in = new InnerClass();
		return in;
	}
}
