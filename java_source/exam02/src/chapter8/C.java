package chapter8;

public class C extends B {
	int numC = 30;
	
	C(){
		super(); // �����Ϸ��� �ڵ����� �߰� -> �θ� �⺻ ������ ȣ��
					  // C() ������ ȣ���� ���� �Ǳ� ���� �θ� �����ڰ� ���� ȣ��ȴ�.
		System.out.println("C������");
	}
	
	void methodC() {
		System.out.println("�޼ҵ� C");
	}

}
