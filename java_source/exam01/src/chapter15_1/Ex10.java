package chapter15_1;

import java.io.Console;

public class Ex10 {
	public static void main(String[] args) {
		Console con = System.console();
		
		System.out.print("���̵�");
		String memId = con.readLine();
		
		System.out.print("��й�ȣ");
		char[] password = con.readPassword();
		String pass = new String(password);
		
		System.out.println("���̵� : "+ memId);
		System.out.println("��й�ȣ : "+ pass);
	}
}
