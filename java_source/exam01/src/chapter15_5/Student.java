package chapter15_5;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 2294334719968699111L;
	private int studentId;
	private String name;
	transient private int age;
	
	public Student(int studentId, String name, int age) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "�й�:  " + studentId + ", �̸�"+ name+", ����: " +age;
	}
}
