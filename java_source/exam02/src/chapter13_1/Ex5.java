package chapter13_1;

interface InterEx{
	void innerMethod();
}

public class Ex5 {
	public static void main(String[] args) {
		InterEx ex = new InterEx() {
			public void innerMethod(){
				System.out.println("메소드 호출");
			}
		};
		ex.innerMethod();
	}
}
