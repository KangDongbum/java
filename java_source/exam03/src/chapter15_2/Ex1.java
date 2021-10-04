package chapter15_2;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		/*
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ����
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		try(FileInputStream fis = new FileInputStream("a.txt")){
			// char i = (char)fis.read(); // ������ ���� �����ϸ� -1
			// System.out.print(i);
			
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
