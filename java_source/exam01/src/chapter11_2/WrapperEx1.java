package chapter11_2;

public class WrapperEx1 {
	public static void main(String[] args) {
		int num1 = 100;
		Integer num2 = Integer.valueOf(200);
		
		int num3 = num1 + num2;
										// 연산을 위해 Integer -> int -> 언박싱
		System.out.println(num3);
		
		Integer num4 = num1; //int -> Integer -> 오토 박싱
		System.out.println(num4.hashCode());
		//System.out.println(num1+num2);
	}
}
