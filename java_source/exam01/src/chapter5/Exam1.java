package chapter5;

public class Exam1 {
	int age;
	int children;
	String name;
	boolean isMarried;
	
	//public Exam1() {} //기본 생성자가 없으면 인스턴스 생성 불가 X
	 // 없으면 컴파일할때 자동으로 추가
	
	public Exam1(int age, String name) { // 생성자 매개변수에 2개만 입력한 경우
		this.age = age;
		this.name = name;
	}
		
	public Exam1(int age, int children, String name, boolean isMarried) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.children = children;
	}
	
	public void showInfo() {
		String isMarriedStr = isMarried?"결혼" : "미혼";
		System.out.println("나이 : " +age);
		System.out.println("이름 : " + name);
		System.out.println("결혼 여부 " +isMarriedStr);
		System.out.println("자녀수 : " +children);
	}
	
	public static void main(String[] args) {
		/* Exam1 exam1 = new Exam1();
		exam1.age = 40;
		exam1.name = "James";
		exam1.isMarried = true;
		exam1.children = 3; */
		
		Exam1 exam1 = new Exam1(40,3,"James",true);
		exam1.showInfo();
		
		Exam1 exam2 = new Exam1(30, "Peter");
		exam2.showInfo();
	}
}
