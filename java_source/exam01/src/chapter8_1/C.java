package chapter8_1;

public class C extends B{
	int numC = 10;
	
	C(){
		super();
		System.out.println("C 생성자");
	}
	
	/*
	C(int numC){
		super(); // B클래스 상위 기본 생성자로 이동함
		this.numC = numC;
		System.out.println("매개변수가 있는 생성자 C");
	} */
	
	void methodC() {
		System.out.println("메소드 C");
	}
}
