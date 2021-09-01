package chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		Book[] book = new Book[3]; //Book 참조 자료형 빈 공간 4개
		Book[] book2 = new Book[3]; //book를 복사할 배열
		
		book[0] = new Book("자바프로그래밍 입문", 20000);
		book[1] = new Book("데이터베이스 개론과 실습", 25000);
		book[2] = new Book("서버프로그램 구현", 0);
		
		//System.arraycopy(book, 0, book2, 0, 3);
		for(int i = 0; i < book2.length; i++) {
			book2[i] = new Book(book[i].getName(), book[i].getPrice());
		}
		
		System.out.println("----------book--------");
		book[2].setName("쉽게 배우는 JSP");
		book[2].setPrice(18000);
		for(int i = 0; i < book.length; i++) {
			book[i].showInfo();
		}
		
		System.out.println("----------book2--------");
		for(int i = 0; i < book.length; i++) {
			book2[i].showInfo();
		}
	
	}
}
