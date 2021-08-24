package chapter5;

public class Exam1 {
	int age;
	int children;
	String name;
	boolean isMarried;
	
	//public Exam1() {} //�⺻ �����ڰ� ������ �ν��Ͻ� ���� �Ұ� X
	 // ������ �������Ҷ� �ڵ����� �߰�
	
	public Exam1(int age, String name) { // ������ �Ű������� 2���� �Է��� ���
		this.age = age;
		this.name = name;
	}
		
	public Exam1(int age, int children, String name, boolean isMarried) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.children = children;
	}
	
	public void showInfo() {
		String isMarriedStr = isMarried?"��ȥ" : "��ȥ";
		System.out.println("���� : " +age);
		System.out.println("�̸� : " + name);
		System.out.println("��ȥ ���� " +isMarriedStr);
		System.out.println("�ڳ�� : " +children);
	}
	
	public static void main(String[] args) {
		/* Exam1 exam1 = new Exam1();
		exam1.age = 40;
		exam1.name = "James";
		exam1.isMarried = true;
		exam1.children = 3; */
		
		Exam1 exam1 = new Exam1(40,3,"James",true);
		exam1.showInfo();
		
		Exam1 exam2 = new Exam1(30, "Peter");
		exam2.showInfo();
	}
}
