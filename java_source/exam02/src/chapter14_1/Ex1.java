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
			//���� ó�� ����, �α�
		} finally {
			try {
				fis.close();
				isr.close();
				fis.close();
			} catch(Exception e) {
				
			}
		}
		System.out.println("���� ����");
	}
}
