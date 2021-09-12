package project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manger {
	public static void main(String[] args){
		try(FileWriter fw = new FileWriter("a.txt",true);
			Scanner sc = new Scanner(System.in)){
			
			System.out.println("책 제목을 입력해주세요");
			String bookname = sc.nextLine();
			fw.write(bookname);
			
			System.out.println("책 번호를 입력해주세요");
			String bookno= sc.nextLine();
			fw.write(bookno + "\r\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
