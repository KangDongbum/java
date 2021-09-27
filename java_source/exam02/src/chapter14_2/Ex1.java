package chapter14_2;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr =null;
		BufferedReader br =null;
		try{
			fis = new FileInputStream("a.txt"); // 리소스 열어서 -> 파일 접근
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			System.out.println("여기부터는 못지나간다 ㅡㅡ");
			
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(isr != null) {
					isr.close();
				}
				if(fis != null) {
					fis.close();
				}
				System.out.println("finally 무조건 실행");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("실행?");
	}
}
