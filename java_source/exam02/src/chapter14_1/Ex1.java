package chapter14_1;

import java.io.*;

public class Ex1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("a.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
		} catch(IOException e) {
			//예외 처리 로직, 로그
		} finally {
			try {
				fis.close();
				isr.close();
				fis.close();
			} catch(Exception e) {
				
			}
		}
		System.out.println("실행 가능");
	}
}
