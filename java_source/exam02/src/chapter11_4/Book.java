package chapter11_4;

public class Book {
	private String title;
	private int price;
	
	public Book() {}
	
	public Book(String title, int price) {
		this.title =title;
		this.price = price;
	}
	
	public String toString() {
		return "���� : "+title+"���� : "+price;
	}
}
