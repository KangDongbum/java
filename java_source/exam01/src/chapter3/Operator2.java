package chapter3;

public class Operator2 {
	public static void main(String[] args) {
		String[] students = new String[30];
		for (int i =0; i<students.length; i++) {
			students[i] = "학생"+ (i+1);
		}
		
		for(int i=0; i<students.length; i++) {
			int room = i % 10; //0~9방 까지
			System.out.println(students[i] + "는 방번호" + room + "입니다");
		}
	}
}
