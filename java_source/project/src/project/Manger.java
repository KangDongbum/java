package project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manger {
	public static void main(String[] args){
		try(FileWriter fw = new FileWriter("a.txt",true);
			Scanner sc = new Scanner(System.in)){
			
			System.out.println("å ������ �Է����ּ���");
			String bookname = sc.nextLine();
			fw.write(bookname);
			
			System.out.println("å ��ȣ�� �Է����ּ���");
			String bookno= sc.nextLine();
			fw.write(bookno + "\r\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
