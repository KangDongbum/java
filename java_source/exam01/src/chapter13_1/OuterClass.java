package chapter13_1;

public class OuterClass {
	public int num = 10;
	private static int sum =20;
	private InnerClass in;
	
	public OuterClass() {
		in = new InnerClass();
	}
	
	class InnerClass{
		int inNum = 10;
		static int inSNum = 20; //jdk15���� ���� O , jdk16�̻� ���� X
		
		void innerMethod() {
			System.out.println("OuterClass num : " + num);
			System.out.println("OuterClass sum : " + sum);
			
			System.out.println("InnerClass inNum : " + inNum);
			System.out.println("InnerClass inSNum : " + inSNum);
		}
		
		static void StaticMethod() { //jdk15���� ���� O , jdk16�̻� ���� X
			System.out.println("��������");
		}
	}
}
