package chapter2;

public class castEx1 {
	public static void main(String[] args) {
		byte num1 =10;
		int num2 = num1; // num -> byte -> int
		System.out.println(num2);
		
		//short num3 = num2; //  ���� �ڷ������� ���� -> �ڷ� �ս� �߻�
		//System.out.println(num3);
		
		float num3 = num2; //num3 �ڷ����� num2���� ���� -> int ->float
		System.out.println(num3);
		
		long num4 = 1234567890L;
		float num5 = num4;
		System.out.println(num5);
		
		System.out.println(10 / 2.0F); // int / float
		//float num6 = 10 / 2.0F;
		double num6 = 10 / 2.0F;
		System.out.println(num6);
		
		
	}
}