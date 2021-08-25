package chapter7;

public class Student {
	String name;
	int classRoom;
	
	public Student(String name, int classRoom) {
		this.name =name;
		this.classRoom = classRoom;
	}
	
	public void showInfo() {
		System.out.println(name + "�� " + classRoom + "�� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		// �ڷ���[] ������ = new �ڷ���[����]; //���� �ڷ��� - Student
		Student[] list = new Student[100]; // �ν��Ͻ��� ������ ���� �ڷ����ǰ����� ���� null
		for(int i=0; i<list.length; i++) {
			//System.out.println(list[i]);
			int num = i + 1;
			int ban = i % 4;
			list[i] = new Student("�̸�" +num, ban + 1 );
		}
		for(int i=0; i<list.length; i ++) {
			list[i].showInfo();
		}
	}
}
