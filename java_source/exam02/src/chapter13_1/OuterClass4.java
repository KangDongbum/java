package chapter13_1;

public class OuterClass4 {
	InnerAbstract in = new InnerAbstract() {
		public void innerMethod(){
			System.out.println("지역 내부 클래스(변수)");
		}
	};
	
	public InnerAbstract innerMethod() {
		InnerAbstract in = new InnerAbstract() {
			public void innerMethod() {
				System.out.println("지역 내부 클래스");
			}
		};
		return in;
	}
}
