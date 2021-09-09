package chapter15_1;

import java.io.Console;

public class Ex10 {
	public static void main(String[] args) {
		Console con = System.console();
		
		System.out.print("아이디");
		String memId = con.readLine();
		
		System.out.print("비밀번호");
		char[] password = con.readPassword();
		String pass = new String(password);
		
		System.out.println("아이디 : "+ memId);
		System.out.println("비밀번호 : "+ pass);
	}
}
