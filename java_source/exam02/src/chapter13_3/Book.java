package chapter13_3;

public class Book {
	private String bookName;
	private int price;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(String Bookname, int price) {
		this.bookName = Bookname;
		this.price = price;
	}
	
	public String toString() {
		return "책 이름"+bookName+"책 가격"+price;
	}
	
}
