package chapter15_1;

import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		int i;
		try {
			System.out.println("문자를 입력하세요: ");
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
