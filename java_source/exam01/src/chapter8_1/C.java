package chapter8_1;

public class C extends B{
	int numC = 10;
	
	C(){
		super();
		System.out.println("C ������");
	}
	
	/*
	C(int numC){
		super(); // BŬ���� ���� �⺻ �����ڷ� �̵���
		this.numC = numC;
		System.out.println("�Ű������� �ִ� ������ C");
	} */
	
	void methodC() {
		System.out.println("�޼ҵ� C");
	}
}
