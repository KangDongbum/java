package chapter13_1;

public class OuterClass3 {
	
	public InnerMyClass outerMethod() {
		int num = 20; // ���� ���� Ŭ���� �ܺο� ���ǵǾ� �ִ� ���� ���ȭ
							// public final -> ������ ����, ���� X
		
		class InnerClass implements InnerMyClass{
			public void method() {
				System.out.println("���� ���� Ŭ����");
				System.out.println("num = " + num);
			}
		}
		InnerClass in = new InnerClass();
		
		return in;
	}
}
