package chapter5;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setStudentName("�̸�1");
		student2.setStudentName("�̸�2");
		
		System.out.println("student1 = " + student1.getStudentName());
		System.out.println("student2 = " + student2.getStudentName());
	
	}
}
