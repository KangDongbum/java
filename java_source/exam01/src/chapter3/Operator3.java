package chapter3;

public class Operator3 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = num++;
		System.out.println("num=" + num +", num2="+ num2);
		int num3 = ++num;
		System.out.println("num=" + num +", num3="+ num3);
		int num4 = num --;
		System.out.println("num=" + num +", num4="+ num4);
		int num5 = --num;
		System.out.println("num=" + num +", num5="+ num5);
	}
}
