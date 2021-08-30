package chapter10_3;

public class InterfaceEx1 implements A, B {

	@Override
	public void methodB() {
		System.out.println("method B");
	}

	@Override
	public void methodA() {
		System.out.println("method A");
	}
	
	@Override
	public void method() {
		System.out.println("공통 메소드");
	}
}
