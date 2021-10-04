package chapter15;

import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) throws IOException {
		char ch = (char)System.in.read();
		/*
		 * byte - unsigned byte -> 양수 0~255
		 * 더이상 읽을 데이터가 없는 경우 -1을 반환
		 * short, int, long ...
		 * short -> int -> (short)
		 * int
		 */
		
		// short num1 = 10;
		// int num1 = 10 --> short num1 = (short)num1;
		// long num1 = 123456789123456789;
		// int num1 = 123456789123456789;(숫자 범위 오류 X) X ->(long)num1
		// long num1 = 123456789123456789L;
		// float num2 = 0.1234; //double -> float
		// float num2 = 0.1234f -> float
		
		System.out.println(ch);
	}
}
