package chapter9_5;

public class B1 {
	public int num; // ���� ��ȣ
	public String title; // ���� ����
	
	public B1(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public int getNum() {
		return num; 
	}
	
	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		B1 book = (B1)obj;
		if(book.getNum() == num) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "���� ��ȣ: " + num + "���� ���� : " + title;
			
	}
	
	
}
