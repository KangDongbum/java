package chapter6; 

public class staticEx1 {
	public static void main (String[] args) {	
		Student st1 = new Student("이름1", 1500);
		Student st2 = new Student("이름2", 2000);
		
		Student.studentNum = 1000;
		System.out.println(Student.getStudentNum());
		
		//System.out.println(st1.getStudentNum());
		//System.out.println(st2.getStudentNum());
		// 인스턴스로 호출 -> 인스턴스에X -> 데이터 영역
		
	/*	st1.studentNum = 1001;
		System.out.println("st2 : " + st2.studentNum);
		st2.studentNum +=10;
		System.out.println("st1 : " + st1.studentNum); */
	
		System.out.print(Student.studentNum);
	}
}
