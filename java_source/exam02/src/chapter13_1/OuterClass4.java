package chapter13_1;

public class OuterClass4 {
	InnerAbstract in = new InnerAbstract() {
		public void innerMethod(){
			System.out.println("���� ���� Ŭ����(����)");
		}
	};
	
	public InnerAbstract innerMethod() {
		InnerAbstract in = new InnerAbstract() {
			public void innerMethod() {
				System.out.println("���� ���� Ŭ����");
			}
		};
		return in;
	}
}
