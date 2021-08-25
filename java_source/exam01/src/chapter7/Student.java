package chapter7;

public class Student {
	String name;
	int classRoom;
	
	public Student(String name, int classRoom) {
		this.name =name;
		this.classRoom = classRoom;
	}
	
	public void showInfo() {
		System.out.println(name + "는 " + classRoom + "반 입니다.");
	}
	
	public static void main(String[] args) {
		// 자료형[] 변수명 = new 자료형[갯수]; //참조 자료형 - Student
		Student[] list = new Student[100]; // 인스턴스가 생성될 참조 자료형의공간만 생성 null
		for(int i=0; i<list.length; i++) {
			//System.out.println(list[i]);
			int num = i + 1;
			int ban = i % 4;
			list[i] = new Student("이름" +num, ban + 1 );
		}
		for(int i=0; i<list.length; i ++) {
			list[i].showInfo();
		}
	}
}
