package chapter15;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
	public static void main(String[] args) throws IOException{
		System.out.println("���� �Է� : ");
		int i;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		while(true) {
			//char ch = (char)System.in.read();
			char ch = (char)isr.read();
			System.out.print(ch);
		}
	}
}
