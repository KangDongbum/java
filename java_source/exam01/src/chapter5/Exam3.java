package chapter5;

public class Exam3 {
	String name;
	double height, weight;
	
	public Exam3(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("이름 = " + name);
		System.out.println("키 = " + height);
		System.out.println("몸무게 = " +  weight);
	}
	
	public static void main(String[] args) {
		Exam3 person = new Exam3("강동범",169.5, 60);
		person.showInfo();	
	}
}
