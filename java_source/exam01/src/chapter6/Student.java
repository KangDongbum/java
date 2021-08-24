package chapter6;

public class Student {
	static int studentNum; //학번
	
	String name; //학생이름
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public static int getStudentNum() {
		return studentNum;
	}
	
	public void rideBus(Bus bus) {
		bus.collect(this); // this -> Student s
	}
	
	public void rideSubway(Subway subway) {
		subway.collect(this);
	}
	
	public void showInfo() {
		System.out.println(this.name + " : " + this.money);
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("학생1", 10000);
		Student st2 = new Student("학생2", 8000);
		
		Bus bus66 = new Bus(66, 1250);
		
		st1.rideBus(bus66); //학생1이 66번 버스에 탑승
		st2.rideBus(bus66); //학생2가 66번 버스에 탑승
		
		st1.showInfo();
		st2.showInfo();
		
		bus66.showInfo();
		
		Subway sub = new Subway("인천2호선", 1250);
		st1.rideSubway (sub);
		st2.rideSubway (sub);
		
		st1.showInfo();
		st2.showInfo();
		
		sub.showInfo();

	}
}
