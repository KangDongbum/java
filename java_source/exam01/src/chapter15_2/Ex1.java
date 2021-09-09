package chapter15_2;

import java.io.IOException;
import java.io.FileInputStream;

/**
 *  스트림 열고 -> 끝나면 반드시 닫아야 한다 close();
 * 
 *
 */
public class Ex1 {
	public static void main(String[] args) {
		FileInputStream fil = null; 
		try {
			fil = new FileInputStream("input.txt");
			
			int i;
			while((i = fil.read()) != -1) {
				System.out.println((char)i);
			}  			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(fil == null) {
				try {
					fil.close();
				} catch(IOException e) {
					e.printStackTrace();
				} catch(NullPointerException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
