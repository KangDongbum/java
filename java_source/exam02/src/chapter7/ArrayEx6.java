package chapter7;

import java.util.ArrayList;

public class ArrayEx6 {
	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<Book>();
		
		book.add(new Book("�ڹ� ���α׷��� �Թ�", 20000));
		book.add(new Book("�����ͺ��̽� ���а� �ǽ�", 25000));
		book.add(new Book("�������α׷� ����", 0));
		
		/*
		for(int i = 0; i < book.size(); i++) {
			Book books = book.get(i);
			books.showInfo();
		}*/
		for(Book books : book) {
			books.showInfo();
		}
	}
}
