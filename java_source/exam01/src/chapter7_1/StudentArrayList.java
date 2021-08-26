package chapter7_1;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList <Ex1> StudentArray = new ArrayList<>();
		StudentArray.add(new Ex1 (1002, "학생2"));
		StudentArray.add(new Ex1 (1002, "학생2"));
		StudentArray.add(new Ex1(1003, "학생3"));

		/*
		for(int i =0; i <StudentArray.size(); i++) {
			Ex1 s = StudentArray.get(i);
			s.showInfo();
		}
		*/
		for(Ex1 student : StudentArray) {
			student.showInfo();
		}
	}
}
