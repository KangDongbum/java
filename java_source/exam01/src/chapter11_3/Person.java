package chapter11_3;

public class Person {
	private String name;
	private int age; 
	
	public Person() {}
	
	public Person(int i) {
		System.out.println("매개변수 정리 : " + i);
	}
	
	public Person(String name) {
		System.out.println("매개변수 문자열 : " + name);
	}
	
	public Person(String name, int age) {
		System.out.println(name +":" +age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
