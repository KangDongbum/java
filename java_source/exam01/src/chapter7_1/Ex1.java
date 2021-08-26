package chapter7_1;

public class Ex1 {
	private int  studentID;
	private String name;
	
	public Ex1(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentID + "," + name);
	}
}
