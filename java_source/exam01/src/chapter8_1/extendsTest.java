package chapter8_1;

public class extendsTest {
	public static void main(String[] args) {
	/*	D d = new D();
		C c = new C();
		B b = new B(); */
	
	//D Ŭ���� -> A,B,C Ŭ������ ��� ����
	/**
	 * D�� D,C,B,A�� �ν��Ͻ��� ������ �ִ�.
	 * 
	 */
		/*
		D d = new D();
		C c = new D();
		B b = new D();
		A a = new A();	
		Object o = new D(); */
	
		//D �� A,B,C�� �������, �޼ҵ带 ��� ������ �����Ƿ� A,B,C ��� ���̵��� �� �� �ִ�.
		// D d = new B(); // B�ν��Ͻ��� ��������� �޼ҵ尡 D�� ������ �ִ°��� ��� ������ ���� �ʱ� ����
		//���� Ŭ�����ǿ� ���� Ŭ���� �ν��Ͻ��� ���� -> �ڵ� ����ȯ(������ ����ȯ)
		
		//D d = new D(10); // �Ű������� �ִ� ������ -> �ν��Ͻ�
	}
}
