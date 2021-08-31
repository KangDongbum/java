package chapter5;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	FamilyMember family;
	java.util.ArrayList<String> list;
	
	public void showInfo() {
		System.out.println("Person 클래스");
	}
	
	/**
	 * 
	 * 변수  num1, num2, result -> 함수 내에 정의
	 */
	public int add (int num1, int num2) {
		int result = num1+ num2;
		return result;
	}
}
