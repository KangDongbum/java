package chapter15_3;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("output3.txt")) {
			char[] chs = {'A','B','C','D','E','F','G'};
			
			fw.write("�ȳ��ϼ���.");
			fw.write(65);
			fw.write("65");
			fw.write(chs,1,3);
			fw.write("�ȳ��ϼ���",3,2);
			
			fw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
