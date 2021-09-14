package project;

import java.io.IOException;
import java.util.Scanner;

public class Manger {
	public static void main(String[] args){
		BookArrayList bookarraylist = new BookArrayList();
		
		
		//Book �ν��Ͻ� ����
		/*
		Book book1 = new Book(1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�");
		Book book2 = new Book(1002, "�� ������", "�󽴹� �õ������ǵ�", "�ֺ���");
		Book book3 = new Book(1003, "������ �ູ", "������", "���೪��"); */
		
		bookarraylist.addBook(new Book(1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�"));
		bookarraylist.addBook(new Book(1002, "�� ������", "�󽴹� �õ������ǵ�", "�ֺ���"));
		bookarraylist.addBook(new Book(1003, "������ �ູ", "������", "���೪��")); 
	
		bookarraylist.showAllBook();

		try(
			Scanner sc = new Scanner(System.in)){
			
			while(true) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("å ��Ϲ�ȣ�� �Է����ּ���.");
			int bookno = Integer.parseInt(sc.nextLine());
			if(Character.isDigit(bookno) == false){
			}else {
				throw new Exception();
			}
			
			System.out.println("å ������ �Է����ּ���.");
			String bookname = sc.nextLine();
			if(bookname.length() >= 1){
			} else {
				throw new Exception();
			}
			
			System.out.println("å ���ڸ� �Է����ּ���.");
			String author = sc.nextLine();
			if(author.length() >= 1){
			} else {
				throw new Exception();
			}
			
			System.out.println("å ���ǻ縦 �Է����ּ���.");
			String publisher = sc.nextLine();
			if(publisher.length() >= 1){
			} else {
				throw new Exception();
			}
			
			bookarraylist.addBook(new Book(bookno,bookname,author,publisher));
			
			
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println("--------------------------------------------------------------------------------");
			bookarraylist.showAllBook();
		}
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("����� Ʋ�Ƚ��ϴ�.");
		}
	}
}