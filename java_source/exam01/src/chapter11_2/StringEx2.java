package chapter11_2;

public class StringEx2 {
	public static void main(String[] args) {
		String text1 = "ABC";
		String text2 = "ABC";
		System.out.println(text1 == text2); //���Ǯ�� ABC�� �Ѵ� ����Ű�� �־ �ּҰ��� ����
		
		String st1 = new String("ABC");
		String st2 = new String("ABC");
		System.out.println(st1 == st2); // �ν��Ͻ� �ּҰ� ��
		System.out.println(st1.equals(st2)); // �ν��Ͻ� �ּҰ� ���ε� StringŬ����(���� hashcode, equals�޼ҵ尡 ������ �Ǿ�����)�� ������⶧���� ���� ��
	}
}
