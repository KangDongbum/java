package chapter8;

public class test {
	public static void main(String[] args) {
		//B d= new C();
		C c = new C();
		
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);
		
		// ���� Ŭ���� -> ���� Ŭ������ ����ȯ -> ���������� ����(��ĳ����)
		B d = new C();
		A e = new C();
		
		// ���� Ŭ���� ����ȯ -> ���� Ŭ���� ���� -> ��������� ����ȯ(�ٿ�ĳ����)
		C f = (C)e;
		
	}
}
