package chapter7_1;

public class Student {
	public static void main(String[] args) {
		Ex1[] StudentArray = new Ex1[3];
		
		StudentArray[0] = new Ex1(1001, "James");
		StudentArray[1] = new Ex1(1002, "Tomas");
		StudentArray[2] = new Ex1(1003, "Edward");
		
		for(int i =0; i<StudentArray.length;i++) {
			StudentArray[i].showInfo();
		}
	}
}