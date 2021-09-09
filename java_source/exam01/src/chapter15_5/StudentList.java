package chapter15_5;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentList implements Serializable{
	private static final long serialVersionUID = 5964709454247633422L;

	private ArrayList<Student> list;
	
	private String name2;
	
	public StudentList() {
		list = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		list.add(s);
	}
	
	public void showList() {
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
