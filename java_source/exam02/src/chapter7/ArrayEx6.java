package chapter7;

import java.util.ArrayList;

public class ArrayEx6 {
	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<Book>();
		
		book.add(new Book("자바 프로그래밍 입문", 20000));
		book.add(new Book("데이터베이스 개론과 실습", 25000));
		book.add(new Book("서버프로그램 구현", 0));
		
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
