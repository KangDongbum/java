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
		System.out.println("�̸� = " + name);
		System.out.println("Ű = " + height);
		System.out.println("������ = " +  weight);
	}
	
	public static void main(String[] args) {
		Exam3 person = new Exam3("������",169.5, 60);
		person.showInfo();	
	}
}
