package chapter5;

public class Student {
	// ��� ����
	int studentID;
	int grade;
	char gender;
	
	String studentName;
	String address;
	Subject subject;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	/* public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1); 
	} */ 
}
