package chapter11_4;

public class Ex1 {
	public static void main(String[] args) {
		int num1= 10;
		Integer num2 = Integer.valueOf(20);
		
		int result = num1+num2; // Integer num2 -> int num2(��ڽ�)
		System.out.println(result);
		String text = "text";

		Integer num3 = num1; //int num1 -> Integer num1(����ڽ�)
	}
}
