package chapter9;

/**
 * 
 *	�������� ���� �޼ҵ� ����
 *				1) ��ӹ��� Ŭ������ �������� ���� �޼ҵ带 ����
 *				2) ��ӹ��� Ŭ������ �߻� Ŭ������ ���� 
 */

public abstract class Notebook extends Computer {
	void monitor() {
		System.out.println("NoteBook �����");
	}
	
	void cpu() {
		System.out.println("NoteBook CPU");
	}
	
	void webcam() {
		System.out.println("NoteBook Webcam");
	}

}
