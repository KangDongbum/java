package chapter13_1;

public class OuterClass3 {
	public InnerAbstract outerMethod(int num) {
		class InnerClass extends InnerAbstract{
			public void innerMethod() {
				// num -> public final int num -> ���ȭ
				System.out.println("num : " + num);
				System.out.println("���� ���� Ŭ���� �޼ҵ�");
			}
		}
		
		InnerClass in = new InnerClass();
		return in;
	}
}
